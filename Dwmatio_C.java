

public class Dwmatio_C extends Dwmatio
{
   int el_atom=1;
   int el_meres=1;
   
   public boolean prosthiki_kratisis(Kratisi kr)
   {   
       check=0;
       if(kr.afixi+kr.meres_diamonhs -1 <=30)
       {
         for (int i=kr.afixi;i<kr.afixi+kr.meres_diamonhs;i++)
         {
           if((diathesimothta[i-1]== null) && (kr.atoma <= max_atoma) && (kr.atoma >=el_atom))
           {
             check+=1;
           }
        }
      }
       if (check==kr.meres_diamonhs && check>=el_meres&& kr.afixi+kr.meres_diamonhs -1 <=30)
       {
           
           for (int i=kr.afixi;i< (kr.afixi+kr.meres_diamonhs);i++)
           {
               diathesimothta[i-1]=kr;
           }
           
            kr.kwd_kratisiss ++;
            kr.kwd_kratisis=kr.kwd_kratisiss;
           return true;
       }
       else
        {
          
             return false;
        }    
   }
}
