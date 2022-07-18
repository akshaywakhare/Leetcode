class LRUCache {int t; 
Map<Integer,Integer> map;
                int cap;
Map<Integer,Integer> time;
                PriorityQueue<int []> pq;
                
    public LRUCache(int capacity) {
        map=new HashMap<>();
        pq=new PriorityQueue((ak,b)->((int[])ak)[1]-((int[])b)[1]);
        time=new HashMap<>();
        t=0;
        cap=capacity;
    }
    
    public int get(int key) { 
                           
                             
        if(map.containsKey(key)){  
        time.put(key,t); 
            pq.add(new int[]{key,t++});
return map.get(key);}
        
         return -1;
    }
    
    public void put(int key, int value) { 
        map.put(key,value); 
        time.put(key,t);
        pq.add(new int[]{key,t++});
        // a[key]=t++;              
        if(map.size()>cap){
            while(time.get(pq.peek()[0])!=pq.peek()[1]){pq.poll();}
            
            int[] temp=pq.poll();
            time.remove(temp[0]);
            // System.out.println(temp[0]+"smms");
            
            map.remove(temp[0]);
        }
    }
}

/**
  
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 
 */