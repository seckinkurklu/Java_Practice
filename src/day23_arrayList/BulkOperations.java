package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {




        Integer[] nums = {1, 2, 3, 4 ,5 ,6, 7,8};


        ArrayList<Integer> l1 = new ArrayList<>();

        l1.addAll(Arrays.asList(nums));

        System.out.println(l1);




    }



}
