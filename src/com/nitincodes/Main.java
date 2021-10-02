package com.nitincodes;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        name=name.toLowerCase();
        int count =0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='a'
                    ||name.charAt(i)=='e'||name.charAt(i)=='i'
                    ||name.charAt(i)=='o'||name.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("the number of vowels in the given string is: "+count);
    }
}
