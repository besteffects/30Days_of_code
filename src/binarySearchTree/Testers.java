package binarySearchTree;

public class Testers {
    public static void checkIsEmpty(Tree t) throws Exception{
    // If the tree t is an instance of EmptyBST --> t.isEmpty ->true
    // if the tree t is an instance of NonEmptyBST --> t.isEmpty -> false
    if (t instanceof EmptyBST){
        if(t.isEmpty()){
            throw new Exception("All is good, the tree is an EmptyBST and it is empty");
        }
    } else if(t instanceof NonemptyBST){
        if (!t.isEmpty()){
            throw new Exception("All is good, the tree is a NonEmptyBST and it is non-empty");
        }
    }
    }
}
