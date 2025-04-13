public class StringComparison {
    public static void main(String[] args) {
        String param1 = "Hello World!";
        String param2 = "Hello World!";

        String param3 = new String("Hello World1");
        String param4 = new String("Hello World1");

        System.out.println(param1 == param2);   // true

        System.out.println(param3 == param4);   // false
        System.out.println(param3.equals(param4));  // true

        System.out.println(param1 == param3);   // false
        System.out.println(param3.equals(param1));  // true
    }
}