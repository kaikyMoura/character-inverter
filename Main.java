package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra qualquer e vejo o resultado: ");
        String str = sc.nextLine();
        
        String inv = inverterChar(str, str.length() - 1);
        System.out.println(inv);
    }

    public static String inverterChar(String str, int i) {
        if (i == 0) {
            return str.charAt(0) + "";
        }
        char inv = str.charAt(i);
        return inv + inverterChar(str, i - 1);
    }
}