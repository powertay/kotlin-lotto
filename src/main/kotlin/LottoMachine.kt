class LottoMachine(
) {
    fun issue(inputMoney: Int): Set<Lotto> {
        val count = inputMoney / LOTTO_PRICE
        val lottos = mutableSetOf<Lotto>()

        (1..count).forEach { _ ->
            val intList = LOTTO_NUMBERS.shuffled().take(6)
            lottos.add(Lotto(intList))
        }

        return lottos
    }

    companion object {
        private val LOTTO_NUMBERS: Set<Int> = (1..45).toSet()
        private const val LOTTO_PRICE: Int = 1000
    }
}
