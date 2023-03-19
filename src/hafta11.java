import java.util.Scanner;

public class hafta11 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //ikici odev
        System.out.println("corner 1:");
        int corner1 = scanner.nextInt();

        System.out.println("Corner 2:");

        int corner2 = scanner.nextInt();

        System.out.println("Corner 3:");

        int corner3 = scanner.nextInt();

        if (corner1 == corner2 && corner1 == corner3 && corner3 == corner2) {

            System.out.println("this triangle is a equilateral");
        } else if (corner1 == corner2 || corner1 == corner3 || corner3 == corner2) {
            System.out.println("this triangle is an isosceles");

        } else {
            System.out.println(" this triangle is a scalene ");
        }


        //ucuncu odev

        System.out.println("sayi bir:");

        int sayi2de1 = scanner.nextInt();

        System.out.println("sayi iki:");

        int sayi2de2 = scanner.nextInt();

        System.out.println("sayi uc:");

        int sayi2de3 = scanner.nextInt();

        String cevap2 = "";

        if (sayi2de1 > sayi2de2){cevap2 = "sayi bir sayi ikiden daha buyuk";

        } else if (sayi2de1 < sayi2de2) {cevap2 = "sayi iki sayi birden daha buyuk";

        } System.out.println(cevap2);

        if (sayi2de2 > sayi2de3){cevap2 = "sayi iki sayi ucten daha buyuk";

        } else if (sayi2de2 < sayi2de3) {cevap2 = "sayi uc sayi ikiden daha buyuk";

        } System.out.println(cevap2);

        if (sayi2de1 > sayi2de3){cevap2 = "sayi bir sayi ucten daha buyuk";

        } else if (sayi2de1 < sayi2de3) {cevap2 = "sayi uc sayi birden daha buyuk";

        }System.out.println(cevap2);


    }



   }