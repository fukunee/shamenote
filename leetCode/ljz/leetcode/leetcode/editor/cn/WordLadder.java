//给定两个单词（beginWord 和 endWord）和一个字典，找到从 beginWord 到 endWord 的最短转换序列的长度。转换需遵循如下规则：
//
// 
// 每次转换只能改变一个字母。 
// 转换过程中的中间单词必须是字典中的单词。 
// 
//
// 说明: 
//
// 
// 如果不存在这样的转换序列，返回 0。 
// 所有单词具有相同的长度。 
// 所有单词只由小写字母组成。 
// 字典中不存在重复的单词。 
// 你可以假设 beginWord 和 endWord 是非空的，且二者不相同。 
// 
//
// 示例 1: 
//
// 输入:
//beginWord = "hit",
//endWord = "cog",
//wordList = ["hot","dot","dog","lot","log","cog"]
//
//输出: 5
//
//解释: 一个最短转换序列是 "hit" -> "hot" -> "dot" -> "dog" -> "cog",
//     返回它的长度 5。
// 
//
// 示例 2: 
//
// 输入:
//beginWord = "hit"
//endWord = "cog"
//wordList = ["hot","dot","dog","lot","log"]
//
//输出: 0
//
//解释: endWord "cog" 不在字典中，所以无法进行转换。 
// Related Topics 广度优先搜索

package cn;

import javafx.util.Pair;

import java.util.*;

public class WordLadder {
    int find = 0, ret1 = Integer.MAX_VALUE;

