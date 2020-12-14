public class CounterThread extends Thread {
    private int carimbo;
    Counter counter;

    public CounterThread(int carimbo, Counter counter) {
        this.carimbo = carimbo;
        this.counter = counter;
    }

    public void run() {
        
        if (this.carimbo == 1) {
            
            for (int i = 0; i < 20; i++) {
                
                counter.increment();
                
                try {
                    
                    Thread.sleep((long) (Math.random() * 500));
                    
                } catch (InterruptedException e) {
                    
                    e.printStackTrace();
                    
                }
                
            }
            
        } 
        else {
            
            for (int i = 0; i < 20; i++) {
                
                counter.decrement();
                
                try {
                    
                    Thread.sleep((long) (Math.random() * 500));
                    
                } catch (InterruptedException e) {
                    
                    e.printStackTrace();
                    
                }
                
            }
            
        }
        
    }
    
}

