public class main {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "World";

        // Concatenation
        String s3 = s1 + " " + s2;
        System.out.println("Concatenation: " + s3);

        // Comparison
        System.out.println("Compare: " + s1.equals(s2));

        // Reversal using StringBuffer
        StringBuffer sb = new StringBuffer(s3);
        System.out.println("Reverse (StringBuffer): " + sb.reverse());

        // Performance comparison
        long start, end;

        // String
        start = System.nanoTime();
        String a = "Java";
        for (int i = 0; i < 1000; i++) {
            a = a + "x";
        }
        end = System.nanoTime();
        System.out.println("String time: " + (end - start));

        // StringBuffer
        start = System.nanoTime();
        StringBuffer sbf = new StringBuffer("Java");
        for (int i = 0; i < 1000; i++) {
            sbf.append("x");
        }
        end = System.nanoTime();
        System.out.println("StringBuffer time: " + (end - start));

        // StringBuilder
        start = System.nanoTime();
        StringBuilder sbd = new StringBuilder("Java");
        for (int i = 0; i < 1000; i++) {
            sbd.append("x");
        }
        end = System.nanoTime();
        System.out.println("StringBuilder time: " + (end - start));
    }
}
// class Employee {
//     public String name;        // accessible everywhere
//     private double salary;     // hidden (only inside class)
//     protected String dept;     // accessible in same package/subclass

//     Employee(String name, double salary, String dept) {
//         this.name = name;
//         this.salary = salary;
//         this.dept = dept;
//     }

//     void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Salary: " + salary);
//         System.out.println("Department: " + dept);
//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         Employee e1 = new Employee("Aileen", 50000, "IT");

//         e1.display();
//     }
// }



// class Product {
//     int id;
//     String name;

//     // static members (common for all objects)
//     static String company = "ABC Pvt Ltd";
//     static String gst = "27ABCDE1234F1Z5";

//     Product(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     void display() {
//         System.out.println(id + " " + name + " " + company + " " + gst);
//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         Product p1 = new Product(1, "Laptop");
//         Product p2 = new Product(2, "Mobile");
//         Product p3 = new Product(3, "Tablet");

//         p1.display();
//         p2.display();
//         p3.display();
//     }
// }




//19
// import java.util.*;

// public class main {
//     public static void main(String[] args) {

//         // ArrayList (Products)
//         ArrayList<String> products = new ArrayList<>();
//         products.add("Laptop");
//         products.add("Mobile");
//         products.add("Tablet");

//         // HashSet (Categories)
//         HashSet<String> categories = new HashSet<>();
//         categories.add("Electronics");
//         categories.add("Gadgets");

//         // HashMap (Product - Price)
//         HashMap<String, Integer> price = new HashMap<>();
//         price.put("Laptop", 50000);
//         price.put("Mobile", 20000);
//         price.put("Tablet", 15000);

//         // Iterator for ArrayList
//         System.out.println("Products:");
//         Iterator<String> it1 = products.iterator();
//         while (it1.hasNext()) {
//             System.out.println(it1.next());
//         }

//         // Iterator for HashSet
//         System.out.println("\nCategories:");
//         Iterator<String> it2 = categories.iterator();
//         while (it2.hasNext()) {
//             System.out.println(it2.next());
//         }

//         // Iterator for HashMap
//         System.out.println("\nProduct Prices:");
//             for (String key : price.keySet())
//             System.out.println(key + " : " + price.get(key));
//     }
// }






















// ArrayList<String> product=new ArrayList<>();
// product.add("");
// Iterator<String> it1 = products.iterator();
//         while (it1.hasNext()) {
//             System.out.println(it1.next());
//         }
// HashMap<String, Integer> price = new HashMap<>();
// price.put("Laptop", 50000);


// for(String key:)
// sop(key+)
//18// import java.io.*;
// import java.util.*;

// public class main {
//     public static void main(String[] args) throws Exception {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Name: ");
//         String name = sc.nextLine();

