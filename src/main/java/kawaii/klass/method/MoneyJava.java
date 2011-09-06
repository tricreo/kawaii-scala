package kawaii.klass.method;

import java.math.BigDecimal;
import java.util.Currency;

public class MoneyJava {

	private final BigDecimal amount;

	private final Currency currency;

	public MoneyJava(BigDecimal amount, Currency currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public MoneyJava plus(MoneyJava other) {
		return new MoneyJava(amount.add(other.amount), currency);
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public Currency getCurrency() {
		return currency;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result
				+ ((currency == null) ? 0 : currency.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MoneyJava other = (MoneyJava) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		return true;
	}

}
