public class Par <F extends Number, S extends Number>{
    F par1;
    S par2;
    public F get_f(){
        return par1;
    }
    public void set_f(F par1){
        this.par1 = par1;
    }
    public S get_S(){
        return par2;
    }
    public void set_s(S par2){
        this.par2 = par2;
    }
}
