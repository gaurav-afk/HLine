package com.example.hline


data class Helpline(
    val country: String,
    val emergency: Map<String, String>,
    val otherHelplines: Map<String, String>,
    val flagUrl: String
)

val helplines = listOf(
    Helpline(
        country = "United States",
        emergency = mapOf(
            "Police" to "911",
            "Ambulance" to "911",
            "Fire" to "911"
        ),
        otherHelplines = mapOf(
            "Women’s Helpline" to "1-800-799-7233",
            "Child Helpline" to "1-800-422-4453",
            "Poison Control" to "1-800-222-1222",
            "Suicide Prevention" to "988"
        ),
        flagUrl = "https://www.worldometers.info/img/flags/us-flag.gif"
    ),
    Helpline(
        country = "United Kingdom",
        emergency = mapOf(
            "Police" to "999",
            "Ambulance" to "999",
            "Fire" to "999"
        ),
        otherHelplines = mapOf(
            "Child Helpline" to "0808 800 5000",
            "Suicide Prevention" to "116 123",
            "Domestic Violence" to "0808 2000 247",
            "Poison Control" to "0345 460 0906"
        ),
        flagUrl = "https://www.worldometers.info/img/flags/uk-flag.gif"
    ),
    Helpline(
        country = "Canada",
        emergency = mapOf(
            "Police" to "911",
            "Ambulance" to "911",
            "Fire" to "911"
        ),
        otherHelplines = mapOf(
            "Suicide Prevention" to "1-833-456-4566",
            "Child Helpline" to "1-800-668-6868",
            "Poison Control" to "1-800-268-9017",
            "Domestic Violence" to "1-877-977-0007"
        ),
        flagUrl = "https://www.worldometers.info/img/flags/ca-flag.gif"
    ),
    Helpline(
        country = "Australia",
        emergency = mapOf(
            "Police" to "000",
            "Ambulance" to "000",
            "Fire" to "000"
        ),
        otherHelplines = mapOf(
            "Lifeline" to "13 11 14",
            "Suicide Prevention" to "13 11 14",
            "Kids Helpline" to "1800 55 1800",
            "Poison Control" to "13 11 26"
        ),
        flagUrl = "https://www.worldometers.info/img/flags/as-flag.gif"
    ),
    Helpline(
        country = "India",
        emergency = mapOf(
            "Police" to "100",
            "Ambulance" to "102",
            "Fire" to "101"
        ),
        otherHelplines = mapOf(
            "Women’s Helpline" to "1091",
            "Child Helpline" to "1098",
            "Suicide Prevention" to "91-22-2772 6771",
            "Poison Control" to "1800-11-7666"
        ),
        flagUrl = "https://www.worldometers.info/img/flags/in-flag.gif"
    ),
    Helpline(
        country = "Germany",
        emergency = mapOf(
            "Police" to "110",
            "Ambulance" to "112",
            "Fire" to "112"
        ),
        otherHelplines = mapOf(
            "Women’s Helpline" to "08000 116 016",
            "Child Helpline" to "0800 111 0222",
            "Suicide Prevention" to "0800 111 0111",
            "Poison Control" to "030-19240"
        ),
        flagUrl = "https://www.worldometers.info/img/flags/gm-flag.gif"
    ),
    Helpline(
        country = "France",
        emergency = mapOf(
            "Police" to "17",
            "Ambulance" to "15",
            "Fire" to "18"
        ),
        otherHelplines = mapOf(
            "Women’s Helpline" to "3919",
            "Child Helpline" to "119",
            "Suicide Prevention" to "01 45 39 40 00",
            "Poison Control" to "01 40 05 48 48"
        ),
        flagUrl = "https://www.worldometers.info/img/flags/fr-flag.gif"
    ),
    Helpline(
        country = "Italy",
        emergency = mapOf(
            "Police" to "113",
            "Ambulance" to "118",
            "Fire" to "115"
        ),
        otherHelplines = mapOf(
            "Women’s Helpline" to "1522",
            "Child Helpline" to "114",
            "Suicide Prevention" to "800 860 022",
            "Poison Control" to "800 883 300"
        ),
        flagUrl = "https://www.worldometers.info/img/flags/it-flag.gif"
    ),
    Helpline(
        country = "Japan",
        emergency = mapOf(
            "Police" to "110",
            "Ambulance" to "119",
            "Fire" to "119"
        ),
        otherHelplines = mapOf(
            "Women’s Helpline" to "0570-003-110",
            "Child Helpline" to "189",
            "Suicide Prevention" to "03-5774-0992",
            "Poison Control" to "03-3212-2321"
        ),
        flagUrl = "https://www.worldometers.info/img/flags/ja-flag.gif"
    ),
    Helpline(
        country = "South Africa",
        emergency = mapOf(
            "Police" to "10111",
            "Ambulance" to "10177",
            "Fire" to "10177"
        ),
        otherHelplines = mapOf(
            "Women’s Helpline" to "0800 150 150",
            "Child Helpline" to "0800 055 555",
            "Suicide Prevention" to "0800 567 567",
            "Poison Control" to "021-931-6129"
        ),
        flagUrl = "https://www.worldometers.info/img/flags/sf-flag.gif"
    ),
    Helpline(
        country = "Brazil",
        emergency = mapOf(
            "Police" to "190",
            "Ambulance" to "192",
            "Fire" to "193"
        ),
        otherHelplines = mapOf(
            "Women’s Helpline" to "180",
            "Child Helpline" to "100",
            "Suicide Prevention" to "188",
            "Poison Control" to "0800 722 6001"
        ),
        flagUrl = "https://www.worldometers.info/img/flags/br-flag.gif"
    ),
    Helpline(
        country = "Mexico",
        emergency = mapOf(
            "Police" to "911",
            "Ambulance" to "911",
            "Fire" to "911"
        ),
        otherHelplines = mapOf(
            "Women’s Helpline" to "800 822 6605",
            "Child Helpline" to "800 900 8080",
            "Suicide Prevention" to "914 590 055",
            "Poison Control" to "91 562 04 20"
        ),
        flagUrl = "https://www.worldometers.info/img/flags/mx-flag.gif"
    ),
    Helpline(
        country = "Spain",
        emergency = mapOf(
            "Police" to "112",
            "Ambulance" to "112",
            "Fire" to "112"
        ),
        otherHelplines = mapOf(
            "Women’s Helpline" to "016",
            "Child Helpline" to "116 111",
            "Suicide Prevention" to "717 003 717",
            "Poison Control" to "91 562 04 20"
        ),
        flagUrl = "https://www.worldometers.info/img/flags/sp-flag.gif"
    ),
    Helpline(
        country = "Russia",
        emergency = mapOf(
            "Police" to "102",
            "Ambulance" to "103",
            "Fire" to "101"
        ),
        otherHelplines = mapOf(
            "Women’s Helpline" to "8-800-2000-122",
            "Child Helpline" to "8-800-100-16-11",
            "Suicide Prevention" to "8-800-200-34-11",
            "Poison Control" to "8-800-200-34-11"
        ),
        flagUrl = "https://www.worldometers.info/img/flags/rs-flag.gif"
    ),
)


fun main() {
    for (helpline in helplines) {
        println("Country: ${helpline.country}")
        println("Emergency Services:")
        helpline.emergency.forEach { (service, number) -> println("  $service: $number") }
        println("Other Helplines:")
        helpline.otherHelplines.forEach { (service, number) -> println("  $service: $number") }
        println()
    }
}
