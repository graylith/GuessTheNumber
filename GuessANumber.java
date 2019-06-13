
package GuessANumber;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    int x,max,number;
    
    public GuessANumber(){
        Random rand = new Random();
        x = Math.abs(rand.nextInt()) % (max+1);
    }
    public void getnumber(){
        while(true){
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt(); 
        }
    }
    public void play(){
        while(true){
        if(number>x)
            System.out.println("Your number is too big");
        if(number<x)
            System.out.println("Your number is too small");
        else{
            System.out.println("You WON...!!!");
            break;
        }
        }
    }

    public static void main(String[] args) {
        
        int n;
        GuessANumber guess = new GuessANumber();
        System.out.println("Enter a number to start the game");
        guess.getnumber();
        guess.play();
        }
}   

