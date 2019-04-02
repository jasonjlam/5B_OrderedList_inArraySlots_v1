/** 
  OrderedList_inArraySlots
  
  A list with the invariant the elements are in order by
  increasing value, implemented using a
  List_inArraySlots
 */

public class OrderedList_inArraySlots implements OrderedList {

    private List_inArraySlots list_iAS;

    public OrderedList_inArraySlots() {
        list_iAS = new List_inArraySlots();
    }

    /** 
      @return a string representation of this Orderedlist_iAS
     */
    public String toString() {
        return list_iAS.toString();
    }

    public int size() {
      return list_iAS.size();
    }
    
    /** 
      Put @value where it belongs in the list.
      @pre: the list is in increasing order
     */
     public void add( int value) {
         int dest = 0;
         for( ; dest < list_iAS.size() && list_iAS.get( dest) < value
            ; dest++) ;
         // System.out.println( "OL adding " + value
         //                   + " at index " + dest);
         list_iAS.add( dest, value);
     }
     
     // Returns the first time an int occurs in the list.
    public int get( int value){
        // pass-through request
        for (int i = 0; i < list_iAS.size(); i++) {
            if (list_iAS.get(i) == value) {
                  return i;
            }
        }
        return -1;
    }
    
    // Removes the first instance of an int in the list.
    public boolean remove (int val) {
        for (int i = 0; i < list_iAS.size(); i++) {
            if (list_iAS.get(i) == val) {
                  list_iAS.remove(i);
                  return true;
            }
        }
        return false;
    }
    
}
