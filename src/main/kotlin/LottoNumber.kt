class LottoNumber(
    private val number: Int
) {
    init {
        check(number in 1..45) { "로또의 숫자는 1-45 여야 합니다." }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as LottoNumber

        return number == other.number
    }

    override fun hashCode(): Int {
        return number
    }
}
