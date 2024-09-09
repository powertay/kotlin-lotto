import org.assertj.core.api.Assertions.assertThatIllegalStateException
import org.junit.jupiter.api.Test

class LottoNumber(
    private val number: Int
) {
    init {
        check(number in 1..45) { "로또의 숫자는 1-45 여야 합니다." }
    }
}

class LottoTest {

    @Test
    fun `로또의 숫자는 1-45이다`() {
        assertThatIllegalStateException()
            .isThrownBy { LottoNumber(46) }
            .withMessage("로또의 숫자는 1-45 여야 합니다.")
    }
}
