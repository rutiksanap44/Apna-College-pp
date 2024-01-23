import java.util.ArrayList;
import java.util.List;

public class UnionArray {
    public static void ArrayUnion(int[] arr1,int[] arr2){
        int i=0;
        int j=0;
        List<Integer> list = new ArrayList<>();;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                if(list.size()!=0 && list.get(list.size()-1)!=arr1[i]){
                    list.add(arr1[i]);
                }
                else if(list.size()==0){
                    list.add(arr1[i]);
                }
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                if(list.size()!=0 && list.get(list.size()-1)!=arr1[i]){
                    list.add(arr1[i]);
                }
                else if(list.size()==0){
                    list.add(arr1[i]);
                }
                i++;
            }
            else if(arr1[j]<arr2[j]){
                if(list.size()!=0 && list.get(list.size()-1)!=arr2[j]){
                    list.add(arr2[j]);
                }
                else if(list.size()==0){
                    list.add(arr2[j]);
                }
            }
        }
        while(i<arr1.length){
            if(list.size()!=0)
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 1, 2, 2, 3, 4 };
        ArrayUnion(arr1, arr2);
    }
}
