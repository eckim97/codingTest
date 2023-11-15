package com.example.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
        static int[] N = new int[9];
        static int sum = 0;
        static int temp1 = 0, temp2 = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < N.length; i++) {
            N[i] = Integer.parseInt(br.readLine());
            sum += N[i];
        }
        Arrays.sort(N);

        for (int i = 0; i < N.length; i++) {
            for (int j = i + 1; j < N.length; j++) {
                if (sum - N[i] - N[j] == 100) {
                    temp1 = N[i];
                    temp2 = N[j];
                }
            }
        }
        for (int i = 0; i < N.length; i++) {
            if(N[i] == temp1 || N[i] == temp2) continue;
            System.out.println(N[i]);
        }
    }
}