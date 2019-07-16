package challenges.Hashtable;

import java.util.LinkedList;
import java.util.List;

public class HashTable<K, V> {
    LinkedList<HashNode<K, V>>[] hashtable = new LinkedList[1024];

    // add new node to hashtable
    public void add(String key, V value) {
        int hash = getHash(key);

        // if nothing exists at that key, create a new ll
        if (hashtable[hash] == null) {
            hashtable[hash] = new LinkedList<>();
        }

        // add node
        hashtable[hash].add(new HashNode<K, V>((K) key, value));
    }

    // get - get value of a hashnode at hashed index
    public V getValue(String key) {
        int hash = getHash(key);

        LinkedList<HashNode<K, V>> bucket = hashtable[hash];

        if (bucket != null) {
            for (HashNode<K, V> node : bucket) {
                if (node.key.equals(key)) {
                    return node.value;
                }
            }
        }
        return null;
    }

    // contains - check if hashtable contains key
    public boolean containsKey(String key) {
        int hash = getHash(key);
        if (hashtable[hash] == null) {
            return false;
        }
        return true;
    }

    // hash - create a hash for the key
    public int getHash(String key) {
        int hashkey = 0;
        char[] letters = key.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            hashkey += letters[i];
        }
        hashkey = (hashkey * 599) % hashtable.length;
        return hashkey;
    }
}
