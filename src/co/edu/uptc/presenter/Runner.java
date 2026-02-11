package co.edu.uptc.presenter;

import co.edu.uptc.interfeces.ModelInterface;
import co.edu.uptc.interfeces.PresenterInterface;
import co.edu.uptc.interfeces.ViewInterfece;
import co.edu.uptc.model.ModelSum;
import co.edu.uptc.view.ViewSum;

public class Runner {
    private ViewInterfece view;
    private ModelInterface model;
    private PresenterInterface presenter;
    private void makeMVP(){
         model = new ModelSum();
         presenter = new PresenterMain();
        view = new ViewSum();

        presenter.setView(view);
        presenter.setModel(model);
        view.setPresenter(presenter);

    }

    public void start(){
        makeMVP();
        view.readInfo();
    }
}
