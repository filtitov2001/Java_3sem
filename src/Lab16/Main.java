package Lab16;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 0};
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            player1.add(arr1[i]);
            player2.add(arr2[i]);
        }

        boolean flag = false;

        for (int i = 0; i < 106; i++) {
            if (player1.get(0) > player2.get(0) || ((player1.get(0) == 0) && (player2.get(0) == 9))) {
                player1.add(player2.get(0));
            } else if (player1.get(0) < player2.get(0) || ((player1.get(0) == 9) && (player2.get(0) == 0))) {
                player2.add(player1.get(0));
            }
            player1.remove(0);
            player2.remove(0);

            if (player1.size() == 0) {
                System.out.println("Second " + i);
                flag = true;
                break;
            } else if (player2.size() == 0) {
                System.out.println("First " + i);
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println("Botva");
    }
}