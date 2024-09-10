package lotto

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatIllegalStateException
import org.junit.jupiter.api.Test

class LottoTest {

    @Test
    fun `로또는 6개의 숫자를 갖고 있다`() {
        assertThatIllegalStateException()
            .isThrownBy { Lotto(3) }
            .withMessage("로또는 6개의 숫자를 가져야 한다.")
    }

    @Test
    fun `로또번호가 포함되어있는지 확인한다`() {
        val lotto = Lotto(1, 2, 3, 4, 5, 6)
        val actual = lotto.contains(LottoNumber(1))
        assertThat(actual).isTrue()
    }
}
