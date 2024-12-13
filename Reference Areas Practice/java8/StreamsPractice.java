package java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java8.Transaction.Type;

public class StreamsPractice {

	public static void main(String[] args) {
		 List<Transaction> transactions = new ArrayList<>();
	        transactions.add(new Transaction(1, Type.GROCERY, new BigDecimal("200.50")));
	        transactions.add(new Transaction(2, Type.FASHION, new BigDecimal("150.75")));
	        transactions.add(new Transaction(3, Type.GROCERY, new BigDecimal("50.25")));
	        transactions.add(new Transaction(4, Type.GROCERY, new BigDecimal("500.00")));
	        
	        
	}
}
