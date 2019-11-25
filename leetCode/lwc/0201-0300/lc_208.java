package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @author lwc
 * @date 2019/11/19 16:09
 */
public class lc_208 {
    class Trie {
        class TrieNode {
            TrieNode[] nodes;
            TrieNode() {
                nodes = new TrieNode[26];
            }
        }

        TrieNode root;
        HashSet<String> words;
        /** Initialize your data structure here. */
        public Trie() {
            root = new TrieNode();
            words = new HashSet<>();
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            if(!words.contains(word)) {
                words.add(word);
                char[] arr = word.toCharArray();
                TrieNode curr = root;
                for (char ch : arr) {
                    TrieNode node = curr.nodes[ch - 'a'];
                    if (node == null) {
                        curr.nodes[ch - 'a'] = new TrieNode();
                    }
                    curr = curr.nodes[ch - 'a'];
                }
            }
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            return words.contains(word);
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            char[] arr = prefix.toCharArray();
            TrieNode curr = root;
            for (char ch: arr) {
                TrieNode node = curr.nodes[ch - 'a'];
                if (node == null) {
                    return false;
                }
                curr = node;
            }
            return true;
        }
    }
}
