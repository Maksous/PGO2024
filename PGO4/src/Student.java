import java.util.ArrayList;
import java.util.List;

public class Student {
    public String fname, lname, indexNumber, email, address;
    public List<Double> grades = new ArrayList<>();

    public Student(String fname, String lname, String indexNumber, String email, String address) {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", indexNumber='" + indexNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", grades=" + grades +
                '}';
    }

    public void addGrade(double grade){
        this.grades.add(grade);
    }

    public double obliczSrednia() {
        double average;
        if (grades.isEmpty()) {
            throw new IllegalArgumentException("Brakuje ocen");
        }
        // Dodaj jeszcze 1 warunek uniemożliwiający dodanie więcej niż 20 ocen
        // .size
        else {
            double suma = 0;
            //sumujemy wszystkie liczby w ArrayList za pomoca pętli i następnie dzielimy przez liczbę ocen
            average = suma / grades.size();
        }
        return average;
    }

}
