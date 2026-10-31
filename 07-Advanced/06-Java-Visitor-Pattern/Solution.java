import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Problem: Java Visitor Pattern
 * Domain: Java / Advanced
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Implement the Visitor Pattern on a tree data structure with three visitors:
 * 1. SumInLeavesVisitor: Sum of values in tree leaves.
 * 2. ProductOfRedNodesVisitor: Product of values of red nodes modulo 10^9 + 7.
 * 3. FancyVisitor: Difference between sum of non-leaf nodes at even depth and sum of green leaf nodes.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
enum Color {
    RED, GREEN
}

abstract class Tree {
    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() { return value; }
    public Color getColor() { return color; }
    public int getDepth() { return depth; }
    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {
    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);
        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {
    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis {
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);
}

class SumInLeavesVisitor extends TreeVis {
    private int sum = 0;

    public int getResult() { return sum; }
    public void visitNode(TreeNode node) {}
    public void visitLeaf(TreeLeaf leaf) { sum += leaf.getValue(); }
}

class ProductOfRedNodesVisitor extends TreeVis {
    private long product = 1;
    private static final int MOD = 1000000007;

    public int getResult() { return (int) product; }

    public void visitNode(TreeNode node) {
        if (node.getColor() == Color.RED) {
            product = (product * node.getValue()) % MOD;
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.RED) {
            product = (product * leaf.getValue()) % MOD;
        }
    }
}

class FancyVisitor extends TreeVis {
    private int nonLeafEvenDepthSum = 0;
    private int greenLeafSum = 0;

    public int getResult() {
        return Math.abs(nonLeafEvenDepthSum - greenLeafSum);
    }

    public void visitNode(TreeNode node) {
        if (node.getDepth() % 2 == 0) {
            nonLeafEvenDepthSum += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.GREEN) {
            greenLeafSum += leaf.getValue();
        }
    }
}

public class Solution {
    private static int[] values;
    private static Color[] colors;
    private static Map<Integer, Set<Integer>> treeMap = new HashMap<>();

    public static Tree solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }

        colors = new Color[n];
        for (int i = 0; i < n; i++) {
            colors[i] = (scanner.nextInt() == 0) ? Color.RED : Color.GREEN;
        }

        for (int i = 0; i < n - 1; i++) {
            int u = scanner.nextInt() - 1;
            int v = scanner.nextInt() - 1;
            treeMap.computeIfAbsent(u, k -> new HashSet<>()).add(v);
            treeMap.computeIfAbsent(v, k -> new HashSet<>()).add(u);
        }
        scanner.close();

        if (n == 1) {
            return new TreeLeaf(values[0], colors[0], 0);
        }

        TreeNode root = new TreeNode(values[0], colors[0], 0);
        buildTree(root, 0, -1);
        return root;
    }

    private static void buildTree(TreeNode parent, int parentId, int grandParentId) {
        Set<Integer> neighbors = treeMap.get(parentId);
        if (neighbors == null) return;

        for (int neighborId : neighbors) {
            if (neighborId != grandParentId) {
                Set<Integer> childNeighbors = treeMap.get(neighborId);
                boolean isLeaf = (childNeighbors.size() == 1 && childNeighbors.contains(parentId));

                if (isLeaf) {
                    TreeLeaf leaf = new TreeLeaf(values[neighborId], colors[neighborId], parent.getDepth() + 1);
                    parent.addChild(leaf);
                } else {
                    TreeNode node = new TreeNode(values[neighborId], colors[neighborId], parent.getDepth() + 1);
                    parent.addChild(node);
                    buildTree(node, neighborId, parentId);
                }
            }
        }
    }

    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        System.out.println(vis1.getResult());
        System.out.println(vis2.getResult());
        System.out.println(vis3.getResult());
    }
}
