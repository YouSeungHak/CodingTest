package _0101_0200;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _0112_PathSumTest {

    @Test
    void hasPathSum1() {
        // Given
        _0112_PathSum pathSum = new _0112_PathSum();
        
        // 트리 노드 만드는 방법 확인 필요
        _0112_TreeNode treeNode = new _0112_TreeNode(5);
        _0112_TreeNode treeNode1 = new _0112_TreeNode(4);
        _0112_TreeNode treeNode2 = new _0112_TreeNode(8);
        _0112_TreeNode treeNode3 = new _0112_TreeNode(11);
        _0112_TreeNode treeNode4 = new _0112_TreeNode(13);
        _0112_TreeNode treeNode5 = new _0112_TreeNode(4);
        _0112_TreeNode treeNode6 = new _0112_TreeNode(7);
        _0112_TreeNode treeNode7 = new _0112_TreeNode(2);
        _0112_TreeNode treeNode8 = new _0112_TreeNode(1);

        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;
        treeNode5.right = treeNode8;

        // When
        int targetSum = 22;
        boolean ret = pathSum.hasPathSum(treeNode, targetSum);

        // Then
        assertTrue(ret);
    }

    @Test
    void hasPathSum2() {
        // Given
        _0112_PathSum pathSum = new _0112_PathSum();

        _0112_TreeNode treeNode = new _0112_TreeNode(1);
        _0112_TreeNode treeNode1 = new _0112_TreeNode(2);
        _0112_TreeNode treeNode2 = new _0112_TreeNode(3);

        treeNode.left = treeNode1;
        treeNode.right = treeNode2;

        // When
        int targetSum = 5;
        boolean ret = pathSum.hasPathSum(treeNode, targetSum);

        // Then
        assertFalse(ret);
    }

    @Test
    void hasPathSum3() {
        // Given
        _0112_PathSum pathSum = new _0112_PathSum();

        // When
        int targetSum = 0;
        boolean ret = pathSum.hasPathSum(null, targetSum);

        // Then
        assertFalse(ret);
    }

    @Test
    void hasPathSum4() {
        // Given
        _0112_PathSum pathSum = new _0112_PathSum();

        _0112_TreeNode treeNode = new _0112_TreeNode(-51);
        _0112_TreeNode treeNode1 = new _0112_TreeNode(-72);
        _0112_TreeNode treeNode2 = new _0112_TreeNode(32);
        _0112_TreeNode treeNode3 = new _0112_TreeNode(82);
        _0112_TreeNode treeNode4 = new _0112_TreeNode(-512);
        _0112_TreeNode treeNode5 = new _0112_TreeNode(-777);
        _0112_TreeNode treeNode6 = new _0112_TreeNode(899);

        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode3.left = treeNode4;
        treeNode2.left = treeNode5;
        treeNode2.right = treeNode6;

        // When
        int targetSum = -796;
        boolean ret = pathSum.hasPathSum(treeNode, targetSum);

        // Then
        assertTrue(ret);
    }

    @Test
    void hasPathSum5() {
        // Given
        _0112_PathSum pathSum = new _0112_PathSum();

        _0112_TreeNode treeNode = new _0112_TreeNode(1);
        _0112_TreeNode treeNode1 = new _0112_TreeNode(2);

        treeNode.left = treeNode1;

        // When
        int targetSum = 1;
        boolean ret = pathSum.hasPathSum(treeNode, targetSum);

        // Then
        assertFalse(ret);
    }

    @Test
    void hasPathSum6() {
        // Given
        _0112_PathSum pathSum = new _0112_PathSum();

        _0112_TreeNode treeNode = new _0112_TreeNode(1);

        // When
        int targetSum = 1;
        boolean ret = pathSum.hasPathSum(treeNode, targetSum);

        // Then
        assertTrue(ret);
    }
}