public class Fraction {
    public int topN;
    public int btmN;
    public String toFraction(){
        return String.format ("%s/%s", topN, btmN);
    }
    public String toFloat(){
        double x = (double) topN/btmN;
        return x+"";
    }
    public void addFraction(Fraction f){
        if(btmN == f.topN){
            topN = topN+f.topN;
        }else{
            topN = topN * f.btmN +f.topN*btmN;
            btmN = btmN*f.btmN;
        }
    }
}
