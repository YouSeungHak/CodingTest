package _0101_0200

class Kt0112PathSum {
    private var targetSum = 0
    private var ret = false

    private fun isLeafNode(node: Kt0112TreeNode): Boolean {
        return node.left == null && node.right == null
    }

    private fun checkTargetSum(node: Kt0112TreeNode, targetSum: Int) {
        if (isLeafNode(node)) {
            if (this.targetSum == targetSum) ret = true
        }
    }

    private fun plusPathSum(node: Kt0112TreeNode?, targetSum: Int) {
        if (ret || node == null) return
        this.targetSum += node.`val`
        checkTargetSum(node, targetSum)
        plusPathSum(node.left, targetSum)
        plusPathSum(node.right, targetSum)
        this.targetSum -= node.`val`
    }

    fun hasPathSum(root: Kt0112TreeNode?, targetSum: Int): Boolean {
        plusPathSum(root, targetSum)
        return ret
    }
}