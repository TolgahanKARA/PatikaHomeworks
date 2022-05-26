package studentInformationSystem;

public class Main {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("Tolgahan", "535", "BLS");
        Teacher t2 = new Teacher("Tunahan", "444", "YMY");
        Teacher t3 = new Teacher("Gültekin", "333","BDN");

        Course Bls = new Course("Bilgisayar","BLS","101") ;
        Course Ymy = new Course("Yeni Medya","YMY","101") ;
        Course Bdn = new Course("Beden Eğitimi","BDN","101") ;

        Student s1 = new Student("Ahmet", 5, "4", Bls, Ymy, Bdn);
        s1.addBulkExamNote(100,100,20, 75,85,90);
        s1.isPass();
        s1.calcAverage();

        Bls.printTeacher();

    }

}
