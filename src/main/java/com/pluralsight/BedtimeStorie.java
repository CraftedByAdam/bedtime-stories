package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BedtimeStorie {
    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the name of the file to read: ");
            String fileName = input.nextLine();

            FileReader file = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(file);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Oops, something went wrong.");

        }
    }
}
