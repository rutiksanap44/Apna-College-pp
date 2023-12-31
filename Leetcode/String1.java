public class String1 {
    public static String mergeAlternately(String word1, String word2){
        String str = "";
        for(int i=0;i<word1.length() || i<word2.length();i++){
            if(i<word1.length()){
                str+=word1.charAt(i);
            }
            if(i<word2.length()){
                str+=word2.charAt(i);
            }
        }
        return str;
    }
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        System.out.println(mergeAlternately(word1, word2));
        
    }
}
