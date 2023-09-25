/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work03;

/**
 *
 * @author Nateethip
 */
public class MyUtil {
    public static double CalculateBMI(double weight, double height) {
        double BMI;
        BMI = weight/(height*height);
        return BMI;
    }
    public static double average(int v1, int v2, int v3) {
        int average;
        average = (v1 + v2 + v3)/3;
        return average;
    }
    
}
