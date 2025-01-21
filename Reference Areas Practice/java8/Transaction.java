package java8;

import java.math.BigDecimal;

public class Transaction {

	private int id;
	private BigDecimal amount;
	private Type type;

	// public enum Type{GROCERY,ELECTRONICS,FASHION}
	public enum type1 {
		GROCERY, ELECTRONICS, FASHION
	}

	public Transaction(int id, Type type, BigDecimal amount) {
		super();
		this.id = id;
		this.amount = amount;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Trasaction [id=" + id + ", amount=" + amount + ", type=" + type + "]";
	}

}
