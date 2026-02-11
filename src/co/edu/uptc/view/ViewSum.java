package co.edu.uptc.view;

import co.edu.uptc.interfeces.PresenterInterface;
import co.edu.uptc.interfeces.ViewInterfece;

import java.util.Scanner;

public class ViewSum implements ViewInterfece {

    private PresenterInterface presenter;
    @Override
    public void setPresenter(PresenterInterface presenter) {
        this.presenter = presenter;
    }

    @Override
    public void showResult(byte resrult) {
        System.out.println("El resultado es: "+ resrult);
    }

    @Override
    public void showError(String msg) {
        System.out.println("Error: "+msg);
    }
      public void readInfo(){
          Scanner keyboard = new Scanner(System.in);

          System.out.println("Numero1: ");
          byte num1 = keyboard.nextByte();

          System.out.println("Numero2: ");
          byte num2 = keyboard.nextByte();

          byte result = presenter.doSum(num1,num2);
          showResult(result);
      }


}
