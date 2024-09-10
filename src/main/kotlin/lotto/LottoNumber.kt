package lotto

data class LottoNumber(
    private val number: Int
) {
    init {
        check(number in 1..45) { "로또의 숫자는 1-45 여야 합니다." }
    }

    companion object {
        private val NUMBERS: Map<Int, LottoNumber> = (1..45).associateWith(::LottoNumber)

        fun from(number: Int): LottoNumber {
            return NUMBERS[number] ?: LottoNumber(number)
        }
    }
}
