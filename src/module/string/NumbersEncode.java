package module.string;

import java.util.HashMap;

public class NumbersEncode extends Encode {
	
	public NumbersEncode(){
		this.map = new HashMap<String, String>();
		this.map.put("0", "zero");
		this.map.put("1", "um");
		this.map.put("2", "dois");
		this.map.put("3", "três");
		this.map.put("4", "quatro");
		this.map.put("5", "cinco");
		this.map.put("6", "seis");
		this.map.put("7", "sete");
		this.map.put("8", "oito");
		this.map.put("9", "nove");
		
	}

}
