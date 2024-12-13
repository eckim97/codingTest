import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        int M = moves.length-1;

        for (int i = 0; i < M; i++) {
            int col = moves[i]-1;
            for(int j = 0; j < board.length; j++) {
                if (board[j][col] != 0) {
                    int doll = board[j][col];
                    board[j][col] = 0;

                    if (!stack.isEmpty() && stack.peek() == doll) {
                        stack.pop();
                        answer += 2;
                    } else{
                        stack.push(doll);
                    }
                    break;
                }
            }
        }
        return answer;
    }
}