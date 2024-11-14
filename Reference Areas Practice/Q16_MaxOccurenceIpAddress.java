import java.util.HashMap;
import java.util.Map;

public class Q16_MaxOccurenceIpAddress {
	/*
	 * "Given an array of strings, return the IP address that occurs maximum number
	 * of times. [You might have to check for the validity of the IP address before
	 * considering it].
	 * 
	 * Example: String [] str = { ""10.0.0.1 bytes=32 time=50ms TTL=63"", ""10.0.0.2
	 * bytes=32 time=50ms TTL=73"", ""10.0.0.4 bytes=32 time=50ms TTL=83"",
	 * ""10.0.0.2 bytes=32 time=50ms TTL=93"", }
	 * 
	 * // Return 10.0.0.2"
	 */

	public static void main(String[] args) {
		String[] str = { "10.0.0.1 bytes=32 time=50ms TTL=63", "10.0.0.2 bytes=32 time=50ms TTL=73",
				"10.0.0.4 bytes=32 time=50ms TTL=83", "10.0.0.2 bytes=32 time=50ms TTL=93" };

		System.out.println("Most frequent IP address: " + findMaxOccurrenceIP(str));
	}

	private static String findMaxOccurrenceIP(String[] logs) {

		HashMap<String, Integer> map= new HashMap<String, Integer>();
		for (String record : logs) {
			String[] splitData = record.split(" ");
			
			if (isValidIpAddress(splitData[0])) {
				map.put(splitData[0], map.getOrDefault(splitData[0], 0)+1);
			}
		}
		
		int maxOccrance=0;
		String maxOccuranceIp=null;
		for(Map.Entry<String, Integer> data: map.entrySet()) {
			if(data.getValue() >maxOccrance) {
				maxOccrance=data.getValue();
				maxOccuranceIp=data.getKey();
			}
		}
		return maxOccuranceIp;
	}

	private static boolean isValidIpAddress(String ipAddress) {
		String[] octets = ipAddress.split("\\.");

		if (octets.length != 4)
			return false;

		for (String octet : octets) {
			try {
				int value = Integer.parseInt(octet);
				if (value < 0 || value > 255) {
					return false;
				}
			} catch (Exception e) {
				return false;
			}
		}
		return true;
	}
}
