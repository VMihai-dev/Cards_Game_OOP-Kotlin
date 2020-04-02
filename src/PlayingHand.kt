data class PlayingHand (val cards: ArrayList<Card>) {
    fun putCardOnPlayingDeck (deck: DeckOfCards, position: Int){
        deck.pushCard(cards[position - 1]);
        cards.removeAt(position - 1);
    }
}