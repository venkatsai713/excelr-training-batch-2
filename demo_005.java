public class demo_005 {
    public static void main(String[] args) {
        String username = "user001";
        String password = "user_001";

        while ((username == "user001") && (password == "user_001")) {
            System.out.println("Username and password are the same. Proceeding...");
        }
    }
}