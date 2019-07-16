package challenges.Hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {

    @Test
    public void add() {
        HashTable table = new HashTable();
        table.add("Levi", 1);

        assertTrue(table.containsKey("Levi"));
    }

    @Test
    public void getValue() {
        HashTable table = new HashTable();
        table.add("Levi", 1);

        assertEquals(1, table.getValue("Levi"));
    }

    @Test
    public void containsKey() {
        HashTable table = new HashTable();
        table.add("Levi", 1);
        assertTrue(table.containsKey("Levi"));
    }

    @Test
    public void containsKeyNull() {
        HashTable table = new HashTable();
        table.add("Levi", 1);
        assertFalse(table.containsKey("levi"));
    }

    @Test
    public void handleCollision() {
        HashTable table = new HashTable();
        table.add("Levi", 1);
        table.add("Kfvi", 2);

        assertEquals(1, table.getValue("Levi"));
        assertEquals(2, table.getValue("Kfvi"));
    }
}