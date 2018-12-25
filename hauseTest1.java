import com.sun.org.apache.bcel.internal.generic.RETURN;

public class hauseTest1 {

    public static void main(String[] args) {

        //Объявление переменных приметивных типов.

        //byte B = 5;
        //short S = 150;
        //int I = 60000;
        //Long L = 5000000L;

        //float F = 1700.23F;
        //double D = 14.456456456;

        //boolean bool = false;
        //char Ch = 'a';

        //Метод вычисления выражения №3 ДЗ:

        //a * (b + (c / d))
        int a = 5;
        int b = 7;
        int c = 4;
        int d = 9;

        System.out.println(sum(a,b,c,d));

        //Метод сравнения №4 из ДЗ:

        int g = 5;
        int h = 7;

        sravnenie( g, h);

        //Метод №5 из ДЗ

        int j = 17; // 0 Положительное число

        proverka(j);

        //Метод № 6 из ДЗ

        int k = -17;
        System.out.println(return_otr(k));

        //Метод №7 из ДЗ

        String Name = "Vasiliy";
        Hallo_name(Name);

        //Метод №8 из ДЗ

        int god = 2400;
        ProverkaGod(god);

    }

    public static void ProverkaGod(int god){

        //Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        //Что бы решить данную задачу пришлось по гуглить.
        if (!(god % 4 == 0) || ((god % 100 == 0) && !(god % 400 == 0))) {
            System.out.println("Не високосный");
        }    else {
            System.out.println("Високосный");
        }

    }

    public static void Hallo_name(String Name){
        System.out.println("Привет," + Name + "!");
    }

    public static boolean return_otr (int k){

        boolean bool = true;

        if (k < 0){
            bool = true;
        }else {
            bool = false;
        }
        return bool;

    }

    public static int sum(int a,int b,int c,int d){

        int abcd = a * (b + (c / d));

        return abcd;
    }

    public static void sravnenie(int g,int h){

        int gh = g + h;

        if (gh >= 10 && gh <= 20){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    public static void proverka(int j){

        if (j >= 0){
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }

    }
}
