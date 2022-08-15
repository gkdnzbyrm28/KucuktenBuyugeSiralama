import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;

         Scanner utp = new Scanner(System.in);

         System.out.print("Birinci Sayiyi Giriniz");
         a = utp.nextInt();

        System.out.print("Ikinci Sayiyi Giriniz");
        b = utp.nextInt();

        System.out.print("Ucuncu Sayiyi Giriniz");
        c = utp.nextInt();

        if ((a < b) && (a < c)){
            if ((b < c))
            {System.out.print("Siralama="+a+"<"+b+"<"+c);}
            else
            {System.out.print("Siralama="+a+"<"+c+"<"+b);}
        }
        else if ((b < a) && (b < c)) {
            if (a < c)
            {System.out.print("Siralama="+b+"<"+a+"<"+c);}
            else
            {System.out.print("Siralama="+b+"<"+c+"<"+a);}
        }
        else{   if (a < b)
        {System.out.print("Siralama="+c+"<"+a+"<"+b);}
        else
        {System.out.print("Siralama="+c+"<"+b+"<"+a);}

        }
    }
}
