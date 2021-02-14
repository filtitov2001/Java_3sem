package Lab7;

public abstract class Furniture {
    private static String material;
    private static String category;
    private static double height;
    private static String color;


    public static double getHeight() {
        return height;
    }

    public static void setCategory(String category) {
        Furniture.category = category;
    }

    public static String getCategory() {
        return category;
    }

    public static void setMaterial(String material) {
        Furniture.material = material;
    }

    public static String getMaterial() {
        return material;
    }

    public static void setHeight(double height) {
        Furniture.height = height;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Furniture.color = color;
    }
}
