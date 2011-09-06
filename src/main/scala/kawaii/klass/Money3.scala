package kawaii.klass
import java.util.Currency
import java.util.Locale

class Money3(val amount: BigDecimal, val currency: Currency) {

  /**
   * 補助コンストラクタ
   */
  def this(amount: BigDecimal) = this(amount, Currency.getInstance(Locale.getDefault()))

}