package com.developer.vk.bfs;

/**
 * Created by vkrishnaraj on 8/22/16.
 */
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BFSTest {
    private BreadthFirstSearch bfs = null;

    @Before
    public void setup() {
        bfs = new BreadthFirstSearch();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBreadthFirstSearchForNullRootNode() {
        bfs.traverse(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBreadthFirstSearchForInvalidRootNode() {
        Node rootNode = new Node();
        Node parentNode = new Node();
        rootNode.setParentNode(parentNode);
        bfs.traverse(rootNode);
    }

    @Test
    public void testBreadthFirstSearchForRootNodeStatusUpdate() {
        Node rootNode = new Node();
        bfs.traverse(rootNode);
        Assert.assertTrue(rootNode.isDiscovered());
        Assert.assertTrue(rootNode.isVisited());
    }

    @Test
    public void testBreadthFirstSearchForFillingUpQueueWithBreadthNodes() {
        Node rootNode = new Node();
        Node leftNode = new Node();
        Node rightNode = new Node();
        leftNode.setParentNode(rootNode);
        rightNode.setParentNode(rootNode);
        rootNode.setLeftNode(leftNode);
        rootNode.setRightNode(rightNode);
        bfs.traverse(rootNode);
        Assert.assertTrue(leftNode.isDiscovered());
        Assert.assertTrue(rightNode.isDiscovered());

    }

    @Test
    public void testBreadthFirstSearchForFillingUpQueueWithMultipleBreadthNodes() {
        Node rootNode = new Node();
        Node leftNode1 = new Node();
        Node rightNode1 = new Node();
        leftNode1.setParentNode(rootNode);
        rightNode1.setParentNode(rootNode);
        rootNode.setLeftNode(leftNode1);
        rootNode.setRightNode(rightNode1);
        Node leftNode11 = new Node();
        Node leftNode12 = new Node();
        leftNode1.setLeftNode(leftNode11);
        leftNode1.setRightNode(leftNode12);
        bfs.traverse(rootNode);
        Assert.assertTrue(leftNode1.isDiscovered());
        Assert.assertTrue(rightNode1.isDiscovered());
        Assert.assertTrue(bfs.getQueue().isEmpty());
        Assert.assertEquals(0, bfs.getQueue().size());
        Assert.assertTrue(leftNode1.isVisited());
        Assert.assertTrue(leftNode11.isVisited());
        Assert.assertTrue(leftNode12.isVisited());
        Assert.assertTrue(rightNode1.isVisited());
        Assert.assertTrue(rootNode.isVisited());
    }

}
