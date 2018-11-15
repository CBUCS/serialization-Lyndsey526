/*
Lyndsey Wilson
ID#684781

 */

public class BSTTest
{
    public static void main(String[] args)
    {
        BinarySearchTree<Integer> tree[] = new BinarySearchTree[7];
        tree[0] = new InOrderBST<Integer>();
        tree[1] = new PreOrderBST<Integer>();
        tree[2] = new PostOrderBST<Integer>();
        tree[3] = new DFSBST<Integer>();
        tree[4] = new BFSBST<Integer>();
        tree[5] = new MinDepthBST<Integer>();
        tree[6] = new MaxDepthBST<Integer>();

        int values[] = {4, 2, 6, 1, 3, 5, 7};
        for(int i = 0; i < values.length; i++) {
            for(int j = 0; j < 5; j++) {
                tree[j].insert(values[i]);
            }
        }

        int mmValues[] = {3, 2, 1, 4, 5, 6, 7};
        for(int i = 0; i < mmValues.length; i++) {
            for(int j = 5; j < 7; j++) {
                tree[j].insert(mmValues[i]);
            }
        }

        for(int i = 0; i < tree.length; i++)
            tree[i].traverse();
    }

/*
       Inorder Tree: 1 2 3 4 5 6 7
       Preorder Tree: 4 2 1 3 6 5 7
       Postorder Tree: 1 3 2 5 7 6 4
       DFS Tree: 4 2 1 3 6 5 7
       BFS Tree: 4 2 6 1 3 5 7
       Minimum Depth of Tree: 3
       Maximum Depth of Tree: 5
*/
}