package view;

import domain.Cart;
import view.page.MainPage;

public class View {
    private PageId currentPageId;

    private final MainPage mainPage = new MainPage();

    public void showView(Cart cart) {
        String viewString = mainPage.getContent(cart);
        System.out.println(viewString);
    }

}
