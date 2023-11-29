package com.workintech.mobilePhone.model;


 public static void main(String[] args){


        MobilePhone mobilePhone = new MobilePhone("1234567890");

        Contact contact1 = new Contact("Bob", "31415926");
        Contact contact2 = new Contact("Alice", "16180339");
        Contact contact3 = new Contact("Tom", "11235813");
        Contact contact4 = new Contact("Jane", "23571113");

        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);
        mobilePhone.addNewContact(contact3);
        mobilePhone.addNewContact(contact4);

        mobilePhone.printContacts();
        }

