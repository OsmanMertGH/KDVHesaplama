import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner deger=new Scanner(System.in);

        System.out.print("Ürün Fiyatı:");
        double fiyat=deger.nextDouble();

        System.out.println("Ürün KDV Dahil Fiyatı:"+fiyat*1.18);
        System.out.println("Ürün KDV'si:"+fiyat*0.18);


    }
}