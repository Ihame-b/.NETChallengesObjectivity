import java.util.ArrayList;
import java.util.List;

public class ArrayChallenge {

    public int[][] GetArrayToUse(int[] realArray, int[] ModifiedArray) {

        List<Integer> addValue = new ArrayList<>();
        List<Integer> RemovedValue = new ArrayList<>();

        for (int values: ModifiedArray ){
            if ( !contains(realArray, values)){
                addValue.add(values);
            }
        }

        for (int values: realArray){
            if (!contains(ModifiedArray, values)){
                RemovedValue.add(values);
            }
        }

        int[] FleshElement = addValue.stream().mapToInt(i -> i).toArray();
        int[] FleshRemovedElement = RemovedValue.stream().mapToInt(i -> i).toArray();

        return new int[][] {FleshElement, FleshRemovedElement};
    }

    private boolean contains(int[] firstArray, int values) {

        for ( int i=0; i< firstArray.length; i++){
            if (firstArray[i] == values){
                return true;
            }
        }

        return false;
    }
}
