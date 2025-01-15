package StreamAPI;

import static java.util.Comparator.comparing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Transaction {
	public static final String GROCERY = "GROCERY";
	private int id;
	private String type;
	private double value;

	public Transaction(int id, String type, double value) {
		this.id = id;
		this.type = type;
		this.value = value;
	}

	public int getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public double getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Transaction{id=" + id + ", type='" + type + "', value=" + value + "}";
	}

	public static void main(String[] args) {
		// Sample list of transactions
		List<Transaction> transactions = Arrays.asList(
				new Transaction(1, "GROCERY", 200.50),
				new Transaction(2, "ELECTRONICS", 1500.00),
				new Transaction(3, "GROCERY", 50.75),
				new Transaction(4, "GROCERY", 300.20),
				new Transaction(5, "CLOTHING", 120.00));

		System.out.println("Printing all transactions :" + "\n" + transactions);

		List<Integer> processedList = transactions.stream()
				.filter(t -> t.getType().equals(Transaction.GROCERY))
				.sorted(comparing(Transaction::getValue).reversed())
				.map(Transaction::getId)
				.collect(Collectors.toList());
		System.out.println("Transaction IDs for GROCERY transactions, sorted by value (descending):");
		processedList.forEach(System.out::println);
	}
}
