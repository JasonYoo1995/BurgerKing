package controller;

import domain.Cart;
import lombok.Getter;

@Getter
public class ModelState {
    private final Cart currentCart;

    public ModelState() {
        this.currentCart = new Cart("Dummy Products");
    }
}


