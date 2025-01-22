package CatchIT.solid;

public class LiskovSubstitutionPrinciple {
	class Rectangle {
	    protected int width, height;

	    public void setWidth(int width) {
	        this.width = width;
	    }

	    public void setHeight(int height) {
	        this.height = height;
	    }

	    public int calculateArea() {
	        return width * height;
	    }
	}
	class Square extends Rectangle {
	    @Override
	    public void setWidth(int width) {
	        this.width = width;
	        this.height = width;  // Enforcing square behavior
	    }

	    @Override
	    public void setHeight(int height) {
	        this.height = height;
	        this.width = height;  // Enforcing square behavior
	    }
	}
	
	
	abstract class Shape {
	    public abstract int calculateArea();
	}

	class Rectangle extends Shape {
	    protected int width, height;

	    public void setWidth(int width) {
	        this.width = width;
	    }

	    public void setHeight(int height) {
	        this.height = height;
	    }

	    public int calculateArea() {
	        return width * height;
	    }
	}

	class Square extends Shape {
	    private int side;

	    public void setSide(int side) {
	        this.side = side;
	    }

	    @Override
	    public int calculateArea() {
	        return side * side;
	    }
	}
}
