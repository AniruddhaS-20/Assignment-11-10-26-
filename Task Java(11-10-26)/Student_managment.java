class Student {
    String name;
    int roll, total;
    double percentage;
    String result;

    Student(String name, int roll, int m1, int m2, int m3, int m4, int m5) {
        this.name = name;
        this.roll = roll;
        this.total = m1 + m2 + m3 + m4 + m5;
        this.percentage = total / 5.0;
        this.result = (m1 >= 40 && m2 >= 40 && m3 >= 40 && m4 >= 40 && m5 >= 40) ? "PASS" : "FAIL";
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Total Marks: " + total + "/500");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Result: " + result);
    }
}

public class Student_managment {
    public static void main(String[] args) {
        new Student("Rahul", 21, 85, 76, 91, 68, 80).display();
    }
}