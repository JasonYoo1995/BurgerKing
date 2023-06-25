package service;


import controller.ModelState;
import db.Database;
import lombok.AllArgsConstructor;
import view.View;

@AllArgsConstructor
public class MainService implements Service {
    private final View view;
    private final ModelState modelState;
    private final Database database;

    public void doUseCase(String input) {
        System.out.println("Do Use Case With " + input);
    }
}