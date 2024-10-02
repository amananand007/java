package Practice;

import java.time.LocalDateTime;
import java.time.Month;

public class BankAccountHolder {

    public static void main(String[] args) {

        LocalDateTime opened = LocalDateTime.of(2018, Month.JUNE, 29, 06, 30, 00);
        BankAccount account = new BankAccount("Tom", opened, 1000.0f);
        account.toString();
    }
}
