package lotto

import org.assertj.core.api.Assertions.assertThatIllegalStateException
import org.junit.jupiter.api.Test

class LottoNumberTest {

    @Test
    fun `로또의 숫자는 1-45이다`() {
        assertThatIllegalStateException()
            .isThrownBy { LottoNumber(46) }
            .withMessage("로또의 숫자는 1-45 여야 합니다.")
    }
}
