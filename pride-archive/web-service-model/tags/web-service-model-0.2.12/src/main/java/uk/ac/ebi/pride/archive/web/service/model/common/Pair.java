package uk.ac.ebi.pride.archive.web.service.model.common;

/**
 * @author florian@ebi.ac.uk
 */
public class Pair<K,V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        setKey(key);
        setValue(value);
    }


    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        if (key == null) {
            throw new IllegalArgumentException("The key of a Pair cannot be null!");
        }
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair pair = (Pair) o;

        if (!key.equals(pair.key)) return false;
        if (value != null ? !value.equals(pair.value) : pair.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = key.hashCode();
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
