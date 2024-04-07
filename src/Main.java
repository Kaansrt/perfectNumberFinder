import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number,result = 0;
        int i = 1;
        System.out.println("Bir sayi giriniz : ");
        number = inp.nextInt();
        while (i < number) {
            if (number % i == 0) {
                result +=i;
            }
            i++;
        }
        System.out.println("*****");
        if (result == number) {
            System.out.println(number + " Mükemmel bir sayidir.");
        } else {
            System.out.println(number + "Mükemmel bir sayi değildir.");
        }
    }
}