import java.util.Scanner;
public class Student {private static int mark; private static int ID; public static int age; public static int date; static Scanner Switch = new Scanner(System.in);
    static void setMark(int mark) {Student.mark = mark;}
    static void setID(int ID) {Student.ID = ID;}
    static int getMark() {return mark;}
    static int getID() {return ID;}
    static void switchAge() {System.out.println("Switch your age: ");
        int age = Switch.nextInt();
        {if (age >= 16 && age <= 23) Student.age = age;
        else {System.out.println("Error!");} } }
    static void switchDate() {System.out.println("Switch your date: ");
        int date = Switch.nextInt();
        if (date >= 1 && date <= 31) Student.date = date;
        else {System.out.println("Error!");} } }