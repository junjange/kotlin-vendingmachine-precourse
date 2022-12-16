package vendingmachine

import vendingmachine.Constant.INPUT_TYPE_ERROR_MESSAGE

object Exception {
    fun String.vendingMachineAmountInputTypeException(){
        try {
            this.toInt()
        }catch (e: NumberFormatException){
             throw IllegalArgumentException(INPUT_TYPE_ERROR_MESSAGE)
        }
    }
}