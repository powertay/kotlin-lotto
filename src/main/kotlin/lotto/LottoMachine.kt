package lotto

class LottoMachine {
    fun issue(inputMoney: Int): Set<Lotto> {
        val count = inputMoney / LOTTO_PRICE
        return (1..count)
            .map { Lotto(LOTTO_NUMBERS.shuffled().take(6)) }
            .toSet()
    }

    companion object {
        private val LOTTO_NUMBERS: Set<Int> = (1..45).toSet()
        private const val LOTTO_PRICE: Int = 1000
    }
}
