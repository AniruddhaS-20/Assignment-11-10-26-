class Employee {
    String name;
    int id;
    double monthlySalary;
    int rating;

    Employee(String name, int id, double monthlySalary, int rating) {
        this.name = name;
        this.id = id;
        this.monthlySalary = monthlySalary;
        this.rating = rating;
    }

    void display() {
        double annual = monthlySalary * 12;
        double bonusPct = (rating == 5) ? 0.20 : (rating == 4) ? 0.15 : (rating == 3) ? 0.10 : 0.05;
        double bonus = annual * bonusPct;

        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Annual Salary: " + annual);
        System.out.println("Annual Bonus: " + bonus);
        System.out.println("Total Annual Compensation: " + (annual + bonus));
    }
}

public class Employe_bonus_salary {
    public static void main(String[] args) {
        new Employee("Amit", 105, 50000, 4).display();
    }
}