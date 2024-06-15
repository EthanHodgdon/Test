// Author: Ethan Hodgdon
// This program shall take input in the form of a string, and store this input in a separate text document. 

import java.util.Scanner;
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class v0_0_0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an input");
        String computerPart = input.nextLine();
        write(computerPart);
    }
    public static void write(String computerPart) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Projects\\ComputerSalesStatistics\\v0_0_0.txt");
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write("\n" + computerPart);
            writer.close();
        } catch(IOException e) {
            System.out.println("There was an error");
        }
        System.out.println(computerPart + " has been saved.");
    }
}

