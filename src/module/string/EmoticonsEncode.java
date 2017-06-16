package module.string;

import java.util.HashMap;

public class EmoticonsEncode extends Encode{

	public EmoticonsEncode(){
		this.map = new HashMap<String, String>();
		this.map.put("a", ":)");
		this.map.put("e", "B)");
		this.map.put("i", ":*");
		this.map.put("o", "¬¬");
		this.map.put("u", "_|_");
	}
}
