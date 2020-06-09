package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(" Calculating area");

        System.out.println(" option 1 triangle");
        System.out.println(" option 2 rectangle");
        System.out.println(" option 3 cube");

        Scanner input = new Scanner(System.in  );
        int l,w, b,h;
        int option;
        option= input.nextInt();
        switch (option) {
            case 1:
                System.out.println(" enter the base");
                b=input.nextInt();
                System.out.println(b);

                System.out.println( " Enter the height");
                h=input.nextInt();
                System.out.println(h);

                System.out.println(0.5*h*b);
                break;
            case 2:
                System.out.println(" enter the length ");
                l = input.nextInt();
                System.out.println(l);
                System.out.println(" enter the width");
                w =input.nextInt();
                System.out.println(w);

                System.out.println(l*w);
                break;
            case 3:
                System.out.println(" enter the length ");
                l = input.nextInt();
                System.out.println(l);
                System.out.println(" enter the width");
                w =input.nextInt();
                System.out.println(w);
                System.out.println(" enter the height");
                h =input.nextInt();
                System.out.println(h);

                System.out.println(l*w*h);
                break;
            default :
                System.out.println("invalid");
        }
    }}

