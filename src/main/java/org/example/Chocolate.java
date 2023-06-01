package org.example;

public class Chocolate extends Products {
    double weight; // вес
    String taste; // Вкус

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        checkWeight(weight);
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        checkTaste(taste);
    }

    public Chocolate(String inputBrand, String inputName, String taste, double weight, double inputPrice) {
        super(inputBrand, inputName, inputPrice);
        checkWeight(weight);
        checkTaste(taste);
    }

    @Override
    public String showInfo() {
        return String.format("[Шоколад]%s - %s - [Вкус: %s] - [Вес: %f] - %f", brand, name, taste, weight, price);
    }

    private void checkTaste(String inputTaste){
        if (inputTaste.length() < 3) {
            taste = "Молочный";
        }
        else {
            taste = inputTaste;
        }
    }
    private void checkWeight(double inputWeight){
        if (inputWeight <= 0) {
            weight = 50;
        }
        else {
            weight = inputWeight;
        }
    }

}
