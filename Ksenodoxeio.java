import java.io.*;
import java.util.*;
public class Ksenodoxeio
{
    String on_ksenodoxeio;
    int check;
    ArrayList<Dwmatio> rooms = new ArrayList<Dwmatio>();
    ArrayList<Kratisi> reserv = new ArrayList<Kratisi>();
 
    public void prosthiki_dwmatiou(Dwmatio dwm)
    {
        rooms.add(dwm);
    }
    public Dwmatio anaktish_dwmatiou(int kwd)
    {
        boolean exist=false;
       for(int i=0;i<rooms.size();i++)
       {
        if(rooms.get(i).kwd_domatio == kwd)
        {
            check=i;
            exist=true;
        }   
       
       }
       if (exist!=false){
           return rooms.get(check);
        }else
             return null;
    } 
    public Kratisi anaktish_kratisis(int kwd)
    { 
        
       boolean exist=false;
       for(int i=0;i<reserv.size();i++)
       {
        if(reserv.get(i).kwd_kratisis == kwd)
        {
            check=i;
            exist=true;
        }   
       
       }
       if (exist == true){
           return reserv.get(check);
        }else
             return null;
    }
    public boolean prosth_krat_dwmatio(Kratisi kr , int kwd)
    {
      kr.domatio= anaktish_dwmatiou(kwd);
      boolean check1=kr.domatio.prosthiki_kratisis(kr);
      if(kr.domatio !=null && check1 == true)
      { 
          reserv.add(kr);
          System.out.println("Η κράτηση έγινε με επιτυχία, στο δωμάτιο : " + kr.domatio.kwd_domatio);
          return check1;
      }  
      else
            {
                System.out.println("Η κράτηση δεν πραγματοποιήθηκε");
                return check1;
            }
    }
    public int prost_kratisis(Kratisi kr)
    {  
        boolean checko=false;
        int i=0;
        int ck=0;
        do
         {  
                if(rooms.get(i).prosthiki_kratisis(kr)==true)
                 {
                   ck=i;
                   checko=true;
                 }   
              
              else{
                       i=i+1;
                  }
               if(i>=rooms.size())
               {
                   checko=true;
               }
           }while(checko!=true);
            if(checko==true &&i<rooms.size())
            {     
                System.out.println("Η κράτηση έγινε με επιτυχία, στο δωμάτιο : " + rooms.get(ck).kwd_domatio);
    
                 reserv.add(kr);
                 kr.domatio=rooms.get(ck);
                return rooms.get(ck).kwd_domatio;
            }
            else
            {  
                System.out.println("Η κράτηση δεν πραγματοποίηθηκε ");
                return 0;
            }
       }
    public void akirosi_kratisis(int kwd) throws Exception
    {
        if(anaktish_kratisis(kwd) != null && anaktish_kratisis(kwd).domatio.akirosi(kwd)==true)
           {      
               
               try{
                  System.out.println("Η ακύρωση της κράτησης έγινε επιτυχώς με αριθμό :"+anaktish_kratisis(kwd).kwd_kratisis);
                   reserv.remove(anaktish_kratisis(kwd));
                     
                     }catch(NullPointerException e){e.getMessage();}
            }   
        else{
             System.out.println("Η ακύρωση της κράτησης δεν πραγματοποίηθηκε επιτυχώς");
            }
        
      }
    public double ypol_esoda()
    {
        double esoda=0.0;
       for(int i=0;i<rooms.size();i++)
       {
           esoda=esoda + rooms.get(i).timologisi();
           
       } return esoda;
    }
    public double ypol_esoda(int kwd)
    {
        double esoda=0.0;
       for(int i=0;i<rooms.size();i++)
       {
           if(rooms.get(i).kwd_domatio==kwd)
           {
            esoda=esoda + rooms.get(i).timologisi();
           }
       } return esoda; 
        
    }
    public void plano_kratisewn()
    {
        System.out.println("Δωμάτιο"+" "+" "+"01 02 03 04 05 06 07 08 09 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30");
        for(int i=0;i<rooms.size();i++)
        {  if(i<=8){
            System.out.print("   "+rooms.get(i).kwd_domatio+"      ");}
            else
              System.out.print("   "+rooms.get(i).kwd_domatio+"     ");
          for(int j=0;j<30;j++)
          { 
              if(rooms.get(i).diathesimothta[j]==null){
                  System.out.print("_  ");}
              else  
                System.out.print("*  ");
              if(j==29){System.out.println();}
          }
        }
    }
}
