import java.util.Scanner

//Just a quick example, creating decks, shuffling, and putting cards from the hand using position
fun main(){
    //Constructing the deck and shuffling
    var cards = ArrayList<Card>()
    val suites = enumValues<Suits>()
    for (i in 1..14){
        for(x in suites){
            val card = Card(x, i);
            cards.add(card);
        }
    }
    val deck = DeckOfCards(cards);
    deck.shuffleCards()

    //Have 2 playing hands for 2 players
    var playingHand1 = PlayingHand(getCardsFromDeck(deck, 4));
    var playingHand2 = PlayingHand(getCardsFromDeck(deck, 4));

    //Empty array to be able to create a deck (probably need another constructor)
    var cards2 = ArrayList<Card>()
    val playingDeck = DeckOfCards(cards2);

    //Playing the game, kind of, just putting cards on a playing deck and drawing from the existing one)
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
        playingHand1.putCardOnPlayingDeck(playingDeck, integer)
        playingHand1.getCardFromDeck(deck, 1)

        println("Second player's hand")
        for (i in playingHand2.cards){
            println("Value: ${i.value} and suite: ${i.suit}")
        }
        print("Enter a number: ")
        // nextInt() reads the next integer from the keyboard
        integer = reader.nextInt()
        playingHand2.putCardOnPlayingDeck(playingDeck, integer);
        playingHand2.getCardFromDeck(deck, 1)
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
