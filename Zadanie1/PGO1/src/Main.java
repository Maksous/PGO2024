import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();

        if(b>0){
            System.out.println("Dodatnia");
        }else if (b<0){
            System.out.println("Ujemna");
        }else{
            System.out.println("Zero");
        }
    }
}