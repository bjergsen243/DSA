package Tree;

public class MyTree {
    public CharTreeNode mRoot;

    public MyTree() {
    }
    public static void preOrder(CharTreeNode currNode) {
        if (currNode == null) {
            return;
        }
        System.out.println("Duyet theo Pre-Order");
        // Duyet currNode truoc
        System.out.print(currNode.value + " ");
        // Duyet ben trai
        preOrder(currNode.left);
        // Duyet ben phai
        preOrder(currNode.right);
    }

    public static void postOrder(CharTreeNode currNode) {
        if (currNode == null) {
            return;
        }
        System.out.println("Duyet theo Post-Order");
        // Duyet ben trai
        postOrder(currNode.left);
        // Duyet ben phai
        postOrder(currNode.right);
        System.out.print(currNode.value + " ");
    }
    public static void inOrder(CharTreeNode currNode) {
        if (currNode == null) {
          return;
        }
        System.out.println("Duyet theo In-Order");
        // Duyet ben trai
        inOrder(currNode.left);
        System.out.print(currNode.value + " ");
        // Duyet ben phai
        inOrder(currNode.right);
      }
}
