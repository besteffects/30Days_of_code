package binarySearchTree;

class NonemptyBST<D extends Comparable> implements Tree<D> {
    D data;
    Tree<D> left;
    Tree<D> right;

    public NonemptyBST(D elt) {
        data = elt;
        left = new EmptyBST<D>();
        right = new EmptyBST<D>();
    }

    public NonemptyBST(D elt, Tree<D> leftTree, Tree<D> rightTree) {
        data = elt;
        left = leftTree;
        right = rightTree;
    }

    public boolean isEmpty() {
        return false;
    }

    public int cardinality() {
        return 1 + left.cardinality() + right.cardinality();
    }

    public boolean member(D elt) {
        if (data == elt) {
            return true;
        } else {
            if (elt.compareTo(data) < 1) {
                return left.member(elt);
            } else {
                return right.member(elt);
            }
        }
    }

    public NonemptyBST<D> add(D elt) {
        if (data == elt) {
            return this;
        } else {
            if (elt.compareTo(data) < 0) {
                return new NonemptyBST(data, left.add(elt), right);
            } else {
                return new NonemptyBST<>(data, left, right.add(elt));
            }
        }
    }
}
