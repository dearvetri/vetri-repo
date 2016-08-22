package com.developer.vk.bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by vkrishnaraj on 8/22/16.
 */
public class BreadthFirstSearch {
    private Queue<Node> queue = new LinkedList<Node>();

    public void traverse(Node rootNode) {
        if(rootNode == null || rootNode.getParentNode() != null) {
            throw new IllegalArgumentException("Invalid Root Node");
        }
        rootNode.setDiscovered(true);
        addNodeToTheQueue(rootNode.getLeftNode());
        addNodeToTheQueue(rootNode.getRightNode());
        rootNode.setVisited(true);
        while(!queue.isEmpty()) {
            Node topNode = queue.poll();
            addNodeToTheQueue(topNode.getLeftNode());
            addNodeToTheQueue(topNode.getRightNode());
            topNode.setVisited(true);
        }
    }

    public Queue<Node> getQueue() {
        return queue;
    }

    private void addNodeToTheQueue(Node node) {
        if(node != null) {
            node.setDiscovered(true);
            queue.add(node);
        }
    }


}