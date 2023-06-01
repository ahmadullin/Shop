package org.example;

import org.example.botter.Milk;
import org.example.botter.TasteWater;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Products product1 = new Products("Бу", "ООО Чистый источник", -5.70);
        System.out.println(product1.showInfo());
        Products water1 = new TasteWater("ООО Чистый источник", "Буратино", "Клубника", 83.60, 1);
        System.out.println(water1.showInfo());
        Products milk1 = new Milk("ООО Молоко", "Домик в деревне", -80, 0.9, 1);
        System.out.println(milk1.showInfo());
        Products chocolate1 = new Chocolate("ООО Победа", "Аленка", "Горький", 0, 19.40 );
        System.out.println(chocolate1.showInfo());
        System.out.println();

        List<Products> products = new ArrayList<>();
        products.add(water1);
        products.add(milk1);
        products.add(chocolate1);

        MagazineApparatus magazineApparatus = new MagazineApparatus(products);
        TasteWater tasteWaterResult = magazineApparatus.getTasteWater(1);
        if (tasteWaterResult != null){
            System.out.println("Вы купили: ");
            System.out.println(tasteWaterResult.showInfo());
        }
        else {
            System.out.println("Ничего не найдено");
        }


        Milk MilkResult = magazineApparatus.getMilk(0.9);
        if (MilkResult != null){
            System.out.println("Вы купили: ");
            System.out.println(MilkResult.showInfo());
        }
        else {
            System.out.println("Ничего не найдено");
        }

        Chocolate chocolateResult = magazineApparatus.getTaste("Горький");
        if (chocolateResult != null){
            System.out.println("Вы купили: ");
            System.out.println(chocolateResult.showInfo());
        }
        else {
            System.out.println("Ничего не найдено");
        }
    }
}
