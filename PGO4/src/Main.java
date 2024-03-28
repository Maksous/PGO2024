public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Andrzej","Koluszko","s00001","s00001@pjwstk.edu.pl","Polna 6");
        s1.addGrade(4.5);
        System.out.println(s1.toString());
    }
}