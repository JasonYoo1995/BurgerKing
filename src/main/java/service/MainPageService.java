package service;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MainPageService {

    public void doUseCase(String input) {
        System.out.println("Do Use Case With " + input);
    }
}