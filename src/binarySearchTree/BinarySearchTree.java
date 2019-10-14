package binarySearchTree;

public class BinarySearchTree {

    public static void main(String[] args) throws Exception {
        EmptyBST e = new EmptyBST();
        NonemptyBST n = new NonemptyBST(5);
//        Testers.checkIsEmpty(e);
//        Testers.checkIsEmpty(n);
//        Testers.checkIsEmpty(e);
//        Testers.checkIsEmpty(n);
//        Testers.checkIsEmpty(e);
//        Testers.checkIsEmpty(n);

        Testers.checkAddMemberCardinality(e, 5);
        Testers.checkAddMemberCardinality(n, 5);
        Testers.checkAddMemberCardinality(n, 6);
    }
}
