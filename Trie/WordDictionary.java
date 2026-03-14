public class WordDictionary {
    class Node{
        Node[] children = new Node[26];
        boolean eow;
    }

    Node root;

    public WordDictionary() {
        root = new Node();
    }
    
    public void addWord(String word) {
        Node curr = root;
        int w = word.length();

        for(int i=0; i<w; i++){
            int index = word.charAt(i) - 'a';

            if(curr.children[index] == null) curr.children[index] = new Node();

            if(i == w-1) curr.children[index].eow = true;

            curr = curr.children[index];
        }
    }

    private boolean dfs(Node node, String word, int index) {

        if(index == word.length()) {
            return node.eow;
        }

        char ch = word.charAt(index);

        // normal character
        if(ch != '.') {
            int childIndex = ch - 'a';

            if(node.children[childIndex] == null) {
                return false;
            }

            return dfs(node.children[childIndex], word, index + 1);
        }

        // wildcard '.'
        for(int i = 0; i < 26; i++) {
            if(node.children[i] != null) {
                if(dfs(node.children[i], word, index + 1)) {
                    return true;
                }
            }
        }

        return false;
    }
    
    public boolean search(String word) {
        return dfs(root, word, 0);
    }

    public static void main(String[] args) {
        WordDictionary obj = new WordDictionary();
        String word = "bad";
        String pre = "b..";

        obj.addWord(word);
        System.out.println(obj.search(pre));
    }    
}
