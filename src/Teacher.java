public class Teacher {static int r = 0; static int c = 0; static String[][] students;
    static void switchMark() {Student.setMark((int)(Math.random() * 4 + 2));}
    static void switchID() {Student.setID((int)(Math.random() * 999 + 1));}
    static void studentMethods() {System.out.println("Calling the methods of students: ");
        System.out.println(Student.getID());
        System.out.println();
        System.out.println(Student.getMark());
        Student.setID((int)(Math.random() * 999 + 1));
        Student.setMark((int)(Math.random() * 4 + 2));
        System.out.println();
        Student.switchAge();
        System.out.println();
        Student.switchDate();}
    static void printInfo() {students = new String[4][2];
        for (int i = 0; i < 3; i++) {Teacher.switchID();
            Teacher.switchMark();
            students[r][c] = "ID:";
            students[r][c + 1] = "Mark:";
            students[r + 1][c] = String.valueOf(Student.getID());
            students[r + 1][c + 1] = String.valueOf(Student.getMark());
            System.out.println(students[r][c] + " " + students[r][c + 1]);
            System.out.print(students[r + 1][c] + " ");
            if (Student.getID() < 100) System.out.print(" ");
            if (Student.getID() < 10) System.out.print(" ");
            System.out.println(students[r + 1][c + 1]);
            r++;}
        r = 0;} }
