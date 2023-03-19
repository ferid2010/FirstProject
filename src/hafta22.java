import java.net.SocketOption;

import java.util.Arrays;

import java.util.Scanner;

public class hafta22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            //odev 1

           // public static int input( ) {

            System.out.println("kactane sayi girmek istoyosunuz");

            int kac = scanner.nextInt();

            int[] sayilar = new int[kac];

            System.out.println("lutfen sayilari girin");

            for (int i = 0; i < kac; i++) {

                sayilar[i] = scanner.nextInt();
            }

       // }

            //public int[] output(int[] sayilar) {

            System.out.println("En buyuk sayi = " + Arrays.stream(sayilar).max());

            System.out.println("En kucuk sayi = " + Arrays.stream(sayilar).min());

       // }


    //odev 2

        System.out.println("kare me ister siniz yoksa dikdortgen mi?");

        String cevap = scanner.next();

        System.out.println(cevap + "nizin alaninmi hesaplanmasini istiyosunuz yoksa cevresini mi?");

        String cevap2 = scanner.next();

        System.out.println("lutfen " + cevap + "in 2 kosesinin uzunlugunu yazin");

        int kose1 = scanner.nextInt();

        int kose2 = scanner.nextInt();

        if (cevap2 == "cevre"){

            int cevap3 = kose1 * kose2;

            System.out.println("sizin " + cevap + "inizin " + cevap2 + "si" + cevap3);


        }else if (cevap2 == "alan"){

            int cevap3 = kose1 * 2 + kose2 * 2;

            System.out.println("sizin " + cevap + "inizin " + cevap2 + "si " + cevap3);




        }

   
   
   
    }
}