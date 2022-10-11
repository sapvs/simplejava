package io.s3vt;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int N) {
        List<Integer> fiveIndexes = new ArrayList<>();
        int maxVal = Integer.MIN_VALUE;
        String stringNumber = Integer.toString(N);

        for (int i = 0; i < stringNumber.length(); i++) {
            if (stringNumber.charAt(i) == '5') {
                fiveIndexes.add(i);
            }
        }

        if (fiveIndexes.isEmpty()) throw new IllegalArgumentException("Should contain atleast one 5");


        for (Integer pos : fiveIndexes) {
            StringBuffer temp = new StringBuffer();
            for (int i = 0; i < stringNumber.length(); i++) {
                if (i == pos) {
                    continue;
                }
                temp.append(stringNumber.charAt(i));
            }
            //convert temp number to integer
            System.out.println(temp);
            int tempInt = Integer.parseInt(temp.toString());
            if (tempInt > maxVal) {
                maxVal = tempInt;
            }
        }
        return maxVal;

    }

    public static void main(String[] args) {


                ;

    }
}


