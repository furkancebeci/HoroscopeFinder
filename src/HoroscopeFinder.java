import java.util.Scanner;

public class HoroscopeFinder {
    public static void main(String[] args) {
        int day, month;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the day you were born numerically: ");
        day = inp.nextInt();
        System.out.print("Enter the month you were born numerically: ");
        month = inp.nextInt();

        if (month == 1) {
            if (day <= 21) {
                System.out.println("Your zodiac sign is Capricorn");
            } else {
                System.out.println("Your zodiac sign is Aquarius");
            }
        }
        if (month == 2) {
            if (day <= 19) {
                System.out.println("Your zodiac sign is Aquarius");
            } else {
                System.out.println("Your zodiac sign is Fish");
            }
        }
        if (month == 3) {
            if (day <= 20) {
                System.out.println("Your zodiac sign is Fish");
            } else {
                System.out.println("Your zodiac sign is Aries");
            }
        }
        if (month == 4) {
            if (day <= 20) {
                System.out.println("Your zodiac sign is Aries");
            } else {
                System.out.println("Your zodiac sign is Taurus");
            }
        }
        if (month == 5) {
            if (day <= 21) {
                System.out.println("Your zodiac sign is Taurus");
            } else {
                System.out.println("Your zodiac sign is Gemini");
            }
        }
        if (month == 6) {
            if (day <= 22) {
                System.out.println("Your zodiac sign is Gemini");
            } else {
                System.out.println("Your zodiac sign is Cancer");
            }
        }
        if (month == 7) {
            if (day <= 22) {
                System.out.println("Your zodiac sign is Cancer");
            } else {
                System.out.println("Your zodiac sign is Leo");
            }
        }
        if (month == 8) {
            if (day <= 22) {
                System.out.println("Your zodiac sign is Leo");
            } else {
                System.out.println("Your zodiac sign is Virgo");
            }
        }
        if (month == 9) {
            if (day <= 22) {
                System.out.println("Your zodiac sign is Virgo");
            } else {
                System.out.println("Your zodiac sign is Libra");
            }
        }
        if (month == 10) {
            if (day <= 22) {
                System.out.println("Your zodiac sign is Libra");
            } else {
                System.out.println("Your zodiac sign is Scorpio");
            }
        }
        if (month == 11) {
            if (day <= 21) {
                System.out.println("Your zodiac sign is Scorpio");
            } else {
                System.out.println("Your zodiac sign is Sagittarius");
            }
        }
        if (month == 12) {
            if (day <= 21) {
                System.out.println("Your zodiac sign is Sagittarius");
            } else {
                System.out.println("Your zodiac sign is Capricorn");
            }
        }
    }
}
