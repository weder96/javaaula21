package PackOCP11JavaClassDesign.Study01.cellphone;

/**
 * Write a description of class Credit here.
 *
 * @author Weder.sousa
 * @version 1.0.0
 */
public class Credit {
    private int balanceCents;

    public Credit() {
        this.balanceCents = 1000;
    }

    public Credit(int initialBalance) {
        if (initialBalance < 0) {
            System.out.println("The initial balance cannot be negative (" + initialBalance + ")");
        } else {
            this.balanceCents = initialBalance;
        }
    }

    public int getBalance() {
        return this.balanceCents;
    }

    public void setBalance(int newBalance) {
        if (newBalance < 0) {
            System.out.println("[setBalance()]: The new balance value cannot be negative (" + newBalance + ")");
        } else {
            this.balanceCents = newBalance;
        }
    }

    public void topUp(int rechargeValue) {
        if (rechargeValue < 0) {
            System.out.println("[topUp()]: The recharge value cannot be negative (" + rechargeValue + ")");
        } else {
            this.balanceCents += rechargeValue;
        }
    }

    public void drawCredit(int drawValue) {
        if (drawValue < 0) {
            System.out.println("[drawCredit()]: The draw value must to be a positive number (" + drawValue + ")");
        } else {
            this.balanceCents -= drawValue;
        }
    }
}
