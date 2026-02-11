package co.edu.uptc.model;

import co.edu.uptc.interfeces.ModelInterface;

public class ModelSum implements ModelInterface {
    @Override
    public byte sum(byte num1, byte num2) {
        return (byte) (num1+num2);
    }
}
