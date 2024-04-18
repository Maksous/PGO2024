import java.util.Date;
import java.util.List;

//Informacje o studentach wraz z metodami do zarządzania ich stanem
// - rejestracja na program studiów
// - dodawanie ocen
// - promocja do następnego semestru
// - wyświetlenie informacji
public class Student {
    private static int nextIndexNumber = 1;
    private String indexNumber;
    private Date birthDate;
    private List<Grade> grades;

    //pozostałe pola
    // this.grade = new ArrayList<>();

    public Student(String indexNumber) {
        this.indexNumber = "s" + nextIndexNumber++;
        //pozostale pola
    }



}
