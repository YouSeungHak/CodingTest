package _0101_0200;

public class _0112_PathSum {
    int targetSum = 0;
    boolean ret = false;
    public void plusPathSum(_0112_TreeNode node, int targetSum) {
        if(node == null) {
            return;
        }
        this.targetSum += node.val;
        if(node.left == null && node.right == null) {
            if(this.targetSum == targetSum)
                this.ret = true;
        }
        plusPathSum(node.left, targetSum);
        plusPathSum(node.right, targetSum);
        this.targetSum -= node.val;
    }

    public boolean hasPathSum(_0112_TreeNode root, int targetSum) {
        plusPathSum(root, targetSum);
        return this.ret;
    }
}
