public class Solution {
    class Trie{
        public Trie() {

        }

        public void insert(String word) {

        }

        public boolean search(String word) {
            return false;
        }

        public boolean startsWith(String prefix) {

            return false;
        }
    }

    public static void main(String[] args){
        Solution.Trie obj = new Solution().new Trie();
        obj.insert("word");
        boolean param_2 = obj.search("word");
        boolean param_3 = obj.startsWith("prefix");
    }
}
