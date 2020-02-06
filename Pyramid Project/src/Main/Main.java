package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PrintPyramid printPyramid = new PrintPyramid();
        Scanner input = new Scanner(System.in);
        int rows;

        System.out.println("Hello! Enter the amount of rows you would like to see");
        rows = Integer.parseInt(input.nextLine());
        printPyramid.printPyramid(rows);
    }

}
