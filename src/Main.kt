import java.util.Scanner

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

    var cards2 = ArrayList<Card>()
    val playingDeck = DeckOfCards(cards2);
    for (i in 1..3){
        println("$i Round: ")
        println("First player's hand")
        for (i in playingHand1.cards){
            println("Value: ${i.value} and suite: ${i.suit}")
        }
        // Creates an instance which takes input from standard input (keyboard)
        val reader = Scanner(System.`in`)
        print("Enter a number: ")
        // nextInt() reads the next integer from the keyboard
        var integer:Int = reader.nextInt()
        playingHand1.putCardOnPlayingDeck(playingDeck, integer);

        println("Second player's hand")
        for (i in playingHand2.cards){
            println("Value: ${i.value} and suite: ${i.suit}")
        }
        print("Enter a number: ")
        // nextInt() reads the next integer from the keyboard
        integer = reader.nextInt()
        playingHand2.putCardOnPlayingDeck(playingDeck, integer);
    }

    println("This is the playing deck: ")
    for (shit in playingDeck.cards) {
        println("Value: ${shit.value} and suite: ${shit.suit}")
    }
}


fun getCardsFromDeck(deck: DeckOfCards, number: Int): ArrayList<Card>{
    val cardsArray = ArrayList<Card>()
    for(i in 0 until number){
        cardsArray.add(deck.removeFirstCard())
    }
    return cardsArray
}
