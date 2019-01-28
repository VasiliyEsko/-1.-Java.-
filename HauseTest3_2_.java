//import java.util.Arrays;
//import java.util.Random;
//import java.util.Scanner;
//
//public class HauseTest3_2 {
//
//    public static Scanner sc = new java.util.Scanner(System.in);
//
//    public static void main(String[] args) {
//
//        String words [] = {"apple", "orange", "lemon", "banana", "apricot",
//                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
//                "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
//                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin",
//                "potato"};
//
//        Random r = new Random();
//        int n = words.length - 1;
//        int number = r.nextInt(n);
//
//        String secretWords = words[number];
//
//        System.out.println("Добрый день, вам нужно угадать фрукт, который загадала система из предложенных вариантов ниже:");
//        System.out.println();
//
//        String intArrayString = Arrays.toString(words);
//        System.out.println(intArrayString);
//
//        do {
//            System.out.println("Выберите слово из предложенного списка и укажите его.");
//            String x = sc.nextLine();
//
//            if (x.equals(secretWords)) {
//                System.out.println("Вы угадали!");
//                break;
//            }
//            else {
//                String mask = "###############";
//                char[] myNameChars = mask.toCharArray();
//                myNameChars[4] = 'x';
//                for (int i = 0; i < x.length(); i++) {
//                    for (int j = 0; j < secretWords.length(); j++) {
//                        if (x.charAt(i) == secretWords.charAt(j)){
//
//                            myNameChars[j] = secretWords.charAt(j);
//                            System.out.println();
//                        }
//                    }
//                }
//
//                System.out.println("Символы которые совпали: " + String.valueOf(myNameChars));
//            };
//        }while (true);
//
//    }
//
//}
