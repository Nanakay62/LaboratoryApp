package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
                Scanner detail = new Scanner(System.in);
                System.out.println("Enter your full name: ");
                System.out.println("Enter your date of birth: ");
                System.out.println("Nationality: ");
                System.out.println("Phone Number: ");
                System.out.println("Email: ");
                System.out.println("Address: ");
                System.out.println("Gender: ");
                System.out.println("Medical History: ");

//inputs
                String name = detail.nextLine();
                int date_of_birth = Integer.parseInt(detail.nextLine());
                String nationality = detail.nextLine();
                int number = Integer.parseInt(detail.nextLine());
                String email = detail.nextLine();
                String address = detail.nextLine();
                String gender = detail.nextLine();
                String history = detail.nextLine();

//outputs
                System.out.println("Name: " + name);
                System.out.println("Date of birth: " + date_of_birth);
                System.out.println("Nationality: " + nationality);
                System.out.println("Phone Number: " + number);
                System.out.println("Email:" + email);
                System.out.println("Address: " + address);
                System.out.println("Gender: " + gender);
                System.out.println("Medical History: " + history);
                System.out.println("Thank you for entering your details.");


            }
        }

