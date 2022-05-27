package calculateWage;

public class Employe {

    String name;
    double salary;
    int workHours;
    int hireYear;


    Employe(String name, int salary, int workHours, int hireYear){

        this.name = name;
        this.salary = salary;
        if (workHours <= 0){

            this.workHours = 0;

        }else{

            this.workHours = workHours;

        }
        if (hireYear > 2021){

            this.hireYear = 2021;

        }else {

            this.hireYear = hireYear;

        }

    }

    public double tax(){

        if (this.salary < 1000){

            return 0;

        }else{

            return this.salary * 0.03;

        }

    }

    public int bonus(){

        if (this.workHours < 40){

            return 0;

        }else{

            return (workHours - 40) * 30;

        }

    }

    public double raiseSalary(){

        if ((2021 - this.hireYear) == 0 && (2021 - this.hireYear) < 10){

            return salary * 0.05;

        }else if((2021 - this.hireYear) >= 10 && (2021 - this.hireYear) < 20){

            return salary * 0.1;

        }else{

            return salary * 0.15;

        }

    }

    public void toStrings(){

        System.out.print("Adı\t\t\t\t\t\t\t\t\t:\t" + this.name + "\n" +
                         "Maaşı\t\t\t\t\t\t\t\t:\t" + this.salary + "\n" +
                         "Çalışma Saati\t\t\t\t\t\t:\t" + this.workHours + "\n" +
                         "Başlangıç yılı\t\t\t\t\t\t:\t" + this.hireYear + "\n" +
                         "Vergi\t\t\t\t\t\t\t\t:\t" + tax() + "\n" +
                         "Bonus\t\t\t\t\t\t\t\t:\t" + bonus() + "\n" +
                         "Maaş Artışı\t\t\t\t\t\t\t:\t" + raiseSalary() + "\n" +
                         "Vergi ve Bonuslar ile birlikte maaş\t:\t" + (this.salary + tax() + bonus()) + "\n" +
                         "Toplam Maaş\t\t\t\t\t\t\t:\t" + (this.salary + tax() + bonus() + raiseSalary()));


    }

}
