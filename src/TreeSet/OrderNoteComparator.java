package TreeSet;

import java.util.Comparator;

public class OrderNoteComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getNote() == o2.getNote()){

            return o2.getNote();

        }
        return o1.getNote()-o2.getNote();
    }
}
