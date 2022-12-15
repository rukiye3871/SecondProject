public class Task1 {
    String str = "amazon";

        System.out.println(reverseString(str));

}
//I attended
    public static String reverseString(String str) {

        String newString="";
        char c;

        for (int i = 0; i < str.length(); i++) {

            c = str.charAt(i);

            if (i!=str.length()-1)
                newString = "-" + c + newString;
            else
                newString= c + newString;

        }return newString;

    }
}
