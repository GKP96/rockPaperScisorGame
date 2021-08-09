package com.codestudentsfriendcybercafe;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random gautam = new Random();
        //This will print the random number from 0 to 2;
        Scanner gkp = new Scanner(System.in);
        for(int i=0;i<10000;i++) {
            int snum = gautam.nextInt(3);
           // System.out.println(snum);
            System.out.println("ENTER\"0 for rock \"|| \"1 for scissors\"||\"2 for papers");
            System.out.println("Enter 5 to end the game");
            int unum = gkp.nextInt();
            if(unum==snum){
                System.out.println("Game Draw");
                System.out.println("Number selected by system");
                System.out.println(snum);

            }
            else if(snum==0&&unum==1){
                System.out.println("You loose");
                System.out.println("Number selected by system");
                System.out.println(snum);
            }
            else if(snum==0&&unum==2){
                System.out.println("You Win");
                System.out.println("Number selected by system");
                System.out.println(snum);
        }
            else if(snum==1&&unum==0){
                System.out.println("You Win");
                System.out.println("Number selected by system");
                System.out.println(snum);
            }
            else if (snum==1&&unum==2){
                System.out.println("You loose");
                System.out.println("Number selected by system");
                System.out.println(snum);
            }
            else if(snum==2&&unum==0){
                System.out.println("You loose");
                System.out.println("Number selected by system");
                System.out.println(snum);
            }
            else if(snum==2&&unum==1){
                System.out.println("You Win");
                System.out.println("Number selected by system");
                System.out.println(snum);
            }
            else if(unum>2&&unum!=5){
                System.out.println("You entered an incorrect number please select right one");
            }
            else if(unum<0){
                System.out.println("You entered an incorrect number please select right one");
            }
            if(unum==5){
                System.out.println("Thanks for playing this game");
                break;
            }

    }
    }
}
