package com.company;
import java.util.Scanner;
import java.util.Random;
public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("eneter 0 for Rock , 1 for Paper , 2 for scissor");
        int userinput = sc.nextInt();

        Random random = new Random();
        int computerinput = random.nextInt(3);
        System.out.println("computer input :"+computerinput);
        if(userinput == computerinput ){
            System.out.println("draw");
        }
        else if(userinput == 0 && computerinput == 2 || userinput == 1 && computerinput == 2 || userinput == 2 && computerinput == 1 )
        {
            System.out.println("you win");
        }
           else{
            System.out.println("you lose");
        }

    }
}