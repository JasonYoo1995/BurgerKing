package view.page;

import domain.Cart;
import util.ObjectMapperUtil;

public class MainPage implements Page {
    public String getContent(Cart cart) {
        return String.format("""
                -------------- Display --------------
                [현재 카트 안에 담겨 있는 상품 목록]
                %s
                -------------------------------------
                """, ObjectMapperUtil.convertToPrettyJsonString(cart));
    }
}