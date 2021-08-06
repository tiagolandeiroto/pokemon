import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String input;

        System.out.println("Insira os movimentos que pretende realizar?\nN- Norte\nS- Sul\nO- Oeste\nE- Este");

        input = inputString();

    }

    public static String inputString(){

        try{
            String input = sc.nextLine();
        }catch(InputMismatchException ex){
            System.out.println("Insira apenas:\nN- Norte\nS- Sul\nO- Oeste\nE- Este");
        }
        return null;
    }
}
