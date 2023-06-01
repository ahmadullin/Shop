package org.example;

import org.example.botter.Botter;
import org.example.botter.Milk;
import org.example.botter.TasteWater;

import java.util.List;

public class MagazineApparatus {
    private List<Products> products;

    public MagazineApparatus(List<Products> products){
        this.products = products;
    }
    public TasteWater getTasteWater(double volume){
        for (Products products : products){
            if(products instanceof TasteWater){
                if (((Botter)products).getVolume() == volume){
                    return (TasteWater) products;
                }
            }
        }
        return null;
    }

    public Milk getMilk(double volume){
        for (Products products : products){
            if(products instanceof Milk){
                if (((Milk)products).getVolume() == volume){
                    return (Milk) products;
                }
            }
        }
        return null;
    }
    public Chocolate getTaste(String taste){
        for (Products products : products){
            if(products instanceof Chocolate){
                if (((Chocolate)products).getTaste() == taste){
                    return (Chocolate) products;
                }
            }
        }
        return null;
    }
}
