/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {

        System.out.println("Invert binary tree");

        Solution solution = new Solution();

        BuildTree1 tree1 = new BuildTree1();

        TreeNode root1 = tree1.getTree();
        TreeNode root2 = solution.invertTree(root1);
        System.out.println("Output = " + root2); // how to print tree

    }

}
