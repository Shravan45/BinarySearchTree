public class Driver {

  public static void main(String[] args) {

    /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */

    BinarySearchTree tree = new BinarySearchTree();
    tree.insertUsingRecursion(50);
    tree.insertUsingRecursion(30);
    tree.insertUsingRecursion(20);
    tree.insertUsingRecursion(40);
    tree.insertUsingRecursion(70);
    tree.insertUsingRecursion(60);
    tree.insertUsingRecursion(80);

    // Print inorder traversal of the BST
    tree.inorderTraversal();

    System.out.println("=-==========================");

    tree = new BinarySearchTree();
    tree.insertUsingRecursion(50);
    tree.insertUsingRecursion(30);
    tree.insertUsingRecursion(20);
    tree.insertUsingRecursion(40);
    tree.insertUsingRecursion(70);
    tree.insertUsingRecursion(60);
    tree.insertUsingRecursion(80);
    tree.insertUsingRecursion(38);

    // Print inorder traversal of the BST
    tree.inorderTraversal();

    System.out.println("=-==========================");

    //Search for an item using recursion.
    boolean keyExists = tree.searchUsingRecursion(30);
    if (keyExists) {
      System.out.println("Key exists!");
    } else {
      System.out.println("Key doesn't exist!");
    }

    System.out.println("=-==========================");
    //Search for an item using iteration.
    keyExists = tree.searchUsingIteration(31);
    if (keyExists) {
      System.out.println("Key exists!");
    } else {
      System.out.println("Key doesn't exist!");
    }

  }
}

