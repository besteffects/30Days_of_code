package binarySearchTree;

public class EmptyBST<D extends Comparable> implements Tree<D> {
    public EmptyBST() {
    }

    public boolean isEmpty() {
        return true;
    }

    public int cardinality() {
        return 0;
    }

    public boolean member(D elt) {
        return false;
    }

    public NonemptyBST<D> add(D elt) {
        return new NonemptyBST<D>(elt);
    }
}

