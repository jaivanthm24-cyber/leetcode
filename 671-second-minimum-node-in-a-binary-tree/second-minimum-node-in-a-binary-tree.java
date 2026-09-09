import java.util.*;

class Solution {
    HashSet<Integer> set = new HashSet<>();

    public int findSecondMinimumValue(TreeNode root) {

        inorder(root);

        ArrayList<Integer> list = new ArrayList<>(set);

        Collections.sort(list);

        if (list.size() >= 2) {
            return list.get(1);
        }

        return -1;
    }

    public void inorder(TreeNode root) {

        if (root == null) {
            return;
        }

        inorder(root.left);

        set.add(root.val);

        inorder(root.right);
    }
}