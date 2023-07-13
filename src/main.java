import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        String islem;
        int sayi_sayisi,sayi1,sayi2,sayi3,sayi4;


        out.println("Hangi islemi yapmak istersiniz?");
        islem=input.next();

        if (islem != "+" + "/"+ "-" +"*")
        {
        out.println("Lutfen matematiksel bir ifade ile hangi islemi yapmak istediginizi belirtiniz ornek: /,-,*,+");
         }
            out.println("Kac sayi kullanmak istersiniz?");
            sayi_sayisi = input.nextInt();


        if(islem.equals("+"))
        {
            if (sayi_sayisi == 2)
            {
                out.println("ilk sayi:");
                sayi1 = input.nextInt();
                out.println("ikinci sayi:");
                sayi2 = input.nextInt();
                out.println("sonuc:"+ (sayi1+sayi2));
            }
            else if (sayi_sayisi >2 && sayi_sayisi<=3)
            {
                out.println("ilk sayi:");
                sayi1 = input.nextInt();
                out.println("ikinci sayi:");
                sayi2 = input.nextInt();
                out.println("ucuncu sayi:");
                sayi3 = input.nextInt();
                out.println("sonuç:"+ (sayi1+sayi2+sayi3));
            }
            else if (sayi_sayisi >3 && sayi_sayisi<=4)
            {
                out.println("ilk sayi:");
                sayi1 = input.nextInt();
                out.println("ikinci sayi:");
                sayi2 = input.nextInt();
                out.println("ucuncu sayi:");
                sayi3 = input.nextInt();
                out.println("ucuncu sayi:");
                sayi4 = input.nextInt();
                out.println("sonuç:"+ (sayi1+sayi2+sayi3+sayi4));
            }
            else if (sayi_sayisi>4)
            {
                out.println("dörtten daha az sayi secmelisiniz");
            }
        }
        if(islem.equals("*"))
        {
            if (sayi_sayisi == 2)
            {
                out.println("ilk sayi:");
                sayi1 = input.nextInt();
                out.println("ikinci sayi:");
                sayi2 = input.nextInt();
                out.println("sonuç:"+ (sayi1*sayi2));
            }
            else if (sayi_sayisi >2 && sayi_sayisi<=3)
            {
                out.println("ilk sayi:");
                sayi1 = input.nextInt();
                out.println("ikinci sayi:");
                sayi2 = input.nextInt();
                out.println("ucuncu sayi:");
                sayi3 = input.nextInt();
                out.println("sonuç:"+ (sayi1*sayi2*sayi3));
            }
            else if (sayi_sayisi >3 && sayi_sayisi<=4)
            {
                out.println("ilk sayi:");
                sayi1 = input.nextInt();
                out.println("ikinci sayi:");
                sayi2 = input.nextInt();
                out.println("ucuncu sayi:");
                sayi3 = input.nextInt();
                out.println("ucuncu sayi:");
                sayi4 = input.nextInt();
                out.println("sonuç:"+ (sayi1*sayi2*sayi3*sayi4));
            }
            else if (sayi_sayisi>4)
            {
                out.println("2 den buyuk 4 den kucuk sayi degeri secmelisiniz");
            }
        }
        if(islem.equals("-"))
        {
            if (sayi_sayisi == 2)
            {
                out.println("ilk sayi:");
                sayi1 = input.nextInt();
                out.println("ikinci sayi:");
                sayi2 = input.nextInt();
                out.println("sonuç:"+ (sayi1-sayi2));
            }
            else if (sayi_sayisi >2 && sayi_sayisi<=3)
            {
                out.println("ilk sayi:");
                sayi1 = input.nextInt();
                out.println("ikinci sayi:");
                sayi2 = input.nextInt();
                out.println("ucuncu sayi:");
                sayi3 = input.nextInt();
                out.println("sonuç:"+ (sayi1-sayi2-sayi3));
            }
            else if (sayi_sayisi >3 && sayi_sayisi<=4)
            {
                out.println("ilk sayi:");
                sayi1 = input.nextInt();
                out.println("ikinci sayi:");
                sayi2 = input.nextInt();
                out.println("ucuncu sayi:");
                sayi3 = input.nextInt();
                out.println("ucuncu sayi:");
                sayi4 = input.nextInt();
                out.println("sonuç:"+ (sayi1-sayi2-sayi3-sayi4));
            }
            else if (sayi_sayisi>4)
            {
                out.println("2 den buyuk 4 den kucuk sayi degeri secmelisiniz");
            }
        }
        if(islem.equals("/"))
        {
            if (sayi_sayisi == 2)
            {
                out.println("ilk sayi:");
                sayi1 = input.nextInt();
                out.println("ikinci sayi:");
                sayi2 = input.nextInt();
                out.println("sonuç:"+ (sayi1/sayi2));
            }
            else if (sayi_sayisi >2 && sayi_sayisi<=3)
            {
                out.println("ilk sayi:");
                sayi1 = input.nextInt();
                out.println("ikinci sayi:");
                sayi2 = input.nextInt();
                out.println("ucuncu sayi:");
                sayi3 = input.nextInt();
                out.println("sonuç:"+ (sayi1/sayi2/sayi3));
            }
            else if (sayi_sayisi >3 && sayi_sayisi<=4)
            {
                out.println("ilk sayi:");
                sayi1 = input.nextInt();
                out.println("ikinci sayi:");
                sayi2 = input.nextInt();
                out.println("ucuncu sayi:");
                sayi3 = input.nextInt();
                out.println("ucuncu sayi:");
                sayi4 = input.nextInt();
                out.println("sonuç:"+ (sayi1/sayi2/sayi3/sayi4));
            }
            else if (sayi_sayisi>4)
            {
                out.println("2 den buyuk 4 den kucuk sayi degeri secmelisiniz");
            }
        }
        else if (islem != "+" + "/"+ "-" +"*")
        {
            out.println("Lutfen matematiksel bir ifade ile hangi islemi yapmak istediginizi belirtiniz ornek: /,-,*,+");
        }
    }
}
