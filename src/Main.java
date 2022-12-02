import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //kullanıcıdan boy ve kilo değerlerini alan "Vücut Kitle İndeks (BIM)" değerini hesaplayan program.
        double kg , m , bim ;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        m = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kg = input.nextDouble();
        bim = kg/Math.pow(m,2) ;
        System.out.println("Vücut Kitle İndeksiniz: "+bim);

    }
}