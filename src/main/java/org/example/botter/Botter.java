package org.example.botter;

import org.example.Products;

public class Botter extends Products {
    double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        checkVolume(volume);
    }

    public Botter(String inputBrand, String inputName, double inputPrice, double volume) {
        super(inputBrand, inputName, inputPrice);
        checkVolume(volume);
    }
    private void checkVolume(double inputVolume){
        if (inputVolume <= 0) {
            volume = 0.5;
        }
        else {
            volume = inputVolume;
        }
    }
    @Override
    public String showInfo() {
        return String.format("[бутылка]%s - %s - %f - [Объем: %f]", brand, name, price, volume);
    }
}
