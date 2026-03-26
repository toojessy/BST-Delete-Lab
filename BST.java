public class BST<E extends Comparable<E>> implements Tree<E> {

    // ── Inner node class ─────────────────────────────────────────────────
    protected static class TreeNode<E> {
        E element;
        TreeNode<E> left;
        TreeNode<E> right;

        TreeNode(E e) {
            element = e;
            left  = null;
            right = null;
        }
    }

    // ── Fields ───────────────────────────────────────────────────────────
    protected TreeNode<E> root;
    protected int size;

    // ── Constructor ──────────────────────────────────────────────────────
    public BST() {
        root = null;
        size = 0;
    }

    // ── Search ───────────────────────────────────────────────────────────
    @Override
    public boolean search(E e) {
        // TODO: return true if e is in the tree, false otherwise
        // follow the invariant from root; return false when current is null
        return false; // replace this
    }

    // ── Insert ───────────────────────────────────────────────────────────
    @Override
    public boolean insert(E e) {
        // TODO: insert e into the correct position
        // return false if e is already in the tree (duplicate)
        // return true if inserted successfully
        // remember to increment size
        return false; // replace this
    }

    // ── Delete ───────────────────────────────────────────────────────────
    @Override
    public boolean delete(E e) {
        // TODO: remove e from the tree
        // handle all three cases: leaf, one child, two children
        // return false if e is not found
        // return true if deleted successfully
        // remember to decrement size
        return false; // replace this
    }

    // ── Traversals ───────────────────────────────────────────────────────
    @Override
    public void inorder() {
        inorder(root);
    }

    private void inorder(TreeNode<E> node) {
        // TODO: implement inorder traversal (left -> visit -> right)
        // base case: if node is null, return
    }

    @Override
    public void preorder() {
        preorder(root);
    }

    private void preorder(TreeNode<E> node) {
        // TODO: implement preorder traversal (visit -> left -> right)
        // base case: if node is null, return
    }

    @Override
    public void postorder() {
        postorder(root);
    }

    private void postorder(TreeNode<E> node) {
        // TODO: implement postorder traversal (left -> right -> visit)
        // base case: if node is null, return
    }

    // ── Size / Empty ─────────────────────────────────────────────────────
    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
