class MedianFinder {
    Queue<Integer> pq1;
    Queue<Integer> pq2;
    public MedianFinder() {
        pq1 = new PriorityQueue<Integer>((a,b)->a-b);
        pq2 = new PriorityQueue<Integer>((a,b)->b-a);
    }
    
    public void addNum(int num) {
        pq2.add(num);
        pq1.add(pq2.remove());
        if(pq1.size()>pq2.size())
            pq2.add(pq1.remove());
    }
    
    public double findMedian() {
        if(pq2.size()>pq1.size())
            return pq2.peek();
        return  (double)(pq1.peek() + pq2.peek())/2;
           
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */