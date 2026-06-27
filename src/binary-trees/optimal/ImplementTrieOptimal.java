// Time Complexity: O(L) — L = word length
// Space Complexity: O(n*L)
// Approach: TrieNode with 26 children array, isEnd flag

public class ImplementTrieOptimal {

    static class TrieNode {
        TrieNode[] children = new TrieNode[26]; // a-z
        boolean isEnd = false; // word yahan khatam hota hai?
    }

    static class Trie {
        TrieNode root = new TrieNode();

        public void insert(String word) {
            TrieNode curr = root;
            for (char c : word.toCharArray()) {
                int idx = c - 'a';
                if (curr.children[idx] == null) {
                    curr.children[idx] = new TrieNode(); // node banao
                }
                curr = curr.children[idx];
            }
            curr.isEnd = true; // word khatam
        }

        public boolean search(String word) {
            TrieNode curr = root;
            for (char c : word.toCharArray()) {
                int idx = c - 'a';
                if (curr.children[idx] == null) return false;
                curr = curr.children[idx];
            }
            return curr.isEnd; // pura word hona chahiye
        }

        public boolean startsWith(String prefix) {
            TrieNode curr = root;
            for (char c : prefix.toCharArray()) {
                int idx = c - 'a';
                if (curr.children[idx] == null) return false;
                curr = curr.children[idx];
            }
            return true; // prefix exist karta hai
        }
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));    // true
        System.out.println(trie.search("app"));      // false
        System.out.println(trie.startsWith("app"));  // true
    }
}