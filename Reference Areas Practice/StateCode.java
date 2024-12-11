import java.util.ArrayList;
import java.util.List;

public class StateCode {
	String stateCode;
	String name;

	public StateCode(String stateCode, String name) {
		super();
		this.stateCode = stateCode;
		this.name = name;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	
	@Override
	public String toString() {
		return "StateCode [stateCode=" + stateCode + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		
		List<StateCode> list= new ArrayList<>();
		list.add(new StateCode("mh", "mumbai"));
		list.add(new StateCode("gh", "ahmedabad"));
		
		
		List<StateCode> result= processData(list);
		System.out.println(result);
	}

	private static List<StateCode> processData(List<StateCode> list) {
		List<StateCode> result= new ArrayList<>();
		for(StateCode data: list) {
			if(data.getName() !=null && data.getName().startsWith("a")) {
				result.add(new StateCode(data.getStateCode(), data.getName().toUpperCase()));
			}else
				result.add(new StateCode(data.getStateCode(), data.getName()));
		}
		return result;
	}
}
