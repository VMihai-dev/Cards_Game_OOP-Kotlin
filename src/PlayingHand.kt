class PlayingHand (cards: ArrayList<Card>) {
    fun getCardsFromDeck(deck: DeckOfCards, number: Int): ArrayList<Card>{
        val cardsArray = ArrayList<Card>()
        for(i in 0..number){
            cardsArray.add(deck.removeFirstCard())
        }
        return cardsArray
    }
}