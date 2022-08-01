class MyCalendar {
List<int[]>a;
    public MyCalendar() {
        a=new ArrayList<int[]>();
    }
    
    public boolean book(int start, int end) {
       
        for(int i[]:a){
            if(start>=i[1]||end<=i[0])continue;
            else return false;
            // if(i[0]<end&&end<=i[1])return false;
            
        }
        a.add(new int[]{start,end});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */