/*
Lyndsey Wilson
ID#684781

https://www.geeksforgeeks.org/write-a-c-program-to-find-the-maximum-depth-or-height-of-a-tree/
 */


public class MaxDepthBST<T extends Comparable<T>> extends BinarySearchTree<T>
{
    public MaxDepthBST()
    {
        super();
    }

    //printout maximum depth of the tree
    @Override
    public void traverse()
    {
        System.out.println("Maximum Depth of Tree: " + maxDepthHelper(root));
    }

    private int maxDepthHelper(TreeNode<T> ptr)
    {
        if(ptr == null)
            return 0;
        else
            return 1 + max(maxDepthHelper(ptr.left), maxDepthHelper(ptr.right));
    }

    //largest number of two values
    private int max(int val1, int val2)
    {
        if(val1 > val2)
            return val1;
        else
            return val2;
    }
}