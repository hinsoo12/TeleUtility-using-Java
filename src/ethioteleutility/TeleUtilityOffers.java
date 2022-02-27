
package ethioteleutility;

//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.Scanner;

public class TeleUtilityOffers
{
    static float simBalance = 0.00f;
    final float transferFee = 0.20f;
    
    static float creditAmmount = 0.00f;
    
    
    
    final float creditFee_Of5 = 0.50f;
    final float creditFee_Of10 = 1.00f;
    final float creditFee_Of15 = 1.50f;
    final float creditFee_Of25 = 2.00f;
    final float creditFee_Of50 = 3.00f;
    final float creditFee_Of100 = 5.00f;
    
   // Date date = new Date();
  //  SimpleDateFormat day = new SimpleDateFormat("dd.mm.yyyy");
    
    public TeleUtilityOffers()  // This is Constuctor 
    {
        System.out.println("\tWelcome to Ethio Telecom Utility services.");
        System.out.println("\tSelect 0 any time to navigate back and exit, Please select the following options.");
    }
        // end of costructor.
    
    public void services()   // begging of method which named service.
    {
     Scanner input = new Scanner(System.in);
     
     int askUserPermission;  // The variable that used to ask user for permission.
     int serviceChooser;     // The variable that used to ask user to choose the Tele services.
     
     //TeleUtilityOffers invoking = new TeleUtilityOffers();   // invoking the constructor
     
     
     System.out.println("\t\t\t1.To continue.");
     System.out.println("\t\t\t0.To exit.");
     System.out.print("\t\t\t : ");
     
     try
     {
         
     askUserPermission = input.nextInt();  // Character should have to token by using index at zero.
     
     if(askUserPermission == 1)  // to check whether you enter upper Letteor smaller letter.
     {
        //label:
         do
         {
        System.out.println("\t\tWelcome to Ethio Tele Communication Utility Services.");
        System.out.println("\t\t\tPRESS--> 1. To Check Your Balance.");
        System.out.println("\t\t\tPRESS--> 2. To Recharge Your Account.");
        System.out.println("\t\t\tPRESS--> 3. To Transfer Money.");
        System.out.println("\t\t\tPRESS--> 4. To Request Call Me Back.");
        System.out.println("\t\t\tPRESS--> 5. To Request For Credit.");
        System.out.println("\t\t\tPRESS--> 0. To Exit.");
        System.out.print("\t\t\tENTER YOUR OPTION : ");
      
        serviceChooser = input.nextInt();
        
        switch(serviceChooser)
        {
            case 1:
                checkBalance();
                break;
            case 2:
              reChargeAccount();
                break;
            case 3:
               transferMoney();
                break;
            case 4:
                requestCallMeBack();
                break;
            case 5:
                requestCredit();
                break;
                
            case 0:
                System.out.println("\t\tThank for using our services.");
                System.exit(0);
            default:
                System.out.println("\t\tPlease enter valid input, and try again.");
                services();
                
        }
        
         }
         while(serviceChooser !=0);
        
         
     }
     else if(askUserPermission == 0) //to check whether you enter upper Letteor smaller letter.
     {
        System.out.println("\t\t\tThank for customering with our company."); 
        System.exit(0);  // to exit the whole program.
     }
     else 
     {
         System.out.println("\t\t\tPlease Enter correct input.");
         services();
     }
     
     
     }
     catch(Exception ex)  // cached every time when the input from keyboard is not correct.
     {
         System.out.println("\t\t\tPlease enter appropriate input.");
         TeleUtilityOffers back = new TeleUtilityOffers();
         back.services();
     }
  
    }  
    // end of method that called services.
    
    
    public void checkBalance()
    {
         
        System.out.println("\t\tCheck your balance."); 
        System.out.println("\t\tDear customer your balance is "+simBalance+" birr.");
        System.out.print("\t\twith this balance your account has been expired on.\n");
        System.out.println("");
       // System.out.println("\t\t"+day.format(date));
    }
    
