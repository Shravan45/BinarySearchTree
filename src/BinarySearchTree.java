public class BinarySearchTree {

  Node root;

  public BinarySearchTree() {
    this.root = null;
  }

  public void insertUsingRecursion(int key) {
    this.root = insertRec(this.root, key);
  }

  private Node insertRec(Node root, int key) {

    if (root == null) {
      root = new Node(key);
      return root;
    }

    // Recur down the tree
    if (key < root.data) {
      root.left = insertRec(root.left, key);
    } else if (key > root.data) {
      root.right = insertRec(root.right, key);
    }

    return root;
  }

  public void insertUsingIteration(int key) {
    if (root == null) {
      this.root = new Node(key);
      return;
    }

    if (key < root.data) {
      Node prev = null;
      Node pointer = root;

      while (pointer != null) {

        if (key < pointer.data) {
          prev = pointer;
          pointer = pointer.left;
        } else if (key > pointer.data) {
          prev = pointer;
          pointer = pointer.right;
        }

        if (key < prev.data) {
          prev.left = new Node(key);
        } else if (key > prev.data) {
          prev.right = new Node(key);
        }
      }
    }
  }

  public void inorderTraversal() {
    inorderRec(this.root);
  }

  private void inorderRec(Node root) {

    //left-root-right
    if (root != null) {
      inorderRec(root.left);
      System.out.println(root.data);
      inorderRec(root.right);
    }
  }

  /**
   * Returns true if item exists in the tree, false if it doesn't.
   *
   * @param item value to be searched.
   * @return presence of value in the tree.
   */
  public boolean searchUsingRecursion(int item) {
    return searchRec(this.root, item);
  }

  private boolean searchRec(Node root, int item) {

    if (root == null) {
      return false;
    }

    if (root.data == item) {
      return true;
    }
    if (item < root.data) {
      return searchRec(root.left, item);
    } else if (item > root.data) {
      return searchRec(root.right, item);
    }

    return false;
  }

  public boolean searchUsingIteration(int item) {
    Node pointer = this.root;

    while (pointer != null) {
      if (item == pointer.data) {
        return true;
      }
      if (item < pointer.data) {
        pointer = pointer.left;
      } else if (item > pointer.data) {
        pointer = pointer.right;
      }
    }
    return false;
  }
}

