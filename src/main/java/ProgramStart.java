import di.InitializeBean;

public class ProgramStart {
    public static void main(String[] args) {
        InitializeBean initializeBean = new InitializeBean();
        initializeBean.getController().start();
    }
}