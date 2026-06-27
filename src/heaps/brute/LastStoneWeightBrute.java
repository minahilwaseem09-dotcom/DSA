// Time Complexity: O(n^2 log n) — sort on every iteration
// Space Complexity: O(n)
// Approach: Sort array each iteration, smash two heaviest stones

    public static int lastStoneWeight(int[] stones) {
        // ArrayList use karo taake remove kar sakein
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        for (int s : stones) list.add(s);

        while (list.size() > 1) {
            // sort karo
            list.sort(null);

            // 2 sabse bhari uthao
            int y = list.remove(list.size() - 1); // sabse bhari
            int x = list.remove(list.size() - 1); // doosri bhari

            if (x != y) {
                list.add(y - x); // difference wapas daalo
            }
            // agar equal toh dono khatam — kuch nahi add karo
        }

        return list.isEmpty() ? 0 : list.get(0);
    }

    void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{2,7,4,1,8,1})); // 1
        System.out.println(lastStoneWeight(new int[]{1}));            // 1
    }
