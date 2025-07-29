/*
Problem 2: Account Balance Aggregation

Statement: Given a list of account transactions [{accountId: string, amount: number, type: "DEPOSIT" | "WITHDRAWAL"}], compute the final balance for each account. Ensure withdrawals don’t exceed the current balance (return -1 for invalid cases).
Example:

Input: transactions = [
  {accountId: "A1", amount: 1000, type: "DEPOSIT"},
  {accountId: "A1", amount: 500, type: "WITHDRAWAL"},
  {accountId: "A2", amount: 200, type: "WITHDRAWAL"}
]
Output: { "A1": 500, "A2": -1 }
 */

public class Transactions {

    String accountId;
    int amount;
   TransactionsType type;

    public Transactions(String accountId, int amount, TransactionsType type) {
        this.accountId = accountId;
        this.amount = amount;
        this.type = type;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public TransactionsType getType() {
        return type;
    }

    public void setType(TransactionsType type) {
        this.type = type;
    }
}
