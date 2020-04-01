import kotlin.random.Random

data class DeckOfCards (val cards: ArrayList<Card>) {
    fun pushCard(card: Card){
        cards.add(card)
    }
    fun removeFirstCard() = cards.removeAt(cards.size - 1)
    fun shuffleCards(){
        for(i in 0 until cards.size) {
            val random = Random.nextInt(from = 0, until = cards.size - 1)
            var temp = cards[i]
            cards[i] = cards[random]
            cards[random] = temp
        }
    }
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