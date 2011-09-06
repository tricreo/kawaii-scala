package kawaii.klass.accessor
import org.scalatest.junit.AssertionsForJUnit
import java.util.Currency
import org.junit.Test

class MoneyTest extends AssertionsForJUnit {

  @Test
  def testAccessor {
    val currency = Currency.getInstance("JPY")
    val a = new Money

    a.amount = BigDecimal(100)
    a.currency = currency

    assert(a.amount == BigDecimal(100))
    assert(a.currency == currency)

  }

}