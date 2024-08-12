class KthLargest {
    int k;
    int[] nums;
    PriorityQueue<Integer> pq;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        pq = new PriorityQueue<>();
        for(int val : nums){
            add(val);
        }
    }
    
    public int add(int val) {
        pq.add(val);
       if(pq.size()>this.k) pq.remove();
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
