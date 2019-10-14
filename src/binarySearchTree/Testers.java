package binarySearchTree;

public class Testers {
    public static void checkIsEmpty(Tree t) throws Exception {
        // If the tree t is an instance of EmptyBST --> t.isEmpty ->true
        // if the tree t is an instance of NonEmptyBST --> t.isEmpty -> false
        if (t instanceof EmptyBST) {
            if (t.isEmpty()) {
                throw new Exception("All is good, the tree is an EmptyBST and it is empty");
            }
        } else if (t instanceof NonemptyBST) {
            if (!t.isEmpty()) {
                throw new Exception("All is good, the tree is a NonEmptyBST and it is non-empty");
            }
        }
    }

    public static void checkAddMemberCardinality(Tree t, int x) throws Exception{
int nT=(t.add(x).cardinality());
        //1. Either something was added and a cardinality increased by one.
        if(nT==(t.cardinality()+1)){
            if(!t.member(x)){
                throw new Exception("The cardinality increased by 1, but the thing"
                + " that was added was already a member of the tree");
            }
        }//2. Or the thing that was added was alredy there and therefore not really added
        //so the cardinality stayed the same.
        else if (nT==t.cardinality()){
            if(!t.member(x)){
                throw new Exception("The cardinality didn;'t increase by 1, but"
                + " we added a new thing");
            }
        }
        else{
            throw new Exception("Something is wrong with our program");
        }
    }
}
