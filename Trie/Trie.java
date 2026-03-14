public class Trie {
    class Node{
        Node[] children = new Node[26];
        boolean eow;
    }

    Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        Node curr = root;
        int w = word.length();

        for(int i=0; i<w; i++){
            int index = word.charAt(i) - 'a';

            if(curr.children[index] == null) curr.children[index] = new Node();

            if(i == w-1) curr.children[index].eow = true;

            curr = curr.children[index];
        }
    }
    
    public boolean search(String word) {
        Node curr = root;
        int w = word.length();

        for(int i=0; i<w; i++){
            int index = word.charAt(i) - 'a';

            if(curr.children[index] == null) return false;

            if(i == w-1 && curr.children[index].eow == false) return false; 

            curr = curr.children[index];
        }
        return true;
    }
    
    public boolean startsWith(String prefix) {
        Node curr = root;
        int w = prefix.length();

        for(int i=0; i<w; i++){
            int index = prefix.charAt(i) - 'a';

            if(curr.children[index] == null) return false;

            curr = curr.children[index];
        }
        return true;
    }

    public static void main(String[] args) {
        Trie obj = new Trie();
        String word = "world";
        String start = "wor";

        obj.insert(word);
        System.out.println(obj.search(word));
        System.out.println(obj.startsWith(start));
    }
}
