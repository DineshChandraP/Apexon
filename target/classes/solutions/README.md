S.No.	Challenge		Remarks
			
1	"Convert a string as given in the format below:

Example:
aabbb into a2b3
aaaa into a4
a into a1"		Run Length Encoding
2	"Given a dictionary (list of words) and a substring, you have to return the length of the longest word in the dictinary containing the substring.

Example:
String[] dict = {""CODGE"", ""ODG"", ""LODGES"", ""SODG"", ""dodge"", ""mODJ"", ""LODGESSSS""}
String toSearch = ""ODG"";

//Returns 9 (LODGESSSS)"		
3	Write a program to print the inorder traversal of a binary tree.		Standard question
4	"Given the string (containing directions e.g., U, R, D, L) and initial coordinates (0,0),
return the final coordinates after traversing the string.

Examples:
Given (0,0) and String - ""UUU""
    Answer : (0,3)

Given (0,0) and String - ""URRDDL""
    Answer : (1,-1)

Additional testcase : String - ""DOWN UP 2xRIGHT DOWN 3xLEFT""
    Answer : (-1,-1)"		"For the additional test case, 
the strings DOWN, UP, RIGHT AND LEFT should be reduced to their first character;
2xRIGHT means move right twice.

So, DOWN UP 2xRIGHT DOWN 3xLEFT
    translates to the string DURRDLLL."
5	"Find the median of two sorted arrays of different sizes.

Example:
arr1[] = {2, 3, 5, 8}
arr2[] = {10, 12, 14, 16, 18, 20}

//Return 11 as the median"		"The merged array is :
        arr3[] = {2, 3, 5, 8, 10, 12, 14, 16, 18, 20}
        if the number of the elements are even, 
        so there are two middle elements,
        take the average between the two :
        (10 + 12) / 2 = 11.

Taken from GeeksforGeeks."
6	"How does a HashMap work internally? 
Code a simplistic version of the working.
    - Implement Put/Get methods.
    - Scaling the HashMap when it reaches full capacity."		"The link below shall help:
Internal Working of HashMap - GeeksforGeeks"
7	"Prefix Search
    Given a document and a prefix, return all the words starting with the prefix.

Example:
Say the document is a string of words,
    String[] arr = {""apple"", ""applet"", ""bread"", ""aper""};
    String prefix = ""app"";

    // Return apple, applet"		Tries should be the choice of available data structures.
8	"Given a string,
    return the first non-repeating character.

Examples:
String str1 = ""12345""
    //Return 1

String str2 = ""abbacd""
    //Return c"		
9	"Given a sentence/phrase and two words,
    return the minimum distance between the words.

Example:
    String str = “the quick the brown quick brown the frog”
    String word1 = “quick”
    String word2 = ""frog""

    //Return 2"		
10	"Implement your custom atoi function in Java.
    Given a string, you have to convert into integer. The input string may contain alphabets and special characters alongside numbers (both negative and positive).

Examples:
    String str1 = ""123"";     //Return 123 (in integer format)
    
    String str2 = ""-123"";    //Return -123

    String str3 = ""1a23"";   //Return -1 (Invalid entry)"		
11	"Given a sorted rotated array,
    return the minimum element from it.

Examples:
    int[] arr1 = {5, 6, 1, 2, 3, 4};    //Return 1

    int[] arr2 = {1, 2, 3, 4};            //Return 1"		We are looking for a solution with O(log n) complexity.
12	"We are given a chess board and a piece with a fixed position (immoveable). We also have a bishop on the board which, well of course, can only move diagonally.
    - Return ""YES"" if we can reach the immoveable piece using the bishop, else return ""NO"".
    - If ""YES"", return the number of minimum steps it takes for the bishop to reach the immoveable piece."		"Hint:
    Something to do with the number of squares on the x and y axes."
13	"Given an array of integers and a sum K,
    return the length of the shortest sub-array which matches the given sum. If it doesn't exist, return -1.
    [Even a single integer can be considered as a sum.]

Examples:
    int[] arr = {2, 4, 6, 10, 2, 1}, K = 12        // Return 2

    int[] arr = {5, 8, 50, 4}, K = 50                // Return 50 (A single integer may be considered as a sum)"		"Explanation:
    All possible subarrays with sum 12 are {2, 4, 6} and {10, 2}."
14	Check whether a number is a power of 10.		
15	"Given a list of student names and corresponding marks,
    return the highest average marks (and print the corresponding student name - optional).
    The marks can be negative as well and a student may have multiple marks.

Example:
 String 2D array= {{"Charles", 84},  {"John", 100},{"Andy", 37},{"John", 23}{"Charles",20}};
    //Return 61.5 (which is of John's)
16	"Given an array of strings,
    return the IP address that occurs maximum number of times. 
    [You might have to check for the validity of the IP address before considering it].

Example:
    String [] str = {
                              ""10.0.0.1 bytes=32 time=50ms TTL=63"",
                              ""10.0.0.2 bytes=32 time=50ms TTL=73"",
                              ""10.0.0.4 bytes=32 time=50ms TTL=83"",
                              ""10.0.0.2 bytes=32 time=50ms TTL=93"",
                            }

    // Return 10.0.0.2"		
17	"Given a dictionary (list of words) and a word,
    return an array of strings that can be formed from the given word.
    [Every letter in the input word can occur only once in the word to be returned].

Examples:
    String[] dict = {""ab"", ""abcd"", ""bcdaf"", ""bcad"", ""acb"", ""acab""};
    String input = ""abcd"";
    // Return {""abcd"", ""bcad""}

    String[] dict =  {""ab"", ""abcd"", ""bcdaf"", ""bcad"", ""acaab"", ""acab""};
    String input = ""caab"";
    // Return {""acab""}"		
