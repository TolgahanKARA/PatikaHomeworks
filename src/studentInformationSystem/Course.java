package studentInformationSystem;

public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int vNoteOne;
    int vNoteTwo;
    int vNoteThree;

    Course (String name, String prefix, String code){

        this.name = name;
        this.prefix = prefix;
        this.code = code;
        this.teacher = teacher;
        int note = 0;

    }

    void addTeacher(Teacher teacher){

        this.teacher = teacher;

        if (this.prefix.equals(this.teacher.breanch)){

            teacher.teacherKnowlange();

        }else{

            System.out.println("ders kodu ile uyuşmuyor");

        }

    }

    void printTeacher(){

        if (this.teacher != null){

            System.out.println(this.prefix + " kodlu "+ this.name + " dersinin öğretmeni :" + teacher.name);

        }else{

            System.out.println("Derse Öğretmen atanmamıştır.");

        }

    }


}
