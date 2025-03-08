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
        flagUrl = "https://upload.wikimedia.org/wikipedia/commons/a/a4/Flag_of_the_United_States.svg"
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
            "Poison Control" to "1800-11-6117",
            "Suicide Prevention" to "022 2754 6669"
        ),
        flagUrl = "https://upload.wikimedia.org/wikipedia/commons/4/41/Flag_of_India.svg"
    ),
    Helpline(
        country = "United Kingdom",
        emergency = mapOf(
            "Police" to "999",
            "Ambulance" to "999",
            "Fire" to "999"
        ),
        otherHelplines = mapOf(
            "Women’s Helpline" to "0808 2000 247",
            "Child Helpline" to "0808 800 5000",
            "Poison Control" to "0844 892 0111",
            "Suicide Prevention" to "116 123"
        ),
        flagUrl = "https://upload.wikimedia.org/wikipedia/commons/a/a4/Flag_of_the_United_Kingdom.svg"
    ),
    Helpline(
        country = "Japan",
        emergency = mapOf(
            "Police" to "110",
            "Ambulance" to "119",
            "Fire" to "119"
        ),
        otherHelplines = mapOf(
            "Women’s Helpline" to "03-5774-0992",
            "Child Helpline" to "189",
            "Poison Control" to "072-727-2499",
            "Suicide Prevention" to "0570-783-556"
        ),
        flagUrl = "https://images5.alphacoders.com/687/687027.png"
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
            "Child Helpline" to "0800 111 0333",
            "Poison Control" to "030-19240",
            "Suicide Prevention" to "0800 111 0111"
        ),
        flagUrl = "https://upload.wikimedia.org/wikipedia/commons/b/ba/Flag_of_Germany.svg"
    )
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
