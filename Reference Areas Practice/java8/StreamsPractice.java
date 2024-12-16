package java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java8.Transaction.Type;

public class StreamsPractice {

	public static void main(String[] args) {
		 List<Transaction> transactions = new ArrayList<>();
	        transactions.add(new Transaction(1, Type.GROCERY, new BigDecimal("200.50")));
	        transactions.add(new Transaction(2, Type.FASHION, new BigDecimal("150.75")));
	        transactions.add(new Transaction(3, Type.GROCERY, new BigDecimal("50.25")));
	        transactions.add(new Transaction(4, Type.GROCERY, new BigDecimal("500.00")));
	        
	        // Filter and sort transactions
	        List<Transaction> groceryTransactions = new ArrayList<>();
	        for (Transaction t : transactions) {
	            if (t.getType() == Type.GROCERY) {
	                groceryTransactions.add(t);
	            }
	        }

	        // Sort by value in descending order
	        Collections.sort(groceryTransactions, new Comparator<Transaction>() {
	            @Override
	            public int compare(Transaction t1, Transaction t2) {
	                return t2.getAmount().compareTo(t1.getAmount());
	            }
	        });

	        // Collect the transaction IDs after sorting
	        List<Integer> transactionIds = new ArrayList<>();
	        for (Transaction t : groceryTransactions) {
	            transactionIds.add(t.getId());
	        }

	        // Print sorted transaction IDs
	        System.out.println("Sorted transaction IDs by value: " + transactionIds);
	    }
	}
