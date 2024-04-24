package P1;
/*)firstArray = [7,8,9,99]
        secondArray = [33,54,87,88]
        Get The Highest Numbers From Each array And Store In Single Array
        resultArray = [9,99,87,88]*/
public class Array2 {
    public  static void main(String[] args){
        int [] firstArray={7,8,9,99};
        int [] secondtArray={33,54,87,88};
        int maxfirstArray=getMax(firstArray);
        int maxsecondArray=getMax(secondtArray);

        int[] result={maxfirstArray,maxsecondArray};
        System.out.println(maxfirstArray);
        for(int num:result){
            System.out.println(num);
        }

    }
    public static int getMax(int[] array) {
        int max=array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>max){
                max=array[i];
               // max=array[i+1];
            }
        }
        return max;
    }

}
