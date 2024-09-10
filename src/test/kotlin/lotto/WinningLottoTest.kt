package lotto

import org.assertj.core.api.Assertions.assertThatIllegalStateException
import org.junit.jupiter.api.Test

class WinningLottoTest {

    @Test
    fun `당첨 로또 번호 6개와 보너스 번호 1개는 달라야 한다`() {
        val winningLottoNumbers = Lotto(1, 2, 3, 4, 5, 6)
        val bonusLotto = LottoNumber(6)
        assertThatIllegalStateException().isThrownBy { WinningLotto(winningLottoNumbers, bonusLotto) }
            .withMessage("당첨로또번호 6개 중 보너스번호가 동일합니다.")
    }
}
