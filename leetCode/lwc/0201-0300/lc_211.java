package leetcode;

import java.util.HashMap;

/**
 * @author lwc
 * @date 2019/11/20 15:32
 */
public class lc_211 {
    class WordDictionary {
        WordDictionary[] dic;
        boolean isWord;

        /** Initialize your data structure here. */
        public WordDictionary() {
            dic = new WordDictionary[26];
            isWord = false;
        }

        /** Adds a word into the data structure. */
        public void addWord(String word) {
            WordDictionary cur = this;
            for(char ch : word.toCharArray()){
                if(cur.dic[ch - 'a'] == null) {
                    cur.dic[ch - 'a'] = new WordDictionary();
                }
                cur = cur.dic[ch - 'a'];
            }
            cur.isWord = true;
        }


        /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
        public boolean search(String word) {
            char[] chars = word.toCharArray();
            return subSearch(0, chars, this);
        }

        public boolean subSearch(int pos, char[] word, WordDictionary cur){
            while(pos < word.length && word[pos] != '.'){
                if(cur.dic[word[pos] - 'a'] == null)
                    return false;
                cur = cur.dic[word[pos] - 'a'];
                pos ++;
            }
            if(pos == word.length) return cur.isWord;

            for(int i = 0; i < 26; i++){
                if(cur.dic[i] != null && subSearch(pos + 1, word, cur.dic[i])){
                    return true;
                }
            }
            return false;
        }
    }
}
