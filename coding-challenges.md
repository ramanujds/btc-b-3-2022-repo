## Problem Statement: Hourly Wage Calculator

**A steel manufacturing plant needs to calculate straight wages and overtime pay for all its hourly employees. Overtime is considered any additional hours worked above 40 hours. ​

The standard hourly pay rate is $12. Overtime pay is double; or $24.**

For example, 
- if an employee works for 45 hours in a week , he gets 5 hours of double pay
- The standard amount paid to all daily wage employees is $12 per hour.
- Please note that the manufacturing plant does not allow an employee to work for more than 60 hours in a week.

**Write a Java program that takes the fixed pay for an hour and total number of hours worked as input, and calculates the wage of a worker depending on the number of hours worked and prints the total pay.**


|Name of Employee |  Base Pay | Hours Worked|
|------|-----|-----|
|Jane| $7.50 |35|
|Sarah|$8.20 | 47|
|Harry | $12.00 |73|
|Sammy  |$15.50 |35|
|Tom   |$18.20|47|
|Dave  | $12.00|73|

**Sample Input**

	Enter name of the employee
	Tommy
	Enter base pay of the employee
	12
	Enter number of hours worked by the employee
	45

**Sample Output**

	Name :: Tommy
	Base pay :: 12.0$
	Hours worked :: 45

	Salary of employee :: 600.0$
--------------------------------------------------------

**Sample Input**

	Enter name of the employee
	Sarah
	Enter base pay of the employee
	8.2
	Enter number of hours worked by the employee
	47

**Sample Output**

	Name :: Sarah
	Base pay :: 8.2$
	Hours worked :: 47

	Salary of employee :: 0.0$
	
## Problem Statement : Resident Repository

**A city hospital has announced a full body check-up, free of cost, for its local residents.
People who wish to avail this facility can use the hospital’s website to register themselves. 
The registration form requires you to fill in the following details:**

**Full Name  

**Social Security number

**Gender (M/F)     

**Implement the following functionalities in the program:


          1. Create a list of all the residents. 
          2. Search for people with their social security number.
          3. Sort the name of the residents in alphabetical order. 
          4. Fetch the list of residents based on their gender.

**Sample Code -**

```java

public class Resident {

    //declare the variables

    //getter setter

    //constructor

    //override toString method

}

```
**Service Layer**

```java

public class ResidentService {

    private static List<Resident> residentsRepository = new ArrayList<>();

    ResidentService(){

    }

    /**
     * create list of all the residents.
     */
    public boolean addResident(Resident resident) throws DuplicateResidentException {

        return false;
    }

   //Search for people with their social security number.

    public Resident searchResident(int socialSecurityNumber) throws ResidentNotFoundException{

       return null;

    }

   // Sort the name of the residents in alphabetical order.

    public List getAllNamesSorted(List residentsRepository){

        return null;

    }

   // Fetch the list of residents based on their gender.
    public List<Resident> getAllResidentsByGender(char gender){


       return null;
    }

}

```

