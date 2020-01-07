
public class Dwmatio_A extends Dwmatio
{
   double timh_ana_hmera=50.0;
   
   public double timologisi()
   { 
        for(int i=0; i < diathesimothta.length; i++)
        {   
            if(diathesimothta[i] != null)
            {
                kostos=kostos+timh_ana_hmera;
            }
            else 
                kostos+=0;
                
        }
        return kostos;
   }
}
