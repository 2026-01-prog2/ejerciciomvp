package co.edu.uptc.interfeces;

public interface ViewInterfece {
    void setPresenter(PresenterInterface presenter);
    void showResult(byte resrult);
    void showError(String msg);
    public void readInfo();
}
