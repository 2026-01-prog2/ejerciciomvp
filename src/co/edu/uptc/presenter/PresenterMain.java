package co.edu.uptc.presenter;

import co.edu.uptc.interfeces.ModelInterface;
import co.edu.uptc.interfeces.PresenterInterface;
import co.edu.uptc.interfeces.ViewInterfece;

public class PresenterMain implements PresenterInterface {
    ModelInterface model;
    ViewInterfece view;
    @Override
    public void setModel(ModelInterface model) {
        this.model = model;
    }

    @Override
    public void setView(ViewInterfece view) {
     this.view = view;
    }

    @Override
    public byte doSum(byte num1, byte num2) {
        return model.sum(num1,num2);
    }
}
