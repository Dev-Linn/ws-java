package application;


import models.entities.Reservation;
import models.entities.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
        System.out.print("Room number");
        int number = sc.nextInt();
        System.out.print("Checking Date (dd/MM/yyyy)");
        Date checking = sdf.parse(sc.next());
        System.out.print("CheckOut Date (dd/MM/yyyy)");
        Date checkOut= sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkOut, checking);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation");
            System.out.println("check-in date (dd/MM/yyyy)");
            checking = sdf.parse(sc.next());
            System.out.println("checkOut date (dd/MM/yyyy)");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checking, checkOut);
            System.out.println("Reservation updated");



        }
        catch (ParseException e) {
            System.out.println("Invalid date format");
        }
        catch (DomainException e) {
            System.out.println("Error in reservation" + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }
    }






    }