//         System.out.print("Marks: ");
//         int marks = sc.nextInt();

//         String data = name + " " + marks;

//         // BYTE STREAM WRITE
//         FileOutputStream fos = new FileOutputStream("byte.txt");
//         fos.write(data.getBytes());
//         fos.close();

//         // BYTE STREAM READ
//         System.out.println("\nByte File:");
//         FileInputStream fis = new FileInputStream("byte.txt");
//         int i;
//         while ((i = fis.read()) != -1)
//             System.out.print((char) i);
//         fis.close();

//         // CHARACTER STREAM WRITE
//         FileWriter fw = new FileWriter("char.txt");
//         fw.write(data);
//         fw.close();

//         // CHARACTER STREAM READ
//         System.out.println("\n\nChar File:");
//         FileReader fr = new FileReader("char.txt");
//         while ((i = fr.read()) != -1)
//             System.out.print((char) i);
//         fr.close();

//         sc.close();
//     }
// }
// //16
// import java .util.*;
// class lowattendance extends Exception {
//     lowattendance(String msg){
//         super(msg);
//     }
// }
// class insufficientbal extends Exception{
//     insufficientbal(String msg){
//         super(msg);
//     }
// }
// class main {
//     public static void main (String[]args){
//         int balance =3000;
//         Scanner sc =new Scanner(System.in);
//         try{
//             System.out.println("enter attendance ");
//             int att=sc.nextInt();
//             if (att<75) throw new lowattendance("not elligible");
//             else System.out.println("eligible");
//             System.out.println("enter withrawal amt");
//             int amt= sc.nextInt();
//             if (amt>balance)throw new insufficientbal("insufficient balance ");
//             else System.out.println("success");
//         }catch(Exception e){
//             System.out.println(e.getMessage());
//         }
//     }
// }
//15
// import java.util.*;
// class main {
//     public static void main (String []args){
//         int balance =3000;
//         Scanner sc= new Scanner (System.in);
//         try{
//             System.out.print("Enter amount: ");
//             int amt=sc.nextInt();
//             if (amt<0) throw new IllegalArgumentException();
//             if (amt>balance) throw new ArithmeticException();
//                 balance=balance-amt;
//                 System.out.println("suceesess! "+amt+"withdrawn remaining balance "+balance);
            
//         }catch(InputMismatchException e){
//             System.out.println("enter only num");

//         }catch(IllegalArgumentException e){
//             System.out.println("num cannot be negative ");

//         }catch(ArithmeticException e){
//             System.out.println("insufficient balance ");
            
//         }
//     }
            
// }
//14. Write a Java program to implement the bank application as shown in diagram.
// class asset{
//     int id;
//     String type;
//     asset(int id,String type){
//         this.id=id;
//         this.type=type;
//     }
//     void print(){
//         System.out.println(id+" "+type);
//     }
// }
// class bankac extends asset{
//     String bankname;
//     float balance;
//     bankac(int id,String type,String bankname,float balance){
//         super(id,type);
//         this.bankname=bankname;
//         this.balance=balance;
//     }
//      void print(){
//         super.print();
//         System.out.println(bankname+" "+balance);
//     }
// }
// class savingac extends bankac{
//     float interestrate ;
//     savingac(int id,String type,String bankname,float balance,float interestrate){
//         super(id,type,bankname,balance);
//         this .interestrate=interestrate;
//     }
//     void print(){
//         super.print();
//         System.out.println(interestrate);
//     }
// }
// class checkingac extends bankac{
//     float overdraftlimit ;
//     checkingac(int id,String type,String bankname,float balance,float overdraftlimit ){
//        super(id,type,bankname,balance);
//         this .overdraftlimit=overdraftlimit;
//     }
//     void print(){
//         super.print();
//         System.out.println(overdraftlimit);
//     } 
    
