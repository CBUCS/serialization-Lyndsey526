/*
Lyndsey Wilson
ID#684781

https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
 */

public class InOrderBST<T extends Comparable<T>> extends BinarySearchTree<T>
{
    public InOrderBST()
    {
        super();
    }

    //printout in-ordered version of the tree
    @Override
    public void traverse()
    {
        System.out.print("Inorder Tree: ");
        preorderHelper(root);
        System.out.println();
    }

    //helps the traversal function solve problem
    private void preorderHelper(TreeNode<T> ptr)
    {
        if(ptr != null)
        {
            preorderHelper(ptr.left);
            System.out.print(ptr.value + " ");
            preorderHelper(ptr.right);
        }
    }


}
