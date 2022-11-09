package week6;

import java.util.Arrays;

public class FindMaximum {
    /*
    Write a method that can find the maximum number from an int Array
     */

        public static void main(String[] args) {
        int [] arr = {80,90,8,5,184,25,36,64,75};

            int max = 0;

            for(int each : arr){
                if(each > max){
                    max = each;
                }
            }

            System.out.println(max);
        }
    }

