package com.example.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        System.out.println(A * B);

    }
}














//package com.example.codingtest;
//
//import java.io.*;
//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) throws IOException {
//
//        Scanner sc = new Scanner(System.in);
////        sc = new Scanner(src);
//
//        int N = sc.nextInt();
//        sc.nextLine();
//
//        Queue<Integer> q = new LinkedList<>();
//        int temp = 0;
//
//        for (int i = 0; i < N; i++) {
//            String s = sc.nextLine();
//            String arr[] = s.split(" ");
//
//            if (arr[0].equals("push")){
//                q.add(Integer.parseInt(arr[1]));
//                  temp = Integer.parseInt(arr[1]);
//            }
//            else if(arr[0].equals("front")){
//                if (q.isEmpty()){
//                    System.out.println(-1);
//                }
//                else{
//                    int p = q.peek();
//                    System.out.println(p);
//                }
//            }
//            else if(arr[0].equals("back")){
//                if (q.isEmpty()){
//                    System.out.println(-1);
//                }
//                else{
//
//                }
//            }
//        }
//        System.out.println(q);
//    }
//
//    private static String src = "15\n" +
//            "push 1\n" +
//            "push 2\n" +
//            "front\n" +
//            "back\n" +
//            "size\n" +
//            "empty\n" +
//            "pop\n" +
//            "pop\n" +
//            "pop\n" +
//            "size\n" +
//            "empty\n" +
//            "pop\n" +
//            "push 3\n" +
//            "empty\n" +
//            "front";
//}
