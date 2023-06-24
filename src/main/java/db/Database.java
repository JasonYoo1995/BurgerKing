package db;

import domain.Cart;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private final Map<Long, Cart> saleHistory = new HashMap<>();
}