// }
// class security extends asset{
//     String tradeofexchange;
//     security(int id,String type,String tradeofexchange){
//         super(id,type);
//         this.tradeofexchange=tradeofexchange;
//     }
//      void print(){
//         super.print();
//         System.out.println(tradeofexchange);
//     }
//     }
// class realestate extends asset{
//     float buildarea;
//     realestate(int id,String type,float buildarea){
//              super(id,type);
//         this.buildarea=buildarea;
//     }
//      void print(){
//         super.print();
//         System.out.println(buildarea);
//     }
//     }
// class main{
//     public static void main (String []args){
//         new savingac(1,"savingac","hdfc",30000,4.5f).print();
//         new checkingac(2,"checkingac","hdfc",30000,2000).print();
//         new security(3,"security","nse").print();
//         new realestate(4,"realestate",1200).print();
//     }
// }


// Write a Java Program to create an application that implements multiple interfaces
// as shown in the
// diagram.
// interface personel{
//     String name= "aileen";
//     String addr="Pune";
//     int id =101;
//     }
// interface teacher extends personel{
//     String dept="computer application";
//     double sal=50000;
//     void pay();
// }
// interface student extends personel{
//     String major="mca";
//     double gpa=8.5;
//     int credits=5;
//     void study();
// }
// class ta implements teacher,student{
//     public void pay(){
//         System.out.println("salary:"+sal);
//     }
//     public void study(){
//         System.out.println("major:"+major);
//     }
//     void display(){
//         System.out.println("name:"+name);
//         System.out.println("address:"+addr);
//         System.out.println("id:"+id);
//         System.out.println("gpa:"+gpa);
//         System.out.println("credits:"+credits);
//     }
// }
// class main{
//     public static void main (String[]args){
//         ta t=new ta();
//         t.pay();
//         t.study();
//         t.display();
//     }
// }


// Write a Java Program to create an application that implements multiple interfaces
// to control smart devices (Wi-Fi, Bluetooth, Voice Control), demonstrating
// runtime polymorphism through interfaces.

// interface wifi {
//     void connectwifi();

// }

// interface bluetooth {
// void connectbluetooth();
// }
// interface voice{
// void voicecommand();
// }
// class smartdevice implements wifi,bluetooth,voice{
// public void connectwifi(){
// System.out.println("Wifi connected");
// }
// public void connectbluetooth(){
// System.out.println("bluetooth  connected");

// }
// public void voicecommand(){
// System.out.println("voice command  connected");
// }
// }
// class main {
// public static void main (String[] args){
// wifi w=new smartdevice();
// w.connectwifi();
// bluetooth b=new smartdevice();
// b.connectbluetooth();
// voice v=new smartdevice();
// v.voicecommand();
// } 
// }



//     11. Write a Java Program to develop an application using abstract classes and
// abstract methods to model multiple payment modes (Credit Card, UPI, Net
// Banking), enforcing a common payment structure.
// abstract class payment{
//     abstract void pay();

// }
// class credit extends payment{
//     void pay(){
//         System.out.println("credit card payment");
//     }
// }
// class upi extends payment{
// void pay(){
//         System.out.println("upi payment");
//     }
// }
// class netbanking extends payment{
// void pay(){
//         System.out.println("netbanking payment");
//     }
// }
// class main{
//     public static void main (String []args){
// payment p ;
// p = new credit();
// p.pay();
// p = new upi();
// p.pay();
// p = new netbanking();
// p.pay();

// }
// }
// Write a Java Program to develop a Java program that performs string
// manipulation operations such as concatenation, comparison, reversal, formatting
// of output, and performance comparison using String, StringBuffer, and
// StringBuilder.






// Write a Java Program to design an application that stores marks of multiple

// students using one-dimensional arrays and subject-wise marks using two-
// dimensional arrays.

// The program should compute sum, average, and perform matrix addition for
// subject score comparison.

// class main {
//     public static void main (String []args){
//         int arr[]={290,403,500};
//         int sum =0;
//         //sum
//         for(int i = 1;i<arr.length;i++){
//             sum=sum+arr[i];
//         }
//         System.out.println("sum="+sum) ;
//         //average 
//         System.out.println("average="+sum/arr.length);

