package Lab3;

public class Head {
    private String hairColor;
    private String eyeColor;
    Head(String hairColor,String eyeColor){
        this.eyeColor=eyeColor;
        this.hairColor=hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }
}
