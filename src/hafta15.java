import java.util.Arrays;
import java.util.Scanner;

public class hafta15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <101 ; i++) {

            System.out.print(i + " ");

            if (i % 10 == 0) {
                System.out.print("\n");}
            
        }

      /*   ASCII table harflerin numarasi koda gore:

        A-Z = 65-90

        a-z = 97-122


       */



        System.out.println("sifrenizi giriniz:");

        String girilen = scanner.next();

        String sifre = "123ABC";

        while (!(girilen.equals(sifre))){

            System.out.println("sifre yanlis\n" +
                    "lutfen tekrar deneyin");

            girilen = scanner.next();
        }

        System.out.println("dogru sifreyi girdiniz\n" +
                "giris basarili");


        }




    }


