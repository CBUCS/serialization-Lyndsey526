/*
Lyndsey Wilson
ID#684781

https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
 */

public class PostOrderBST<T extends Comparable<T>> extends BinarySearchTree<T>
{
    public PostOrderBST()
    {
        super();
    }

    //printout preordered version of the tree
    @Override
    public void traverse()
    {
        System.out.print("Postorder Tree: ");
        preorderHelper(root);
        System.out.println();
    }

    //helps the traversal function solve problem
    private void preorderHelper(TreeNode<T> ptr)
    {
        if(ptr != null)
        {
            preorderHelper(ptr.left);
            preorderHelper(ptr.right);
            System.out.print(ptr.value + " ");
        }
    }
}

