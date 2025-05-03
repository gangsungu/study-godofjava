public class LabelExample2 {
    public static void main(String[] args) {
        outerLoop: // Label 지정
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    continue outerLoop; // 바깥쪽 반복문 다음 반복으로 이동
                }

                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}

// i = 0, j = 0
// i = 1, j = 0
// i = 2, j = 0