// Time Complexity: O(n) search, O(1) insert
// Space Complexity: O(n*L) — n words, L average length
// Approach: Store all words in ArrayList, search with startsWith

import java.util.ArrayList;

public class ImplementTrieBrute {

    static class Trie {
        ArrayList<String> words = new ArrayList<>();

        public void insert(String word) {
            words.add(word);
        }

        public boolean search(String word) {
            return words.contains(word);
        }

        public boolean startsWith(String prefix) {
            for (String w : words) {
                if (w.startsWith(prefix)) return true;
            }
            return false;
        }
    }

    static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));    // true
        System.out.println(trie.search("app"));      // false
        System.out.println(trie.startsWith("app"));  // true
    }
}