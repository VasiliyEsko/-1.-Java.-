import java.util.Random;
import java.util.Scanner;

public class HauseTest3 {

    public static Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        //int d = getNumberFromScanner("Введите число в пределах от 1 до 10 ", 1, 10);

        do {
            Random r =  new Random();
            int secretNumber = r.nextInt(9);

            for (int i = 0; i < 3; i++) {

                System.out.println("Введите число в пределах от 1 до 9 ");

                int x = sc.nextInt();

                if (x == secretNumber){
                    System.out.println("Вы угадали!");
                    break;
                }
                else if (x > secretNumber)System.out.println("Ваше число больше загаданного!");
                else if (x < secretNumber)System.out.println("Ваше число меньше загаданного!");

                if (i == 3)System.out.println("Вы проиграли!");

            }

            System.out.println("Хотите продолжить? 1-да, 0-нет.");

            int n = sc.nextInt();

            if (n == 1)System.out.println("Играем!");
            else {
                System.out.println("Удачи!");
                return;
            };

        }while (true);



    }
}
