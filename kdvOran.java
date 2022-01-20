import java.util.Scanner;

public class KdvHesap {
    public static void main(String[] args){
        double tutar,kdvOran = 0.18, kdvTutar, kdvliTutar, kdvOranIndirimli = 0.08;

        Scanner inp = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz : ");
        tutar = inp.nextDouble();

        if(tutar < 1000) {
            kdvTutar = tutar * kdvOran;
            kdvliTutar = tutar + kdvTutar;

            System.out.println("KDV\'siz Oranı : " + tutar);
            System.out.println("KDV Oranı : " + kdvOran);
            System.out.println("KDV Tutarı : " + kdvTutar);
            System.out.println("KDV\'siz Tutar : " + kdvliTutar);
        }
        else {
            kdvTutar = tutar * kdvOranIndirimli;
            kdvliTutar = tutar + kdvTutar;

            System.out.println("KDV\'siz Oranı : " + tutar);
            System.out.println("KDV Oranı İndirimli : " + kdvOranIndirimli);
            System.out.println("KDV Tutarı : " + kdvTutar);
            System.out.println("KDV\'siz Tutar : " + kdvliTutar);

        }



    }
}
