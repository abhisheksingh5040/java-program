package com.technoelevate.program.imp;

public class Question3 {
    public static void main(String[] args) {
      int n = 222;
        String s = convertIntoBinary(n);
        System.out.println(s);
        System.out.println(count(s));

    }

    public static int count(String data){
        int count = 0;
        int maxCount = 0;
        char[] chars = data.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='1'){
                count++;
            }else{
                count = 0;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }

    public static String convertIntoBinary(int n){
        StringBuilder builder = new StringBuilder();
        while(n!=0){
            if(n%2==0){
                n = n / 2;
                builder.append("0");
            }else{
                n = n / 2;
                builder.append("1");
            }
        }
        return builder.toString();

    }

}
