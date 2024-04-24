package P1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
Input: [5, 2, 1, 3, 2, 4, 5]
        Output: Sorted array without duplicates: [1, 2, 3, 4, 5]; Median: 3

public class Array {
    public static void main(String[] args){
        int[] inputArray={5,2,1,3,2,4,5};
        Set<Integer> set=new HashSet<>();
        for (int num: inputArray){
            set.add(num);
        }
        List<Integer> sortedList=new ArrayList<>(set);
        sortedList.sort(null);
        System.out.println(sortedList);

        int medianIndex=sortedList.size()/2;
        double median;
        if(sortedList.size()%2==0){
            median=(sortedList.get(medianIndex-1)+sortedList.get(medianIndex))/2.0;
        }
        else {
            median=sortedList.get(medianIndex);
        }

        System.out.println(median);
    }
}
