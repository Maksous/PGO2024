import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz miasto");
        String city = scanner.nextLine();
        System.out.println("Wprowadz wiek");
        int age=scanner.nextInt();
        scanner.nextLine(); // for consuming the remaining newline
        System.out.println("Wprowadz dzien");
        String dayOfWeek = scanner.nextLine();

        double finalPrice = calculatePrice(age, city, dayOfWeek);
        //String discountMessage = getDiscountMessage(age, city, dayOfWeek);

        System.out.printf("Data: %s %d years old %s Ticket price: %.2f PLN\n", city, age, dayOfWeek,finalPrice);

    }

    private static String getDiscountMessage(int age, String city, String dayOfWeek) {
        return "test";
    }

    public static double calculatePrice(int age, String city, String dayOfWeek) {
        double poczatkowaCena = 40.00;
        double price = poczatkowaCena;
        if (dayOfWeek=="Czwartek" || age <10){
            return 0;
        }
        if(age>=10 && age <= 18){
            price*=0.5; // price=price*0.5
        }
        if(city == "Warszawa"){
            price*=0.9;
        }
        return price;
    }
}