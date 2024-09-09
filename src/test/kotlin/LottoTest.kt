import org.assertj.core.api.Assertions.assertThatIllegalStateException
import org.junit.jupiter.api.Test

class LottoTest {

    @Test
    fun `로또는 6개의 숫자를 갖고 있다`() {
        assertThatIllegalStateException()
            .isThrownBy { Lotto(setOf(LottoNumber(3))) }
            .withMessage("로또는 6개의 숫자를 가져야 한다.")
    }
}
