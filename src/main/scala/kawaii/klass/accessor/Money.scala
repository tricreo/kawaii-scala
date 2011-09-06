package kawaii.klass.accessor
import java.util.Currency

/**
 * 統一アクセスを使った例
 */
class Money {
  private var _amount: BigDecimal = _
  private var _currency: Currency = _

  // getter
  def amount = _amount

  // setter
  def amount_=(value: BigDecimal) {
    require(value >= 0)
    _amount = value
  }

  // getter
  def currency = _currency

  // setter
  def currency_=(value: Currency) {
    _currency = value
  }

}