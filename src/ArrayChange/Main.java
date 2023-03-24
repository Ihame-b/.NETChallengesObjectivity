package ArrayChange;

import ArrayChange.ArrayChallenge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayChallenge arraychallenge= new ArrayChallenge();

        int[] ArrayToUse = {3,5,7,1};
        int[] ArrayToModify = {3,9,2,8};

        int[][] changes = arraychallenge.GetArrayToUse(ArrayToUse,ArrayToModify);
        int[] newElement= changes[0];
        int[] remElement = changes[1];

        System.out.println("Flesh Added Value are: " + Arrays.toString(newElement));
        System.out.println("Flesh Removed Value are: " + Arrays.toString(remElement));
    }
}