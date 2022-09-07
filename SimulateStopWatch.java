package day6;

import java.util.Scanner;
import java.time.*;

public class SimulateStopWatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int userchoice;
        long startTime = 0;
        long stopTime;
        long timeElapsed;


        while (true) {

            System.out.println("Enter:\nSTART - 1\nSTOP - 2\nEXIT - 3\n");
            userchoice = sc.nextInt();
            switch (userchoice) {

                case 1 -> {
                    startTime = System.currentTimeMillis();
                    System.out.println("Started At: " + startTime + " ms");
                }
                case 2 -> {
                    stopTime = System.currentTimeMillis();
                    System.out.println("Stopped At: " + stopTime + " ms");
                    timeElapsed = stopTime - startTime;
                    System.out.println("Elapsed Time: " + timeElapsed + " ms");
                }
                case 3 -> System.exit(0);
            }

        }
    }
}