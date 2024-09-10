package lotto

class WinningLotto(
    private val winningLotto: Lotto,
    private val bonusLottoNumber: LottoNumber,
) {
    init {
        check(!winningLotto.contains(bonusLottoNumber)) { "당첨로또번호 6개 중 보너스번호가 동일합니다." }
    }
}
