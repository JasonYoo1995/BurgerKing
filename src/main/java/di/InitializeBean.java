package di;

import controller.Controller;
import controller.ModelState;
import db.Database;
import lombok.Getter;
import service.MainService;
import view.View;
import view.ViewState;
import view.page.MainPage;

@Getter
public class InitializeBean {
    private final ViewState viewState = new ViewState();
    private final MainPage mainPage = new MainPage();
    private final View view = new View(viewState, mainPage);
    private final ModelState modelState = new ModelState();
    private final Database database = new Database();
    private final MainService mainService = new MainService(view, modelState, database);
    private final Controller controller = new Controller(viewState, view, modelState, database, mainService);
}