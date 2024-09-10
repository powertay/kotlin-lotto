package lotto

import org.assertj.core.api.Assertions.assertThatIllegalStateException
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow

class LottoNumberTest {

    @Test
    fun `로또의 숫자는 1-45이다`() {
        assertThatIllegalStateException()
            .isThrownBy { LottoNumber.from(0) }
            .withMessage("로또의 숫자는 1-45 여야 합니다.")
        assertThatIllegalStateException()
            .isThrownBy { LottoNumber.from(46) }
            .withMessage("로또의 숫자는 1-45 여야 합니다.")
        assertDoesNotThrow { LottoNumber.from(1) }
        assertDoesNotThrow { LottoNumber.from(45) }
    }
}
