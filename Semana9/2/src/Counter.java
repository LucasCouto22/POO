public class Counter{
    private int count = 0;

    synchronized void increment(){
        
        if(count < 3){
            
            this.count++;
            System.out.println("O contador recebeu um incremento, agora o valor é de : " + Integer.toString(this.count));
            
        }else{
            
            System.out.println("O contador chegou ao seu limite de 3, aguarde que ele diminua!");
            
        }

    }
    
    synchronized void decrement(){
        
        if(count > 0){
            
            this.count--;
            System.out.println("O contador teve um decremento, agora o valor é de : " + Integer.toString(this.count));
            
        }else{
            
            System.out.println("O contador chegou ao seu limite de 0, aguarde que ele aumente!");
            
        }
        
    }
    
}
