import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurences {
    public static boolean uniqueOccurrences(int[] arr) {
        // [1,2,2,2,1,1,3]
        HashMap<Integer, Integer> mymap = new HashMap<>();
        for (int i : arr) {
            if(mymap.containsKey(i)==false){
                mymap.put(i, 1);
            }
            else{
                int count = mymap.get(i);
                mymap.put(i, ++count);
            }
        }
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for(int j:mymap.values()){
            if(uniqueNumbers.contains(j)==true){
                return false;
            }
            else{
                uniqueNumbers.add(j);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniqueOccurrences(arr));
    }
}
