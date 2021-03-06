package com.stiplin.hackerrank.tasks.easy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NumberLineJumps {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        int firstCoord = x1;
        int secondCoord = x2;
        int coordDiff = secondCoord - firstCoord;

        while (true) {
            if (coordDiff == 0) {
                return "YES";
            }
            firstCoord = firstCoord + v1;
            secondCoord = secondCoord + v2;
            int newCoordDiff;
            if (secondCoord > firstCoord) {
                newCoordDiff = secondCoord - firstCoord;
            } else {
                newCoordDiff = firstCoord - secondCoord;
            }
            if (newCoordDiff > coordDiff) {
                return "NO";
            }
            coordDiff = newCoordDiff;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
