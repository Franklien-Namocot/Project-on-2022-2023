package library;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import java.util.ArrayList;
public class Library {
    private static Scanner user = new Scanner(System.in);
    private static Library book = new Library();
    public static void main(String[] args) {
    ArrayList<String> booked = new ArrayList<String>();
    String fname, lname,cno,addres,id2,pswrd,mname,course; 
    boolean quit = false;
    int choice =0;
                System.out.println("====================================================================");
                System.out.println("Welcome to USTP Library");          
                System.out.printf("Before you proceed follow the instruction down below!!!\n");
                System.out.println("will you provide 3 books for 1 Semester only must be careful your borrowing books it's only 1week");
                System.out.println("before returning the books please proceed to the next step!");       
       printInstructions();
        while(!quit){
            System.out.print("\nEnter your choice: ");
            choice = user.nextInt();
            user.nextLine();       
                switch(choice) {
                    case 0:
                         printInstructions();
                         break;
                    case 1:
                         printViewbooks();
                         printInstructions();
                         break;
                    case 2:
                         printViewbooks();
                         addBooks();
                         printInstructions();
                         break;
                    case 3:  
                         returningBooks(booked, user);
                         printInstructions();
                         break; 
                    case 4:
                         quit = true;
                         System.out.println("Thank you for cooperation!"); 
                         System.out.println("====================================================================");
                         break;    

                         }

                    }	
           }
       public static void printInstructions(){
            System.out.println("\nPress");
            System.out.println("\t 0 - to print choice options");
            System.out.println("\t 1 - to View Books");
            System.out.println("\t 2 - to Borrow");
            System.out.println("\t 3 - to Return");
            System.out.println("\t 4 - to Logout");      

       }   
       public static void addBooks(){
            String book_number = "";
            String StudentId, Title, Author, Copyright,StudentId2, Title2, Author2, Copyright2, fname, lname,mname,cno,addres,course,books,date;
            Date currentDate = new Date();
            String[] one = {"1.Title: |The Book of Mistakes|\nAuthor: |Skip Prichard|\nCopyright: |2018|"};
            String[] two = {"2.Title: |How Will You Measure Your Life?|\nAuthor: |Clayton M. Christensen, James Allworth, Karen Dillon|\nCopyright: |2012|"};
            String[] three = {"3.Title: |Mastery|\ntAuthor: |Robert Greene|\nCopyright: |2013|"};
            String[] four = {"4.Title: |Become a SuperLearner| \nAuthor: |Jonathan A. Levi, Anna Goldentouch, Lev Goldentouch, Nelson Dellis|\nCopyright: |2015|"};
            String[] five = {"5.Title: |I Will Teach You To Be Rich|\nAuthor: |Ramit Sethi|\nCopyright: |2009|"};
            String[] six = {"6.Title: |The Intelligent Investor|\\nAuthor: |Benjamin Graham, Jason Zweig, Warren E. Buffett|\\nCopyright: |2006|"};
            String[] seven = {"7.Title: |Amazing Things Will Happen|\nAuthor: |C. C. Chapman|\nCopyright: |2012|"};
            String[] eight = {"8.Title: |The Leadership Challenge|\n|Author: |James M. Kouzes, Barry Z. Posner|\nCopyright: |2017|"};
            String[] nine = {"9.Title: |The Myth of the Strong Leader|\nAuthor: |Archie Brown|\nCopyright: |2012|"};
            String[] ten = {"10.Title: |Quiet|The Power of Introverts in a World That Can't Stop Talking|\nAuthor: |Susan Cain|\nCopyright: |2013|"};
            String[] eleven = {"11. Title: |Switch|\nAuthor: |Chip Heath, Dan Heath|\nCopyright: 2010"};
            String[] twelve = {"12. Title: |Extreme Ownership|\nAuthor: |Jocko Willink|\nCopyright: 2017"};
            String[] thirteen = {"13. Title: |The 7 Habits of Highly Effective People|\nAuthor: |Stephen R. Covey|\nCopyright: 2013"};
            String[] fourteen = {"14. Title: |Who Moved My Cheese?|\nAuthor: |Spencer Johnson, Kenneth Blanchard|\nCopyright: 1998"};
            String[] fifteen = {"15. Title: |Unlimited Power|\nAuthor: |Anthony Robbins|\nCopyright: 1986"};
            Scanner me = new Scanner(System.in);
            System.out.println("\nPress");
            System.out.println("\t 1 - to Login your Student ID #");
            System.out.println("\t 2 - to Register your STudent ID #");
            String input = me.nextLine();
            System.out.println("====================================================================");     
       if(input.equals("1")){  
        System.out.print("Enter your ID: ");
        StudentId = me.nextLine();
        System.out.print("Enter your Course: "); 
        course = user.nextLine();
        while(true) {
        System.out.print("Please Enter Number title: ");
        books = user.nextLine();    
        if (books.equals("1")){
            book_number = one[0];
            System.out.println(Arrays.toString(one));
		break;          
       } else if (books.equals("2")){
            book_number = two[0];
            System.out.println(Arrays.toString(two));
		break; 
       } else if (books.equals("3")){ 
            book_number = three[0];
            System.out.println(Arrays.toString(three));
		break;
       } else if (books.equals("4")){
            book_number = four[0];
            System.out.println(Arrays.toString(four));
		break;
       } else if (books.equals("5")){
            book_number = five[0];
            System.out.println(Arrays.toString(five));
		break;
       } else if (books.equals("6")){
            book_number = six[0];
            System.out.println(Arrays.toString(six));
		break;
       } else if (books.equals("7")){
            book_number = seven[0];
            System.out.println(Arrays.toString(seven));
		break;	
       } else if (books.equals("8")){
            book_number = eight[0];
            System.out.println(Arrays.toString(eight));
		break;
       } else if (books.equals("9")){
            book_number = nine[0];
            System.out.println(Arrays.toString(nine));
		break;
       } else if (books.equals("10")){
            book_number = ten[0];
            System.out.println(Arrays.toString(ten));
		break;
       }  
       else {
            System.out.println("Book not found.");
            return;
        }
        }
        System.out.print("Return Date: ");
        date = user.nextLine();
        System.out.println("====================================================================");    
        System.out.println("Borrowing Slip");
        System.out.println("Thank you for borrowing books!");
        System.out.println(book_number);
        System.out.println("Return date: "+date);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(dateFormat.format(currentDate));
        SimpleDateFormat dayOfTheWeekFormat = new SimpleDateFormat("EEEE");
        System.out.println(dayOfTheWeekFormat.format(currentDate));
        SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm a");
        System.out.println(clockFormat.format(currentDate));
        System.out.println("====================================================================");
       
        }
       else if(input.equals("2")){
        System.out.println("====================================================================");    
        System.out.print("Enter your Firstname: ");
        fname = user.nextLine();
        System.out.print("Enter your Middlename: ");
        mname = user.nextLine();
        System.out.print("Enter your Lastname: ");
        lname = user.nextLine();
        System.out.print("Enter your Contact No: ");
        cno = user.nextLine();
        System.out.print("Enter your Address: ");
        addres = user.nextLine();
        System.out.print("Enter your ID: ");
        StudentId2 = me.nextLine();
        System.out.print("Enter your Course: ");
        course = me.nextLine();
        while(true){
        System.out.print("Please Enter Number title: ");
        books = user.nextLine();    
        if (books.equals("1")){
            book_number = one[0];
            System.out.println(Arrays.toString(one));
		break;          
       } else if (books.equals("2")){
            book_number = two[0];
            System.out.println(Arrays.toString(two));
		break; 
       } else if (books.equals("3")){ 
            book_number = three[0];
            System.out.println(Arrays.toString(three));
		break;
       } else if (books.equals("4")){
            book_number = four[0];
            System.out.println(Arrays.toString(four));
		break;
       } else if (books.equals("5")){
            book_number = five[0];
            System.out.println(Arrays.toString(five));
		break;
       } else if (books.equals("6")){
            book_number = six[0];
            System.out.println(Arrays.toString(six));
		break;
       } else if (books.equals("7")){
            book_number = seven[0];
            System.out.println(Arrays.toString(seven));
		break;	
       } else if (books.equals("8")){
            book_number = eight[0];
            System.out.println(Arrays.toString(eight));
		break;
       } else if (books.equals("9")){
            book_number = nine[0];
            System.out.println(Arrays.toString(nine));
		break;
       } else if (books.equals("10")){
            book_number = ten[0];
            System.out.println(Arrays.toString(ten));
		break;
       }  
       else {
            System.out.println("Book not found.");
            return;
        }
	}
         
        System.out.print("Return Date: ");
        date = user.nextLine();
        System.out.println("====================================================================");
        System.out.println("Borrowing Slip");
        System.out.println("Firstname: " +fname );
        System.out.println("Middlename: " +mname );
        System.out.println("Lastname: " +lname );
        System.out.println("Contact No: " +cno );
        System.out.println("Address: " +addres );
        System.out.println("Course" + course);
        System.out.println("ID no: "+ StudentId2);
        System.out.println("Course" + course);
        System.out.println(book_number);
        System.out.println("Thank you for borrowing books!");
        System.out.println("Return: " + date);
        System.out.println(Arrays.toString(one)+(two)+(three)+(four));
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(dateFormat.format(currentDate));
        SimpleDateFormat dayOfTheWeekFormat = new SimpleDateFormat("EEEE");
        System.out.println(dayOfTheWeekFormat.format(currentDate));
        SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm a");
        System.out.println(clockFormat.format(currentDate));
        System.out.println("====================================================================");
       }
       }   
    public static void returningBooks(ArrayList<String> booked, Scanner user){ 
        String book_number = "";
        String StudentId, Title, Author, Copyright,StudentId2, Title2, Author2, Copyright2, fname, lname,mname,cno,addres,course,books,days;
        Scanner me = new Scanner(System.in);
        Date currentDate = new Date();
         String[] one = {"1.Title: |The Book of Mistakes|\nAuthor: |Skip Prichard|\nCopyright: |2018|"};
         String[] two = {"2.Title: |How Will You Measure Your Life?|\nAuthor: |Clayton M. Christensen, James Allworth, Karen Dillon|\nCopyright: |2012|"};
         String[] three = {"3.Title: |Mastery|\ntAuthor: |Robert Greene|\nCopyright: |2013|"};
         String[] four = {"4.Title: |Become a SuperLearner| \nAuthor: |Jonathan A. Levi, Anna Goldentouch, Lev Goldentouch, Nelson Dellis|\nCopyright: |2015|"};
         String[] five = {"5.Title: |I Will Teach You To Be Rich|\nAuthor: |Ramit Sethi|\nCopyright: |2009|"};
         String[] six = {"6.Title: |The Intelligent Investor|\\nAuthor: |Benjamin Graham, Jason Zweig, Warren E. Buffett|\\nCopyright: |2006|"};
         String[] seven = {"7.Title: |Amazing Things Will Happen|\nAuthor: |C. C. Chapman|\nCopyright: |2012|"};
         String[] eight = {"8.Title: |The Leadership Challenge|\n|Author: |James M. Kouzes, Barry Z. Posner|\nCopyright: |2017|"};
         String[] nine = {"9.Title: |The Myth of the Strong Leader|\nAuthor: |Archie Brown|\nCopyright: |2012|"};
         String[] ten = {"10.Title: |Quiet|The Power of Introverts in a World That Can't Stop Talking|\nAuthor: |Susan Cain|\nCopyright: |2013|"};
         String[] eleven = {"11. Title: |Switch|\nAuthor: |Chip Heath, Dan Heath|\nCopyright: 2010"};
         String[] twelve = {"12. Title: |Extreme Ownership|\nAuthor: |Jocko Willink|\nCopyright: 2017"};
         String[] thirteen = {"13. Title: |The 7 Habits of Highly Effective People|\nAuthor: |Stephen R. Covey|\nCopyright: 2013"};
         String[] fourteen = {"14. Title: |Who Moved My Cheese?|\nAuthor: |Spencer Johnson, Kenneth Blanchard|\nCopyright: 1998"};
         String[] fifteen = {"15. Title: |Unlimited Power|\nAuthor: |Anthony Robbins|\nCopyright: 1986"};
            System.out.println("\nPress");
            System.out.println("\t 1 - to Login your Student ID #");
            System.out.println("\t 2 - to Register your STudent ID #");
            String input = me.nextLine();
            System.out.println("====================================================================");
        
        if(input.equals("1")){
        System.out.print("Enter your ID: ");
        StudentId = me.nextLine();
        System.out.print("Enter your Course: ");
        course = me.nextLine();
	while(true){
        System.out.print("Please Enter Number title: ");
        books = user.nextLine();    
        if (books.equals("1")){
            book_number = one[0];
            System.out.println(Arrays.toString(one));
		break;          
       } else if (books.equals("2")){
            book_number = two[0];
            System.out.println(Arrays.toString(two));
		break; 
       } else if (books.equals("3")){ 
            book_number = three[0];
            System.out.println(Arrays.toString(three));
		break;
       } else if (books.equals("4")){
            book_number = four[0];
            System.out.println(Arrays.toString(four));
		break;
       } else if (books.equals("5")){
            book_number = five[0];
            System.out.println(Arrays.toString(five));
		break;
       } else if (books.equals("6")){
            book_number = six[0];
            System.out.println(Arrays.toString(six));
		break;
       } else if (books.equals("7")){
            book_number = seven[0];
            System.out.println(Arrays.toString(seven));
		break;	
       } else if (books.equals("8")){
            book_number = eight[0];
            System.out.println(Arrays.toString(eight));
		break;
       } else if (books.equals("9")){
            book_number = nine[0];
            System.out.println(Arrays.toString(nine));
		break;
       } else if (books.equals("10")){
            book_number = ten[0];
            System.out.println(Arrays.toString(ten));
		break;
       }  
       else {
            System.out.println("Book not found.");
            return;
        }
	}
            System.out.print("How many days do you return the books: ");
       int day = user.nextInt();
       if (day > 7){
            System.out.println("You have" +" "+ day +" days"+" "+"you may pay the remaining days to atleast 5 pesos per day"); 
            System.out.print("Please enter your amount: ");
            int amount = user.nextInt();
            System.out.println("====================================================================");
            System.out.println("Returning Slip");
            System.out.println("ID no: "+ StudentId);
            System.out.println("Course:" + course);
            System.out.println(book_number);
            System.out.println("Payment: "+ amount);
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            System.out.println(dateFormat.format(currentDate));
            SimpleDateFormat dayOfTheWeekFormat = new SimpleDateFormat("EEEE");
            System.out.println(dayOfTheWeekFormat.format(currentDate));
            SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm a");
            System.out.println(clockFormat.format(currentDate));
            System.out.println("====================================================================");           
       }
       else{
            System.out.println("Thank you for returning within 1 week");
            System.out.println("====================================================================");
            System.out.println("Returning Slip");
            System.out.println("ID no: "+ StudentId);
            System.out.println("Course:" + course); 
            System.out.println(book_number);
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            System.out.println(dateFormat.format(currentDate));
            SimpleDateFormat dayOfTheWeekFormat = new SimpleDateFormat("EEEE");
            System.out.println(dayOfTheWeekFormat.format(currentDate));
            SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm a");
            System.out.println(clockFormat.format(currentDate));
       }      
       }
       else if(input.equals("2")){
       System.out.print("Enter your Firstname: ");
       fname = user.nextLine();
       System.out.print("Enter your Middlename: ");
       mname = user.nextLine();
       System.out.print("Enter your Lastname: ");
       lname = user.nextLine();
       System.out.print("Enter your Contact No: ");
       cno = user.nextLine();
       System.out.print("Enter your Address: ");
       addres = user.nextLine();
       System.out.print("Enter your ID: ");
       StudentId2 = me.nextLine();
       System.out.print("Enter your Course: ");
       course = me.nextLine();       
       while(true) {
        System.out.print("Please Enter Number title: ");
        books = user.nextLine();    
        if (books.equals("1")){
            book_number = one[0];
            System.out.println(Arrays.toString(one));
		break;          
       } else if (books.equals("2")){
            book_number = two[0];
            System.out.println(Arrays.toString(two));
		break; 
       } else if (books.equals("3")){ 
            book_number = three[0];
            System.out.println(Arrays.toString(three));
		break;
       } else if (books.equals("4")){
            book_number = four[0];
            System.out.println(Arrays.toString(four));
		break;
       } else if (books.equals("5")){
            book_number = five[0];
            System.out.println(Arrays.toString(five));
		break;
       } else if (books.equals("6")){
            book_number = six[0];
            System.out.println(Arrays.toString(six));
		break;
       } else if (books.equals("7")){
            book_number = seven[0];
            System.out.println(Arrays.toString(seven));
		break;	
       } else if (books.equals("8")){
            book_number = eight[0];
            System.out.println(Arrays.toString(eight));
		break;
       } else if (books.equals("9")){
            book_number = nine[0];
            System.out.println(Arrays.toString(nine));
		break;
       } else if (books.equals("10")){
            book_number = ten[0];
            System.out.println(Arrays.toString(ten));
		break;
       }  
       else {
            System.out.println("Book not found.");
            return;
        }
	}
       System.out.print("How many days do you return the books: ");
       int day = user.nextInt();
       if (day > 7){
           System.out.println("You have" +" "+ day +" days"+" "+"you may pay the remaining days to atleast 5 pesos per day"); 
           System.out.print("Please enter your amount: ");
           int amount = me.nextInt(); 
           System.out.println("====================================================================");
           System.out.println("Returning Slip");
           System.out.println("Firstname: " +fname );
           System.out.println("Middlename: " +mname );
           System.out.println("Lastname: " +lname );
           System.out.println("Contact No: " +cno );
           System.out.println("Address: " +addres );
           System.out.println("ID no: "+ StudentId2);
           System.out.println("Course" + course);
           System.out.println(book_number);
           System.out.println("Payment: "+ amount);
           SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
           System.out.println(dateFormat.format(currentDate));

           SimpleDateFormat dayOfTheWeekFormat = new SimpleDateFormat("EEEE");
           System.out.println(dayOfTheWeekFormat.format(currentDate));

           SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm a");
           System.out.println(clockFormat.format(currentDate));
           System.out.println("====================================================================");
           
       }
       else {
           System.out.println("Thank you for returning within 1 week");
           System.out.println("====================================================================");
           System.out.println("Returning Slip");
           System.out.println("Firstname: " +fname );
           System.out.println("Middlename: " +mname );
           System.out.println("Lastname: " +lname );
           System.out.println("Contact No: " +cno );
           System.out.println("Address: " +addres );
           System.out.println("ID no: "+ StudentId2);
           System.out.println("Course" + course);
           System.out.println(book_number);
           SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
           System.out.println(dateFormat.format(currentDate));

           SimpleDateFormat dayOfTheWeekFormat = new SimpleDateFormat("EEEE");
           System.out.println(dayOfTheWeekFormat.format(currentDate));

           SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm a");
           System.out.println(clockFormat.format(currentDate));
       }
       }
    }
    public static void printViewbooks(){
          System.out.println("====================================================================");
          System.out.println("View Books =>");
          System.out.println("\nPress");
          System.out.println("====================================================================");
          System.out.println("1.Title: |The Book of Mistakes|\nAuthor: |Skip Prichard|\nCopyright: |2018|");
          System.out.println("2.Title: |How Will You Measure Your Life?|\nAuthor: |Clayton M. Christensen, James Allworth, Karen Dillon|\nCopyright: |2012|");
          System.out.println("3.Title: |Mastery|\nAuthor: |Robert Greene|\nCopyright: |2013|");
          System.out.println("4.Title: |Become a SuperLearner| \nAuthor: |Jonathan A. Levi, Anna Goldentouch, Lev Goldentouch, Nelson Dellis|\nCopyright: |2015|");
          System.out.println("5.Title: |I Will Teach You To Be Rich|\nAuthor: |Ramit Sethi|\nCopyright: |2009|");
          System.out.println("6.Title: |The Intelligent Investor|\nAuthor: |Benjamin Graham, Jason Zweig, Warren E. Buffett|\nCopyright: |2006|");
          System.out.println("7.Title: |Amazing Things Will Happen|\nAuthor: |C. C. Chapman|\nCopyright: |2012|");
          System.out.println("8.Title: |The Leadership Challenge|\n|Author: |James M. Kouzes, Barry Z. Posner|\nCopyright: |2017|");
          System.out.println("9.Title: |The Myth of the Strong Leader|\nAuthor: |Archie Brown|\nCopyright: |2012|");
          System.out.println("10.Title: |Quiet|The Power of Introverts in a World That Can't Stop Talking|\nAuthor: |Susan Cain|\nCopyright: |2013|");
          System.out.println("11. Title: |Switch|\nAuthor: |Chip Heath, Dan Heath|\nCopyright: 2010");
          System.out.println("12. Title: |Extreme Ownership|\nAuthor: |Jocko Willink|\nCopyright: 2017");
          System.out.println("13. Title: |The 7 Habits of Highly Effective People|\nAuthor: |Stephen R. Covey|\nCopyright: 2013");
          System.out.println("14. Title: |Who Moved My Cheese?|\nAuthor: |Spencer Johnson, Kenneth Blanchard|\nCopyright: 1998");
          System.out.println("15. Title: |Unlimited Power|\nAuthor: |Anthony Robbins|\nCopyright: 1986");
          System.out.println("====================================================================");
              
        } 
}   

