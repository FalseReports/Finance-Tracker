import java.time.LocalDateTime;

class main {
    public static void main(String[] args) {

        LocalDateTime date = LocalDateTime.now();
        
        Account Greg = new Account("Greg",120.12,Account.Type.CHECKING,"USD",date);

        System.out.println(Greg);

    }
}