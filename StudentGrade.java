
import java.util.Scanner;

class StudentGrade {

    void student() {

        String name;

        long roll_num;
        byte sub1, sub2, sub3, sub4, sub5;
        float per;
        //short m;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name");
        name = sc.nextLine();

        System.out.println("Enter   roll number");
        roll_num = sc.nextLong();

        System.out.println("Enter   physics number");
        sub1 = sc.nextByte();

        System.out.println("Enter   math number");
        sub2 = sc.nextByte();

        System.out.println("Enter   english number");
        sub3 = sc.nextByte();

        System.out.println("Enter   hindi number");
        sub4 = sc.nextByte();

        System.out.println("Enter   chemistry number");
        sub5 = sc.nextByte();

        per = (sub1 + sub2 + sub3 + sub4 + sub5) * 100 / 500;

        System.out.println("Student Details");
        System.out.println(" Student Name : " + name);
        System.out.println("Roll  number : " + roll_num);
        System.out.println("physics number : " + sub1);
        System.out.println("math number : " + sub2);
        System.out.println("english number : " + sub3);
        System.out.println("hindi number : " + sub4);
        System.out.println("chemistry number : " + sub5);
        System.out.println("total marks : " + (sub1 + sub2 + sub3 + sub4 + sub5));
        System.out.println("percentage: " + per);
        
        if (per <= 100 && per > 85) {
            System.out.println("Grade : A");
        } else if (per <= 85 && per > 75) {
            System.out.println("Grade : B");
        } else if (per <= 75 && per > 65) {
            System.out.println("Grade : C");
        } else if (per <= 65 && per > 40) {
            System.out.println("Grade : D");
        } else {
            System.out.println("you are faild");
        }

    }

    public static void main(String[] args) {

        StudentGrade obj = new StudentGrade();
        obj.student();
    }
}
