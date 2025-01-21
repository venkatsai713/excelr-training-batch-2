import java.util.HashSet;

class HashSetDemo1 {
    void HSetMethod() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("100");
        hashSet.add("SAI");
        hashSet.add("9999.99");
        System.out.println(hashSet);

        for (String x : hashSet) {
            System.out.println(x);
        }
    }
}

public class demo_023 {
    public static void main(String[] args) {
        HashSetDemo1 obj = new HashSetDemo1();
        obj.HSetMethod();
    }
}