package com.pluralsight;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScore {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter the game score (ex. Home:Visitor|21:9): ");
        String input = myScanner.nextLine();


        String[] tokens = input.split(Pattern.quote("|"));
        String teams = tokens[0];
        String scores = tokens[1];

        String[] teamNames = teams.split(":");
        String homeTeam = teamNames[0];
        String visitorTeam = teamNames[1];

        String[] teamScores = scores.split(":");

        int homeScore = Integer.parseInt(teamScores[0]);
        int visitorScore = Integer.parseInt(teamScores[1]);

        if (homeScore > visitorScore) {
            System.out.println("Winner: " + homeTeam);
        } else if (visitorScore > homeScore) {
            System.out.println("Winner: " + visitorTeam);
        } else {
            System.out.println("Winner: Tie!");

        }

    }

}
