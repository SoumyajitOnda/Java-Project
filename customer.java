package com.bank.manage;

public class customer {
    private int Account_no;
    private String name;
    private int age;
    private String phone_no;
    private String address;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccount_no() {
        return Account_no;
    }

    public void setAccount_no(int account_no) {
        Account_no = account_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public customer(int account_no, String name, int age, String phone_no, String address, double balance) {
        super();
        Account_no = account_no;
        this.name = name;
        this.age = age;
        this.phone_no = phone_no;
        this.address = address;
        this.balance = balance;
    }

    public customer(String name, int age, String phone_no, String address, double balance) {
        super();
        this.name = name;
        this.age = age;
        this.phone_no = phone_no;
        this.address = address;
        this.balance = balance;
    }

    public customer() {
        super();
    }

    @Override
    public String toString() {
        return "customer{" +
                "Account_no=" + Account_no +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone_no='" + phone_no + '\'' +
                ", address='" + address + '\'' +
                ", balance=" + balance +
                '}';
    }
}
