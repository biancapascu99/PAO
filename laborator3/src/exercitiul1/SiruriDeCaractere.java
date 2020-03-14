package exercitiul1;

public class SiruriDeCaractere {

    static final int ASCII_SIZE = 256;

    public static char maxChar(String str) {

        int[] count = new int[ASCII_SIZE];

        int len = str.length();
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;

        int max = -1;
        char result = ' ';

        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }

    public static String concatSpecial(String s1, String s2) {

        if (s1.substring(0, 3).equals(s2.substring(s2.length() - 3)))
            return s1 + s2;
        return s2 + s1;
    }

    public static void main(String[] args) {

        //1
        String str1 = "Hello World!";
        String str2 = "I'm String!";
        String str3 = "I'm Stri'n'g!";

        System.out.println("Prima pozitie a caracterului 'e' in -" + str1 + "- are indexul: " + str1.indexOf('e'));
        System.out.println("Ultima pozitie a caracterului 'l' in -" + str1 + "- este: " + str1.lastIndexOf('l'));
        System.out.println("Sirul -" + str1 + "- are " + str1.length() + " caractere.");
        System.out.println("Sirul -" + str2 + "- are " + str2.length() + " caractere.");
        String[] str3Split = str3.split("'", 4);
        for (String i : str3Split) {
            System.out.println(i);
        }

        //2
        String str = "alabala";
        System.out.println("Litera care apare cel mai des in " + str + " este: " + SiruriDeCaractere.maxChar(str));

        //3
        String str4 = "animal";
        System.out.println(str4.replace('a', '*'));

        //4
        String str5 = "           cuvant        ";
        System.out.println(str5.trim());

        //5
        System.out.println(SiruriDeCaractere.concatSpecial("ele fac","cafele"));
    }


}
