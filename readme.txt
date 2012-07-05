In today's workshop we worked with a simple problem, which looked like:

    We need to build a "Digital Phonebook" using Java. It should be a console application. No GUI needed. What we need is to insert new phone-book entries containing a person's Name, Email-ID, Contact number & Address. We will also like to update any entry and delete, show a list of entries, search, etc...


Our approach to solve the problem:

Let's think something like MVC (Model-View-Controller) architecture for beginners. We may assume following simplified concepts:

    Model: A class containing code related to (a) Database table(s), with necessary mechanism to build database query and execute them.
    Controller: A class which accepts user provided query, decides what to do, which model & view class to load...
    View: A class which renders output and presents it to user.

 

User Interface:

Our solution has a command-line interface. You should write "insert" and hit enter, then type all the information (separated by spaces) required to insert a new entry in a single line. say, if I run the program and type in console:

insert
Shafiul 01557420420 random.id@gmail.com Dhaka

Then a new phone-book entry with following information will be stored in Database:

        Name: Shafiul
        Contact number: 01557420420
        Email: random.id@gmail.com
        Address: Dhaka

 

The program will run in an infinite loop until user types "quit" and hits enter. For update, you may type "update" and hit enter, and in the following line specify which entry to update with what etc.

 

Download:

Here you’ll find the code written using Netbeans. If you’re using Netbeans, you may simply “Open” a project and specify the folder of the downloaded code.
The code assumes you’ve a database named “digital_phonebook” with a table named “phonebook” - create a database named "digital_phonebook". Then, you can execute following SQL to create the table:

--
-- Table structure for table `phonebook`
--

CREATE TABLE IF NOT EXISTS `phonebook` (
  `name` varchar(100) NOT NULL,
  `contact` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL
) ;

The code has comments enough to increase understandability. This solution does nothing but shows how to write managable code from the very beginning, before a projct grows large enough to maintain. :)

Take care,
Shafiul Azam
