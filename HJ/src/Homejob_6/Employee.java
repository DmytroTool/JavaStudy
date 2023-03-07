package Homejob_6;
//2. Описати клас Employee з полями (методи описуєте самостійно):
//
//        - Прізвище
//
//        - Ім'я
//
//        - Посада
//
//        - Заробітня платня за годину
public class Employee {
    String lastName;
    String firstName;
    double salaryPerHour;

    public Employee(String lastName, String firstName, double salaryPerHour) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.salaryPerHour = salaryPerHour;
    }
        public String getLastName() {
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
    }
        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public double getSalaryPerHour() {
            return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }
}
