/*
Lyndsey Wilson
ID#684781

https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
 */
public class BFSBST<T extends Comparable<T>> extends BinarySearchTree<T> implements java.io.Serializable
{
    public BFSBST()
    {
        super();
    }

    //printout BFS version of the tree
    @Override
    public void traverse()
    {
        Queue<TreeNode<T>> queue = new Queue<>();
        queue.enqueue(root);
        System.out.print("BFS Tree: ");
        while(!queue.isEmpty())
        {
            TreeNode<T> node = queue.dequeue();
            System.out.print(node.value + " ");
            if(node.left != null)
                queue.enqueue(node.left);
            if(node.right != null)
                queue.enqueue(node.right);
        }
        System.out.println();
    }


}