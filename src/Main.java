import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fizik, turkce, tarih, muzik;


        System.out.println("Matematik Notunuz :");
        mat = input.nextInt();
        if ((mat < 0) || (mat > 100)){
            System.out.println("0 ve 100 Arasında Bir Sayı Giriniz");
            mat = input.nextInt();

        }
        System.out.println("Fizik Notunuz :");
        fizik = input.nextInt();
        if ((fizik < 0) || (fizik >100)){
            System.out.println("0 ve 100 Arasında Bir Sayı Giriniz");
            fizik = input.nextInt();
        }
        System.out.println("Türkçe Notunuz :");
        turkce = input.nextInt();
        if ((turkce < 0) || (turkce >100)) {
            System.out.println("0 ve 100 Arasında Bir Sayı Giriniz");
            turkce = input.nextInt();
        }

        System.out.println("Tarih Notunuz :");
        tarih = input.nextInt();
            if ((tarih < 0) || (tarih >100)) {
                System.out.println("0 ve 100 Arasında Bir Sayı Giriniz");
                tarih = input.nextInt();
            }

        System.out.println("Müzik Notunuz : ");
        muzik = input.nextInt();
                if ((muzik < 0) || (muzik >100)) {
                    System.out.println("0 ve 100 Arasında Bir Sayı Giriniz");
                    muzik = input.nextInt();
                }

        double average = (mat + fizik + turkce + tarih + muzik)/5;
        if (average <= 55.0){
            System.out.println("Sınıfı Geçemediniz");
        }else {
            System.out.println("Tebrikler Sınıfı Geçtiniz");
        }
        System.out.println("Ortalamanız : " + average);
    }
}