public class MethodChaining {
    private String name;

    MethodChaining setName(String name) {
        this.name = name;
        return this;    // 현재 객체 반환
    }

    void printName() {
        System.out.println("Name: " + this.name);
    }

    public static void main(String[] args) {
        MethodChaining ex = new MethodChaining().setName("John").setName("Alice");
        ex.printName(); // Name: Alice

        // 각 호출에서 이전 값을 덮어쓰게 되므로
        // Name: Alice가 출력됨
    }    
}