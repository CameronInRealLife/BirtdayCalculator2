//Cameron Ciampichini
// 1675275

import javax.swing.*;
import java.util.Scanner;

public class BirthdayCalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter the current month" ); // Prompts user for current month
        int currentMonth = scanner.nextInt();           // User input
        System.out.println( "Enter the current day" );    // Prompts user for current day
        int currentDay = scanner.nextInt();         // User input
        System.out.println( "Enter the current year" ); // Prompts user for current year
        int currentYear = scanner.nextInt();        // User input
        System.out.println( "Enter the month of your birthday" );  // Prompts user for birthday month
        int birthMonth = scanner.nextInt();                 // user input
        System.out.println( "Enter the day of your birthday" ); // Prompts user to enter birthday
        int birthDay = scanner.nextInt();                   // User input
        System.out.println( "Enter the year of your birthday" );  // Prompts user to enter birthday year
        int birthYear = scanner.nextInt();                      // Enter birthday
        int ageInYears = currentYear - birthYear;           // Calculates year - birthday year
        int ageInYearsBeforeDay = currentYear - birthYear - 1; // Calculates year - birthday year - 1

        System.out.println( "****Birthday Calculator****" );
        System.out.println( "Current day: " );
        System.out.println( "Month: " + currentMonth ); // Shows current month
        System.out.println( "Day: " + currentDay ); // shows current day
        System.out.println( "Year: " + currentYear );  // +currentYear yields the current year from above
        System.out.println( "Birthday" );
        System.out.println( "Month: " + birthMonth );
        System.out.println( "Day: " + birthDay );
        System.out.println( "Year: " + birthYear );

        if ( birthMonth == currentMonth ) { // Continues if the birthday equals the current month
            if (birthDay == currentDay) {    // Printss happy birthday if the birthday equals the current day
                System.out.println( "Happy Birthday" );  // System prints Happy Birthday

            }
        }
        if (birthYear > currentYear) {  //  prints "where did you get a time machine" if the birthday year is greater than the current year.
            System.out.println( "Where did you get your time machine? " );


        }
        if (currentYear > birthYear) { // If the current year is greater than the birth year continues to the next line
            if (currentMonth == birthMonth) {
                if (currentDay >= birthDay) {  // If the current day is past or equal to the birthday, it prints your ageinyears calculations
                    System.out.println( "You are " + ageInYears + " years old." );
                } else  // If the current day is before the birthday, it prints age in years before day.
                    System.out.println( "You are " + ageInYearsBeforeDay + " years old." );
            }
        }
        if (currentYear > birthYear) {
            if (currentMonth > birthMonth) {
                System.out.println( "You are " + ageInYears + " years old." );
            }


        }
        if (currentYear > birthYear) {
            if (currentMonth < birthMonth) {
                System.out.println( "You are " + ageInYears + " years old" );
            }
        }

        }
    }

