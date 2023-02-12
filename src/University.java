import java.util.Scanner;
public class University {public static void main(String[] args) {System.out.println("You are presented with information about the teacher's students.");
    System.out.println("Enter '+' or '-' to get a teacher to work: ");
    Scanner chars = new Scanner(System.in);
    for (int x = 0; x < 3; x++) {System.out.println("Next teacher:");
        Teacher.printInfo();
        for (int y = 0; y < 1; y++) {String ch = chars.next();
            if (ch.equals("+")) System.out.println("The teacher is hired!");
            else if (ch.equals("-")) System.out.println("The teacher is not hired");
            else {System.out.println("Error! Try again!");
                y--;}
            chars.nextLine();}
        System.out.println();}
    Teacher.studentMethods();
    System.out.println();
    System.out.println("Calling the methods of teachers: ");
    Teacher.switchMark();
    Teacher.switchID();
    System.out.println();
    Teacher.printInfo();
} }