import java.util.ArrayList;

public class dfsTraversal {

    static ArrayList<Integer>[] l;

    public void dfsHelper(int u, boolean[] vis){
        System.out.print(u + " ");
        vis[u] = true;

        for(int v: l[u]){
            if(!vis[v]){
                dfsHelper(v, vis);
            }
        }
    }

    public void dfs(){
        int src = 0;
        boolean[] vis = new boolean[l.length];

        dfsHelper(src, vis);
    }

    public static void main(String[] args){
        int V = 5;

        l = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            l[i] = new ArrayList<>();
        }

        // Undirected graph
        l[0].add(1);
        l[0].add(2);

        l[1].add(0);
        l[1].add(3);
        l[1].add(4);

        l[2].add(0);

        l[3].add(1);

        l[4].add(1);

        dfsTraversal obj = new dfsTraversal();
        obj.dfs();
    }
}
