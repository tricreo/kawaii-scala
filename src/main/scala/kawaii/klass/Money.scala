package kawaii.klass
import java.util.Currency

/**
 * お金を表すクラス。
 * クラス名の後の引数はコンストラクタの引数を表す。プライマリコンストラクタと呼ぶ。
 */
class Money(amnt: BigDecimal, curency: Currency) {
  val amount = BigDecimal
  val currency = curency
}