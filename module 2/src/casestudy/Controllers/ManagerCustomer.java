package casestudy.Controllers;

import casestudy.commons.read_and_write_file.ReadAndWriteFile;
import casestudy.commons.exception.*;
import casestudy.commons.validate.validatecustomer.ValidateCustomer;
import casestudy.models.person.Customer;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ManagerCustomer {
    public void addCustomer() {
        Scanner scanner = new Scanner(System.in);
        String nameCustomer;
        String birthDay;
        String gender;
        String idCard;
        String phoneNumber;
        String email;
        String customerType;
        String customerAddress;

        do {
            System.out.println("Enter The Customer's Name");
            nameCustomer = scanner.nextLine();
            try {
                ValidateCustomer.validateName(nameCustomer);
                break;
            } catch (NameException e) {
                System.err.println(e.getMessage());
            }
        } while (true);
        do {
            System.out.println("Enter The Customer's Birthday");
            birthDay = scanner.nextLine();
            try {
                ValidateCustomer.validateBirthday(birthDay);
                break;
            } catch (BirthdayException e) {
                System.err.println(e.getMessage());
            }

        } while (true);
        do {
            System.out.println("Enter The Customer's Gender");
            gender = scanner.nextLine();
            try {
                ValidateCustomer.validateGender(gender);
                break;
            } catch (GenderException e) {
                System.err.println(e.getMessage());
            }

        } while (true);
        do {
            System.out.println("Enter The Customer's IdCard");
            idCard = scanner.nextLine();
            try {
                ValidateCustomer.validateIdCard(idCard);
                break;
            } catch (IdCardException e) {
                System.err.println(e.getMessage());
            }
        } while (true);
        do {
            System.out.println("Enter The Customer's Email");
            email = scanner.nextLine();
            try {
                ValidateCustomer.validateEmail(email);
                break;
            } catch (EmailException e) {
                System.err.println(e.getMessage());
            }

        } while (true);
        do {
            System.out.println("Enter The Customer's phoneNumber");
            phoneNumber = scanner.nextLine();
            String regexPhone = "[0]\\d{9}";
            if (phoneNumber.matches(regexPhone)) {
                break;
            }
            System.err.println("The Phone Number must be 10 num");

        } while (true);
        do {
            System.out.println("Enter The Customer Type");
            customerType = scanner.nextLine();
            String regexCustomerType = "(Vip|Business|Normal)";
            if (customerType.matches(regexCustomerType)) {
                break;
            }
            System.err.println("Customer Type must Vip|Business|Normal");
        } while (true);
        do {
            System.out.println("Enter The Customer Address");
            customerAddress = scanner.nextLine();
            String regexCustomerAddress = "[A-Z][a-z]+(\\s[A-Z][a-z]+)*";
            if (customerAddress.matches(regexCustomerAddress)) {

                break;
            }
            System.err.println("Address incorrect, only the first letter must be uppercase, try again !");
        } while (true);
        Customer customer = new Customer(nameCustomer, birthDay, gender, idCard, phoneNumber, email, customerType, customerAddress);
        ReadAndWriteFile.writeCustomer(customer);
    }

    public void showInformationOfCustomer() {
        List<Customer> list = ReadAndWriteFile.readCustomer();
        Collections.sort(list);
        int count = 1;
        System.out.println("----------------------------------------------------------------------" +
                "-----------------------------------------------------------------------------");
        System.out.printf("%-5s%-12s%-14s%-10s%-15s%-15s%-29s%-20s%-20s","NO","NAME","BIRTHDAY","GENDER",
                "ID CARD","PHONE NUMBER","EMAIL","CUSTOMER TYPE","CUSTOMER ADDRESS");
        System.out.println();
        System.out.println();
        for (Customer customer : list){
            System.out.printf("%-5s%-12s%-14s%-10s%-15s%-15s%-29s%-20s%-20s",count++,customer.getNameCustomer(),
                    customer.getBirthDay(),customer.getGender(),customer.getIdCard(),customer.getPhoneNumber(),
                    customer.getEmail(),customer.getCustomerType(),customer.getCustomerAddress());
            System.out.println();
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------------" +
                "-----------------------------------------------------------------------------");

    }
}
