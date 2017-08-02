package models;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Guest on 8/1/17.
 */
public class Anagrams {
    public String answer;
    public String anagramCheck(String first, String second ){
        String[] splitFirst = first.split("");
        Arrays.sort(splitFirst);
        String[] splitSecond = second.split("");
        Arrays.sort(splitSecond);
        System.out.println(splitFirst[0]);
        if (splitFirst.length ==splitSecond.length) {
                if (Arrays.equals(splitFirst, splitSecond)) {
                    answer = "true";
                } else {
                    answer = "false";
                }

        }else{
            answer = "false";
        }
        return answer;
    }

}
