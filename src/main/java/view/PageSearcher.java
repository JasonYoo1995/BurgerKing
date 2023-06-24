package view;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;

public class PageSearcher {
    private final Map<Condition, PageId> nextPageMapper = new HashMap<>();
}
