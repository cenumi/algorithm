package 前缀树;

public class 前缀树 {






    static class Trie{
        private TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public void insert(String word){
            if (word == null){
                return;
            }
            char[] chs = word.toCharArray();
            TrieNode node = root;
            int index = 0;
            for (int i = 0; i < chs.length; i++) {
                index = chs[i] - 'a';
                if (node.nexts[index] == null){
                    node.nexts[index] = new TrieNode();
                }
                node = node.nexts[index];
                node.path++;
            }
            node.end++;
        }


    }
}
