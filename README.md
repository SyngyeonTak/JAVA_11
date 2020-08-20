# JAVA_11

## marker

* A marker interface is an interface that has no methods or constants inside it. It provides run-time type information about objects, so the compiler and JVM have additional information about the object.<br><br>

* A marker interface is also called a tagging interface.<br><br>

* Though marker interfaces are still in use, they very likely point to a code smell and should be used carefully. The main reason for this is that they blur the lines about what an interface represents since markers don't define any behavior. Newer development favors annotations to solve some of the same problems.<br><br>

* Custom Marker Interface
Let's create our own marker interface.

For example, we could create a marker that indicates whether an object can be removed from the database:<br>

  1. public interface Deletable {}<br><br>
In order to delete an entity from the database, the object representing this entity has to implement our Deletable marker interface:<br>

1. public class Entity implements Deletable {<br>
    // implementation details
}<br><br>
Let's say that we have a DAO object with a method for removing entities from the database. We can write our delete() method so that only objects implementing our marker interface can be deleted:<br>

1. public class ShapeDao {<br><br>
 
    // other dao methods
 
    public boolean delete(Object object) {<br>
        if (!(object instanceof Deletable)) {<br>
               return false;<br>
        }<br><br>
 
        // delete implementation details
        
        return true;
    }<br>
}<br><br>
As we can see, we are giving an indication to the JVM, about the runtime behavior of our objects. If the object implements our marker interface, it can be deleted from the database.

citation: baeldung, Marker Interfaces in Java<br>
https://www.baeldung.com/java-marker-interfaces
