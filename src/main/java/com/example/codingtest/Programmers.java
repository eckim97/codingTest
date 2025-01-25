package com.example.codingtest;
import java.util.*;

public class Programmers {
    public boolean isPrime(int num) {
        if (num ==1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println();
    }
}