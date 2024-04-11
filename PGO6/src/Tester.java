//ctrl + o do nadpisywania metod. Wymagany aktywny kursor na nazwie klasy
public class Tester extends Employee{

    public Tester(String name, String surname, String address, String email, String PESEL, int yearOfEmployment) {
        super(name, surname, address, email, PESEL, yearOfEmployment);
    }


    //metoda dodawania typu testu

    @Override
    public int calculateSalary() {
        return super.calculateSalary() + testType.size() * 300;
    }
}
