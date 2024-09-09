class Lotto(
    private val lottoNumbers: Set<LottoNumber>
) {
    fun contains(lottoNumber: LottoNumber): Boolean {
        return lottoNumbers.contains(lottoNumber)
    }

    constructor(lottoNumbers: List<Int>) : this(lottoNumbers.map { LottoNumber(it) }.toSet())

    init {
        check(lottoNumbers.size == 6) { "로또는 6개의 숫자를 가져야 한다." }
    }
}
