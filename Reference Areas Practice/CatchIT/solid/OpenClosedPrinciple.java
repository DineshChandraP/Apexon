package CatchIT.solid;

public class OpenClosedPrinciple {
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
