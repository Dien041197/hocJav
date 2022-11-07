package buoi10;

import java.util.Scanner;

public class ManagementStudent {
    public static void main(String[] args) {
        int n=0;
        Scanner sc=new Scanner(System.in);
        ArrayListStudent als = new ArrayListStudent();
        System.out.println("1. Add new student");
        System.out.println("2. Print list of student");
        System.out.println("3. Delete student");
        System.out.println("4. Edit information except ID");
        System.out.println("5. Find student base on name");
        System.out.println("6. Sort student by increase id");
        System.out.println("7. Exit!");
        System.out.print("Please choose function: ");
        n = sc.nextInt();
        switch (n){
            case 1:
                System.out.print("id: ");
                int id=sc.nextInt();
                System.out.print("name: ");
                String name=sc.nextLine();
                System.out.print("year: ");
                int year=sc.nextInt();
                Student sv= new Student(id,name,year);
                als.addStudent(sv);
                break;
            case 2:
                als.printStudent();
                break;
            case 3:
                System.out.print("id delete: ");
                int idd=sc.nextInt();
                Student s1=new Student(idd);
                als.deleteStudent(s1);
                als.printStudent();
        }
    }
}
