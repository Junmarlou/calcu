import  java.util.Scanner;

public class tree {
    public static void main(String[] args) {
        
        String opera;
        
        float sum=0;

        Scanner input = new Scanner(System.in);
        System.out.println("\t\tCalculator\t\t");
        System.out.println();

        System.out.println("Enter the first number: ");
        int firnum=input.nextInt();
        input.nextLine();

        System.out.println("What operation u want to use? + - / x");
        opera=input.nextLine();

        if(opera.equals("+")){
            System.out.println("Enter the second number:");
            int secnum=input.nextInt();
            sum= firnum + secnum; 
            
        }
        if(opera.equals("-")){
            System.out.println("Enter the second number:");
            int secnum=input.nextInt();
            sum= firnum - secnum; 
            
        }if(opera.equals("/")){
            System.out.println("Enter the second number:");
            int secnum=input.nextInt();
            sum= firnum/secnum; 
            
        }if(opera.equals("x")){
            System.out.println("Enter the second number:");
            int secnum=input.nextInt();
            sum= firnum * secnum; 
            
        }
        

        System.out.println("The sum is " + sum);
        



       input.close();
}   
}