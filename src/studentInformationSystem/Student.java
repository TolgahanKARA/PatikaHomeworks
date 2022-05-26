package studentInformationSystem;

public class Student {

    Course cOne;
    Course cTwo;
    Course cThree;

    String name;
    int stuNo;
    String classes;
    double average;
    boolean isPass = false;

    Student (String name, int stuNo, String classes, Course cOne, Course cTwo, Course cThree){

        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.cOne = cOne;
        this.cTwo = cTwo;
        this.cThree = cThree;

    }

    void isPass(){

        calcAverage();

        if (this.average > 55){

            isPass = true;
            System.out.println("Sınıfı geçtiniz");

        }else{
            System.out.println(average);
            System.out.println("Sınıfta kaldınız Aynı sınıfı bir kez daha okuyacaksınız");

        }

    }

    public void addBulkExamNote(int noteOne, int noteTwo, int noteThree, int vNoteOne, int vNoteTwo, int vNoteThree){

        if (noteOne >= 0 && noteOne <= 100){

            this.cOne.note = noteOne;
            System.out.println( this.cOne.name + "dersinin notu " + this.cOne.note);

        }else{

            System.out.println("Öğrencinin notu 0'dan küçük yada 100'den büyük olamaz");

        }

        if (noteTwo >= 0 && noteTwo <= 100){

            this.cTwo.note = noteTwo;
            System.out.println( this.cTwo.name + "dersinin notu " + this.cTwo.note);

        }else{

            System.out.println("Öğrencinin notu 0'dan küçük yada 100'den büyük olamaz");

        }

        if (noteThree >= 0 && noteThree <= 100){

            this.cThree.note = noteThree;
            System.out.println( this.cThree.name + "dersinin notu " + this.cThree.note);

        }else{

            System.out.println("Öğrencinin notu 0'dan küçük yada 100'den büyük olamaz");

        }



    }

    public void calcAverage(){

        this.average = (((this.cOne.note*0.8)+(this.cOne.vNoteOne*0.2)) + ((this.cTwo.note*0.8)+(this.cTwo.vNoteTwo*0.2)) + ((this.cThree.note*0.8)+(this.cThree.vNoteThree*0.2)))/3.0;
        System.out.println(this.average);

    }






}
