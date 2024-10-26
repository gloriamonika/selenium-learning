package selenium.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basics {
    public static void main(String[] args) {
        //declare new array with fixed value to be stored
        int[] arrayNum = new int[5]; 
        arrayNum[0] = 1;
        arrayNum[1] = 2;
        arrayNum[2] = 3;
        arrayNum[3] = 4;
        arrayNum[4] = 5;

        //or int[] arrayNum = {1, 2, 3, 4, 5}
        
        String[] name = {"abc", "cde", "efg"};
        //change array into arraylist
        List<String> nameList = Arrays.asList(name);
        for(int i = 0; i < nameList.size();i++){
            System.out.println(nameList.get(i));
        }
        
        //iterate through the array
        //usual for loop
        // for(int i = 0; i < arrayNum.length; i++){
        //     System.out.println(arrayNum[i]);
        // }

        //'enhanced' for loop
        for(int num: arrayNum){
            //this means for each value inside the arrayNum, do loop
            System.out.println(num);

        }

        //arraylist -> dynamic array, doesn't need to be fixed
        ArrayList<Integer> arr = new ArrayList<>(); //explicitly states the type of values stored in the arraylist (integer)
        arr.add(1); //push the value inside the arraylist
        arr.remove(0); //remove the value stored in the index inside the arraylist
        arr.get(0); //get the value

        //iterate through ArrayList with .size()
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i)); 
        }

        //check if the arraylist contains an item -> returns boolean
        boolean containsTen = arr.contains(10);
        System.out.println(containsTen);
    }
}
