package module.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class Encode {
	Map<String, String> map;
	
	public String encode(String password){
		for(Entry<String, String> mapValue : this.map.entrySet()){
			password = password.replaceAll(mapValue.getKey(), mapValue.getValue());
		}
		
		return password;
	}
}
