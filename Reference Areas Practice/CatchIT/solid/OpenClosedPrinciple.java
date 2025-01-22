package CatchIT.solid;

public class OpenClosedPrinciple {
	
	class TaxCalculator {
	    public double calculateTax(String country, double amount) {
	        if (country.equals("USA")) {
	            return amount * 0.10;  // USA tax rate
	        } else if (country.equals("Canada")) {
	            return amount * 0.15;  // Canada tax rate
	        }
	        return 0;
	    }
	}
	
	interface TaxStrategy {
	    double calculateTax(double amount);
	}

	class USATaxStrategy implements TaxStrategy {
	    public double calculateTax(double amount) {
	        return amount * 0.10;  // USA tax rate
	    }
	}

	class CanadaTaxStrategy implements TaxStrategy {
	    public double calculateTax(double amount) {
	        return amount * 0.15;  // Canada tax rate
	    }
	}

	class TaxCalculator {
	    private TaxStrategy taxStrategy;

	    public TaxCalculator(TaxStrategy taxStrategy) {
	        this.taxStrategy = taxStrategy;
	    }

	    public double calculateTax(double amount) {
	        return taxStrategy.calculateTax(amount);
	    }
	}
	
	class DiscountCalculator {
	    public double calculateDiscount(String customerType, double price) {
	        if (customerType.equals("Regular")) {
	            return price * 0.10;
	        } else if (customerType.equals("Premium")) {
	            return price * 0.20;
	        }
	        return 0;
	    }
	}
	
	interface DiscountStrategy {
	    double calculateDiscount(double price);
	}

	class RegularDiscount implements DiscountStrategy {
	    public double calculateDiscount(double price) {
	        return price * 0.10;
	    }
	}

	class PremiumDiscount implements DiscountStrategy {
	    public double calculateDiscount(double price) {
	        return price * 0.20;
	    }
	}

	class DiscountCalculator {
	    private DiscountStrategy discountStrategy;

	    public DiscountCalculator(DiscountStrategy discountStrategy) {
	        this.discountStrategy = discountStrategy;
	    }

	    public double calculateDiscount(double price) {
	        return discountStrategy.calculateDiscount(price);
	    }
	}
}
