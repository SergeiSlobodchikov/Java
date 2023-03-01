package Seminar6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class  TreeN{
    public static class Tree {
        int val;
        Tree left;
        Tree right;

        public Tree(int val, Tree left, Tree right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public Tree(int value) {
            this.val = value;
        }
    }
    public static void main(String[] args) {
        Tree root = new Tree(1,
                new Tree(2, new Tree(4), new Tree(5, new Tree(7), new Tree(8))),
                new Tree(3, null,
                        new Tree(6, new Tree(9), new Tree(10))));
        System.out.println(levelOrder(root));
    }

    public static List<List<Integer>> levelOrder(Tree root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> levels = new ArrayList<>();
        Queue<Tree> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while (queue.size() > 0) {
            levels.add(new ArrayList<>());
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                Tree curr = queue.remove();
                levels.get(level).add(curr.val);
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
            level++;
        }
        return levels;
    }
}
