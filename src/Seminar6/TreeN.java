package Seminar6;

import java.util.*;

class TreeN {
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

        for (int i = 0; i < levelOrder(derevo()).size(); i++) {
            System.out.println(levelOrder(derevo()).get(i) + " Уровень: " + i);
        }
        System.out.println("\nPreorder Traversal" + preorderTraversal(derevo()));
    }



    public static Tree derevo() {
        return new Tree(1,
                new Tree(2, new Tree(4), new Tree(5,
                        new Tree(7, new Tree(11), null), null)),
                new Tree(3, null,
                        new Tree(6, new Tree(9), new Tree(10))));
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
    public static List<Integer> preorderTraversal(Tree root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<Tree> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Tree node = stack.pop();
            result.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return result;
    }

}
