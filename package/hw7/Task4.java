package hw7;

import java.text.DecimalFormat;

public class Task4 {

    public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat("#.###########");
        double[] sinTable = new double[361];

        for (int i = 0; i <= sinTable.length-1; i += 10) {
            int degrees = i;
            sinTable[i] = Math.sin(Math.toRadians(i));
            System.out.println("degree " + degrees + " = sin " + decimalFormat.format(sinTable[i]));
        }
    }
}






