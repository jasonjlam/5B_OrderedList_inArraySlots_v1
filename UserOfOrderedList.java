/**
  test OrderedList
 */

public class UserOfOrderedList {
    public static OrderedList_inArraySlots orderedList =
      new OrderedList_inArraySlots();

    public static void main(String[] commandLine) {
        System.out.println( orderedList);
        System.out.println( System.lineSeparator());

        addOne( "populate an empty list"
               , 0
               ,"[0,]"
               );

        addOne( "add an element that belongs at the front"
               , -11
               ,"[-11,-10,]"
               );

        addOne( "add an element that belongs at the back"
               , 5
               ,"[-11,-10,5,]"
               );

        addOne( "add an element that belongs somewhere in the middle"
               , 2
               ,"[-11,0,2,5,]"
               );

        addOne( "add an element that is the same as another element"
               , 0
               ,"[-11,0,0,2,5,]"
               );

        removeOne( "remove an element"
               , 2 
               ,"[-11,0,0,5,]"
               );
        removeOne( "remove an element that doesnt exist"
               , 4
               ,"[-11,0,0,5,]"
               );
        removeOne( "remove a duplicate"
               , 0
               ,"[-11,0,5,]"
               );
        addOne( "add back a duplicate"
               , 0
               ,"[-11,0,0,5,]"
               );

        getOne( "get an element"
               , -11 
               ,"0"
               );
        getOne( "get an element that is not in the list"
               , 4 
               ,"-1"
               );
        getOne( "get a duplicate element"
               , 0 
               ,"1"
               );
        
    }

    
    /**
      run one test
     */
    private static void check( String description
                              , int value
                              , String expect
                              ) {

        // check 
        System.out.println( 
            "result:   "
          + orderedList
          + " ...expecting "
          + expect
          + System.lineSeparator());
     }
     
     private static void addOne( String description,
                                 int value,
                                 String expect
                                 ) {
        System.out.println( description);
        orderedList.add( value);
        check(description, value, expect);
                                 }
                                 
     private static void removeOne( String description,
                                 int value,
                                 String expect
                                 ) {
        System.out.println( description);
        orderedList.remove( value);
        check(description, value, expect);
                                 }
                                 
     private static void getOne( String description,
                                 int value,
                                 String expect
                                 ) {
        System.out.println( description);
        System.out.println(orderedList.get( value));
        check(description, value, expect);
                                 }

}    
