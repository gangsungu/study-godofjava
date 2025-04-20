public class ArrayFor {
    public static void main(String[] args) {
        ArrayFor array = new ArrayFor();
        // array.newFor();
        array.newFor2();
    }

    public void newFor() {
        int oneDim[] = new int[]{1, 2, 3, 4, 5};
        for(int data:oneDim) {
            System.out.println(data);
            // 1
            // 2
            // 3
            // 4
            // 5
        }
    }

    public void newFor2() {
        int twoDim[][] = {{1, 2}, {1, 2, 3}};
        for(int[] dimArray:twoDim) {
            for(int data:dimArray) {
                System.out.println(data);
                // 1
                // 2
                // 1
                // 2
                // 3
            }
        }
    }
}