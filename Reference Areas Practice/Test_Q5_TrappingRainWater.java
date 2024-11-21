
public class Test_Q5_TrappingRainWater {

	public static void main(String[] args) {
		int[] elevationMap = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }; // Example elevation map
		int trappedWater = trap(elevationMap);
		System.out.println("Water trapped: " + trappedWater);
	}

	public static int trap(int[] height) {
		if (height == null || height.length == 0) {
			return 0;
		}

		int left = 0;
		int right = height.length - 1;
		int leftMax = 0;
		int rightMax = 0;
		int waterTrapped = 0;

		while (left < right) {
			if (height[left] < height[right]) {
				if (height[left] >= leftMax) {
					leftMax = height[left];
				} else {
					waterTrapped += leftMax - height[left];
				}
				left++;
			} else {
				if (height[right] >= rightMax) {
					rightMax = height[right];
				} else {
					waterTrapped += rightMax - height[right];
				}
				right--;
			}
		}

		return waterTrapped;
	}
}
