/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Joseph
 */
public class Ex8TemperaturesatWheatley {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double[] temperatures = new double[12];

        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Please enter temperature: " + (i + 1) + ": ");
            temperatures[i] = kb.nextDouble();
        }

        double highest = temperatures[0];
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > highest) {
                highest = temperatures[i];
            }
        }

        System.out.print("The highest temperature is: " + highest);
        
        double lowest = temperatures[0];
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] < lowest) {
                lowest = temperatures[i];
            }
        }
        System.out.print("The lowest temperature is:" + lowest);
       
        double total = 0;
        for (int i = 0; i < temperatures.length; i++) {
            total += temperatures[i];
        }    
        
        double average = total / temperatures.length;
        System.out.print("The average temperature is: " + average);
    }
