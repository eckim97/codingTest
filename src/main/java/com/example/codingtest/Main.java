package com.example.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());

        for (int i = 1; i <= A; i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);

            if (st.countTokens() < 2) {
                System.out.println("X");
                return;
            }

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a + b));
        }
    }
}


