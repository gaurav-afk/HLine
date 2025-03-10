package com.example.hline

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hline.ui.theme.HLineTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HLineTheme {
                val focusManager = LocalFocusManager.current
                Scaffold(
                    topBar = { TopBar() },
                    modifier = Modifier.fillMaxSize()
                        .pointerInput(Unit) {
                            detectTapGestures(
                                onTap = {
                                    focusManager.clearFocus()
                                }
                            )
                        }

                ) { innerPadding ->
                    Column(modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xFF233733))
                        .padding(
                            top = innerPadding.calculateTopPadding(),
                            start = 0.dp,
                            end = 0.dp,
                            bottom = 0.dp
                        )
                       ) {
                        AutoCompleteSearchBar()
                    }
                }
            }
        }
    }



    @Composable
    fun TopBar() {
        Row(
            modifier = Modifier
                .padding(top = 50.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = Color(0xFFFFA07A),
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold
                        )
                    ) {
                        append("H")
                    }
                    withStyle(
                        style = SpanStyle(
                            color = Color(0xFFFFF2D7),
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold
                        )
                    ) {
                        append("Line")
                    }
                }
            )
        }
    }
}
