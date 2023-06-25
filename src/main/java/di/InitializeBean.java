package di;

import controller.Controller;
import controller.ModelState;
import db.Database;
import lombok.Getter;
import service.MainPageService;
import view.View;
import view.ViewState;
import view.page.MainPage;

@Getter
public class InitializeBean {
    private final ViewState viewState = new ViewState();
    private final MainPage mainPage = new MainPage();
    private final View view = new View(mainPage);
    private final ModelState modelState = new ModelState();
    private final Database database = new Database();
    private final MainPageService mainPageService = new MainPageService();
    private final Controller controller = new Controller(view, modelState, mainPageService);
}