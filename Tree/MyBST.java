package Tree;

public class MyBST {
  public TreeNode mRoot;

  public MyBST() {}

  public TreeNode insert(TreeNode root, int value) {
    TreeNode newNode = new TreeNode(value);
    // TH1: root == null
    if (root == null) {
      root = newNode;
      return root;
    } else {
      TreeNode temp = root;
      while (true) {
        if (value > temp.value) {
          if (temp.right == null) {
            temp.right = newNode;
            break;
          } else {
            temp = temp.right;
          }
        } else if (value < temp.value) {
          if (temp.left == null) {
            temp.left = newNode;
            break;
          } else {
            temp = temp.left;
          }
        }
      }
      return root;
    }
  }

  public TreeNode insertIntoBST(TreeNode root, int value) {
    if (root == null) {
      return new TreeNode(value);
    }
    if (value < root.value) {
      if (root.left == null) {
        root.left = new TreeNode(value);
      } else {
        insertIntoBST(root.left, value);
      }
    } else {
      if (root.right == null) {
        root.right = new TreeNode(value);
      } else {
        insertIntoBST(root.right, value);
      }
    }
    return root;
  }

  // Tim node con trai cung cua root
  public TreeNode findLeftMostNode(TreeNode root) {
    if (root == null) {
      return null;
    }
    TreeNode leftMostNode = root;
    while (leftMostNode.left != null) {
      leftMostNode = leftMostNode.left;
    }
    return leftMostNode;
  }

  // xoa Node trong cay root
  // return cay moi da duoc xoa Node
  public TreeNode delNode(TreeNode root, int value) {
    if (root == null) {
      return null;
    }
    // B1 di tim Node xoa
    if (value < root.value) {
      root.left = delNode(root.left, value);
    } else if (value > root.value) {
      root.right = delNode(root.right, value);
    } else {
      // root.value = value -> xoa root | Xac dinh dc Node xoa
      // B2: xoa Node root

      // TH1: root la Node la'
      if (root.left == null && root.right == null) {
        return null;
      }
      // TH2: chi co 1 node con ben trai
      if (root.left != null && root.right == null) {
        return root.left;
      }
      // TH2: chi co 1 node con ben phai
      if (root.left == null && root.right != null) {
        return root.right;
      }
      // TH4: ton tai ca 2 node con
      // tim node trai cung cua cay con ben phai
      TreeNode leftMostNode = findLeftMostNode(root.right);
      root.value = leftMostNode.value;
      root.right = delNode(root.right, leftMostNode.value);
    }
    return root;
  }

  // Tim Node trong BST
  public TreeNode searchBST(TreeNode root, int key) {
    if (root == null) return null;
    if (key < root.value) {
      return searchBST(root.left, key);
    } else if (key > root.value) {
      return searchBST(root.right, key);
    } else { // root.value = key
      return root;
    }
  }

  // Duyet Tree theo 3 cach
  // Cach 1: Pre-order
  public static void preOrder(TreeNode currNode) {
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

  // Cach 2: In-Order
  public static void inOrder(TreeNode currNode) {
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

  // Cach 3: Post-Order
  public static void postOrder(TreeNode currNode) {
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

  // Tim chieu cao cua cay
  public int maxDepth(TreeNode root) {
    // B1: Dk dung`
    if (root == null) {
      return 0;
    }
    int chieuCaoCayBenTrai = maxDepth(root.left);
    int chieuCaoCayBenPhai = maxDepth(root.right);
    int result = Math.max(chieuCaoCayBenTrai, chieuCaoCayBenPhai) + 1;
    return result;
  }

  // Tim tong tren cay = targetSum
  public boolean isLeaf(TreeNode node) {
    return node.left == null && node.right == null;
  }
  // Kiem tra xem duyet sang 2 cay con de kiem tra
  public boolean duyet(TreeNode currNode, int currSum, int targetSum) {
    // B1: dk dung` | bai toan co so
    if (currNode == null) return false;
    currSum += currNode.value;
    if (isLeaf(currNode)) {
      return currSum == targetSum;
    }
    boolean resultLeft = duyet(currNode.left, currSum, targetSum);
    boolean resultRight = duyet(currNode.right, currSum, targetSum);
    return resultLeft || resultRight;
  }

  public boolean hasPathSum(TreeNode root, int targetSum) {
    return duyet(root, 0, targetSum);
  }

  // cac canh: ab, ac, bd, be, cf, fj, ei, dg, dh, abd, abe, acf, bdg, bdh, bei, cfj, abdg, abdh, abei, acfj
  public void lietKeCanh(TreeNode root) {
      // tuan sau kiem tra
      // duyet cac canh vao trong cay
  }

}
