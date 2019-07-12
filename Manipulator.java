public class Manipulator {
    public void trimAndConcat(String str, String strTwo) {
        str.trim();
        strTwo.trim();
        String three = str + strTwo;
        System.out.println(three);
    }

    public void getIndexOrNull(String str, char a) {
        if(str.indexOf(a) == -1) {
            System.out.println("null");
        } else {
            System.out.println(str.indexOf(a));
        }
    }

    public void getIndexOrNull(String str, String sub) {
        if (str.indexOf(sub) == -1) {
            System.out.println("null");
        } else {
            System.out.println(str.indexOf(sub));
        }
    }

    public void concatSubstring(String str, int a, int b, String sub) {
        String total = sub + str.substring(a, b);
        System.out.println(total);
    }
}