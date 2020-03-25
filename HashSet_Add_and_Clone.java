package HashSet;

import java.util.HashSet;

public class HashSet_Add_and_Clone {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(23);
		hs.add(new Integer(45));
		hs.add(74.5);
		hs.add("hai");
		hs.add(23);
	HashSet hs1=new HashSet();
	hs1=(HashSet)hs.clone();
	System.out.println(hs);
	System.out.println(hs1);

	}

}
