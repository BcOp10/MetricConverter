import java.util.Scanner;

public class Converter {

public static float metricConverter(String metricInput, String metricOutput, float number){
            float convertNum = 0;

            switch (metricInput){
                case "kg":
                case "mL":
                case "km":
                case "kph":
                case "cm":
                switch (metricOutput){
                    case "lb":
                        convertNum = number * (float)2.205;
                        System.out.println(number  + " " +  metricInput + " = "  + convertNum  + " "+  metricOutput + "\n");
                        break;
                    case "L":
                        convertNum = number * (float)0.001;
                        System.out.println(number  + " " +  metricInput + " = "  + convertNum  + " "+  metricOutput + "\n");
                        break;
                    case "ft":
                        convertNum = number * (float)3280.84;
                        System.out.println(number  + " " +  metricInput + " = "  + convertNum  + " "+  metricOutput + "\n");
                        break;
                    case "mph":
                        convertNum = number * (float)0.621371;
                        System.out.println(number  + " " +  metricInput + " = "  + convertNum  + " "+  metricOutput + "\n");
                        break;
                    case "in":
                        convertNum = number * (float)0.393701;
                        System.out.println(number  + " " +  metricInput + " = "  + convertNum  + " "+  metricOutput + "\n");
                        break;
                    default:
                        System.out.println("Please enter a valid conversion! For example: 1 kg = lb\n");
                        break;
                        
                }
            }
            return convertNum;
}

    public static void main(String[] args) throws Exception {
        
        Scanner scnr = new Scanner(System.in);
        float number;
        String input;
        String[] array;
        String metricInput;
        String metricOutput;

        while(true){
            System.out.println("Welcome to the metric converter!" + "\nPlease enter your metrics to convert" + "\nFor example: 1 kg = lb" + "\nEnter 'exit' or '-1' to close the program!\n");
            input = scnr.nextLine();
            array = input.split(" ");
            if(input.equals("exit") || input.equals("-1")){
                System.out.println("Thank you for using the metric converter! Goodbye!");
                scnr.close();
                break;
            }

            if (array.length != 4){
                System.out.println("The input entered is not valid. Please try again!\n");
                continue;
            } else {
                number = Float.parseFloat(array[0]);
                metricInput = array[1];
                metricOutput = array[3];
                metricConverter(metricInput, metricOutput, number);
            }
        }
            scnr.close();
    }
}