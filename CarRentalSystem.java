/*
Car Rental System
Create a Car class with attributes carId, brandName, model, rentalRate, and available.
Implement constructors for the Car class - one that takes all the attributes as parameters and
another that takes only make, model, and rentalRate as parameters and assigns default values
for carId and available, make more if required.
Create an array of Car objects to represent different rental cars. Use constructor to initialize the
objects, and then display the details of all the available cars for rent.
Create a nethod to calculate the rental cost for car (rentalRate * rentDays) and to print the
invoice if car is rented (Optional).
*/

import java.util.*;

class CarRentalSystem{

        public static void main (String[]args)
        {
                Scanner sc=new Scanner(System.in);
               Car cars[]= new Car[3];
                for(int i=0;i<cars.length;i++)
                {
					System.out.println("Enter "+ i + " Detail : ");
                        System.out.print("Model  : ");
                        String s1=sc.nextLine();
                        System.out.print("Brand :");
                        String s2=sc.nextLine();
                        System.out.print("Rate per day:");
                        int s3 = sc.nextInt();
                        System.out.print("Enter Car price:");
                        int s4 = sc.nextInt();

                     cars[i]=new Car(s1,s2,s3,s4);

                }
                for(int i=0;i<cars.length;i++)
                {
                    cars[i].displayRecord();
                }


                System.out.println("Enter car No:   ");
                int c=sc.nextInt();
                switch(c)
                {
                    case 1:
                    {
                        System.out.println("Enter No. of days :   ");
                        int a=sc.nextInt();
                        cars[0].rentalDays(a);
                        cars[0].invoice();
                        break;

                    }
                    case 2:
                    {
                        System.out.println("Enter No. of days :   ");
                        int a=sc.nextInt();
                        cars[1].rentalDays(a);
                        cars[1].invoice();
                        break;

                    }
                    case 3:
                    {
                        System.out.println("Enter No. of days :   ");
                        int a=sc.nextInt();
                        cars[2].rentalDays(a);
                        cars[2].invoice();
                        break;

                    }

                }

          }
}

class Car{
       String model;
       String brandName;
       int rentalRate;
       String status;
        static int TotalPrice;
        int rentdays;
       Car()
       {
            this.brandName=null;
            this.model=null;
            this.rentalRate=0;
            this.status=null;

       }
       Car(String model,String brandName)
       {
       this.model=model;
       this.brandName=brandName;
       }
      Car(String model,String brandName,int rentalRate,int status)
      {
         this(model,brandName);
         this.rentalRate=rentalRate;
         if(status== 1 ){
         this.status="Booked";
         }else{
             this.status="Available";
         }
      }
      void displayRecord()
      {

         System.out.println("Car Brand  : "+brandName+ "  Model: "+model+"   status : "+status + "  Rate :  "+rentalRate);
      }
      void rentalDays(int a)
      {
          this.rentdays=a;
          this.TotalPrice=rentalRate*a;
      }
      void invoice()
      {
          System.out.println("Thank you for booking car from us ");
          System.out.println("Happy Journey ");
          System.out.println("Car  : "+brandName);
          System.out.println("Model  : "+model);
          System.out.println("Booked For   : "+rentdays +" No. of Days") ;
          System.out.println("Total Worth  : "+TotalPrice);
      }

}

/*
D:\JAVA Workspace\Assignments\Assignment1>java CarRentalSystem.java
Enter 0 Detail :
Model  :gsw483
Brand :huyndai
Rate per day:1200
Enter Car price:675847
Enter 1 Detail :
Model  :ak47
Brand :suzyuki
Rate per day:2000
Enter Car price:593759
Enter 2 Detail :
Model  :maxx
Brand :honda
Rate per day:2000
Enter Car price:984736

Car Brand  : huyndai  Model: gsw483   status : Available  Rate :  1200
Car Brand  : suzyuki  Model: ak47   status : Available  Rate :  2000
Car Brand  : honda  Model: maxx   status : Available  Rate :  2000

Enter car No:
2

Enter No. of days :
10

Thank you for booking car from us
Happy Journey
Car  : suzyuki
Model  : ak47
Booked For   : 10 No. of Days
Total Worth  : 20000
*/