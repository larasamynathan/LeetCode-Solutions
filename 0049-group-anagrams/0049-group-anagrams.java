class Solution {
    public List<List<String>> groupAnagrams(String[] st) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:st)
        {
            char[] a=s.toCharArray();
            Arrays.sort(a);
            String key=new String(a);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);


        }
       
        return new ArrayList<>(map.values());
    }
}