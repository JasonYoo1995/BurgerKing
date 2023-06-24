package controller;

import db.Database;
import domain.Cart;
import view.PageSearcher;
import view.View;

public class Controller {
    private final ModelState modelState = new ModelState();
    private final View view = new View();
    private final PageSearcher pageSearcher = new PageSearcher();
    private final Database database = new Database();

    public void showCurrentPage() {
        view.showView(new Cart("Dummy Products"));
    }
}