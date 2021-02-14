package Lab3;

public class Human {
    Human(){
        Head head = new Head("Черные", "Карие");
        Leg leg =new Leg("Худые"," Длинные");
        Hand hand = new Hand("Накаченные","Короткие");
        System.out.println( "Характеристика человека:");
        System.out.println("Волосы: "+ head.getHairColor() +" Глаза: "+ head.getEyeColor());
        System.out.println("Руки: "+ hand.getPump() +" и "+ hand.getDlina());
        System.out.println("Ноги: "+ leg.getPump() +" и "+ leg.getDlina());

    }
}
