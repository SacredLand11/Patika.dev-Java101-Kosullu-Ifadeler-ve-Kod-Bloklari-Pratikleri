import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class QuickSort{
    void Sorting(int arr[]){
        int index = 0;
        int lowNo, highNo;
        for(int j = 0; j<arr.length;j++){
            for(int i=index; i<arr.length;i++){
                if(arr[i]<arr[index]) {
                    lowNo=arr[i];
                    highNo=arr[index];
                    arr[index]=lowNo;
                    arr[i]=highNo;
                }
            }
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }
}

public class patika_dev_Java_Backend_Projeleri_QuickSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Write the array length: ");
        int arrayLength = s.nextInt();
        List<Integer> integerList = new ArrayList<Integer>();
        for(int i = 0; i<arrayLength; i++){
            integerList.add(s.nextInt());
        }
        int[] integerArray = integerList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        QuickSort obj = new QuickSort();
        obj.Sorting(integerArray);
    }
}
