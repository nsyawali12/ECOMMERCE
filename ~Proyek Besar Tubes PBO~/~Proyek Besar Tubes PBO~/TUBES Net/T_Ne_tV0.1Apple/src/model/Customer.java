/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dimas
 */
public class Customer extends Account{
    private int id_customer;
    private List<Transaction> transactions= new ArrayList<>();
    private List<Donation> donations= new ArrayList<>();

    public Customer(String name, String password, String address, String e_mail) {
        super(name, password, address, e_mail);
    }
    
    
    
    public void addDonation(String name, String type_donation, String discription, String date, int count_donation){
       Donation donation = new Donation(name, type_donation, discription, date, count_donation);
       donations.add(donation);
    }
    
    public void addTransaction(String code_transaction, Payment payment){
       Transaction transaction = new Transaction(code_transaction, payment);
       transactions.add(transaction);
    }
}
