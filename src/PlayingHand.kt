data class PlayingHand (val cards: ArrayList<Card>) {
    fun putCardOnPlayingDeck (deck: DeckOfCards, position: Int){
        deck.pushCard(cards[position]);
        cards.removeAt(position);
    }
}