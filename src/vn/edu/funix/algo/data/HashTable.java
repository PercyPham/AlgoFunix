package vn.edu.funix.algo.data;

/** HashTable using Open Addressing */
public class HashTable {
    private static final int TABLE_SIZE = 100;
    private Record[] table = new Record[TABLE_SIZE];

    public void put(Object key, Object value) {
        int hash = key.hashCode();
        int step = 0;
        int idx = calculateIdx(hash, step);
        while (table[idx] != null && !table[idx].getKey().equals(key)) {
            idx = calculateIdx(hash, ++step);
        }
        table[idx] = new Record(key, value);
    }

    public Object get(Object key) {
        int hash = key.hashCode();
        int step = 0;
        int idx = calculateIdx(hash, step);
        while (table[idx] != null && !table[idx].getKey().equals(key)) {
            idx = calculateIdx(hash, ++step);
        }
        return table[idx] != null ? table[idx].getVal() : null;
    }

    public boolean keyExists(Object key) {
        int hash = key.hashCode();
        int step = 0;
        int idx = calculateIdx(hash, step);
        while (table[idx] != null && !table[idx].getKey().equals(key)) {
            idx = calculateIdx(hash, ++step);
        }
        return table[idx] != null;
    }

    private int calculateIdx(int hash, int step) {
        return (hash % TABLE_SIZE + step*step) % TABLE_SIZE;
    }


    private class Record {
        Object key;
        Object val;

        Record(Object key, Object val) {
            this.key = key;
            this.val = val;
        }

        public Object getKey() {
            return key;
        }

        public Object getVal() {
            return val;
        }
    }
}
