class MyHashMap {

    List<Integer> keys;
    List<Integer> vals;

    public MyHashMap() {
        keys = new ArrayList<>();
        vals = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        int idx = -1;
        for(int i=0;i<keys.size();i++) {
            if (keys.get(i)==key) {
                idx = i;
            } 
        }
        if(idx!=-1) {
            vals.set(idx,value);
            return;
        }
        keys.add(key);
        vals.add(value);
    }
    
    public int get(int key) {
        for(int i=0;i<keys.size();i++) {
            if (keys.get(i)==key) {
                return vals.get(i);
            } 
        }
        return -1;
    }
    
    public void remove(int key) {
        for(int i=0;i<keys.size();i++) {
            if (keys.get(i)==key) {
                keys.remove(i);
                vals.remove(i);
            } 
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */