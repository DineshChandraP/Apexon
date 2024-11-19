/*
 * "The following is a puzzle. You could code this but ideally you're supposed to (or asked to) give the answer by solving it on paper.

You are given 100 bulbs. There are going to be 100 iterations, in each iteration you toggle the switch for bulbs numbered by the multiples of the iterating variable. Return the number of bulbs remaining after all the 100 passes.      

    As in, in the 1st iteration - all the bulbs with the multiples of 1 would be toggled.            
               in the 2nd iteration - all the bulbs with only multiples of 2 would be toggled.      "
 */
public class Q25_BulbPuzzle {

	public static void main(String[] args) {
		int iterations = 100;
		int bulbCount = 100;
		boolean[] bulbs = new boolean[bulbCount];

		
		for (int i = 1; i <= iterations; i++) {

			for (int j = i - 1; j < bulbs.length; j += i) {
					bulbs[j]=!bulbs[j];
			}
		}
		
		int numberOfBulbsTurnedOn=0;
		System.out.println("Bulbs which are turned on : ");
		for(int i=0 ;i< bulbs.length;i++) {
			
			if(bulbs[i]) {
				numberOfBulbsTurnedOn++;
				System.out.print(i+1+" ");
			}
		}
		System.out.println("\n\nTotal number of bulbs turned on : " +numberOfBulbsTurnedOn);
	}
}
