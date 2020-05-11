package com.company;


import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Team Builder System");
        System.out.println("==================================");

        System.out.println("How many members are in the team?");
        int i = scanner.nextInt();

        Member[] teamMembers = new Member[i];

        System.out.println("Input the team members (Name: Surname: Sex: DD/MM/YYYY): ");

        for(int j = 0; j < i; j++) {
            String member = scanner.nextLine();
            System.out.println("");

            int indexSeperator = member.indexOf(":");
            String name = member.substring(0, indexSeperator);
            member = member.substring(indexSeperator + 1, member.length());

            indexSeperator = member.indexOf(":");
            String surname = member.substring(0, indexSeperator);
            member = member.substring(indexSeperator + 1, member.length());

            indexSeperator = member.indexOf(":");
            char sex = member.charAt(0);
            member = member.substring(indexSeperator + 1, member.length());

            indexSeperator = member.indexOf("/");
            String dateString = member.substring(0, indexSeperator);
            member = member.substring(indexSeperator + 1, member.length());

            indexSeperator = member.indexOf("/");
            String monthString = member.substring(0, indexSeperator);
            member = member.substring(indexSeperator + 1, member.length());

            String yearString = member.substring(0, member.length());

            Integer dateInteger = new Integer(dateString);
            Integer monthInteger = new Integer(monthString);
            Integer yearInteger = new Integer(yearString);

            int date = dateInteger.intValue();
            int month = monthInteger.intValue();
            int year = yearInteger.intValue();

            teamMembers[j] = new com.company.Member(name, surname, sex, date, month, year);
        }

        int selection = 0;

        while(selection != 1 && selection != 2 && selection != 3) {
            System.out.println("");
            System.out.println("Team Builder Menu: ");
            System.out.println("");
            System.out.println("=======================");
            System.out.println("");
            System.out.println("1 - List the team members");
            System.out.println("2 - Find the oldest member");
            System.out.println("3 - Find the youngest member");

            selection = scanner.nextInt();
        }

        switch (selection) {
            case 1:
                System.out.println("");
                outputTeamMembers(teamMembers);
                break;
            case 2:
                System.out.println("The oldest member is: " + oldest(teamMembers));
                break;
            case 3:
                System.out.println("The youngest member is: " + youngest(teamMembers));
                break;
            default:
                break;
        }
    }

    public static void outputTeamMembers(Member[] teamMembers) {
        for (int i = 0; i < teamMembers.length; i++) {
            String name = teamMembers[i].getName();
            String surname = teamMembers[i].getSurname();
            char sex = teamMembers[i].getSex();
            int date = teamMembers[i].getDate();
            int month = teamMembers[i].getMonth();
            int year = teamMembers[i].getYear();

            String sLong;

            if (sex == 'm') {
                sLong = "male";
            }else{
                sLong = "female";
            }

            System.out.println(name + " " + surname + ", " + sLong + ", " + "born " + date + "/" + month + "/" + year);
        }
    }

    public static String oldest(Member[] teamMembers) {
        int max = 0;
        int oldest = 0;

        for(int i = 0; i < teamMembers.length; i++) {
            int age = (2020 - teamMembers[i].getYear());
            if (age > max) {
                max = age;
                oldest = i;
            }
        }

        int age = (2020 - teamMembers[oldest].getYear());
        String toReturn = teamMembers[oldest].getName() + " " + teamMembers[oldest].getSurname() + ", age " + age;

        return toReturn;
    }

    public static String youngest(Member[] teamMembers) {
        int min = 99;
        int youngest = 0;

        for(int i = 0; i < teamMembers.length; i++) {
            int age = (2020 - teamMembers[i].getYear());
            if (age < min) {
                min = age;
                youngest = i;
            }
        }

        int age = (2020 - teamMembers[youngest].getYear());
        String toReturn = teamMembers[youngest].getName() + " " + teamMembers[youngest].getSurname() + ", age " + age;

        return toReturn;
    }
}
