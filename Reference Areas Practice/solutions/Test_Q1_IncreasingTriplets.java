package solutions;

public class Test_Q1_IncreasingTriplets {
	 
	  public static boolean increasingTriplet(int[] nums) {
	      for(int i=0;i<nums.length-2;i++){
	        System.out.println(nums[i]+" "+ nums[i+1]+" "+ nums[i+2]);
	        if(nums[i]<nums[i+1] && nums[i+1]<nums[i+2] ){
	          return true;
	        }
	      }
	     return false;
	  }
	  public static void main(String[] args) {
	   int[] nums = {2,1,5,0,4,6};
	   System.out.println(increasingTriplet(nums));
	  }
	 

}
