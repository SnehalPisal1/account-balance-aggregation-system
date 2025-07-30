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


import java.util.*;

public class Aggregation {

    public static void main(String str[]){
        List<Transactions> transactions = new ArrayList<>();

        transactions.add(new Transactions("A1", 1000, TransactionsType.DEPOSIT));
        transactions.add(new Transactions("A1", 500, TransactionsType.WITHDRAWAL));
        transactions.add(new Transactions("A2", 200, TransactionsType.WITHDRAWAL));


        System.out.println(calBalance(transactions));
    }

    public static Map<String,Integer> calBalance(List<Transactions> transactions) {
        Map<String,Integer> result = new LinkedHashMap<>();

        return result;
    }

}
