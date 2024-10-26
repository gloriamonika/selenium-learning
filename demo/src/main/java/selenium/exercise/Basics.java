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

        //

        //String is an object -> only the first initialised string (s) will be created bc Java considers s and s1 to be one and the same
        //this is called string literal
        String s = "Hello and welcome!";
        String s1 = "Hello and welcome!";

        //the story, however, is different if...
        String stringObject = new String("Hello and welcome!");
        String stringObject1 = new String("Hello and welcome!");
        //these lines create two different objects (different memory allocations) and thus are treated as two separate objects.

        String splitString[] = s.split(" "); //split strings with whatever delimiter (in this case a space)
        s1.trim(); //remove all the white spaces


        //print char by char
        for(int i = 0; i < stringObject.length(); i++){
            System.out.println(stringObject.charAt(i));
        }

    }
}
