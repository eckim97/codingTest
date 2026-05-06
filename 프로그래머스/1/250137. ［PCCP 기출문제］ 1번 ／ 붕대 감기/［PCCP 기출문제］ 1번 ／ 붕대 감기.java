class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0], x = bandage[1], y = bandage[2];
        int maxHp = health;
        int curHp = health;
        int time = 1;

        for (int[] attack : attacks) {
            int attackTime = attack[0];
            int damage = attack[1];

            int healTime = attackTime - time;
            int fullCount = healTime / t;

            curHp += x * healTime + y * fullCount;
            curHp = Math.min(curHp, maxHp);

            curHp -= damage;
            if (curHp <= 0) return -1;

            time = attackTime + 1;
        }

        return curHp;
    }
}