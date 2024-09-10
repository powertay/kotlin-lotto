package lotto

import io.kotest.matchers.collections.shouldHaveSize
import org.junit.jupiter.api.Test

class LottoMachineTest {

    @Test
    fun `로또 발급기는 로또 가격에 맞는 개수를 발급해준다`() {
        val lottoMachine = LottoMachine()
        val actual = lottoMachine.issue(14000)
        actual shouldHaveSize 14
    }
}
