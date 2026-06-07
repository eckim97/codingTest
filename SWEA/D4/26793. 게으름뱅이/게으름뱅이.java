import java.io.*;
import java.util.*;

public class Solution {
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ');

            int val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }

            return val;
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder sb = new StringBuilder();

        int TC = fs.nextInt();

        for (int tc = 0; tc < TC; tc++) {
            int N = fs.nextInt();

            long[] arr = new long[N];

            for (int i = 0; i < N; i++) {
                int time = fs.nextInt();
                int deadline = fs.nextInt();

                arr[i] = ((long) deadline << 32) | (time & 0xffffffffL);
            }

            Arrays.sort(arr);

            long start = Long.MAX_VALUE;

            for (int i = N - 1; i >= 0; i--) {
                long deadline = arr[i] >>> 32;
                long time = arr[i] & 0xffffffffL;

                start = Math.min(start, deadline);
                start -= time;
            }

            sb.append(start).append('\n');
        }

        System.out.print(sb);
    }
}