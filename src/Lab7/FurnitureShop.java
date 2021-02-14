package Lab7;

import java.util.ArrayList;
import java.util.Scanner;

public class FurnitureShop {
    private static Furniture[] bag;
    private static  String color;
    private static String material;
    private static double height;

    FurnitureShop() {
        System.out.println("Добро пожаловать в магазин мебели!");
        System.out.println("Здесь вы можете выбрать различные атрибуты мебели, такие как:");
        System.out.println("Стул, стол, кресло, шкаф и диван");
        System.out.println("У каждого из этих атрибутов вы можете задать 3 параметра: цвет, материал и высоту");
        Wardrobe wardrobe = new Wardrobe("Гардероб","черный","дерово",70);
        Table table = new Table("Стол","прозрачный","стекло",30);
        Armchair armchair = new Armchair("Кресло","красный","металл",40);
        Sofa sofa = new Sofa("Диван","черный","пух",50);
        Chair chair = new Chair("Стул","желтый","дерово",30);
        ArrayList<Furniture> furnitureArrayList = new ArrayList<>();
        furnitureArrayList.add(wardrobe);
        furnitureArrayList.add(table);
        furnitureArrayList.add(armchair);
        furnitureArrayList.add(sofa);
        furnitureArrayList.add(chair);
    }



}