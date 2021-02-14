package Lab3;

public class Hand {
    private String pump;
    private String dlina;

    Hand(String pump, String dlina){
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
