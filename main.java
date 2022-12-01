package vki;
import java.util.Scanner;
public class VKI {

    public static void main(String[] args) {
        double boy, kilo ,vki;

        Scanner input = new Scanner(System.in);

        System.out.println("Lüütfen Boyunuzu Metre Cinsinden Giriniz : ");
        boy = input.nextDouble();

        System.out.println("Lütfen Kilonuzu Giriniz : ");
        kilo = input.nextDouble();

        vki = kilo/(boy * boy);

        System.out.println("Girmiş Olduğunuz Veriler Işığında VKI : " + vki);
    }

}
