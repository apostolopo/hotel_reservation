
public class Dwmatio_B extends Dwmatio_A
{
    int ekp_ana_hmera=10;
    double timh=timh_ana_hmera;
    int j=0;
     public double timologisi()
   {
    
     for(int i=0; i < diathesimothta.length; i++)
        { 
            if(i>j){j=i;}
            if(diathesimothta[i]==null)
            {
                kostos=kostos+0;
            }
            else if(diathesimothta[i]==null && diathesimothta[i]!=diathesimothta[i+1])
            {
                kostos=kostos+timh_ana_hmera;
            }
            else if(diathesimothta[i] != null && diathesimothta[i]==diathesimothta[i+1] && i==j)
            {
                  kostos=kostos+timh_ana_hmera;
                  timh=timh_ana_hmera;
                  j++;
                while(  diathesimothta[j]==diathesimothta[j-1])
                {
                    if(timh>=timh_ana_hmera/2) 
                     { 
                          timh=timh-ekp_ana_hmera;
                          kostos=kostos+timh;
                          j++;
                     }
                   else 
                     {
                       kostos=kostos+timh_ana_hmera/2;
                       j++;
                     }
                }
            
             }
           

        }   
         return kostos;
   }
}