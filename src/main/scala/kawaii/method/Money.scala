package kawaii.method
import java.util.Currency

/**
 * メソッド定義の例。
 */
case class Money(amount: BigDecimal, currency: Currency) {

  /**
   * 最後の式で評価された結果が戻り値となる。
   * 戻り値の型は型推論可能。
   */
  def plus(other: Money) /*: Money */ = {
    require(currency == other.currency)
    Money(amount + other.amount, currency)
  }

  // returnを使うJava的な書き方
  def plusJavaLike(other: Money): Money = {
    require(currency == other.currency)
    return Money(amount + other.amount, currency)
  }

}