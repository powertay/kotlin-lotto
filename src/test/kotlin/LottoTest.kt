import org.assertj.core.api.Assertions.assertThatIllegalStateException
import org.junit.jupiter.api.Test

class Lotto(
    private val lottoNumbers: Set<LottoNumber>
) {
    init {
        check(lottoNumbers.size == 6) { "로또는 6개의 숫자를 가져야 한다." }
    }
}

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

    @Test
    fun `로또는 6개의 숫자를 갖고 있다`() {
        assertThatIllegalStateException()
            .isThrownBy { Lotto(setOf(LottoNumber(3))) }
            .withMessage("로또는 6개의 숫자를 가져야 한다.")
    }

}
