package Lab2.library;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Library {
    ArrayList<Rent> rents;

    public Library() {
        this.rents=new ArrayList<Rent>();
    }
    public ArrayList<Rent> loadData(){

        for(boolean y=false;y==false;) {
            System.out.println("Vuole inserire un:\n1)Libro\n2)Film\n3)ESCI\n");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            if (i == 1) {
                System.out.println("Inserisci titolo:");
                String title = sc.next();
                System.out.println("Inserisci anno:");
                int anno = sc.nextInt();
                System.out.println("Inserisci pagine:");
                int pagine = sc.nextInt();
                Book b=new Book(title,anno,pagine);
                System.out.println("Inserisci nome:");
                String nome = sc.next();
                System.out.println("Inserisci cognome:");
                String cognome = sc.next();
                Student s=new Student(nome,cognome);
                System.out.println("Inserisci anno inizio:");
                int anno_init = sc.nextInt();
                System.out.println("Inserisci mese inizio:");
                int mese_init = sc.nextInt();
                System.out.println("Inserisci giorno inzio:");
                int giorno_init = sc.nextInt();
                DateTime d1=new DateTime(giorno_init,mese_init,anno_init);
                System.out.println("Inserisci anno fine:");
                int anno_end = sc.nextInt();
                System.out.println("Inserisci mese fine:");
                int mese_end = sc.nextInt();
                System.out.println("Inserisci giorno fine:");
                int giorno_end = sc.nextInt();
                DateTime d2 = new DateTime(giorno_end,mese_end,anno_end);
                Rent r1 = new Rent(s,b,d1,d2);
                rents.add(r1);
            } else if (i == 2) {
                System.out.println("Inserisci titolo:");
                String title = sc.nextLine();
                System.out.println("Inserisci anno:");
                int anno = sc.nextInt();
                System.out.println("Inserisci durata:");
                int durata = sc.nextInt();
                Book b=new Book(title,anno,durata);
                System.out.println("Inserisci nome:");
                String nome = sc.nextLine();
                System.out.println("Inserisci nome:");
                String cognome = sc.nextLine();
                Student s=new Student(nome,cognome);
                System.out.println("Inserisci anno inizio:");
                int anno_init = sc.nextInt();
                System.out.println("Inserisci mese inizio:");
                int mese_init = sc.nextInt();
                System.out.println("Inserisci giorno inzio:");
                int giorno_init = sc.nextInt();
                DateTime d1=new DateTime(giorno_init,mese_init,anno_init);
                System.out.println("Inserisci anno fine:");
                int anno_end = sc.nextInt();
                System.out.println("Inserisci mese fine:");
                int mese_end = sc.nextInt();
                System.out.println("Inserisci giorno fine:");
                int giorno_end = sc.nextInt();
                DateTime d2 = new DateTime(giorno_end,mese_end,anno_end);
                Rent r1 = new Rent(s,b,d1,d2);
                rents.add(r1);
            }else if(i==3)
                y=true;
        }
        return rents;
    }
    public Rent longestRent(){
        int max=0;
        Rent a=new Rent();
        for(Rent re: rents){
            int tot = re.end.giorno - re.begin.giorno;
            if(tot>max) {
                max = tot;
                a=re;
            }
        }
        return a;
    }
}
