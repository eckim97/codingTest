//package com.example.codingtest;
//
//import java.io.IOException;
//import java.util.*;
//
///**
// * 매드업 1번
// */
////public class Test {
////    public static void main(String[] args) throws IOException {
//////        String[] boxes = {"4514--234495-1", "305-44-291501", "1-2-34-495-8623","492134545151","623-421523-67-341","-5439-59639921","6235-7X3+47-7456","98-76-543-210","512-73-634901","000-999999-22-555","064-82-792561"};
////        String[] boxes = {"1-2-3-456789012","582845-385823","48572-39485-89012","4-5-2-593328484","4958-39-2945123-","49582039415423","7-3-7-000000000","485723-693812","39482746582734","1-1-1-111111111","A4944-5095-4951","4851293412223"};
//////        String[] boxes = {"592356=5345","49-694-4495-64","5923565345%"};
////
////        Solution S = new Solution();
////
////        System.out.println(Arrays.toString(S.solution(boxes)));
////    }
////}
////
////class Solution {
////    public int solution(int n, int[][] water) {
////        int answer = 0;
////        return answer;
////    }
////}
//
///**
// * 매드업 3번
// */
////public class Test {
////    public static void main(String[] args) throws IOException {
////        int n = 4;
//////        int[][] water = {{3, 2}};
//////        int[][] water = {{2, 3}, {3, 2}, {4, 3}};
////        int[][] water = {{1, 2}, {2, 3}, {3, 1}, {3, 4}};
//////        int[][] water = {{1, 3}, {2, 1}, {3, 3}};
////        Solution S = new Solution();
////
////        System.out.println(S.solution(n, water));
////    }
////}
////
////class Solution {
////    private int n;
////    private boolean[][] water_map;
////    private boolean[][] visited;
////    private int minExplorers;
////    private int totalCells;
////
////    // 상하좌우 이동
////    private static final int[] dx = {-1, 1, 0, 0};
////    private static final int[] dy = {0, 0, -1, 1};
////
////    public int solution(int n, int[][] water) {
////        this.n = n;
////        this.water_map = new boolean[n][n];
////        this.minExplorers = n * n;
////
////        // 물웅덩이 위치 표시
////        for (int[] w : water) {
////            water_map[w[0]-1][w[1]-1] = true;
////        }
////
////        // 탐험해야 할 총 칸 수 계산
////        totalCells = n * n - water.length;
////
////        // 각 시작점에서 탐색 시도
////        for (int i = 0; i < n; i++) {
////            for (int j = 0; j < n; j++) {
////                if (!water_map[i][j]) {
////                    visited = new boolean[n][n];
////                    dfs(i, j, 1, new HashSet<>());
////                }
////            }
////        }
////
////        return minExplorers;
////    }
////
////    private void dfs(int x, int y, int explorers, Set<String> covered) {
////        if (explorers >= minExplorers) return;  // 가지치기
////
////        visited[x][y] = true;
////        covered.add(x + "," + y);
////
////        // 모든 칸을 커버했는지 확인
////        if (covered.size() == totalCells) {
////            minExplorers = Math.min(minExplorers, explorers);
////            visited[x][y] = false;
////            return;
////        }
////
////        // 현재 위치에서 더 이상 갈 수 없는 경우, 새로운 시작점 찾기
////        boolean stuck = true;
////        for (int i = 0; i < 4; i++) {
////            int nx = x + dx[i];
////            int ny = y + dy[i];
////
////            if (isValid(nx, ny) && !water_map[nx][ny] && !visited[nx][ny]) {
////                stuck = false;
////                dfs(nx, ny, explorers, covered);
////            }
////        }
////
////        if (stuck) {
////            // 새로운 시작점 찾기
////            for (int i = 0; i < n; i++) {
////                for (int j = 0; j < n; j++) {
////                    if (!water_map[i][j] && !visited[i][j]) {
////                        dfs(i, j, explorers + 1, covered);
////                    }
////                }
////            }
////        }
////
////        visited[x][y] = false;
////        covered.remove(x + "," + y);
////    }
////
////    private boolean isValid(int x, int y) {
////        return x >= 0 && x < n && y >= 0 && y < n;
////    }
////}
//
///**
// * 매드업 2번
// */
//public class Test {
//    public static void main(String[] args) throws IOException {
//        int n = 4;
//        int[][] board = {{0,0,1,0,0,0}, {0,2,0,0,0,1}, {0,0,2,1,0,0}, {0,0,0,0,0,0}
//                        , {0,0,0,0,1,0}, {0,1,0,0,0,0}};
//        int k = 2;
//        int ax = 1;
//        int ay = 2;
////        int[][] board = {{0,0,0,1}, {0,2,0,1}, {2,0,0,1}, {0,2,0,1}};
////        int k = 2;
////        int ax = 2;
////        int ay = 1;
//
//        Solution S = new Solution();
//
//        System.out.println(S.solution(board, k, ax, ay));
//    }
//}
//
//class Solution {
//    // 상하좌우 이동을 위한 방향 배열
//    int[] dx = {-1, 1, 0, 0};
//    int[] dy = {0, 0, -1, 1};
//
//    public int solution(int[][] board, int k, int ax, int ay) {
//        int n = board.length;
//        boolean[][] explosion = new boolean[n][n];
//
//        // 폭발 범위 계산
//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j < n; j++) {
//                if(board[i][j] == 1) {
//                    calculateExplosion(board, explosion, i, j, k, n);
//                }
//            }
//        }
//
//        // BFS를 위한 큐
//        Queue<int[]> queue = new LinkedList<>();
//        boolean[][] visited = new boolean[n][n];
//
//        // 시작 위치 추가
//        queue.offer(new int[]{ax, ay, 0}); // x, y, time
//        visited[ax][ay] = true;
//
//        while(!queue.isEmpty()) {
//            int[] current = queue.poll();
//            int x = current[0];
//            int y = current[1];
//            int time = current[2];
//
//            // 현재 위치가 안전한 곳이라면
//            if(!explosion[x][y]) {
//                return time;
//            }
//
//            // 상하좌우 이동
//            for(int i = 0; i < 4; i++) {
//                int nx = x + dx[i];
//                int ny = y + dy[i];
//
//                // 보드 범위 내이고, 방문하지 않았고, 장애물이나 폭탄이 없는 경우
//                if(nx >= 0 && nx < n && ny >= 0 && ny < n
//                        && !visited[nx][ny] && board[nx][ny] != 2 && board[nx][ny] != 1) {
//                    queue.offer(new int[]{nx, ny, time + 1});
//                    visited[nx][ny] = true;
//                }
//            }
//        }
//
//        return -1; // 안전한 곳으로 이동할 수 없는 경우
//    }
//
//    // 폭발 범위 계산 함수
//    private void calculateExplosion(int[][] board, boolean[][] explosion, int x, int y, int k, int n) {
//        explosion[x][y] = true;
//
//        // 상하좌우 방향으로 k칸까지 폭발 범위 계산
//        for(int i = 0; i < 4; i++) {
//            for(int dist = 1; dist <= k; dist++) {
//                int nx = x + dx[i] * dist;
//                int ny = y + dy[i] * dist;
//
//                // 보드 범위를 벗어나거나 장애물을 만나면 중단
//                if(nx < 0 || nx >= n || ny < 0 || ny >= n || board[nx][ny] == 2) {
//                    break;
//                }
//                explosion[nx][ny] = true;
//            }
//        }
//    }
//}