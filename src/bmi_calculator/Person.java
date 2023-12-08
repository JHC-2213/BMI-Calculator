/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmi_calculator;
public final class Person extends Calculate{
    public double height,weight,mass,Mheight,BMI,HinInch;
    public String BMIInfo="";
    public Person(double height,double weight){
        this.height=height;
        this.weight=weight;
        getH_W();
        getBMI();
    }
    
    private void getH_W(){
        mass=convertLBToKG(weight);
        HinInch=convertFtToInch(height);
        Mheight=convertInchToM( HinInch);
    }
    private void getBMI(){
        BMI=BMI(mass,Mheight);
        BMIInfo=checkBMI(BMI);
    }
    
}
