public class sort_alphanumeric {

    public static char[] sort(String str) {
        char[] flag = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            flag[i] = str.charAt(i);
        }
        for (int i = 0; i < flag.length - 1; i++) {
            for (int j = 1; j < flag.length - i; j++) {
                if ((int) flag[i] > (int) flag[j]) {
                    char temp = flag[i];
                    flag[i] = flag[j];
                    flag[j] = temp;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        String str = "1ghy765DfgHTYry5";
        char[] ch = sort(str);
        for(char i:ch){
            System.out.print((int) i+" ");
        }
    }
}