    public static void main(String[] args) {

        Solution solution = new WordLadder().new Solution();
        String start = "hot";
        String end = "dog";
        List<String> list = new LinkedList<>();
        list.add("hot");
        list.add("dot");
        list.add("dog");
        list.add("lot");
        list.add("log");
        list.add("cog");
        String[] qq = new String[]{"hot", "dog", "dot"};
        List lqq = Arrays.asList(qq);
        //qa->sq 5
        String[] staffs = new String[]{"si", "go", "se", "cm", "so", "ph", "mt", "db", "mb", "sb", "kr", "ln", "tm", "le", "av", "sm", "ar", "ci", "ca", "br", "ti", "ba", "to", "ra", "fa", "yo", "ow", "sn", "ya", "cr", "po", "fe", "ho", "ma", "re", "or", "rn", "au", "ur", "rh", "sr", "tc", "lt", "lo", "as", "fr", "nb", "yb", "if", "pb", "ge", "th", "pm", "rb", "sh", "co", "ga", "li", "ha", "hz", "no", "bi", "di", "hi", "qa", "pi", "os", "uh", "wm", "an", "me", "mo", "na", "la", "st", "er", "sc", "ne", "mn", "mi", "am", "ex", "pt", "io", "be", "fm", "ta", "tb", "ni", "mr", "pa", "he", "lr", "sq", "ye"};
        List staffsList = Arrays.asList(staffs);
        //cet->ism 11
        String[] sa = new String[]{"kid", "tag", "pup", "ail", "tun", "woo", "erg", "luz", "brr", "gay", "sip", "kay", "per", "val", "mes", "ohs", "now", "boa", "cet", "pal", "bar", "die", "war", "hay", "eco", "pub", "lob", "rue", "fry", "lit", "rex", "jan", "cot", "bid", "ali", "pay", "col", "gum", "ger", "row", "won", "dan", "rum", "fad", "tut", "sag", "yip", "sui", "ark", "has", "zip", "fez", "own", "ump", "dis", "ads", "max", "jaw", "out", "btu", "ana", "gap", "cry", "led", "abe", "box", "ore", "pig", "fie", "toy", "fat", "cal", "lie", "noh", "sew", "ono", "tam", "flu", "mgm", "ply", "awe", "pry", "tit", "tie", "yet", "too", "tax", "jim", "san", "pan", "map", "ski", "ova", "wed", "non", "wac", "nut", "why", "bye", "lye", "oct", "old", "fin", "feb", "chi", "sap", "owl", "log", "tod", "dot", "bow", "fob", "for", "joe", "ivy", "fan", "age", "fax", "hip", "jib", "mel", "hus", "sob", "ifs", "tab", "ara", "dab", "jag", "jar", "arm", "lot", "tom", "sax", "tex", "yum", "pei", "wen", "wry", "ire", "irk", "far", "mew", "wit", "doe", "gas", "rte", "ian", "pot", "ask", "wag", "hag", "amy", "nag", "ron", "soy", "gin", "don", "tug", "fay", "vic", "boo", "nam", "ave", "buy", "sop", "but", "orb", "fen", "paw", "his", "sub", "bob", "yea", "oft", "inn", "rod", "yam", "pew", "web", "hod", "hun", "gyp", "wei", "wis", "rob", "gad", "pie", "mon", "dog", "bib", "rub", "ere", "dig", "era", "cat", "fox", "bee", "mod", "day", "apr", "vie", "nev", "jam", "pam", "new", "aye", "ani", "and", "ibm", "yap", "can", "pyx", "tar", "kin", "fog", "hum", "pip", "cup", "dye", "lyx", "jog", "nun", "par", "wan", "fey", "bus", "oak", "bad", "ats", "set", "qom", "vat", "eat", "pus", "rev", "axe", "ion", "six", "ila", "lao", "mom", "mas", "pro", "few", "opt", "poe", "art", "ash", "oar", "cap", "lop", "may", "shy", "rid", "bat", "sum", "rim", "fee", "bmw", "sky", "maj", "hue", "thy", "ava", "rap", "den", "fla", "auk", "cox", "ibo", "hey", "saw", "vim", "sec", "ltd", "you", "its", "tat", "dew", "eva", "tog", "ram", "let", "see", "zit", "maw", "nix", "ate", "gig", "rep", "owe", "ind", "hog", "eve", "sam", "zoo", "any", "dow", "cod", "bed", "vet", "ham", "sis", "hex", "via", "fir", "nod", "mao", "aug", "mum", "hoe", "bah", "hal", "keg", "hew", "zed", "tow", "gog", "ass", "dem", "who", "bet", "gos", "son", "ear", "spy", "kit", "boy", "due", "sen", "oaf", "mix", "hep", "fur", "ada", "bin", "nil", "mia", "ewe", "hit", "fix", "sad", "rib", "eye", "hop", "haw", "wax", "mid", "tad", "ken", "wad", "rye", "pap", "bog", "gut", "ito", "woe", "our", "ado", "sin", "mad", "ray", "hon", "roy", "dip", "hen", "iva", "lug", "asp", "hui", "yak", "bay", "poi", "yep", "bun", "try", "lad", "elm", "nat", "wyo", "gym", "dug", "toe", "dee", "wig", "sly", "rip", "geo", "cog", "pas", "zen", "odd", "nan", "lay", "pod", "fit", "hem", "joy", "bum", "rio", "yon", "dec", "leg", "put", "sue", "dim", "pet", "yaw", "nub", "bit", "bur", "sid", "sun", "oil", "red", "doc", "moe", "caw", "eel", "dix", "cub", "end", "gem", "off", "yew", "hug", "pop", "tub", "sgt", "lid", "pun", "ton", "sol", "din", "yup", "jab", "pea", "bug", "gag", "mil", "jig", "hub", "low", "did", "tin", "get", "gte", "sox", "lei", "mig", "fig", "lon", "use", "ban", "flo", "nov", "jut", "bag", "mir", "sty", "lap", "two", "ins", "con", "ant", "net", "tux", "ode", "stu", "mug", "cad", "nap", "gun", "fop", "tot", "sow", "sal", "sic", "ted", "wot", "del", "imp", "cob", "way", "ann", "tan", "mci", "job", "wet", "ism", "err", "him", "all", "pad", "hah", "hie", "aim", "ike", "jed", "ego", "mac", "baa", "min", "com", "ill", "was", "cab", "ago", "ina", "big", "ilk", "gal", "tap", "duh", "ola", "ran", "lab", "top", "gob", "hot", "ora", "tia", "kip", "han", "met", "hut", "she", "sac", "fed", "goo", "tee", "ell", "not", "act", "gil", "rut", "ala", "ape", "rig", "cid", "god", "duo", "lin", "aid", "gel", "awl", "lag", "elf", "liz", "ref", "aha", "fib", "oho", "tho", "her", "nor", "ace", "adz", "fun", "ned", "coo", "win", "tao", "coy", "van", "man", "pit", "guy", "foe", "hid", "mai", "sup", "jay", "hob", "mow", "jot", "are", "pol", "arc", "lax", "aft", "alb", "len", "air", "pug", "pox", "vow", "got", "meg", "zoe", "amp", "ale", "bud", "gee", "pin", "dun", "pat", "ten", "mob"};
        List a = Arrays.asList(sa);
        System.out.print(solution.ladderLength(start, end, lqq));
    }

