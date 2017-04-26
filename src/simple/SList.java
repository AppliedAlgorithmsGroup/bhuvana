package simple;

/**
 * Given a sorted linked list of items - remove duplicates.
 * For example given 1 -> 2 -> 2 -> 2 -> 3
 * Return 1 -> 2 -> 3 destructively
 */


public class SList {

    public int val = 2;
    public SList tail;

    private class hello {

        private void helll(){
            removeDuplicates(null);
        }

    }

    public SList(int val, SList tail) {

        //this.val = val;
        this.tail = tail;

    }




    public static void removeDuplicates(SList node){

//        if(node == null){
//            return;
//        }
//
//
//        SList current = node.tail;
//        SList previous = node;
//        while(current != null){
//
//            if(current.val == previous.val){
//                previous.tail = current.tail;
//            }else{
//                previous = current;
//            }
//            current = previous.tail;
//
//        }

        System.out.println("SList");

    }

}