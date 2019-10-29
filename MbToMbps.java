// Written by Noah Pohl
// 10/29/2019

import java.util.Scanner;

public class MbToMbps{
    public static void main(String[] args) {
        System.out.println("This program will convert your intenet download speed from Megabytes (MB/s) to Megabits (Mbps)");
        System.out.println("Pleases enter your current download speed in MB/s");

        Scanner input = new Scanner(System.in);
        double MB = input.nextDouble();
        System.out.println( "The internet speed you entered in Megabytes is " + MB + " MB/s ");
        double Mbps = MB * 8.192;

        String MbpsVal = String.format("%.2f", Mbps);
        System.out.println("Your internet speed in Megabits is " + MbpsVal + " Mbps");
        input.close();
    }
    
}