
public class SortArray {

	public static void main(String[] args) {

		int arr[]= {1,3,-4,2,-9, 10,-1};
		
		int sortedArray[]= sortArrayByDesc(arr);
		
		for(int i: sortedArray) {
			System.out.print(i+" ");
		}
	}

	private static int[] sortArrayByDesc(int[] arr) {

		int start=0;
		int end=arr.length-1;
		
		while(start!=end) {
			
			if(arr[start]>0 && arr[end]<0) {
				int temp= arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}else if(arr[start]< 0) {
				start++;
			}else if(arr[end]>0) {
				end--;
			}
			
		}
		return arr;
	}

}
