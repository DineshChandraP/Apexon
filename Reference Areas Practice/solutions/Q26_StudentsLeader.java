/*
 * "A group of students are sitting in a circle. The teacher is electing a new class president. The teacher does this by singing a song while walking around the circle. After the song is finished the student at which the teacher stopped is removed from the circle. Starting at the student next to the one that was just removed, the teacher resumes singing and walking around the circle. After the teacher is done singing, the next student is removed. The teacher repeats this until one student is left.
A song of length k will result in the teacher walking past k students on each round. The students are numbered 1 to n. The teacher starts at student 1.
For example, suppose the song length is two(k=2). And there are four students to start with (1,2,3,4). The first student to go would be '2', after that '4', and after that '3’. Student '1' would be the next president in this example.

    n - the number of students sitting in a circle
    k - the length (in students) of each song.

return the number of the student that is elected."
 */

/*
 * Josephus Problem Recursion:
The Josephus problem can be solved using a recursive approach. The recursive formula for the problem is:

Base case: If there is only one person, they are the survivor. So, J(1,k)=0 (using 0-based indexing).
Recursive case: For more than one person, the position of the survivor is given by:
J(n,k)=(J(n−1,k)+k)%n
where J(n−1,k) is the solution for n−1 people, and we add k to it, and then take the modulo n to ensure we stay within bounds of the circle.
 */
package solutions;

public class Q26_StudentsLeader {

	public static void main(String[] args) {

		int numberOfStudents = 400;

		int magicNumber = 4;

		int electedStudent = findJosephusPosition(numberOfStudents, magicNumber);

		System.out.println("Elected student : " + electedStudent);
	}

	private static int findJosephusPosition(int numberOfStudents, int magicNumber) {

		int postion = 0;

		for (int i = 2; i <= numberOfStudents; i++) {
			postion = (postion + magicNumber) % i;
		}

		return postion + 1;
	}

}
