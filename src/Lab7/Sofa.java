package Lab7;

public class Sofa extends Furniture
{
    Sofa(String category, String color, String material,double height)
    {
        setCategory(category);
        setColor(color);
        setMaterial(material);
        setHeight(height);

    }

    public String toString()
    {
        return getCategory() + " из материала: " + getMaterial() + ", цвет: " + getColor() + " с высотой: " + getHeight() ;
    }



}
