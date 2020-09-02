Feature: Gmail Login

#Without using Example keyword				 

#Scenario: GmailLogin_TestApp

#Given Open chrome and launch application
 
#When Enter the "gouthamipokala"	and "abc@123"

#Then user loggedin succssfully

#With using Example keyword	we need to use feature name as scenario outline

Scenario Outline: GmailLogin_TestApp

Given Open chrome and launch application
 
When Enter the "<username>"	and "<password>"

Then user loggedin succssfully

Examples:
	| username| password |
	| gouthami | abc@123 |
  	| pokala   | qwe@123 |

  	
 