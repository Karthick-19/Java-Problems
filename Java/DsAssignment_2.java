package Java;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.LinkedList;

public class DsAssignment_2 {


static class Graph {
    private final int V; 
    private final ArrayList<LinkedList<Integer>> adj;

    Graph(int v) {
        V = v;
        adj = new ArrayList<>(v);
        for (int i = 0; i < v; ++i)
            adj.add(new LinkedList<>());
    }

    void addEdge(int v, int w) {
        adj.get(v).add(w);
    }

    void BFS(int s) {
        boolean[] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()) {
            s = queue.poll();
            System.out.print(s + " ");

            for (Integer n : adj.get(s)) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (Integer n : adj.get(v)) {
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    void DFS(int v) {
        boolean[] visited = new boolean[V];
        DFSUtil(v, visited);
    }
}
    static class Node {
        int data;
        Node left, right;
    
        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    
    // Binary Tree
    static class BinaryTree {
        Node root;
        BinaryTree() {
            root = null;
        }

        void insert(int data) {
            root = insertRec(root, data);
        }
    
        Node insertRec(Node root, int data) {
            if (root == null) {
                root = new Node(data);
                return root;
            }
            if (data < root.data)
                root.left = insertRec(root.left, data);
            else if (data > root.data)
                root.right = insertRec(root.right, data);
            return root;
        }

        void delete(int key) {
            root = deleteRec(root, key);
        }
    
        Node deleteRec(Node root, int key) {
            if (root == null)
                return root;
            if (key < root.data)
                root.left = deleteRec(root.left, key);
            else if (key > root.data)
                root.right = deleteRec(root.right, key);
            else {
                if (root.left == null)
                    return root.right;
                else if (root.right == null)
                    return root.left;
                root.data = minValue(root.right);
                root.right = deleteRec(root.right, root.data);
            }
            return root;
        }

        int minValue(Node root) {
            int minv = root.data;
            while (root.left != null) {
                minv = root.left.data;
                root = root.left;
            }
            return minv;
        }
    }
    public static int recusrionFibonacci(int n){
        if(n <= 1){
            return n;
        }
        return recusrionFibonacci(n-1) +recusrionFibonacci(n-2);
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Inserting nodes into the tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to HashMap
        map.put("Mark", 25);
        map.put("Matt", 30);
        map.put("Mike", 35);

        System.out.println(map.get("Matt"));
        //To check whether there is a key value of Mike
        System.out.println(map.containsKey("Mike"));
        //To check whether there is a value of 100
        System.out.println(map.containsValue(100));

        System.out.println("Unsorted HashMap:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Creating TreeMap and sorting by values
        TreeMap<String, Integer> sortedMap = new TreeMap<>((o1, o2) -> {
            int cmp = map.get(o1).compareTo(map.get(o2));
            if (cmp == 0) {
                return o1.compareTo(o2);
            }
            return cmp;
        });

        sortedMap.putAll(map);

        // Displaying sorted TreeMap
        System.out.println("\nSorted TreeMap based on values:");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Breadth First Traversal (starting from vertex 2): ");
        g.BFS(2);

        System.out.println("\nDepth First Traversal (starting from vertex 2): ");
        g.DFS(2);

        int n = 10;
        for (int i = 0; i <= n; i++) {
            System.out.print(recusrionFibonacci(i)+" ");
        }
        
    }
}
