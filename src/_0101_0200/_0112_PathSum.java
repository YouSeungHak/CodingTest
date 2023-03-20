package _0101_0200;

public class _0112_PathSum {
    int targetSum = 0;
    boolean ret = false;

    private boolean isLeafNode(_0112_TreeNode node) {
        return node.left == null && node.right == null;
    }

    private void checkTargetSum(_0112_TreeNode node, int targetSum) {
        if(isLeafNode(node)) {
            if(this.targetSum == targetSum)
                this.ret = true;
        }
    }

    private void plusPathSum(_0112_TreeNode node, int targetSum) {
        if(this.ret || node == null)
            return;

        this.targetSum += node.val;
        checkTargetSum(node, targetSum);
        plusPathSum(node.left, targetSum);
        plusPathSum(node.right, targetSum);
        this.targetSum -= node.val;
    }

    public boolean hasPathSum(_0112_TreeNode root, int targetSum) {
        plusPathSum(root, targetSum);
        return this.ret;
    }
}
