package co.edu.uptc.interfeces;

public interface PresenterInterface {

    void setModel(ModelInterface model);
    void setView(ViewInterfece view);


    byte doSum(byte num1, byte num2);
}
