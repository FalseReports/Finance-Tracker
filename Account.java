import java.time.LocalDateTime;
import java.time.format.*;

public class Account {

    private String name;
    private double balance;
    private String currency;
    private LocalDateTime CDate;
    private Type type;

    public enum Type {
        CHECKING, SAVINGS, CREDIT, CASH, INVESTMENT
    }

    public Account(String name, double balance, Type type, String currency, LocalDateTime CDate){

        this.name = name;
        this.balance = balance;
        this.type = type;
        this.currency = currency;
        this.CDate = CDate;    
    }

    private String formatTime(LocalDateTime x){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        return x.format(formatter);
    }

    public String toString(){
        return
            "\n"
            +"Account name: "+name+"\n"+
            "Current balance: "+balance+"\n"+
            "Account Type: "+type+"\n"+
            "Currency: "+currency+"\n"+
            "Date Created: "+formatTime(CDate)+
            "\n";
    }
}