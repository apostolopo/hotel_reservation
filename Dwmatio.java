import java.io.*;
import java.util.*;
import java.util.Arrays;
public class Dwmatio
{
    static int kwd_domatioo;
    int kwd_domatio;
   int max_atoma;
   int check=0;
   int meres;
   int pososto;
   double kostos=0;
   Kratisi diathesimothta[]= new Kratisi[30];
   double timh_atomo;
   public Dwmatio()
   {
       kwd_domatioo ++;
       kwd_domatio=kwd_domatioo; 
       max_atoma=6;
       timh_atomo=25;
    }
   
   public boolean prosthiki_kratisis(Kratisi kr) throws NullPointerException

   {    
       check=0;
       if(kr.afixi+kr.meres_diamonhs -1 <=30)
       {
         for (int i=kr.afixi;i < (kr.afixi+kr.meres_diamonhs);i++)
          {try{
             if(diathesimothta[i-1]== null && kr.atoma <= max_atoma)
             {
                 check+=1;
             }
            }catch(NullPointerException e){e.getMessage();}
           }
        }
         if (check==kr.meres_diamonhs && kr.afixi+kr.meres_diamonhs -1 <=30)
         {
          // System.out.println("Η κράτηση πραγματοποιήθηκε επιτυχώς ");
           for (int i=kr.afixi;i < (kr.afixi+kr.meres_diamonhs);i++)
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
  
   public boolean akirosi(int kwd_kratis) throws Exception
   {
       for(int i=0; i<diathesimothta.length; i++)
       {
         try{
           if(diathesimothta[i].kwd_kratisis == kwd_kratis )
           { 
               diathesimothta[i]= null;
            
           }
           }catch(NullPointerException e){e.getMessage();}
       }
       return true;
   }
   public double poso_plirotitas() //throws Exception
   {    meres=0;
        for(int i=0; i < diathesimothta.length; i++)
        {
            if(diathesimothta[i] != null)
            {
                meres +=1;
            }
        }
        pososto=(meres*100)/diathesimothta.length;
        return pososto;
   }
   public double timologisi()
   {   kostos=0;
        for(int i=0; i < diathesimothta.length; i++)
        {   
            if(diathesimothta[i] != null)
            {
                kostos=kostos+diathesimothta[i].atoma*timh_atomo;
            }
            else 
                kostos+=0;
                
        }
        return kostos;
   }  
}

