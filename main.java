import java.util.*;
class main{
    public static void main(String[] args){
        ATMoper op=new ATMoper();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ATM number");
        int atmnumber=sc.nextInt();
        System.out.println("Enter the PIN Number");
        int pin=sc.nextInt();
        if((atmnumber==12408||atmnumber==12415) && (pin==1519)){
            System.out.println("Welcome to ATM");
            while(true){
                System.out.println("1.Check Balance \n2.Withdrawn Amount \n3.Deposit Amount \n4.Get Mini Statement \n5.EXIT");
                System.out.println("Enter choice");
                int choice=sc.nextInt();
                if(choice==1){
                    op.viewBalance();
                }
                else if(choice==2){
                    System.out.println("Enter the amount to be withdrawn");
                    double withdrawAm=sc.nextDouble();
                    op.withdrawAmount(withdrawAm);
                }
                else if(choice==3){
                    op.viewMiniStatement();
                }
                else if(choice==4){
                    System.out.println("Collect Your Card");
                    System.exit(0);
                }
                else{
                    System.out.println("Please Enter the correct Option");
                }
            }
        }
    }
}