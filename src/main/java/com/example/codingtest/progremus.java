//package com.example.codingtest;
//
//import java.io.IOException;
//import java.util.*;
//
//public class progremus {
//    public static void main(String[] args) throws IOException {
//        int num_teams = 3;
////        String reference = "abc";
////        String track = "bcab";
//        String reference = "vxrvip";
//        String track = "xrviprvipvxrv";
//
//        Solution2 s = new Solution2();
//        System.out.println(s.solution(reference, track));
//    }
//}
//
//class Solution2 {
//    public int solution(String reference, String track) {
//        int[] dp = new int[track.length() + 1];
////        Arrays.fill(dp, -1);
//        dp[track.length()] = Integer.MAX_VALUE;
//
//        for (int i = track.length() - 1; i >= 0; i--) {
//            int max = 0;
//            for (int len = 1; i + len <= track.length(); len++) {
//                String jump = track.substring(i, i + len);
//                if (reference.contains(jump) && dp[i + len] > 0) {
//                    max = Math.max(max, Math.min(len, dp[i + len]));
//                }
//            }
//            if (max > 0){
//                dp[i] = max;
//            }
//        }
//        return dp[0];
//    }
//}
