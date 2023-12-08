/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmi_calculator;
public class Calculate {
    
    public double convertLBToKG(double weight){  
        return  weight *=0.454;
    }
    public double convertFtToInch(double height){  
        double inch;
       return inch =height * 12;
    }
    public double convertInchToM(double inch){ 
        double h = inch /= 39.37;
       return h;
    }
    public double BMI(double mass,double height){
        double BMI = mass/Math.pow(height,2);
        return BMI;
    }
    public String checkBMI(double BMI){
        String string="";
        if(BMI<18.5){
            string="Underweight";
        }else if(BMI>=18.5&&BMI<25){
            string="Normal weight";
        }else if(BMI>=25&&BMI<30){
            string="Overweight";
        }else if(BMI>=30){
            string="Obese";
        }
        return string;
    }
}