    public void reChargeAccount()
    {
        Scanner input = new Scanner(System.in);
        int card;
        System.out.println("\t\tRecharge your account balance.");
        try
        {
        System.out.print("\t\t\tEnter the ammount of card.");
        card = input.nextInt();
        if(card == 5 || card == 10 || card == 15 || card == 25 || card == 50 || card == 100)
        {
            simBalance = card + simBalance;
            
            System.out.println("\t\tYou succesfully recharge your account with "+card+" birr.");
            System.out.println("\t\tNow your balance is "+simBalance+" birr.Thank you!\n");
            System.out.println("");
         
            
        }
        else
        {
            System.out.println("\t\t\tSorry sir, please enter valid ammount of card.");
            reChargeAccount();
        }
        }
        catch(Exception ex)
        {
            System.out.println("\t\t\tPlease enter valid input.");
            reChargeAccount();
        }
    }
    
    public void transferMoney()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\t\tTransfer money to others."); 
        int transferAmmount;
        String phone;
        try
        {
        System.out.print("\t\tEnter transfer ammount.");
        transferAmmount = input.nextInt();
        System.out.println("");
        System.out.print("\t\tEnter phone number.");
        phone = input.next();
        
        if(transferAmmount<simBalance && simBalance>=1+transferFee)
        {
          
            System.out.print("\t\tPress 1 to confirm.");
            int confirm = input.nextInt();
            if(confirm == 1)
            {
                simBalance = simBalance-transferAmmount - transferFee;
                System.out.println("\t\tYou succesfully transfer "+transferAmmount+" birr to "+phone);
                System.out.println("\t\tNow your balance is "+simBalance+" birr.");
                System.out.println("");
            }
            else
            {
           System.out.println("\t\tPlease enter valid input."); 
           transferMoney();
            }
        }
        else
        {
            System.out.println("\t\tYour balance is too low transfer money to other.");
            
        }
        
        }
        catch(Exception ex)
        {
            System.out.println("\t\tPlease enter valid input.");
            transferMoney();
        }
    }
    
    public void requestCallMeBack()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("\t\tRequest for call me back.");
        System.out.print("\t\tEnter phone number.");
        String phone = input.next();
        if(simBalance<1)
        {
            System.out.println("\t\tYour operation succesfully sent. Thank you.");
            //System.out.println("\t\t Your sent call me back to "+phone);
        }
        else
        {
            System.out.println("\t\tYou can't sent request call me back.");
        }
    }
 
    
    public void requestCredit()
    {
        Scanner input = new Scanner(System.in);
                
        int creditOption;
        
        System.out.println("\t\tRequest for credit.");
        System.out.println("\t\t\t press--> 1. To apply for credit.");
        System.out.println("\t\t\t press--> 2. To get help.");
        System.out.print("\t\t\t\tEnter Here : ");
       
        creditOption = input.nextInt();
        
        if(creditOption == 1)
        {
             System.out.println("\t\t\tEthio Telecom credit provide service");
             System.out.println("\t\t\tpress--> 5. to birr"); 
             System.out.println("\t\t\tpress--> 10. to birr"); 
             System.out.println("\t\t\tpress--> 15. to birr");  
             System.out.println("\t\t\tpress--> 25. to birr");  
             System.out.println("\t\t\tpress--> 50. to birr");  
             System.out.println("\t\t\tpress--> 100. to birr");  
             System.out.print("\t\t\t\tReply here : ");
             
             switch(creditOption)
             {
                 case 1:
                     
                     break;
                 case 2:
                     
                     break;
                 case 3:
                     
                     break;
                 case 4:
                     
                     break;
                 case 5:
                     
                     break;
                 default:
                     System.out.println("\t\tPlease try again.\n");
                     requestCredit();
                  
             }
        }
        
        else if(creditOption == 2)
        {
            System.out.println("\t\t1. To check eligibility"); 
            System.out.println("\t\t2. To view your debt");
            System.out.print("\t\tEnter here : ");
            int helpOption = input.nextInt();
            
            switch(helpOption)
            {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                default:
                    System.out.println("\t\tYou enter invalid input.");
                    requestCredit();
            }
        }
        
        else
        {
            System.out.println("\t\tYour enter invalid input.");
            System.out.println("\t\tPlease try again.");
            requestCredit();
        }
        
    }
}
