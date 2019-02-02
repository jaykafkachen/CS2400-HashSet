public class HashSetLP<T> implements HashSetInterface<T> {
    
    T[] set;
    int numItems;

    public HashSetLP()
    {
      set = (T[]) new Object[157];
      numItems = 0;
    }

    /** Gets the current number of entries in this set.
     @return  The integer number of entries currently in the set. */
    public int size()
    {
      return numItems;
    }

    /** Sees whether this set is empty.
     @return  True if the set is empty, or false if not. */
    public boolean isEmpty()
    {
      return numItems == 0;
    }

    /** Retrieves all entries that are in this set.
     @return  A newly allocated array of all the entries in the set.
     Note: If the set is empty, the returned array is empty. */
    public T[] toArray()
    {
      T[] arr = (T[]) new Object[numItems];
      int i=0;
      for(T item:set)
      {
        if(item!=null)
          arr[i++] = item;
      }
      return arr;
    }

    /** Removes all entries from this bag. */
    public void clear()
    {
      set = (T[]) new Object[157]; //dumps all previous data, creates new arr
    }

    private int h2(int code)
    {
      return Math.abs(code)%157;
    }

    /** Adds a new entry to this bag.
     @param item  The object to be added as a new entry.
     @return  True if the addition is successful, or false if not. */
    public boolean add(T item)
    {
      int code = 0;
      int temp = 0;
      boolean found = false;
      for(int i=0;i<157;i++)
      {
        code = h2(item.hashCode()+i); //will return unmodded hash for first loop run
        if(set[code]==null && found == false && i<31)
        {
          temp = code;
          found = true;
        }
        if(set[code]!=null && set[code].equals(item))
          return false;  
      }
      if(found==true)
      {
        numItems++;
        set[temp] = item;
        return true;
      }
      return false;
    }

    /** 
     @return  Either the removed entry, if the removal.
     was successful, or null. */
    public T remove(T item)
    {
      int code = 0;
      for(int i=0;i<31;i++)
      {
        code = h2(item.hashCode()+i); //will return unmodded hash for first loop run
        if(set[code]!=null && item.equals(set[code])) 
        {
          T removed = set[code];
          set[code] = null;
          numItems--;
          return removed; 
        }
      }
      return null;
    }

    /** Tests whether this set contains a given entry.
     @param item  The entry to locate.
     @return  True if the set contains anEntry, or false if not. */
    public boolean contains(T item)
    {
      int code = 0;
      for(int i=0;i<31;i++)
      {
        code = h2(item.hashCode()+i); //will return unmodded hash for first loop run
        if(set[code]!=null && item.equals(set[code])) 
          return true;
      }
      return false;
    }
}
