class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        tax();
    }
    public double tax() {
        if (this.salary > 1000) {
            return this.salary * 0.03;
        }else {
            return 0;
        }
    }
    public double bonus() {
        if (this.workHours  > 40) {
            return (this.workHours-40) * 30;
        }else {
            return 0;
        }
    }
    public double raiseSalary() {
        if (2021-this.hireYear>19) {
            return this.salary * 0.15;
        }else if (2021-this.hireYear>9 && 2021-this.hireYear<20) {
            return this.salary * 0.10;
        }else if (2021-this.hireYear>0 && 2021-this.hireYear<10) {
            return this.salary * 0.05;
        }else {
            return 0;
        }
    }
    public String toString() {
        double total2 = salary - tax() + bonus() + raiseSalary();
        double total1 = salary + bonus() - tax();
        System.out.println("Adi : " + this.name);
        System.out.println("Maasi : " + this.salary);
        System.out.println("Çalisma Saati : " + this.workHours);
        System.out.println("Baslangic Yili : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maas artisi : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maas : " + total1);
        System.out.println("Toplam Maas : " + total2);
        return null;
    }
}
public class patika_dev_Java101_Maas_Hesaplama {
    public static void main(String[] args) {
        Employee employee = new Employee("Elon", 10000, 48, 1982);
        employee.toString();
    }
}
