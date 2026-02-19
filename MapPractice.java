package JavavivaPractice;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

	public static void main(String[] args) {
	Map<Integer, String> m1 = new HashMap<>();
	
	m1.put(123, "pallavi");
	m1.put(132, "priash");
	m1.put(321, "pramod");
	
	System.out.println(m1);
	System.out.println(m1.containsKey(123));
	System.out.println(m1.containsValue("pramod"));
	
	}

}
