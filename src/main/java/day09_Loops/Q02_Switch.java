package day09_Loops;

import java.util.Scanner;

public class Q02_Switch {

    public static void main(String[] args) {

        //Ask user to enter a character, if it is vowel print 'Vowel 'or if it is not vowel 'Not Vowel'

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter to heck if it is a wovel or not");

        char c = scanner.next().toLowerCase().charAt(0);

        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Wovel");
                break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'y':
            case 'z':

        }
    }
}
