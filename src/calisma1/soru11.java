package calisma1;

import java.util.Scanner;

public class soru11 {
    public static void main(String[] args) {
        /*  TASK :
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden method create ediniz.
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("kelime gir");
        String kelime=scan.nextLine();

        boolean sonuc=xyz(kelime);
        System.out.println(sonuc);

    }

    private static boolean xyz(String kelime) {
        boolean sonuc=false;
        if (kelime.contains("xyz")){
            sonuc=true;
        }
        return sonuc;

    }
}
