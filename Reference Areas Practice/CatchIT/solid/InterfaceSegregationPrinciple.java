package CatchIT.solid;

public class InterfaceSegregationPrinciple {
	interface Animal {
	    void fly();
	    void swim();
	    void run();
	}

	class Duck implements Animal {
	    public void fly() {
	        // Duck flying logic
	    }

	    public void swim() {
	        // Duck swimming logic
	    }

	    public void run() {
	        // Duck running logic
	    }
	}

	class Fish implements Animal {
	    public void fly() {
	        // Fish cannot fly, this is unnecessary and breaks ISP
	    }

	    public void swim() {
	        // Fish swimming logic
	    }

	    public void run() {
	        // Fish cannot run, this is unnecessary and breaks ISP
	    }
	}
	
	interface Swimmable {
	    void swim();
	}

	interface Flyable {
	    void fly();
	}

	interface Runnable {
	    void run();
	}

	class Duck implements Flyable, Swimmable, Runnable {
	    public void fly() {
	        // Duck flying logic
	    }

	    public void swim() {
	        // Duck swimming logic
	    }

	    public void run() {
	        // Duck running logic
	    }
	}

	class Fish implements Swimmable {
	    public void swim() {
	        // Fish swimming logic
	    }
	}
}
