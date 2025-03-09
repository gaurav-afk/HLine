package com.example.hline


import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.isUnspecified
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.toSize
import coil.compose.AsyncImage
import coil.request.ImageRequest

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AutoCompleteSearchBar() {
    var selectedCountry by remember { mutableStateOf("India") }
    var expanded by remember { mutableStateOf(false) }
    var textFieldSize by remember { mutableStateOf(Size.Zero) }

    val filteredCountries = if (selectedCountry.isNotEmpty()) {
        helplines.filter { it.country.lowercase().contains(selectedCountry.lowercase()) }
    } else {
        helplines
    }

    Column(
        modifier = Modifier
            .padding(vertical = 30.dp)
            .fillMaxWidth()
    ) {
        TextField(
            modifier = Modifier
                .height(55.dp)
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .onGloballyPositioned { coordinates ->
                    textFieldSize = coordinates.size.toSize()
                },
            value = selectedCountry,
            onValueChange = {
                selectedCountry = it
                expanded = true
            },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0xFF3F6F66),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                cursorColor = Color.Black
            ),
            textStyle = TextStyle(
                color = Color.Black,
                fontSize = 16.sp
            ),
            shape = RoundedCornerShape(15.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            ),
            singleLine = true,
            trailingIcon = {
                val selectedFlagUrl = helplines.find { it.country == selectedCountry }?.flagUrl
                selectedFlagUrl?.let {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data(it)
                            .crossfade(true)
                            .build(),
                        contentDescription = "Flag of $selectedCountry",
                        modifier = Modifier
                            .size(45.dp)
                            .padding(end = 10.dp)
                            .clickable {
                                expanded = !expanded
                            }
                    )
                }
            }
        )

        AnimatedVisibility(visible = expanded) {
            Card(
                modifier = Modifier
                    .width(textFieldSize.width.dp)
                    .padding(horizontal = 20.dp),
                shape = RoundedCornerShape(15.dp),
            ) {
                LazyColumn(
                    modifier = Modifier.heightIn(max = 250.dp),
                ) {
                    items(filteredCountries) { helpline ->
                        CountryItem(helpline = helpline) { selected ->
                            selectedCountry = selected.country
                            expanded = false
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.padding(top = 20.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier
                .padding(horizontal = 15.dp)
                .background(Color(0xFFF88800), shape = RoundedCornerShape(16.dp))
                .padding(12.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.warning), contentDescription = "Warning icon", modifier = Modifier.size(24.dp))
            Text(
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                        append("Warning: ")
                    }
                    append("Clicking on any helpline number will immediately make a call.")
                },
                style = TextStyle(fontSize = 14.sp, color = Color.Black)
            )
        }

        if (selectedCountry.isNotEmpty()) {
            val selectedHelpline = helplines.find { it.country == selectedCountry }
            selectedHelpline?.let { helpline ->
                LazyVerticalGrid(
                    columns = GridCells.Fixed(2),
                    verticalArrangement = Arrangement.spacedBy(15.dp),
                    horizontalArrangement = Arrangement.spacedBy(15.dp),
                    contentPadding = PaddingValues(15.dp),
                ) {
                    items(helpline.emergency.toList()) { (service, number) ->
                        HelplineCard(number, service, true)
                    }
                    items(helpline.otherHelplines.toList()) { (service, number) ->
                        HelplineCard(number, service, false)
                    }
                }
            }
        }
    }
}

@Composable
fun HelplineCard(number: String, title: String, isEmergency: Boolean) {
    Box(
        modifier = Modifier
            .width(160.dp)
            .height(100.dp)
            .border(
                2.dp,
                if (isEmergency) Color(0xFFF98866) else Color(0xFF3F6F66),
                shape = RoundedCornerShape(16.dp)
            )
            .background(Color(0xFF31473A), shape = RoundedCornerShape(16.dp)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            AutoResizedText(text = number, color = Color(0xFFF98866), style = TextStyle(fontSize = 22.sp, fontWeight = FontWeight.Bold))
            Spacer(modifier = Modifier.padding(vertical = 5.dp))
            AutoResizedText(text = title, color = Color(0xFFFFF2D7), style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Normal))

        }
    }
}


@Composable
fun CountryItem(
    helpline: Helpline,
    onSelect: (Helpline) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onSelect(helpline) }
            .padding(10.dp)
    ) {
        Text(text = helpline.country, fontSize = 16.sp)
    }
}

@Composable
fun AutoResizedText(
    modifier: Modifier = Modifier,
    text: String,
    style: TextStyle = TextStyle(fontSize = 22.sp),
    color: Color = style.color
) {
    var resizedTextStyle by remember { mutableStateOf(style) }
    val defaultFontSize = MaterialTheme.typography.bodyMedium.fontSize

    Text(
        text = text,
        color = color,
        modifier = modifier.padding(horizontal = 8.dp),
        style = resizedTextStyle,
        softWrap = false,
        onTextLayout = { result ->
            if (result.didOverflowWidth) {
                resizedTextStyle = resizedTextStyle.copy(
                    fontSize = if (resizedTextStyle.fontSize.isUnspecified) defaultFontSize else resizedTextStyle.fontSize * 0.95
                )
            }
        }
    )
}


