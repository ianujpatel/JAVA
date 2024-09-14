package D_functionAndMethodsds;

import java.util.Arrays;
import java.util.Scanner;

public class starterfunction {
    public static void main(String[] args) {
        sum();// calling the functions
        int ans =sum2();
        System.out.println(ans);
        String ask = greet();
        System.out.println(ask);
        int answ = multiply(7,5);
        System.out.println(answ);
        swap(2,3);
        String name =" i anuj kumar";
        greets(name); // there is no pass by referance cocepts in java its only pass by value
        // create an array
        int[]arr = {1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a");
        int a = sc.nextInt();
        System.out.println("Enter the number b");
        int b = sc.nextInt();
        int result = a+b;
        System.out.println("the sum of the two nos is "+result);
    }
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a");
        int a = sc.nextInt();
        System.out.println("Enter the number b");
        int b = sc.nextInt();
        int result = a+b;
        // return the value according to its return types
        return result;
        //System.out.println("this will never executes");
    }
    static String greet(){
        String greeting = "how are you";
        return greeting;
    }
    // arguments :- pass the value of numbers when you are calling the method in main();
    static int multiply(int a, int b){
        int resu = a*b;
        return resu;
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }
   static void greets(String naam){
        System.out.println(naam);
   }
   static void change(int[] nums){
        nums[0] = 99;
   }
}
