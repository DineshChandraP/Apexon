
public class Test_Q2_DailyTemperature {

	public static int[] getwarmerTemp(int[] temp) {
		int n = temp.length;

		if (n == 0) {
			int[] ans = { 0 };
			return ans;
		}
		int[] ans = new int[n];
		for (int i = 0; i < n; i++) {
			int currTemp = temp[i];
			int count = 0;
			for (int j = i + 1; j < n; j++) {
				if (temp[j] > currTemp) {
					ans[i] = j - i;
					break;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] temp = { 73, 74, 75, 71, 69, 72, 76, 73 };
		// int[] temp1 = {};
		int arr[] = getwarmerTemp(temp);
		for (int each : arr) {
			System.out.print(each + " ");
		}
	}
}
