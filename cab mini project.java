package com.cabminiproject;
import java.util.Scanner;

class cab{
    int fare;
    int d;

    public cab(){
        fare = 25;
    }

    public cab(int amt){
        fare = amt;
    }
class ridecab{

    public static void main(String[] args){
        int cd;
        Scanner sc = new Scanner(System.in);

       System.out.println("Distance of cab from user? :");
          
       cd = sc.nextInt();

       if (cd > 5) {
           cab ob = new cab(25 * (cd-5));

           System.out.println("Travelled distance of user ?: ");
           ob.d = sc.nextInt();
           ob.fare += 8*ob.d;

           System.out.println("Hope you had a best ride Yours total fare : " + ob.fare);
       } 
       else {
           cab ob = new cab();

           System.out.println("Travelled distance of user ?: ");
           ob.d = sc.nextInt();
           ob.fare += 10*ob.d;

           System.out.println("Hope you had a best ride Yours total fare : " + ob.fare);
       } 

       sc.close();

           
       }

    }

}
