import java.util.HashSet;

class HashSetDemo2 {

	void HashsetMethod() {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("INDIA");
		hashSet.add("PAKISTAN");
		hashSet.add("BANGLADESH");
		hashSet.add("CHINA");
		hashSet.add("NEPAL");
		hashSet.add("SRI LANKA");
		System.out.println(hashSet);
	}
}

public class demo_024 {
	public static void main(String[] args) {
		HashSetDemo2 obj = new HashSetDemo2();
		obj.HashsetMethod();
	}
}
