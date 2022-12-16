package vendingmachine

import kotlin.random.Random

enum class Coin(private val amount: Int) {
    COIN_500(500), COIN_100(100), COIN_50(50), COIN_10(10);

    fun getAmount(): Int = amount

    fun makeCoin() {
        var money = getAmount()
        while (money > 0) {
            val randomCoin = listOf(COIN_500, COIN_100, COIN_50, COIN_10).random()
            if (money >= randomCoin.amount){
                money -= randomCoin.amount
            }
        }
    }
}
