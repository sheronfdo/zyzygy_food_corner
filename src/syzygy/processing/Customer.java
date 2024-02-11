/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syzygy.processing;

import java.util.HashMap;

/**
 *
 * @author Jamith
 */
public class Customer {

    private static HashMap<String, Customer> CUSTOMER_POOL = new HashMap<>();

    private String customerName;
    private String email;
    private String contactNo;
    private String address;
    private String password;

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    private Customer() {
    }

    private Customer build(Builder builder) {
        Customer customer = CUSTOMER_POOL.get(builder.email);
        if (customer == null) {
            customer = new Customer();
            customer.email = builder.email;
        }
        customer.address = builder.address;
        customer.contactNo = builder.contactNo;
        customer.customerName = builder.customerName;
        customer.password = builder.password;
        CUSTOMER_POOL.put(customer.email, customer);
        return customer;
    }

    public static Customer getCustomer(String email, String password) {
        Customer customer = CUSTOMER_POOL.get(email);
        if (customer.getPassword().equals(password)) {
            return customer;
        }
        return null;
    }

//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setContactNo(String contactNo) {
//        this.contactNo = contactNo;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
    @Override
    public String toString() {
        return "Customer{" + "customerName=" + customerName + ", email=" + email + ", contactNo=" + contactNo + ", address=" + address + ", password=" + password + '}';
    }

    public static Builder Builder() {
        return new Builder();
    }

    public static class Builder {

        private String customerName;
        private String email;
        private String contactNo;
        private String address;
        private String password;

        public Builder setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setContactNo(String contactNo) {
            this.contactNo = contactNo;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Customer build() {
            return new Customer().build(this);
        }
    }

}
