public class ImmutableTest {
    public static void main(String[] args) {
        String param1 = "Hello";
        System.out.println(param1.hashCode());
        // 69609650

        param1 = param1 + "World!";
        System.out.println(param1.hashCode());
        // 734305825
    }
}