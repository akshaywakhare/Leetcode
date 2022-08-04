class MyCalendar {
TreeMap<Integer,Integer> map;
    public MyCalendar() {
        // a=new ArrayList<int[]>();
    map=new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
       
        Integer  lk=map.lowerKey(end);
        if(lk==null||map.get(lk)<=start){
            map.put(start,end);
            return true;
        }return false;
}
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */