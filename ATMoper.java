import java.util.*;
public class ATMoper{
    ATM atm=new ATM();
    Map<Double,String> Ministmt=new HashMap<>();
    
    public void viewBalance(){
        System.out.println("Available balance is "+atm.getBalance());
    }
    
    public void withdrawAmount(double withdrawAmount){
        if(withdrawAmount%500==0||withdrawAmount%200==0||withdrawAmount%100==0){
            if(atm.getBalance()>=withdrawAmount){
               Ministmt.put(withdrawAmount," Amount has been withdrawn");
               System.out.println("Collect the cash"+withdrawAmount);
               atm.setBalance(atm.getBalance()-withdrawAmount);
               viewBalance();
             }
            else{
               System.out.println("In Sufficient Balance");
            }
        }
        else{
            System.out.println("Enter the amount in multiple of 500 200 100 ");
        }
    }
    
    public void depositAmount(double depositAmount){
        if(depositAmount%500==0||depositAmount%200==0||depositAmount%100==0){
            Ministmt.put(depositAmount," Amount has been Deposited");
            System.out.println(depositAmount+" Deposited Succesfully !!");
            atm.setBalance(atm.getBalance()+depositAmount);
            viewBalance();
        }
        else{
            System.out.println("Enter the amount in the multiples of 500 200 100");
        }
    }
    
    public void viewMiniStatement(){
        for(Map.Entry<Double,String> m:Ministmt.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }

    }
}