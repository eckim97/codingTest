class Solution {
    public String solution(String str, String target) {
        int idx = str.lastIndexOf(target);

        if (idx == -1) {
            return "";
        }

        return str.substring(0, idx + target.length());
    }
}
