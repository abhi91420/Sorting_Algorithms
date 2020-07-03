import com.abhi.sortingAlgorithms.BubbleSort;
import com.abhi.sortingAlgorithms.sortingAlgorithm;

public class Main {
    public static void main(String[] args) {
        int[] arr ={7,6,4,1,3,8,2,9};
        sortingAlgorithm bs = new BubbleSort(arr);
        int[] sorted = bs.sort(true);
        for (int element : sorted){
            System.out.print(element);
        }
    }
}
