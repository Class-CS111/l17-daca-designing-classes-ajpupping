/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/
class Main 
{
  public static void main(String[] args) 
	{
    DACArecipient person1, person2;

    person1 = new DACArecipient();
    person2 = new DACArecipient();

    person1.setAll("Miranda", "Daniel", "12-3-456", "Mexico", 
     	2453321, 2460584, 2464236, 'M');

    person2.setAll("Rose", "Alexis", "10-9-876", "Turkey", 
    2453450, 2460341, 2463994, 'F');

    System.out.println(person1);
    System.out.println(person2);
    System.out.println(person1.equals(person2));

    System.out.println(person1.printCard());
    System.out.println(person2.printCard());

  }
}