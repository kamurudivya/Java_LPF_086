package org.example;

public class TwoPlayers {
    public static void roll() {
    int dice3, dice4, dice5, dice6, s1 = 0,s2 =0, i = 0, e;
     while(s1<100 && s2<100) {
        if (s1 < 0 ) {
            s1 = 0; }
        else {
            dice3 = (int) (Math.random() * 6) + 1;
            dice4 = (int) (Math.random() * 3);
            if (dice4 == 0) {
                System.out.println("Player1 - No Play ");
                System.out.println("Position of Player1 " + s1);
            }
            else if (dice4 == 1) {
                System.out.println("Ladder - Player1 moves ahead by " + dice3);
                i++;
                e = s1;
                s1 = s1 + dice3;
                System.out.println("Position of Player1 " + s1);
                if (s1 > 100) {
                    s1 = e;
                }
                else if (s1==100) {
                    System.out.println("Player1 reached " + s1 + " and won by rolling the dice " + i + " times");
                    System.exit(0);
                }
                else {
                    continue;
                }
            }
            else {
                System.out.println("Snake - Player1 moves behind by " + dice3);
                s1 = s1 - dice3;
            }
        }
         if (s2 < 0 ) {
             s2 = 0; }
        else {
             dice5 = (int) (Math.random() * 6) + 1;
             dice6 = (int) (Math.random() * 3);
             if (dice6 == 0) {
                 System.out.println("Player2 - No Play ");
                 System.out.println("Position of Player2 " + s2); }
             else if (dice6 == 1) {
                 System.out.println("Ladder - Player2 moves ahead by " + dice5);
                 i++;
                 e = s2;
                 s2 = s2 + dice5;
                 System.out.println("Position of Player2 " + s2);
                 if (s2 > 100) {
                     s2 = e;
                 }
                 else if (s2==100) {
                     System.out.println("Player2 reached " + s2 + " and won by rolling the dice " + i + " times");
                     System.exit(0);
                 }
                 else {
                     continue;
                 }
             }
             else {
                 System.out.println("Snake - Player2 moves behind by " + dice5);
                 s2 = s2 - dice5;
             }
         }
     }

    }

    public static void main(String[] args) {
        roll();
    }
}

