package controller;

import db.Database;
import lombok.AllArgsConstructor;
import service.MainService;
import view.View;
import view.ViewState;

import java.util.Scanner;

@AllArgsConstructor
public class Controller {
    private final ViewState viewState;
    private final View view;
    private final ModelState modelState;
    private final Database database;
    private final MainService mainService;

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            scrollPage(); // 페이지 스크롤
            showCurrentPage(); // 현재 페이지 출력
            System.out.print("입력 : ");
            String input = scanner.next(); // 유저 입력
            if (input.equals("!exit")) return; // 프로그램 종료
            else doWorkWithInput(input); // 입력 값 수행
        }
    }

    private void scrollPage() {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }

    public void showCurrentPage() {
        view.showView(modelState.getCurrentCart());
    }

    private void doWorkWithInput(String input) {
        mainService.doUseCase(input);
    }
}