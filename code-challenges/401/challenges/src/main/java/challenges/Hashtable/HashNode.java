package challenges.Hashtable;

public class HashNode<K, V> {
    K key;
    V value;
    HashNode next;

    public HashNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setNext(HashNode next) {
        this.next = next;
    }
}
