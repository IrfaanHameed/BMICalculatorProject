import java.util.Scanner;

public class BMI {
    static Scanner input = new Scanner(System.in);
    static float  height;
    static float weight;
    static String name;
    static int age;
    static char Gender;

    public  void getData(){
        System.out.println("Enter Your Name : ");
        name = input.nextLine();
        System.out.println("Enter Your Age :  ");
        age = input.nextInt();
        System.out.println("Enter Your Gender (M/F) : ");
        Gender = input.next().charAt(0);
        System.out.println("Enter Your Height (in cm) : ");
        height = input.nextFloat();
        System.out.println("Enter Your Weight (in kg) : ");
        weight = input.nextFloat();
    }

    public float getHeight(){
        return  height;
    }

    public float getWeight(){
        return  weight;
    }

    public float ComputeBMI(){
        height = getHeight();
        weight = getWeight();
        float heightInMeter = height / 100;
        float squareOfHeight = heightInMeter * heightInMeter;
        float bmi = weight / squareOfHeight;

        return Math.round(bmi);
    };

    public void DisplayData(){
        System.out.println("***** Details *****\n");
        System.out.println("Name  : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Gender : " + Gender);
        System.out.println("Height  : " + height );
        System.out.println("Weight : " + weight);
        System.out.println(" ");
        System.out.println("Computing Your  BMI.........\n");
        System.out.println(" ");
        System.out.println("RESULT");
        System.out.println(" ");
        float bmi = ComputeBMI();
        System.out.println("Your bmi is : "+ bmi);
   }

    public void DisplayMessage(){
        String message = " ";
        float bmi = ComputeBMI();
        if(bmi < 18.5){
            message = "UnderWeight";
        }else if(bmi > 18.5 && bmi < 24.9){
            message = "Normal";
        }else if(bmi > 25 && bmi < 29.9){
            message = "OverWeight";
        }else if(bmi > 30 && bmi < 34.9){
            message = "Obese";
        }else if(bmi > 35 && bmi < 39.9){
            message = "Severely Obese";
        }else if(bmi > 40){
            message = "Morbidly Obese";
        }
         System.out.println("You are "+ message);
    }
}
