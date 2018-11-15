/*
Lyndsey Wilson
ID#684781

https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
 */

public class PreOrderBST<T extends Comparable<T>> extends BinarySearchTree<T>
{
    public PreOrderBST()
    {
        super();
    }

    //printout preordered version of the tree
    @Override
    public void traverse()
    {
        System.out.print("Preorder Tree: ");
        preorderHelper(root);
        System.out.println();
    }

    //helps the traversal function solve problem
    private void preorderHelper(TreeNode<T> ptr)
    {
        if(ptr != null)
        {
            System.out.print(ptr.value + " ");
            preorderHelper(ptr.left);
            preorderHelper(ptr.right);
        }
    }


}
