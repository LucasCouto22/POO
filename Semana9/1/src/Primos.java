public class Primos extends Thread{
    
    private int comeco;
    private int termino;
    private int quant = 0;
    
    public Primos(int comeco, int termino){
        this.comeco = comeco;
        this.termino = termino;
    }

    public void setComeco(int comeco){
        this.comeco = comeco;
    }

    public int getComeco(){
        return this.comeco;
    }

    public void setTermino(int termino){
        this.termino = termino;
    }

    public int getTermino(){
        return this.termino;
    }

    public int getQuantidade(){
        return this.quant;
    }
    public void run(){
        int quantidade = 0;
        for(int i = this.comeco ; i <= this.termino; i++){
            int divisores = 0;
            for(int divisor = 2; divisor < this.termino; divisor++){
                if(divisor != i){
                    if(i%divisor == 0){
                        divisores++;
                    }
                }
            }
            if(divisores == 0){
             quant++;
            }
        }
        this.quant = quant;
    }
}
