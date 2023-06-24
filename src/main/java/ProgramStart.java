import java.util.Scanner;

public class ProgramStart {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            // 유저 입력
            System.out.print("입력 : ");
            String input = scanner.next();

            // 입력 값 수행
            if (input.equals("!exit")) { // 프로그램 종료
                return;
            } else {
                System.out.println("Implement Use Case (input = " + input + ")");
            }
        }
    }
}