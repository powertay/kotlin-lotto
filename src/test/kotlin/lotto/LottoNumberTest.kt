package lotto

import org.assertj.core.api.Assertions.assertThatIllegalStateException
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow

class LottoNumberTest {

    @Test
    fun `로또의 숫자는 1-45이다`() {
        assertThatIllegalStateException()
            .isThrownBy { LottoNumber(0) }
            .withMessage("로또의 숫자는 1-45 여야 합니다.")
        assertThatIllegalStateException()
            .isThrownBy { LottoNumber(46) }
            .withMessage("로또의 숫자는 1-45 여야 합니다.")
        assertDoesNotThrow { LottoNumber(1) }
        assertDoesNotThrow { LottoNumber(45) }
    }
}
