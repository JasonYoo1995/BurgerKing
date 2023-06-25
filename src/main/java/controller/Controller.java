package controller;

import lombok.AllArgsConstructor;
import service.MainPageService;
import view.View;

import java.util.Scanner;

@AllArgsConstructor
public class Controller {
    private final View view;
    private final ModelState modelState;
    private final MainPageService mainPageService;

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            scrollPage(); // 페이지 스크롤
            showCurrentPage(); // 현재 페이지 출력
            System.out.print("입력 : ");
            String input = scanner.next(); // 키보드를 통해 명령값 입력
            if (input.equals("!exit")) return; // 프로그램 종료
            else doUseCase(input); // 비즈니스 로직 수행
        }
    }

    private void scrollPage() {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }

    private void showCurrentPage() {
        view.showView(modelState.getCurrentCart());
    }

    private void doUseCase(String input) {
        mainPageService.doUseCase(input);
    }
}