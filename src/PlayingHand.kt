//Create a playing hand with an array of cards (can get the array with getCardsFromDeck function in Main)
data class PlayingHand (val cards: ArrayList<Card>) {
    //Get a cards from the hand and put it in a deck (playing deck - used for my custom game)
    fun putCardOnPlayingDeck (deck: DeckOfCards, position: Int){
        deck.pushCard(cards[position - 1]);
        cards.removeAt(position - 1);
    }
    //Get a card from a deck (drawing a number of cards)
    fun getCardFromDeck(deck: DeckOfCards, number: Int){
        for (i in 1..number){
            cards.add(deck.removeFirstCard())
        }
    }
}