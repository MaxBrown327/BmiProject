import java.util.Scanner;

public class BmiProject {

    public static void main(String[] args){
        //Declare\\
        int feet;
        int inches;
        int lbs;
        float meters;
        float kgs;
        float BMI;

        Scanner keyboard = new Scanner(System.in);




        //Collecting info\\
        System.out.println("What is your height only in feet?");
        feet = keyboard.nextInt();
        feet = feet *12;
        System.out.println("How man inches after that? Ex. 5'11");
        inches = keyboard.nextInt();
        inches = inches + feet;
        meters = inches * 0.0254f;
        System.out.println("How much dow you weigh?");
        lbs = keyboard.nextInt();
        kgs = lbs * 0.453592f;
        BMI = kgs / (meters*meters);
        System.out.println("So with the data collected that means your BMI is" +" "+ BMI);

        }
}
