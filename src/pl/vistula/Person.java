package pl.vistula;

import java.util.Scanner;

public class Person {


    Scanner sr = new Scanner(System.in);
    String surnameShah56255 , firstNameBhavya56255, street56255 , city56255;
    int zipCode56255;

    void InitiShahze(){
        System.out.println("Please enter your Name: ");
        firstNameBhavya56255 = sr.nextLine();
        System.out.println("Please enter your Surname: ");
        surnameShah56255 = sr.nextLine();
        System.out.println("Please enter your Street name: ");
        street56255 = sr.nextLine();
        System.out.println("Please enter your City: ");
        city56255 = sr.nextLine();
        System.out.println("Please enter your Zip Code: ");
        zipCode56255 = sr.nextInt();
    }

    void printData(){
        System.out.println("Name: "+ firstNameBhavya56255);
        System.out.println("Surname: "+ surnameShah56255);
        System.out.println("Street Name: "+ street56255);
        System.out.println("City: "+ city56255);
        System.out.println("Zip Code: "+ zipCode56255);
    }

}


class Staff extends pl.vistula.Person implements Salary{
    String education , Position;
    void InitiShahze1(){
        InitiShahze();
        System.out.println("Enter your Education: ");
        education = sr.nextLine();
        System.out.println("Enter your Position");
        Position = sr.nextLine();
    }

    void Print1(){
        printData();
        System.out.println("Education: " + education);
        System.out.println("Position: "+ Position);
    }


    @Override
    public void salaryToPayShah56255(int hoursShah56255, int RateShah56255) {

    }

    @Override
    public int salaryForOvertime(int extrahoursShah56255, int rateShah56255) {
        return Salary.super.salaryForOvertime(extrahoursShah56255, rateShah56255);
    }
}

interface Salary{
    void salaryToPayShah56255(int hoursShah56255, int RateShah56255);



    default int salaryForOvertime(int extrahoursShah56255, int rateShah56255){
        int salaryOverTime=extrahoursShah56255 * rateShah56255;
        return salaryOverTime;

    }

    static double bonusCheckShah56255( int yearsOfExpirience){
        double bonusShah56255=0;
        if (yearsOfExpirience>3) bonusShah56255=100;
        else bonusShah56255=0;
        return bonusShah56255;
    };


}


class main {
    public static void main(String[] args) {
        Staff employee = new Staff();
        employee.InitiShahze1();
        employee.Print1();
        employee.salaryToPayShah56255(5,9);
        Salary.bonusCheckShah56255(7);
    }
}
