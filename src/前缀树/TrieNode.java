package 前缀树;



public class TrieNode {
    public int path;
    public int end;
    public TrieNode[] nexts;

    public TrieNode() {
        this.path = 0;
        this.end = 0;
        this.nexts = new TrieNode[26];
    }
}
