class CardDetailsException extends Exception{
    CardDetailsException(String message){
        super(message);
    } 
}
class swipe{
    void swipecard(int pin,double amount)throws CardDetailsException{
        double initalamount=10000;
        int originalpin=1234;
            if(pin!=originalpin){
                throw new CardDetailsException("invalid pin ");
            }
            if(initalamount<amount){
                throw new CardDetailsException("your amount is insufficient");
            }
            else{
                initalamount-=amount;
                System.out.println("your transaction successful");
            }
    }
}
public class Main{
    public static void main(String[] args){
        swipe x = new swipe();
        int pin=1234;
        double amount=5000;
        try{
        x.swipecard(pin, amount);
        }
        catch(CardDetailsException e){
            System.out.println("error : "+e.getMessage());
        }
    }
}
