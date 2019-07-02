package binarySearchTree;

public interface Tree<D extends Comparable> {
    public boolean isEmpty();

    public int cardinality();

    public boolean member(D elt);

    public NonemptyBST<D> add(D elt);
}
