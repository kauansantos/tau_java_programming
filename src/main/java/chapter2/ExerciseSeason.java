package chapter2;

import java.util.Scanner;

public class ExerciseSeason {
    public static void main(String[] args){

        //1. Get the name of season
        System.out.println("Enter the season name:");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //2. Get the adjective of the season
        System.out.println("Enter the adjective of the season:");
        String adjectiveSeason = scanner.next();

        //3. Get the numbers of cups of coffee
        System.out.println("Enter the numbers of cups of coffee:");
        int cups = scanner.nextInt();

        //4. Display result
        System.out.println("On a " + adjectiveSeason + " " + season + " day, I drink a minimum of " + cups + " cups of coffee");
    }
}
