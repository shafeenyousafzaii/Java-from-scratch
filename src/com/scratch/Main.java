package com.scratch;
import java.security.PublicKey;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//        System.out.println();
//// First Java App loop lol . 
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        Creating first variable in JAVA 
//        int number=100;
//        float num=number;
//        double num2=number;
//        byte numm=120;
//        System.out.println(numm);
//        String Name="Muhammad Shafeen";
//        System.out.println(Name+" "+number);
//        System.out.println(num+" "+num2);
//        Date date=new Date();
//        System.out.println(date);
//        System.out.println(123_456_789);
        
//        Person person=new Person("Shafeen");
//        System.out.println(person.name);
//        System.out.println(person.name.toUpperCase());
//    String []array = new String[10];
//    for (int i = 0; i<array.length; i++) {
//        array[i]=i+"";
//    }
//        String []array2 = new String[10];
//        for (int i = 0; i<array.length; i++) {
//            String input = String.valueOf(new Scanner(System.in));
//            array2[i] = input.wait();
//        }
//        String [] name={"Shafeen","Khan"};
//    System.out.println(Arrays.toString(name));
//    System.out.println(Arrays.toString(array));
//    
//    Arrays.stream(array).forEach(System.out::println);
//    Scanner scanner=new Scanner(System.in);
//    String namee=scanner.nextLine();
//    System.out.println(namee);
//    Scanner new_scanner=new Scanner(System.in);
//    int age=new_scanner.nextInt();
//        LocalDate ageinyears=LocalDate.now().minusYears(age);
//        System.out.println("Born in year : " + ageinyears.getYear());
//        char [] array={'a','b','c','d','e','f','g','b','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
//        Scanner scanner=new Scanner(System.in);
//        System.out.println(Arrays.toString(array));
//        System.out.println("Enter any letter that you wanna find in the array");
////        String x=scanner.next().charAt(0);
//        int occurance=count_occur(array,'b');
//        System.out.println("The letter b occurs : " + occurance + " times");
//        
        
        // just checking commits and pushes from intelliJ
        
        
        Person person=new Person("Muhammad Shafeen",22,100,5.10F,"Pakistan","Matric","Pakistan");
        person.setname("Muhammad Shafeen");
        person.setage(22);
        person.setSalary(100);
        person.setHeight(5.10F);
        person.setaddress("Pakistan");
        person.setEducation("BSAI");
        person.setjobaddress("Pakistan");
        Person person1=new Person();
        person1.setname("Rehman");
        person1.setage(25);
        person1.setHeight(5.11F);
        person1.setaddress("Pakistan");
        person1.setEducation("BBA");
        person1.setjobaddress("Pakistan");
        Passport one=new Passport();
        one.setPassportnumber(16202_456151_9D);
        one.setIssueDate(LocalDate.of(2015,9,12));
        one.setExpireDate(LocalDate.now().plusDays(100));
        
        System.out.println(person.getname() + " has Passport number : "+ one.getPassportnumber() + " With an issue date of : "+ one.getIssueDate() + " And expiry date of "+ one.getExpireDate());
        System.out.println(person.getname() + "Has age "+ person.getage()+ " Has height"+ person.getheight()+ " Has address "+ person.getaddress() + " Has educatoin "+ person.getEducation());
        
        
    }
    public static int count_occur(char [ ]aarray,char letter) {
        int count=0;
        for (char let:aarray) {
            if(let == letter) {
                count+=1;
            }
        }
        return count;
    
    
    }




    }

