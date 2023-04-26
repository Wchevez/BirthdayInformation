package com.learntocode;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;
public class BirthdayInformation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birthdate (MM/dd/yyyy): ");
        String input = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate birthdate = LocalDate.parse(input, formatter);


        String dayOfWeek = birthdate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.US).toUpperCase();


        System.out.println("You were born on " + dayOfWeek);
    }
}