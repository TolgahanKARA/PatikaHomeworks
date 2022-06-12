package TreeSet;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Student> students = new TreeSet<>(new OrderNameComparator());

        students.add(new Student("Tolgahan", 85));
        students.add(new Student("Tunahan",95));
        students.add(new Student("Behlül",45));
        students.add(new Student("Damla",60));
        students.add(new Student("Cemre",60));

        for(Student student : students){

            System.out.println(student.getName());

        }


    }

}
