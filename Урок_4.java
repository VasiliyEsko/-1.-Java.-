//import java.util.Random;
//import java.util.Scanner;
//
//public class Урок4 {
//
//    static int SIZE = 5;
//    static int VERDICT = SIZE - 1;
//
//    static int SUZE_X = SIZE;
//    static int SUZE_Y = SIZE;
//
//    static char [][] field = new char[SUZE_X][SUZE_Y];
//    //static char [][] field = new char[SUZE_Y][SUZE_X];
//    static Scanner scanner = new Scanner(System.in);
//    static Random random = new Random();
//
//    static char PLAYER_DOT = 'X';
//    static char ALT_DOT = 'O';
//    static char EMPTY_DOT = '.';
//
//    static void initField(){
//        for (int i = 0; i < SUZE_Y; i++) {
//            for (int j = 0; j < SUZE_X; j++) {
//               field[i][j] = EMPTY_DOT;
//            }
//        }
//    }
//
//    static void printField(){
//        for (int i = 0; i < SUZE_Y; i++) {
//            if (i == 0){
//                System.out.print("   " + ( i + 1 ) + "   ");
//            } else {
//                System.out.print(( i + 1 ) + "   ");
//            }
//        }
//        System.out.println();
//        for (int i = 0; i < SUZE_Y; i++) {
//            System.out.print((i + 1) + " |");
//            for (int j = 0; j < SUZE_X; j++) {
//                System.out.print(field[i][j] + " |");
//            }
//            System.out.println();
//        }
//    }
//
//    static void setSym(int y, int x, char sym){
//        field[y][x] = sym;
//    };
//
//    static void playerStep(){
//        int x;
//        int y;
//        do {
//            System.out.println("Введите координаты Y и X от 1 до 3");
//            y = scanner.nextInt() - 1;
//            x = scanner.nextInt() - 1;
//
//        }while (!isCellValid(y,x));
//        setSym(y,x,PLAYER_DOT);
//
//    }
//
//    static void aiStep(){
//        int x;
//        int y;
//        System.out.println("Ходит комп");
//        do {
//            y = random.nextInt(SUZE_Y);
//            x = random.nextInt(SUZE_X);
//
//        }while (!isCellValid(y,x));
//        setSym(y,x,ALT_DOT);
//
//    }
//
//    static boolean isCellValid(int y, int x){
//        if (x < 0 || x >= SUZE_X || y < 0 || y >= SUZE_Y) {
//            return false;
//        }
//
//        return field[y][x] == EMPTY_DOT;
//    }
//
//    static boolean checkWin(char sym){
//
//        int gorizont = 0;
//        int vertical = 0;
//        int diagonal_1 = 0;
//        int diagonal_2 = 0;
//
//        for (int i = 0; i < SIZE; i++) {
//            for (int j = 0; j < SIZE; j++) {
//                if (field[i][j] == sym) {
//                    gorizont++;
//                    if (gorizont == VERDICT) return true;
//                }
//
//                if (field[j][i] == sym) {
//                    vertical++;
//                    if (vertical == VERDICT) return true;
//                }
//            }
//
//            if (field[i][i] == sym){
//                diagonal_1++;
//                if (diagonal_1 == VERDICT) return true;
//            }else diagonal_1 = 0;
//
//            if (field[i][SIZE - 1 - i] == sym){
//                diagonal_2++;
//                if (diagonal_2 == VERDICT) return true;
//            }else diagonal_2 = 0;
//
//        }
//
////        if (field[0][0] == sym && field[0][1] == sym && field[0][2] == sym){
////            return true;
////        }
////        if (field[1][0] == sym && field[1][1] == sym && field[1][2] == sym){
////            return true;
////        }
////        if (field[2][0] == sym && field[2][1] == sym && field[2][2] == sym){
////            return true;
////        }
////        if (field[0][0] == sym && field[1][0] == sym && field[2][0] == sym){
////            return true;
////        }
////        if (field[0][1] == sym && field[1][1] == sym && field[2][1] == sym){
////            return true;
////        }
////        if (field[0][2] == sym && field[1][2] == sym && field[2][2] == sym){
////            return true;
////        }
////        if (field[0][0] == sym && field[1][1] == sym && field[2][2] == sym){
////            return true;
////        }
////        if (field[2][0] == sym && field[1][1] == sym && field[0][2] == sym){
////            return true;
////        }
//
//        return false;
//
//    }
//
//    static boolean isFieldFull(){
//        for (int i = 0; i < SUZE_Y; i++) {
//            for (int j = 0; j < SUZE_X; j++) {
//                if(field[i][j] == EMPTY_DOT) return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//
//        initField();
//        printField();
//
//        while (true){
//            playerStep();
//            printField();
//            if (checkWin(PLAYER_DOT)){
//                System.out.println("Игрок выйграл!");
//                break;
//            }
//            if (isFieldFull()){
//                System.out.println("Ничья!");
//                break;
//            }
//            aiStep();
//            printField();
//            if (checkWin(ALT_DOT)){
//                System.out.println("Комп выйграл!");
//                break;
//            }
//            if (isFieldFull()){
//                System.out.println("Ничья!");
//                break;
//            }
//        }
//
//    }
//
//}
