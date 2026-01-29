package org.example.practice;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstring {
    public static void Longeststring(String s){

        int start=0;
        int end=0;
        int maxlength=0;

        List<Character> list=new ArrayList<Character>();
        while(end < s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                maxlength=Math.max(maxlength,list.size());
            }
            else {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        System.out.println(maxlength);
    }

    public static void main(String[] args) {
        Longeststring("bbbbb");
    }
}
