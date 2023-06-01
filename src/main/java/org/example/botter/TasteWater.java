package org.example.botter;

public class TasteWater extends Botter{
    String taste; // Вкус

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        checkTaste(taste);
    }

    public TasteWater(String inputBrand, String inputName, String taste, double inputPrice, double volume) {
        super(inputBrand, inputName, inputPrice, volume);
        checkTaste(taste);
    }
    private void checkTaste(String inputTaste){
        if (inputTaste.length() < 3) {
            taste = "Без вкуса";
        }
        else {
            taste = inputTaste;
        }
    }

    @Override
    public String showInfo() {
        return String.format("[Вода]%s - %s - [Вкус: %s] - %f - [Объем: %f]", brand, name, taste, price, volume);
    }
}
