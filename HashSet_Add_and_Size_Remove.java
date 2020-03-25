package HashSet;

import java.util.HashSet;

public class HashSet_Add_and_Size_Remove {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(23);
		hs.add(new Integer(45));
		hs.add(74.5);
		hs.add("hai");
		hs.add(23);
	        System.out.println(hs.size());
	        System.out.println(hs);
	        hs.remove(23);
	        System.out.println(hs);
	}

}
