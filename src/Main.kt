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
    for(i in deck.cards){
        println("Value ${i.value} and Suite: ${i.suit}")
    }
    deck.shuffleCards()
    println("Shuffeld")
    for(i in deck.cards) {
        println("Value ${i.value} and Suite: ${i.suit}")
    }
}