    /**
     * 这道题相当于从一个点，到另一个点，每次经过wordlist中一个点。结果求的就是无环无向图中最短路径
     * 常规方法就是使用bfs，从出发点开始，找到所有下一步能到达的点，一直找，直到等于要找的endword
     * 同时bfs还可以实现双向bfs加速收敛
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int ladderLength(String beginWord, String endWord, List<String> wordList) {
            /**
             * 方法超时,dfs效率太低，尝试用bfs做
             */
            /*
            if (wordList.size() == 0) return 0;
            int flag = 0;
            Set<String> set = new HashSet<>();
            for (String str : wordList) {
                if (str.equals(endWord)) {
                    flag = 1;
                    continue;
                }
                set.add(str);
            }
            set.remove(beginWord);
            if (flag == 0) return 0;
            int ret = dupdis(beginWord, endWord, set, 0);
            if (ret != 0) ret += 1;
            return ret == Integer.MAX_VALUE ? 0 : ret;
            */
            //bfs开始 75%左右，尝试使用双向bfs
            /*bfs
            if(wordList.size() == 0 || !wordList.contains(endWord)) return 0;
            Set<String> set = new HashSet<>(wordList);
            Set<String> visited = new HashSet<>();
            Pair<String, Integer> p;
            Queue<Pair<String, Integer>> queue = new LinkedList<>();
            String str;
            int i = 0, n = beginWord.length(), j = 0;
            queue.offer(new Pair<>(beginWord, 1));

            while(queue.size() != 0){
                Pair temp = queue.poll();
                String temp1 = (String)temp.getKey();
                j = (int)temp.getValue();
                if(temp1.equals(endWord)) return j;
                visited.add(temp1);
                for(i = 0; i < n; i++){
                    StringBuilder sb = new StringBuilder(temp1);
                    for(char b = 'a'; b <= 'z'; b++){
                        sb.setCharAt(i, b);
                        str = sb.toString();
                        //如果这个点在wordlist里面，且未被访问，就把他放入队列
                        if(set.contains(str) && !visited.contains(str)){
                            queue.offer(new Pair<>(str, j+1));
                            visited.add(str);
                        }
                    }
                }
            }
            return 0;
            bfs
             */
            //双向bfs开始
            if (wordList.size() == 0 || !wordList.contains(endWord)) return 0;
            boolean key1 = false, key2 = false;
            Set<String> set = new HashSet<>(wordList);
            Map<String, Integer> visited1 = new HashMap<>();
            Map<String, Integer> visited2 = new HashMap<>();
            Queue<String> queue1 = new LinkedList<>();
            Queue<String> queue2 = new LinkedList<>();
            Queue<String> queue3;
            String str;
            int i = 0, n = beginWord.length(), j = 0, flag = 0;
            queue1.offer(beginWord);
            queue2.offer(endWord);
            visited1.put(beginWord, 1);
            visited2.put(endWord, 1);
            while (queue1.size() != 0 || queue2.size() != 0) {
                if ((queue1.isEmpty() && !queue2.isEmpty()) || queue2.size() < queue1.size()) {
                    queue3 = queue1;
                    queue1 = queue2;
                    queue2 = queue3;
                    flag = 1 - flag;
                }
                String node = queue1.poll();
                if (flag == 1) {
                    j = visited2.get(node) + 1;
                } else j = visited1.get(node) + 1;
                for (i = 0; i < n; i++) {
                    StringBuilder sb = new StringBuilder(node);
                    for (char b = 'a'; b <= 'z'; b++) {
                        if (b == node.charAt(i)) continue;
                        sb.setCharAt(i, b);
                        str = sb.toString();
                        if (set.contains(str)) {
                            //放到vis1
                            key1 = visited1.containsKey(str);
                            key2 = visited2.containsKey(str);
                            if (flag == 0 && !key1 && !key2) {
                                visited1.put(str, j);
                                queue1.offer(str);
                            } else if (flag == 0 && !key1 && key2)
                                return j + visited2.get(str) - 1;
                            else if (flag == 1 && !key2 && !key1) {
                                visited2.put(str, j);
                                queue1.offer(str);
                            } else if (flag == 1 && !key2 && key1)
                                return visited1.get(str) + j - 1;
                            else if (key1 && key2) {
                                return visited1.get(str) + visited2.get(str) - 1;
                            }

                        }
                    }
                }
            }
            return 0;
        }

        //dfs使用的方法dupdis
        /*
        private int dupdis(String start, String end, Set<String> set, int j) {
            if (find == 1 && j >= ret1 || (j >= 20)) return Integer.MAX_VALUE;
            if (getDis(start, end) == 1) {
                find = 1;
                ret1 = j + 1;
                return j + 1;
            }
            if (set.isEmpty()) return 0;
            int min = Integer.MAX_VALUE;
            for (String str : set) {
                if (getDis(str, end) == 1) {
                    Set<String> nset = new HashSet<>(set);
                    nset.remove(str);
                    min = Math.min(dupdis(start, str, nset, (j + 1)), min);
                }
            }
            return min;


        }
        */


        //dfs使用的方法 getDis
        /*
        private int getDis(String a, String b) {
            int i = 0, j = 0;
            for (; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i))
                    j++;
                if(j > 1) return 3;
            }
            return j;
        }

         */
    }
//leetcode submit region end(Prohibit modification and deletion)

}