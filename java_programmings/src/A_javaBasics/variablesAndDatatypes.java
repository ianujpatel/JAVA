package A_javaBasics;
import java.util.*;
public class variablesAndDatatypes {
    public static void main(String[] args) {
        System.out.println("namaste bharat");
        // Variable and data types
        String name ="tony stark";
        System.out.println(name);
        /*primitive :- byte ,short ,int ,char ,boolean , lang , float , double
        * non-primitive :- String , array , class , object , interface  */
        int a = 10;
        int b =25;
        int sum = a+b;
        System.out.println(sum);
        //priority in java [ * / % > + - ]
        // taking input in java
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your id");
        String id1 = sc.next();
        System.out.println(id1);
        System.out.println("enter your id2");
        Scanner s = new Scanner(System.in);
        String id2 = s.nextLine();
        System.out.println(id2);
    }
}
