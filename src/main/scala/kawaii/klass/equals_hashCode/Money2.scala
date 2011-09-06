package kawaii.klass.equals_hashCode
import java.util.Currency

/**
 * ケースクラスを使うことでequals, hashCodeを自動生成。
 */
case class Money2(amount: BigDecimal, currency: Currency)