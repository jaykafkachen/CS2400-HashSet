# CS2400-HashSet
CS2400 project, hashing algorithms implemented with linear and quadratic probing.

CS2400 - Data Structures and Advanced Programming
Exercise 3: HashSet

A Set is a type of collection that will hold exactly one of any object. The “equals” method of the object will determine if one object is equal to another. If the client program tries to insert two equal items, the set will not store the second one.

A hash set is a set that uses the object’s hashCode function to store and retrieve the items in constant time. Two objects with different keys (objects that are not equal) could generate the same hash code and/or be compressed such that the hash function will generate the same index at which to store those objects (a collision).

In this exercise you must create two classes that implement the provided interface (HashSetInterface) using two different probing methods. You will implement them with an array of type T and of size 157. You do not have to resize this array if it gets full. 

These two hash sets should be called HashSetLP (hash set with linear probing), and HashSetQP (hash set with quadratic probing). 

SEE:
T item = null;
item.hashCode();

ALSO ONLY ACCEPT ONE OF ANY VALUE
scan for the first open index, save it, then keep scanning to see if the value already exists in the array

Use an item’s hashCode function and a compression function that you implement to generate an array index at which to store the item. 

Do not allow more than 31 probing attempts. If you cannot find a location in which to store the item after 31 attempts, return false from the method under execution. Note: Do not alter HashSetInterface in any way.

For a compression algorithm, implement the division method: h2(y) = y mod N.

When an item is removed, you will not need to relocate any items that were entered using linear probing. Instead, when looking for such an item, simply use linear probing for all 31 steps before giving up.

What to submit:
● HashSetLP.java and HashSetQP.java both which implement the provided HashSetInterface.
● Compress the two files into a single zip file entitled, Your_Full_Name_E3.zip. Submit these files via
BlackBoard before the due date. No late submissions will be accepted.
