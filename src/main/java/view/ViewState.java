package view;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ViewState {
    private PageId currentPageId;

    public ViewState() {
        this.currentPageId = PageId.MAIN;
    }
}