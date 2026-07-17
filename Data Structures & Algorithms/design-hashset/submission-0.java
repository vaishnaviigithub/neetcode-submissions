class MyHashSet {

    List<Integer> set;

    public MyHashSet() {
        set = new ArrayList<>();
    }
    
    public void add(int key) {
        for(Integer x: set) {
            if (key==x) return;
        }
        set.add(key);
    }
    
    public void remove(int key) {
        for(Integer x: set) {
            if (key==x) {
                set.remove(x);
                return;
            }
        }
    }
    
    public boolean contains(int key) {
        for(Integer x: set) {
            if(key==x) return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */