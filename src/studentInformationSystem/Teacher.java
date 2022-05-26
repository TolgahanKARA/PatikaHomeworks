package studentInformationSystem;

public class Teacher {

    String name;
    String mpno;
    String breanch;

    Teacher (String name, String mpno, String breanch) {

        this.name = name;
        this.mpno = mpno;
        this.breanch = breanch;

    }

    public void teacherKnowlange() {

        System.out.println("Öğretmenin Adı\t\t:\t" + this.name);
        System.out.println("Öğretmenin Bölümü\t:\t" + this.breanch);
        System.out.println("Öğretmenin Telefonu\t:\t"+ this.mpno);

    }
}


