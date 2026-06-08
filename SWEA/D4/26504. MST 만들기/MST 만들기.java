import java.io.*;
import java.util.*;

public class Solution {
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0;
        private int len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        long nextLong() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ' && c != -1);

            long value = 0;
            while (c > ' ') {
                value = value * 10 + (c - '0');
                c = read();
            }

            return value;
        }

        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder sb = new StringBuilder();

        int TC = fs.nextInt();

        for (int tc = 0; tc < TC; tc++) {
            int N = fs.nextInt();
            int M = N * (N - 1) / 2;

            long[] arr = new long[M];

            for (int i = 0; i < M; i++) {
                arr[i] = fs.nextLong();
            }

            Arrays.sort(arr);

            long minCost = 0;
            long maxCost = 0;

            for (int i = 0; i < N - 1; i++) {
                minCost += arr[i];
            }

            for (int r = 1; r <= N - 1; r++) {
                int index = r * (r - 1) / 2;
                maxCost += arr[index];
            }

            sb.append(minCost).append(' ').append(maxCost).append('\n');
        }

        System.out.print(sb);
    }
}