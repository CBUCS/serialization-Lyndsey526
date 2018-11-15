/*
Lyndsey Wilson
ID#684781

https://www.geeksforgeeks.org/insertion-binary-tree/
https://www.geeksforgeeks.org/binary-search-tree-data-structure/
 */
public abstract class BinarySearchTree<T extends Comparable<T>> implements Tree<T>,java.io.Serializable
{
    //printout BFS version of the tree
    public abstract void traverse();

    public class TreeNode<T> implements java.io.Serializable
    {
        T value;
        TreeNode<T> left, right;

        public TreeNode(T val, TreeNode<T> l, TreeNode<T> r)
        {
            value = val;
            left = l;
            right = r;
        }
    }

    protected TreeNode<T> root;

    public BinarySearchTree()
    {
        root = null;
    }

    //insert item in the tree at the top left most open position
    public void insert(T value)
    {
        root = insertHelper(root, value);
    }

    public TreeNode<T> insertHelper(TreeNode<T> ptr, T value)
    {
        if(ptr == null)
            return new TreeNode<T>(value, null, null);
        else if(value.compareTo(ptr.value) < 0)
            ptr.left = insertHelper(ptr.left, value);
        else
            ptr.right = insertHelper(ptr.right, value);
        return ptr;
    }

    //removes item from tree and replaces with the bottom right most element
    public void remove(T item)
    {
        TreeNode<T> ptr = root, before = null;
        while(ptr != null && ptr.value != item) {
            before = ptr;
            if(item.compareTo(ptr.value) < 0)
                ptr = ptr.left;
            else
                ptr = ptr.right;
        }
        if(ptr == null)
            return;

        if(ptr.left == null && ptr.right == null)
        {
            if(before.left == ptr)
                before.left = null;
            else
                before.right = null;
        }
        else if(ptr.left == null)
        {
            if(before.left == ptr)
                before.left = ptr.right;
            else
                before.right = ptr.right;
        }
        else if(ptr.right == null)
        {
            if(before.left == ptr)
                before.left = ptr.left;
            else
                before.right = ptr.left;
        }
        else
        {
            TreeNode<T> max = ptr.left, beforeMax = ptr;
            while(max.right != null) {
                beforeMax = max;
                max = max.right;
            }
            ptr.value = max.value;
            beforeMax.right = max.left;
        }
    }

    //find a specific tree node that contains item
    public boolean find(T item)
    {
        return findNodeHelper(root, item);
    }

    private boolean findNodeHelper(TreeNode<T> ptr, T item)
    {
        if(ptr == null)
            return false;
        else
        {
            if(item.compareTo(ptr.value) == 0)
                return true;
            else if(item.compareTo(ptr.value) < 0)
                return findNodeHelper(ptr.left, item);
            else
                return findNodeHelper(ptr.right, item);
        }
    }


}
