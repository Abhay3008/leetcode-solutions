class MyHashMap {
    int[] arr;
    int size = (int)Math.pow(10, 6)+1;
    public MyHashMap() {
        arr = new int[size];
        for(int i = 0;i<arr.length;i++)
            arr[i] = -1;
    }
    
    public void put(int key, int value) {
        arr[key] = value;
    }
    
    public int get(int key) {
        return arr[key]!=-1?arr[key]:-1;
    }
    
    public void remove(int key) {
        arr[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */