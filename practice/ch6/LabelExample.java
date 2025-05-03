public class LabelExample {
    public static void main(String[] args) {
        outerLoop:
        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                if(i == 2 && j == 2) {
                    break outerLoop;
                }

                System.out.println("i = " + i + ", j = " + j);
            }
        }

        System.out.println("반복문 종료");
    }
}

// i = 0, j = 0
// i = 0, j = 1
// i = 0, j = 2
// i = 0, j = 3
// i = 0, j = 4
// i = 1, j = 0
// i = 1, j = 1
// i = 1, j = 2
// i = 1, j = 3
// i = 1, j = 4
// i = 2, j = 0
// i = 2, j = 1
// 반복문 종료