package exercitiul2;

public class TipuriDeString {

    public static void main(String[] args) {
        //String
        //An int value: 0 if the string is equal to the other string.
        //< 0 if the string is lexicographically less than the other string
        //> 0 if the string is lexicographically greater than the other string (more characters)
        System.out.println("hello".compareTo("hello"));
        System.out.println("hello".compareTo("world"));
        char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
        String myStr2 = "";
        myStr2 = myStr2.copyValueOf(myStr1, 0, 5);
        System.out.println("Returned String: " + myStr2);

        //StringBuffer
        StringBuffer str1 = new StringBuffer(10);
        System.out.println(str1.capacity());
        str1.append("Hello World");
        System.out.println(str1);
        str1.insert(str1.length(), "!");
        System.out.println(str1);

        //StringBuilder
        StringBuilder str2 = new StringBuilder(5);
        str2.append("world");
        System.out.println(str2);
        str2.deleteCharAt(3);
        System.out.println(str2);
        str2.reverse();
        System.out.println(str2);

    }
}
