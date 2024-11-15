

import java.util.Arrays;

public class Q28_WaveForm {
    
    // Function to sort the array in wave form
    public static void waveSort(int[] arr) {
        // Sort the array in increasing order
        Arrays.sort(arr);
        
        // Swap adjacent elements to create the wave form
        for (int i = 0; i < arr.length - 1; i += 2) {
            // Swap arr[i] and arr[i+1]
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    // Main method to test the waveSort function
    public static void main(String[] args) {
        int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
        
        System.out.println("Original array: " + Arrays.toString(arr));
        
        waveSort(arr);  // Sort the array in wave form
        
        System.out.println("Array in wave form: " + Arrays.toString(arr));
    }
}

