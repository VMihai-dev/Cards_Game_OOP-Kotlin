import kotlin.random.Random

data class DeckOfCards (val cards: ArrayList<Card>) {
    //Pushing a card on a deck (to be used for playingDeck or playerCardsTakenDeck)
    fun pushCard(card: Card){
        cards.add(card)
    }
    //Remove the first card (to be used when drawing cards from deck)
    fun removeFirstCard() = cards.removeAt(cards.size - 1)
    //Shuffle the deck by changing positions
    fun shuffleCards(){
        for(i in 0 until cards.size) {
            val random = Random.nextInt(from = 0, until = cards.size - 1)
            var temp = cards[i]
            cards[i] = cards[random]
            cards[random] = temp
        }
    }
    //This is to be used for my custom game (points are 10 and 11)
    fun numberOfPoints(): Int{
        var points = 0;
        for(i in cards){
            if(i.value == 10 || i.value == 11){
                points++;
            }
        }
        return points;
    }
}