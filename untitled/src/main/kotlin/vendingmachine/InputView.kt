package vendingmachine

import vendingmachine.Exception.vendingMachineAmountInputTypeException


class InputView {
    fun getVendingMachineAmount(): String {
        while (true) {
            val amount = readLine()!!
            kotlin.runCatching {
                amount.vendingMachineAmountInputTypeException()
            }.onSuccess { return amount }.onFailure { println(it.message) }
        }
    }
}