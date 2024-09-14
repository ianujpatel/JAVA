package D_functionAndMethodsds;

import java.util.Scanner;

public class scope {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("we can not acess num here ");
        System.out.println("we also not used marks outside the finction");
        random(55);
        {
           // int a = 78; this will throw a error because we only update the value but not reinitialized in block scope
            a =90;
            int c = 80;
        }
        System.out.println("we cannot use c here");
    }
    static void random(int marks){
        //any thing declare in function we only acess in function that's called function scope
        int num =67;
        System.out.println("num will be only used in this function"+num);
        System.out.println("marks will be used in this function"+marks);
    }
}
