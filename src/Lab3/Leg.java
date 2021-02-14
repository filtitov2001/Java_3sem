package Lab3;

public class Leg {
    private String pump;
    private String dlina;

    Leg(String pump, String dlina){
        this.dlina=dlina;
        this.pump=pump;
    }

    public String getDlina() {
        return dlina;
    }

    public String getPump() {
        return pump;
    }
}
