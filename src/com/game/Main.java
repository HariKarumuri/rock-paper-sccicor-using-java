package com.game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int q =0;
        while (q!=4) {
            int min = 1;
            int max = 3;
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            char r, p, s;

            //  int selection = (int) sc.nextInt();

            System.out.println("1.rock  2.sccicors 3.paper 4.end");
            int selection = (int) sc.nextInt();
            if (random_int == 1 && selection == 1)
                System.out.println("draw with rock");
            else if (random_int == 1 && selection == 2)
                System.out.println("computer won with rock ");
            else if (random_int == 1 && selection == 3)
                System.out.println("player won with rock");
            else if (random_int == 2 && selection == 2)
                System.out.println("draw with sci");
            else if (random_int == 2 && selection == 3)
                System.out.println("computer won with sci");
            else if (random_int == 2 && selection == 1)
                System.out.println("player won with sci");
            else if (random_int == 3 && selection == 3)
                System.out.println("draw with paper");
            else if (random_int == 3 && selection == 2)
                System.out.println("computer won with paper");
            else if (random_int == 3 && selection == 1)
                System.out.println("player won with paper");
            else if(selection==4){
                q=4;
            }
            else
                System.out.println("wrong input");
        }
    }
}