18	"Given a sorted array of non-negative integers of size n,
    return the smallest missing integer.

Examples:
    int[] arr1 = {1, 2, 3, 4};    // Return 0

    int[] arr2 = {0, 1, 3, 4};    // Return 2"		
19	"Given two integers representing the numerator and denominator of a fraction, 
    return the fraction in string format. 
    [If the fractional part is repeating, enclose the repeating part in parentheses].

Examples:
    Numerator = 1, Denominator = 2
    // Return ""0.5""

    Numerator = 1, Denominator = -2
    // Return ""-0.5""

    Numerator = 50, Denominator = 22
    // Return ""2.(27)""  [Fractional part (27) is repeating, hence enclosed in paranthesis]"		"Link to the problem (GeeksforGeeks):
    Represent the fraction of two numbers in the string format"
20	"Given a string,
    return the starting index & length of the longest substring containing the same character.

Example:
    String[] str = ""aabbbbCCddd"";    // Return 2 (index) and substring ""bbbb"""		Minor variation of the standard Run Length Encoding problem.
21	"Give two fractions, the numerator and denominator represented as a pair of ints,
    return them in their simplest form after adding them.

Examples:
    {Numerator_frac1 = 1, Denominator_frac1 = 3}                // 1/3
    {Numerator_frac2 = 3, Denominator_frac2 = 9}                // 3/9
    // Return Numerator_ans = 2, Denominator_ans = 3       // 2/3

    {Numerator_frac1 = 1, Denominator_frac1 = 2}               // 1/2
    {Numerator_frac2 = 3, Denominator_frac2 = 2}               // 3/2
    // Return Numerator_ans = 2, Denominator_ans = 1      // 2/1"		"Link to the problem (GeeksforGeeks):
    Program to add two fractions
"
22	"A staircase with n steps is given. Starting from the base,
    return the number of ways of reaching the n’th stair.
    [The person can climb either 1 or 2 stairs in one move]."		"Link to the problem (GeeksforGeeks):
    Count ways to reach the n’th stair"
23	"Given a matrix of size m * n,
    return the maximum path sum in the matrix.
    [You start from the top-left corner of the matrix and may up, down and diagonally].

Example:
    Matrix      10 10  2  0 20  4
                       1  0  0 30  2  5
                       0 10  4  0  2  0
                       1  0  2 20  0  4
    
    // Return 74 [The maximum sum path is 20-30-4-20]"		"Link to the problem (GeeksforGeeks):
    Maximum path sum in matrix"
24	"Given a string,
    return the pallindrome of maximum length and its length. 
    (So, you return both the relevant pallindrome substring and its length).

Example:
    String str = ""forgeeksskeegfor"";    // Return {""geeksskeeg"",  10}"		"Link to the problem (GeeksforGeeks):
    Longest Palindromic Substring

On a sidenote, this and the above two problems use the Dynamic Programming (DP) Approach. Asked in almost all the interviews here, there is a high chance you might encounter one. So, it is suggested that you solve as many standard DP questions as possible from any website/videos of your choice."
25	"The following is a puzzle. You could code this but ideally you're supposed to (or asked to) give the answer by solving it on paper.

You are given 100 bulbs. There are going to be 100 iterations, in each iteration you toggle the switch for bulbs numbered by the multiples of the iterating variable. Return the number of bulbs remaining after all the 100 passes.      

    As in, in the 1st iteration - all the bulbs with the multiples of 1 would be toggled.            
               in the 2nd iteration - all the bulbs with only multiples of 2 would be toggled.      "		"Keep in mind - 'toggled' - that is in every iteration, specific bulbs are getting turned on and off.

Link to the solution:
    100 Light Bulbs Puzzle"
26	"A group of students are sitting in a circle. The teacher is electing a new class president. The teacher does this by singing a song while walking around the circle. After the song is finished the student at which the teacher stopped is removed from the circle. Starting at the student next to the one that was just removed, the teacher resumes singing and walking around the circle. After the teacher is done singing, the next student is removed. The teacher repeats this until one student is left.
A song of length k will result in the teacher walking past k students on each round. The students are numbered 1 to n. The teacher starts at student 1.
For example, suppose the song length is two(k=2). And there are four students to start with (1,2,3,4). The first student to go would be '2', after that '4', and after that '3’. Student '1' would be the next president in this example.

    n - the number of students sitting in a circle
    k - the length (in students) of each song.

return the number of the student that is elected."		You are to apply the Josephus Problem approach here.
27	"Given an array of integers (positive and negative),
    return length of the loop, if it exists. Else return -1.
    [ Rules for the movement - Index to move to,
        for +ve numbers - (i + arr[i])%n
        for -ve numbers - (i - arr[i])%n ]

Example:
    int[] arr = {2, -1, 1, 2, 2}    
    // Returns 3  [There is a loop in this array because 0 moves to 2, 2 moves to 3, and 3 moves to 0.]"		"Link to the problem (GeeksforGeeks):
    Check loop in array according to given constraints"
28	"Given an array of integers,
    sort it in a wave form.
    [ The order of elements in a wave form:
       arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= ….. ]

Example:
    int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
    Answer : arr[] = {10, 5, 6, 2, 20, 3, 100, 80} OR {20, 5, 10, 2, 80, 6, 100, 3}"		
29	"Pascal Triangle
        generate the Pascal Triangle, OR
        generate a specified row of the Pascal Triangle, OR
        calculate the element at a specified row and column."		
30	"Conceptual:
    Method overloading and method overriding in Java."		
31	"Conceptual:
    What are immutable classes?"		
32	"Conceptual:
    Explain the difference between Hashmap and Concurrent Hashmap."		