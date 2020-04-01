fun main(){
    var cards = ArrayList<Card>()
    val suites = enumValues<Suits>()
    for (i in 1..15){
        for(x in suites){
            val card = Card(x, i);
            cards.add(card);
        }
    }
    val deck = DeckOfCards(cards);
    deck.shuffleCards()

    var playingHand1 = PlayingHand(getCardsFromDeck(deck, 4));
    var playingHand2 = PlayingHand(getCardsFromDeck(deck, 4));

    println("First player's hand")
    for (i in playingHand1.cards){
        println("Value: ${i.value} and suite: ${i.suit}")
    }
    println("Second player's hand")
    for (i in playingHand2.cards){
        println("Value: ${i.value} and suite: ${i.suit}")
    }

}

fun getCardsFromDeck(deck: DeckOfCards, number: Int): ArrayList<Card>{
    val cardsArray = ArrayList<Card>()
    for(i in 0 until number){
        cardsArray.add(deck.removeFirstCard())
    }
    return cardsArray
}
