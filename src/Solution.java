import java.util.HashMap;
import java.util.Map;

public class Solution {
    class Trie {
        private TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public void insert(String word) {
            TrieNode current = root;
            for (char c : word.toCharArray()) {
                current.children.putIfAbsent(c, new TrieNode());
                current = current.children.get(c);
            }
            current.word = word;
        }

        public boolean search(String word) {
            TrieNode node = searchHelper(word);
            return node != null && node.word != null;
        }

        public boolean startsWith(String prefix) {
            TrieNode node = searchHelper(prefix);
            return node != null;
        }

        private TrieNode searchHelper(String word) {
            TrieNode current = root;
            for (char c : word.toCharArray()) {
                if (!current.children.containsKey(c)) {
                    return null;
                }
                current = current.children.get(c);
            }
            return current;
        }

        private class TrieNode {
            Map<Character, TrieNode> children;
            String word;

            public TrieNode() {
                children = new HashMap<>();
                word = null;
            }
        }
    }


    public static void main(String[] args){
        Solution.Trie trie = new Solution().new Trie();
        trie.insert("word");
        trie.insert("hello");
        trie.insert("world");
        System.out.println(trie.search("hello"));    // true
        System.out.println(trie.search("world"));    // true
        System.out.println(trie.search("hi"));       // false
        System.out.println(trie.startsWith("he"));   // true
        System.out.println(trie.startsWith("wor"));  // true
        System.out.println(trie.startsWith("hi"));
    }
}
