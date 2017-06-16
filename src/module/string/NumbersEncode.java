package module.string;

import java.util.HashMap;

public class NumbersEncode extends Encode {
	
	public NumbersEncode(){
		this.map = new HashMap<String, String>();
		this.map.put("0", "00");
		this.map.put("1", "01");
		this.map.put("2", "11");
		this.map.put("3", "21");

		
	}

}
