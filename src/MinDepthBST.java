/*
Lyndsey Wilson
ID#684781

https://www.geeksforgeeks.org/find-minimum-depth-of-a-binary-tree/
 */


public class MinDepthBST<T extends Comparable<T>> extends BinarySearchTree<T>
{
    public MinDepthBST()
    {
        super();
    }

    //printout minimum depth of the tree
    @Override
    public void traverse()
    {
        System.out.println("Minimum Depth of Tree: " + minDepthHelper(root));
    }

    //get the height (depth) of the tree
    private int minDepthHelper(TreeNode<T> ptr)
    {
        if(ptr == null)
            return 0;
        else if(ptr.left == null && ptr.right == null)
            return 1;
        else if(ptr.left == null)
            return 1 + minDepthHelper(ptr.right);
        else if(ptr.right == null)
            return 1 + minDepthHelper(ptr.left);
        else
            return 1 + min(minDepthHelper(ptr.left), minDepthHelper(ptr.right));
    }

    //largest number of two values
    private int min(int val1, int val2)
    {
        if(val1 < val2)
            return val1;
        else
            return val2;
    }
}