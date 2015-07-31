package com.builder.impl;

/**
 * Created by will on 7/31/15.
 */
public class Client {
    private String lastName;
    private String firstName;
    private String email;

    //optional
    private String middleName;
    private String address;

    public String getLastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getEmail(){
        return email;
    }
    public String getAddress(){
        return address;
    }
    public String getMiddleName(){
        return middleName;
    }
    private Client(ClientBuilder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
    }
    public static class ClientBuilder{

        private String lastName;
        private String firstName;
        private String email;

        //optional
        private String middleName;
        private String address;
        public ClientBuilder(String first, String last, String email){
            this.firstName = first;
            this.lastName = last;
            this.email = email;
        }
        public ClientBuilder setMiddleName(String middleName){
            this.middleName = middleName;
            return this;
        }
        public ClientBuilder setAddress(String address){
            this.address = address;
            return this;
        }
        public Client build(){
            return new Client(this);
        }
    }
}
