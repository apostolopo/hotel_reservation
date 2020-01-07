
public class Kratisi
{
    String on_pelati;
    static int kwd_kratisiss;
    int kwd_kratisis;
    int afixi,meres_diamonhs,atoma;
    Dwmatio domatio=new Dwmatio();
    public Kratisi()
    {
       
        on_pelati=" ";
        
    }
    public Kratisi(String on_pelati,int afixi,int meres_diamonhs,int atoma)
    {

        this.on_pelati=on_pelati;
        this.afixi=afixi;
        this.meres_diamonhs=meres_diamonhs;
        this.atoma=atoma;
    }
     public Kratisi(int afixi,int meres_diamonhs,int atoma)
    {

        on_pelati="Luck";
        this.afixi=afixi;
        this.meres_diamonhs=meres_diamonhs;
        this.atoma=atoma;
    }

    public void Room(Dwmatio domatio)
    {
        this.domatio=domatio;
    }
   
}