//         int a[][]={
//             {40,60,40},
//             {40,60,40},
//             {40,60,40}
//         };
//         int b[][]={
//             {60,40,40},
//             {60,40,40},
//             {60,40,40}
//         };
//         for(int i = 0;i<3;i++){
//             for(int j = 0;j<3;j++){
//             System.out.print(a[i][j]+b[i][j]+"" );
//         }
// System.out.println("");
//         }

        
//     }
// }











// Write a Java Program to create a command-line calculator application that
// accepts inputs (numbers and operator) via command line arguments and performs
// arithmetic operations such as addition, subtraction, multiplication, and division.
// class main{
//     public static void main (String[] args){
//         if(args.length != 3){
//             System.out.println("enter num 1 op num 2");
//             return;
//         }
//         double num1=Double.parseDouble(args[0]);
//         double num2=Double.parseDouble(args[2]);
//         String op=args[1];
        
//         switch(op){
//             case "+":
//                 System.out.println(num1+num2);
//                 break;
//             case "-":
//                 System.out.println(num1-num2);
//                 break;
//             case "x":
//                 System.out.println(num1*num2);
//                 break;
//             case "/":
//                 System.out.println(num1/num2);
//                 break;
//             default:
//                 System.out.println("invalid");
//         }

//     }
// }
















// Write a Java Program that accepts student marks and evaluates results. The
// system should determine pass/fail status, grade classification, and display
// remarks using if–else, switch, and looping constructs.
// import java.util.Scanner;
// class main {
//     public static void main (String []args){
//         int marks,n;
//         String results,grade , remarks;
//         Scanner sc =new Scanner(System.in);
//         System .out.println("enter no of students :");
//         n=sc.nextInt();
//         for (int i=1;i<=n;i++){
//             System .out.println("enter marks");
//             marks=sc.nextInt();

//             if(marks>40){
//                 results="pass";

//             }
//             else {
//                 results="fail";
//             }

//             if (marks>75){
//                 grade="a";
//             }else if (marks >65){
//                 grade="b";
//             }else if (marks>55){
//                 grade="c";
//             }else if (marks>45){
//                 grade="d";
//             }else {
//                 grade="f";
//             } 
//             switch (grade){
//             case "a":
//                 remarks="excellent";
//                 break;
//             case "b":
//                 remarks="good";
//                 break;
//             case "c":
//                 remarks="satisfactory ";
//                 break;
//             case "d":
//                 remarks="poor";
//                 break;
                          
//             default:
//                 remarks="fail";
//                 break;

//             }
//         System .out.println("marks"+marks);
//          System .out.println("result"+results);
//           System .out.println("grade"+grade);
//            System .out.println("remarks"+remarks);

//         }

//     }
// }





































// class ticketbooking {
//     int seat=3;
//     synchronized void bookticket(String name,int reqseat){
//        System.out.println(name+"trying to book "+reqseat+"seat ");
//        if (reqseat<seat){
//         System.out.println(name+" booked "+reqseat+"seat ");
//         seat=seat-reqseat;
//        }else {
//         System.out.println(name+"booking failed  "+reqseat+"seat ");
//        }
//     }
    
// }
// class user implements Runnable{
//     ticketbooking t;
//     int r;
//     String n;

//     user(ticketbooking t,int r,String n){
//         this.t= t;
//         this.r=r;
//         this.n=n;
//     }
//     public void run (){
//         t.bookticket(n,r);
//     }

// }
// class main {
//     public static void main (String []args){
//         ticketbooking t= new ticketbooking();
//         Thread t1=new Thread(new user(t,"user1",2));
//         Thread t2=new Thread(new user(t,"user2",1));
//         Thread t3=new Thread(new user(t,"user4",2));

//         t1.start();
//         t2.start();
//         t3.start();
//     }
// }