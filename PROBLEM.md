## Practice Statement - Unique Arrays

**A company has revamped the health insurance policy for all its insured employees and has increased their health cover by 20%. In order to provide them this facility, the human resource department needs to collect the data of all insured employees and prepare a unique list of their employee ids.​ Write a program to help the HR manager to create a unique list of employee ids to avoid duplication.​​**

### Example 

    Sample Input :
        int[] salesDepartmentEmpIds = {101,105,106,107,108,109};
    Sample Output:
        true
    ---------------------------------------------
    Sample Input :
        int[] accountDepartmentEmpIds = {201,205,206,207,208,209,201};
    Sample Output:
        false



# Practice Statement - Shortest word 

**Write a Java program to get the strings as input from the user and push them to an array. Find the shortest word in the list of strings and display the same on the screen.**

**Sample Input**

	words[] = {"Atrocity", "Pensive", "Imperceptible", "Discordant" }

**Sample Output**

	Shortest word is Pensive
	
	
# Practice Statement: Calorie Tracker

**Anne is using a calorie tracker app that helps her keep a record of all her physical activities and her daily intake of calories**
**The calories burned by her doing some of the common physical activities are:**

1. 30 minutes of cycling burns around 300 calories
2. 30 minutes of swimming burns around 200 calories
3. 30 minutes of running burns around 500 calories

**Anne can lose one pound of weight for each 1000 calories burned. Her daily extra calorie intake tracked by the app is 100**
**Write a java program to calculate the number of pounds Anne can lose in a month if she does each of the above mentioned activities
once a week for 1 hour and chooses to do one activity per day.**


**Sample Input:**

    Calorie burnt by cycling : 200
    Calorie burnt by running : 200
    Calorie burnt by swimming: 200
    Calorie intake in a day  : 100

**Sample Output:**

    Weight lost by Anne in a month is : 5.0 pounds

# Pratice Statement: Fencing a Barn

**   Ron wishes to renovate his barn. He thinks that creating fences and keeping the animals separately would help him feed the animals easily and prevent the problem of animals getting mixed. For this, he plans to divide the area into three parts. He wishes to have a square area for the chickens, a circular area for the ducks and a rectangular area for the cows.​**
**Write a program in Java to help Ron calculate the area for each fence separately.**
Note: 
- Input ‘side’ for the square, ‘length and breadth’ for rectangle and ‘radius’ for circle.   
- Modularize your code by writing separate functions to calculate the area of each of the fence shapes.

**Sample Input:**

    Select an option from list to calculate area of fence
    1. Square area for the chickens
    2. Circular area for ducks
    3. Rectangular area for cows

    1
    Enter side of square : 12

**Sample Output:**

    Area of square fence for chickens is 144.0

## Practice Statement: Aquarium Water pH Value

**The chemical formula of water is H2O (2 hydrogen atoms + 1 Oxygen atom). 
The term pH is a measure of the hydrogen-ion concentration in water.
The pH value ranges from 0 to 14, with 0 being the most acidic and 14 the most alkaline (basic). 
Neutral water has the pH value of 7.
For a goldfish to survive in an aquarium, the preferred pH value must range from 7 to 8.
The pH value of an aquarium may change from time to time.**

**Write a program that takes the pH value of the aquarium water as an input and displays one of the following results.**

    1.If the pH value is below 7, display “pH value is low, partial water change required”.
    2.If the value is in between 7 to 8, display “pH value is fine”.
    3.If the value is greater than 8, display “pH value is high, partial water change required”.



## Practice Statement - Palindrome 

**Palindrome is a word, sentence or a number that reads the same even after its order is reversed. Harrah is one such palindrome town in Oklahoma, United States. For administrative purposes, a list of all palindrome towns and cities is being prepared.**
**Write a Java program that states whether the name of a place is a palindrome or not. Print the words and display their total count.**

**Sample Input**

    String words []= {"Hannah", "Texas", "Renner", "Eleele" }

**Expected Output**

    Hannah is a palindrome
    Renner is a palindrome

    Total number of palindromes: 2

## Practice Statement: Bookstore

**The Hammond Bookstore sells books of different genres, such as fiction, religion, adventure, cooking, travel, autobiographies, etc., written by different authors.The bookstore has had a good sale this past year. Now, the end of the year sale is on, and the books from the fiction genre are being sold at a discount of 25%.**

**Tasks :**

1. Implement appropriate access specifiers.
2. Write accessor and mutator methods for all the classes.
3. Access the variables of the classes only through accessor and mutator methods.

```java
class Book {
    // Implement data hiding by declaring member variables private
    int isbnNo;
    String bookName;
    String author;
    String genre;
    float price;
}



public class Bookstore {
    // Implement data hiding by declaring member variables private
    String bookStoreName;
    String bookStoreId;
    Book[] books;

    public Bookstore(String bookStoreName, String bookStoreId, Book[] books) {
        this.bookStoreName = bookStoreName;
        this.bookStoreId = bookStoreId;
        this.books = books;
    }

    //Declare getter and setter methods


    // Function to calculate the discount for a genre of books
    public float calculateDiscount(Book book,float discountPercentage)
    {
        return -1;
    }
}


public class BookStoreImpl {
    public static void main(String[] args) {
    
        // Declare and initialize author, book and bookstore objects

        // Use the get and set methods to set values to the variables

        //Display book details before discount is calculated

        //Calculate discount on the books by calling the methods

        //Display book details after discount is calculated
    }

}



```


