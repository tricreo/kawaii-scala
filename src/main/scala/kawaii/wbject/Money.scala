package kawaii.wbject
import java.util.Currency

class Money(private val amount: BigDecimal, val currency: Currency) {
  def this(amount: BigDecimal) = this(amount, Money.DEFAULT_CURRENCY)
}

object Money {
  val USD = Currency.getInstance("USD")
  val JPY = Currency.getInstance("JPY")

  private val DEFAULT_CURRENCY = JPY

  def sum1(monies: List[Money]) = {
    var result: BigDecimal = 0
    for (money <- monies) {
      result += money.amount
    }
    new Money(result)
  }

  def sum2(monies: List[Money]) = {
    val result = monies.map(_.amount).sum
    new Money(result)
  }

}