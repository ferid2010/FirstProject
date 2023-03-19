import java.util.Scanner;

public class hafta21odev {

    public static void main(String[] args) {

        //odev 1

        Scanner scanner = new Scanner(System.in);

        System.out.println("bir sayi girin");

        int sayi = scanner.nextInt();

        System.out.println("sayinin ustunu girin");

        int ust = scanner.nextInt();

        System.out.println(Math.pow(sayi, ust));


        //odev 2

        System.out.println("isminizi giriniz");

        String isim = scanner.next();
        System.out.println("yasinizi giriniz");

        int yas = scanner.nextInt();

        if (yas >= 18) {

            System.out.println("ehliyet alabilirsiniz");

        } else {

            System.out.println("ehliyet alamasyiniz");

        }


    }


}