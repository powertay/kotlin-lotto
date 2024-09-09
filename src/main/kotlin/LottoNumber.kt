class LottoNumber(
    private val number: Int
) {
    init {
        check(number in 1..45) { "로또의 숫자는 1-45 여야 합니다." }
    }
}
