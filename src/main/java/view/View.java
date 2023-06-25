package view;

import domain.Cart;
import lombok.AllArgsConstructor;
import view.page.MainPage;

@AllArgsConstructor
public class View {
    private final ViewState viewState;
    private final MainPage mainPage;

    public void showView(Cart cart) {
        String viewString = mainPage.getContent(cart);
        System.out.println(viewString);
    }

}
