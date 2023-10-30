package com.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Welcome to the Calculator!");
        Scanner inp=new Scanner(System.in);
        int run=1;
        int opcode=-1;
        do{
            System.out.println("0. Exit");
            System.out.println("1. Square root");
            System.out.println("2. log10");
            System.out.println("3. Power");
            System.out.println("4. Factorial");
            System.out.println("Choose the operation:");
            opcode=inp.nextInt();
            if(opcode==0){
                run=0;
            }
            else if(opcode==1){
                System.out.println("Enter the number:");
                double num=inp.nextDouble();
                System.out.println("Answer is:");
                System.out.println(sqrt(num));
            }
            else if(opcode==2){
                System.out.println("Enter the number:");
                double num=inp.nextDouble();
                System.out.println("Answer is:");
                System.out.println(log10(num));
            }
            else if(opcode==3){
                System.out.println("Enter the first number:");
                int num1=inp.nextInt();
                System.out.println("Enter the power:");
                int num2=inp.nextInt();
                System.out.println("Answer is:");
                System.out.println(power(num1, num2));
            }
            else if(opcode==4){
                System.out.println("Enter the number:");
                int num=inp.nextInt();
                System.out.println("Answer is:");
                System.out.println(fact(num));
            }

        }while(run==1);
        inp.close();
    }
    public static double sqrt(double num){
        return Math.sqrt(num);
    }
    public static double log10(double num){
        return Math.log10(num);
    }
    public static double power(int num1, int num2){
        return Math.pow(num1,num2);
    }
    public static int fact(int num){
        int ans=1;
        for(int i=1;i<=num;i++){
            ans=ans*i;
        }
        return ans;
    }
}
