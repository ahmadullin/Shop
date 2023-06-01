package org.example.botter;

public class Milk extends Botter{
    double fatContent; // жирность

    public double getFatContent() {
        return fatContent;
    }

    public void setFatContent(double fatContent) {
        checkFatContent(fatContent);
    }

    public Milk(String inputBrand, String inputName, double inputPrice, double volume, double fatContent) {
        super(inputBrand, inputName, inputPrice, volume);
        checkFatContent(fatContent);
    }

    @Override
    public String showInfo() {
        return String.format("[Молоко]%s - %s - %f - [Объем: %f] - [Жирность: %f]", brand, name, price, volume, fatContent);
    }

    private void checkFatContent(double inputFatContent){
        if (inputFatContent < 0) {
            fatContent = 0;
        }
        else {
            fatContent = inputFatContent;
        }
    }
}
