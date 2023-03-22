package _0101_0200

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Kt0112PathSumTest {

    @Test
    fun hasPathSum1() {
        // Given
        val pathSum = Kt0112PathSum()

        // 트리 노드 만드는 방법 확인 필요
        val treeNode = Kt0112TreeNode(5)
        val treeNode1 = Kt0112TreeNode(4)
        val treeNode2 = Kt0112TreeNode(8)
        val treeNode3 = Kt0112TreeNode(11)
        val treeNode4 = Kt0112TreeNode(13)
        val treeNode5 = Kt0112TreeNode(4)
        val treeNode6 = Kt0112TreeNode(7)
        val treeNode7 = Kt0112TreeNode(2)
        val treeNode8 = Kt0112TreeNode(1)
        treeNode.left = treeNode1
        treeNode.right = treeNode2
        treeNode1.left = treeNode3
        treeNode2.left = treeNode4
        treeNode2.right = treeNode5
        treeNode3.left = treeNode6
        treeNode3.right = treeNode7
        treeNode5.right = treeNode8

        // When
        val targetSum = 22
        val ret = pathSum.hasPathSum(treeNode, targetSum)

        // Then
        assertTrue(ret)
    }

    @Test
    fun hasPathSum2() {
        // Given
        val pathSum = Kt0112PathSum()
        val treeNode = Kt0112TreeNode(1)
        val treeNode1 = Kt0112TreeNode(2)
        val treeNode2 = Kt0112TreeNode(3)
        treeNode.left = treeNode1
        treeNode.right = treeNode2

        // When
        val targetSum = 5
        val ret = pathSum.hasPathSum(treeNode, targetSum)

        // Then
        assertFalse(ret)
    }

    @Test
    fun hasPathSum3() {
        // Given
        val pathSum = Kt0112PathSum()

        // When
        val targetSum = 0
        val ret = pathSum.hasPathSum(null, targetSum)

        // Then
        assertFalse(ret)
    }

    @Test
    fun hasPathSum4() {
        // Given
        val pathSum = Kt0112PathSum()
        val treeNode = Kt0112TreeNode(-51)
        val treeNode1 = Kt0112TreeNode(-72)
        val treeNode2 = Kt0112TreeNode(32)
        val treeNode3 = Kt0112TreeNode(82)
        val treeNode4 = Kt0112TreeNode(-512)
        val treeNode5 = Kt0112TreeNode(-777)
        val treeNode6 = Kt0112TreeNode(899)
        treeNode.left = treeNode1
        treeNode.right = treeNode2
        treeNode1.left = treeNode3
        treeNode3.left = treeNode4
        treeNode2.left = treeNode5
        treeNode2.right = treeNode6

        // When
        val targetSum = -796
        val ret = pathSum.hasPathSum(treeNode, targetSum)

        // Then
        assertTrue(ret)
    }

    @Test
    fun hasPathSum5() {
        // Given
        val pathSum = Kt0112PathSum()
        val treeNode = Kt0112TreeNode(1)
        val treeNode1 = Kt0112TreeNode(2)
        treeNode.left = treeNode1

        // When
        val targetSum = 1
        val ret = pathSum.hasPathSum(treeNode, targetSum)

        // Then
        assertFalse(ret)
    }

    @Test
    fun hasPathSum6() {
        // Given
        val pathSum = Kt0112PathSum()
        val treeNode = Kt0112TreeNode(1)

        // When
        val targetSum = 1
        val ret = pathSum.hasPathSum(treeNode, targetSum)

        // Then
        assertTrue(ret)
    }
}