package kawaii.klass.equals_hashCode
import java.util.Currency

/**
 * equalsとhashCodeを自前で実装した例
 */
class Money(val amount: BigDecimal, val currency: Currency) {

  override def equals(obj: Any) = obj match {
    case that: Money => amount == that.amount && currency == that.currency
    case _ => false
  }

  override def hashCode = amount.## + currency.##

}