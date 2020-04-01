enum class Suits {
    HEARTS, CLUBS, DIAMONDS, SPADES
}

data class Card(val suit: Suits, val value: Int) {
    // This function is for the custom game that I'm building
    // where 10 and 11 (A) are counted as points
    fun isPoint(): Boolean = value == 10 || value == 11
}