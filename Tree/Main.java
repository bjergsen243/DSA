package Tree;

public class Main {
    public static void main(String[] args) {
        MyBST myBST = new MyBST();
        // Them 1 node vao trong BST
        /*
        myBST.mRoot = myBST.insert(myBST.mRoot,5);
        myBST.mRoot = myBST.insert(myBST.mRoot,1);
        myBST.mRoot = myBST.insert(myBST.mRoot,6);
        myBST.mRoot = myBST.insert(myBST.mRoot,0);
        myBST.mRoot = myBST.insert(myBST.mRoot,3);
        myBST.mRoot = myBST.insert(myBST.mRoot,7);
        myBST.mRoot = myBST.insert(myBST.mRoot,2);
        myBST.mRoot = myBST.insert(myBST.mRoot,4);
        */
        /*
        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot,5);
        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot,1);
        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot,6);
        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot,0);
        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot,3);
        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot,7);
        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot,2);
        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot,4);
        */
        // Xoa 1 node trong BST
        //myBST.mRoot = myBST.delNode(myBST.mRoot,1);

        TreeNode n0 = new TreeNode(0);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);


        n0.left = n1; n0.right = n2;
        n1.left = n3; n1.right = n4;
        n2.right = n5;
        n4.left = n6; n4.right = n7;
        

    }
}
