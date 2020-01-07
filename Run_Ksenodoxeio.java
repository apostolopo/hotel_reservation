import java.util.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Run_Ksenodoxeio
{
    static boolean exit=false;
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static Scanner keyb = new Scanner(System.in);
  static Ksenodoxeio ks1= new Ksenodoxeio();
  static int var;
  public static void main(String args[]) throws Exception
  {
      Dwmatio dom1 = new Dwmatio();
      ks1.prosthiki_dwmatiou(dom1);
      Dwmatio room1 = new Dwmatio();
      ks1.prosthiki_dwmatiou(room1);
      Dwmatio d1 = new Dwmatio();
      ks1.prosthiki_dwmatiou(d1);
      Dwmatio do1 = new Dwmatio();
      ks1.prosthiki_dwmatiou(do1);
      Dwmatio_A doma = new Dwmatio_A();
      ks1.prosthiki_dwmatiou(doma);
      Dwmatio_A doa = new Dwmatio_A();
      ks1.prosthiki_dwmatiou(doa);
      Dwmatio_B domb = new Dwmatio_B();
      ks1.prosthiki_dwmatiou(domb);
      Dwmatio_B dob = new Dwmatio_B();
      ks1.prosthiki_dwmatiou(dob);
      Dwmatio_C domc = new Dwmatio_C();
      ks1.prosthiki_dwmatiou(domc);
      Dwmatio_C doc = new Dwmatio_C();
      ks1.prosthiki_dwmatiou(doc);
      while(exit !=true){
     
      Kratisi kr=new Kratisi((int) Math.ceil(Math.random() * 30),(int) Math.ceil(Math.random() * 30),(int) Math.ceil(Math.random() * 6));
       int kwdi=ks1.prost_kratisis(kr);
       if((int) Math.ceil(Math.random() *4 )== 1)
       {
           int x=(int) Math.floor(Math.random() *ks1.reserv.size());
           while(ks1.reserv.get(x)==null)
           {
             x=(int) Math.ceil(Math.random() *ks1.reserv.size());
            }
           
                ks1.akirosi_kratisis(x);     
       }
       menu();
    }
  }
  public static void menu() throws Exception
  {
      
      System.out.println("1.Επόμενη Επανάληψη"+"\n"+"2.Προσθήκη Κράτησης"+"\n"+"3.Ακύρωση Κράτησης"+"\n"+"4.Προβολή Κρατήσεων"+"\n"+"5.Προβολή Δωματίων"+"\n"+"6.Προβολή Πλάνου"+"\n"+"7.Προβολή Εσόδων"+"\n"+"8.Τερματισμός");
      int choice = keyb.nextInt();
      switch(choice)
      {
        case 1: break;
        case 2: 
               {
                 System.out.println("Δώστε Όνομα για την κράτηση");
                 String name = br.readLine();
                 System.out.println("Μέρα Άφιξης του μήνα");
                 String mera1=br.readLine();
                 int mera=Integer.parseInt(mera1);
                 System.out.println("Μέρες Διαμονής");
                 String meres1=br.readLine();
                 int meres=Integer.parseInt(meres1);
                 System.out.println("Πλήθος Ατόμων");
                 String atoma1=br.readLine();
                 int atoma=Integer.parseInt(atoma1);
                 System.out.println("Γνωρίζεται κωδικό Δωματίου ? Πληκτρολογήστε yes or no");
                 String answer = br.readLine();
                // int answer1=Integer.parseInt(answer);
                   if (answer.equals("yes"))
                    {              
                       System.out.println("Δώστε τον αριθμό δωματίου :?");
                       String kwdi=br.readLine();
                       int kwd=Integer.parseInt(kwdi);
                       Kratisi kr = new Kratisi(name,mera,meres,atoma);
                       boolean check1=ks1.prosth_krat_dwmatio(kr,kwd);
                     }
                  else
                     {
                       Kratisi kr = new Kratisi(name,mera,meres,atoma);
                       int check=ks1.prost_kratisis(kr);
                     }
                    System.out.println();
                    menu();
                    break;
              }
        case 3:
              {
                  System.out.println("Δώστε τον κωδικό της κράτησης για να ακυρωθεί:");
                  String kwdik=br.readLine();
                  int kwdiko=Integer.parseInt(kwdik);
                  ks1.akirosi_kratisis(kwdiko);
                  System.out.println();
                  menu();
                  break;
                
              }
        case 4:
              {
                  for (int i=0; i <ks1.reserv.size(); i++)
                  {
                      System.out.println("Κωδικός Κράτησης :"+ks1.reserv.get(i).kwd_kratisis+"  "+"Όνομα Πελάτη :"+ks1.reserv.get(i).on_pelati+"  "+"Κωδικός Δωματίου :"+ ks1.reserv.get(i).domatio.kwd_domatio);
                  }
                  System.out.println();
                menu();
                break;
              }
        case 5:
              {
                for(int i=0; i<ks1.rooms.size(); i++)
                {
                    System.out.println("Κωδικός Δωματιου :"+ks1.rooms.get(i).kwd_domatio+" "+"Πληρότητα :"+ks1.rooms.get(i).poso_plirotitas()+"%"+" "+"Έσοδα :"+ks1.ypol_esoda(ks1.rooms.get(i).kwd_domatio)+"Euro");
                }
                
                System.out.println();
                menu();
                break;
              }
        case 6: 
              {
                ks1.plano_kratisewn();
                System.out.println();
                menu();
                break;
              }
        case 7:
              {
                System.out.println("Θέλετε να δείτε τα έσοδα για συγκεκριμένο δωμάτιο?: yes or no?");
                String answer = br.readLine();
                if(answer.equals("yes"))
                 {
                     System.out.println("Δώστε τον αριθμό δωματίου :?");
                     String kwdi=br.readLine();
                     int kwd=Integer.parseInt(kwdi);
                     for(int i=0; i<ks1.rooms.size(); i++)
                     {
                        if(ks1.rooms.get(i).kwd_domatio==kwd)
                        {
                            System.out.println("'Εσοδα Δωματίου:"+kwd+ " ="+ks1.ypol_esoda(ks1.rooms.get(i).kwd_domatio)+"Euro");
                        }
                        
                      }
                    
                 }
                 else
                 {
                      System.out.println("Προβολή Εσόδων Ξενοδοχείου :"+ks1.ypol_esoda()+"Euro");
                 }
                System.out.println();
                menu();
                break;
              }
        case 8: 
                {
                    exit=true;
                    System.out.println("Exit Program");
                     break;
                }
      }
    
  }
  
}


