/*
Lyndsey Wilson
ID#684781

https://www.geeksforgeeks.org/depth-first-search-or-dfs-for-a-graph/
 */

public class DFSBST<T extends Comparable<T>> extends BinarySearchTree<T>
{
    //printout DFS version of the tree
    @Override
    public void traverse()
    {
        System.out.print("DFS Tree: ");
        DFSHelper(root);
        System.out.println();
    }

    private void DFSHelper(TreeNode<T> ptr)
    {
        if(ptr != null)
        {
            System.out.print(ptr.value + " ");
            DFSHelper(ptr.left);
            DFSHelper(ptr.right);
        }
    }


}
