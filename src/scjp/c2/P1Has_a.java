package scjp.c2;

class Account {
  private int accountNumber;
  private String accountName;
  private double balance;

  public Account(int accountNumber, String accountName, double balance) {
    this.accountNumber = accountNumber;
    this.accountName = accountName;
    this.balance = balance;
  }

  double getBalance() {
    return balance;
  }
  
}

  class Employee {
    private String name;
    private int employeeNumber;
    private double salary;
    Account account;

    public Employee(String name, int employeeNumber, double salary, Account account) {
      this.name = name;
      this.employeeNumber = employeeNumber;
      this.salary = salary;
      this.account = account;
    }
    
}

public class P1Has_a {
  public static void main(String[] args) {
    Account  account = new Account(12345, "John Doe", 10000.0);
    Employee  employee = new Employee("Jane Doe", 67890, 50000.0, account);

    System.out.println(account.getBalance());
    System.out.println(employee.account.getBalance());
  }  
  
}

