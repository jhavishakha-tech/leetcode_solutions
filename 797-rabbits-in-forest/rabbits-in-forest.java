class Solution {
    public int numRabbits(int[] answers) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int a : answers)
            map.put(a,map.getOrDefault(a,0)+1);

        int ans = 0;

        for(int key : map.keySet()){

            int group = key + 1;
            int freq = map.get(key);

            ans += Math.ceil((double)freq/group)*group;
        }

        return ans;
    }
}