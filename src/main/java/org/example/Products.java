package org.example;

public class Products {
    protected String name;
    protected String brand;
    protected double price;

    public double getPrice(){
        return price;
    }
    public void  setPrice(double inputPrice){
        checkPrice(inputPrice);
    }
    protected Products(String inputBrand, String inputName, double inputPrice){
        checkBrand(inputBrand);
        checkName(inputName);
        checkPrice(inputPrice);
    }
    private void checkBrand(String inputBrand){
        if (inputBrand.length() < 3) {
            name = "no_brand";
        }
        else {
            brand = inputBrand;
        }
    }
    private void checkName(String inputName){
        if (inputName.length() < 3) {
            name = "no_name";
        }
        else {
            name = inputName;
        }
    }
    private void checkPrice(double inputPrice){
        if (inputPrice <= 0) {
            price = 50;
        }
        else {
            price = inputPrice;
        }
    }
    public String showInfo(){
        return String.format("%s - %s - %f", brand, name, price);
    }

    public double getVolume() {
        return 0;
    }
}
