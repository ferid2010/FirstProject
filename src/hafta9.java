import java.util.Scanner;

public class hafta9 {
    public static void main(String[] args) {



            System.out.println("sizin notunuzu yaziniz");
        Scanner scanner = new Scanner(System.in);


            int grade = scanner.nextInt();

            String result = "";

            if (grade >= 90){
                result = " A";

            } else if (grade >= 80) {

                result = " B";
            } else if (grade >= 70) {

                result = " C";
            } else if (grade >= 60) {

                result = " D";
            } else if (grade <= 59) {

                result = " F";
            }

            System.out.println("sizin notunuz " + result);

    }
}
