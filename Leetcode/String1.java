public class String1 {
    public static String mergeAlternately(String word1, String word2){
        String str = "";
        int bigCount = Math.max(word1.length(), word2.length());
        int i=0;
        int j=0;
        // ab
        // pqrs
        while(i<bigCount || j<bigCount){
            if(i<word1.length()){
                str+=word1.charAt(j);
            }
            if(j<word2.length()){
                str+=word2.charAt(j);
            }
            i++;    
            j++;
        }
        return str;
    }
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        System.out.println(mergeAlternately(word1, word2));
        
    }
}
