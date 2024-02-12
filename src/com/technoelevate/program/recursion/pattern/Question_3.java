package com.technoelevate.program.recursion.pattern;

public class Question_3 {
    public static void main(String[] args) {
        String s = "101010101";
        System.out.println(minTax(s.length(),1,2,s));
    }

    public static int minTax(int N, int X, int Y,String s){
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < N-1; i++) {
            if(s.charAt(i)=='0' && s.charAt(i+1)=='1'){
                count1++;
            }else if(s.charAt(i)=='1'&&s.charAt(i+1)=='0'){
                count2++;
            }
        }
        int tax1 = count1 * X;
        int tax2 = count2 * Y;
        return  Math.min(tax1,tax2);
    }
}
