# Film Query Project - Week 7 Skill Distillery

### Overview
This program simulates retrieval of data from a movie rental store inventory. It utilizes a local database to store information on each film, and a simple menu system to access the database.

The user is initially given 3 options: *Look up film by ID*, *Look up film by keyword*, and *Exit*. When option 1 is selected, the user is prompted to enter the ID of the film they are searching for, and is then presented with basic information on that film. Once there, they have the additional option to either view all information on that film or return to the menu.
Option 2 allows the user to type a string of characters to search for a film, which returns a list of all films with titles or descriptions matching their query. The information on each search result is the same as in option 1, except the film ID is added so that they may run a search on it to find more detailed information.
Option 3 exits the program.

Example:

	+--------------------+
	|  BLOCKBUSTER  APP  |
	+--------------------+
	
	Please make a selection from the Menu:
	1. Look up film by ID
	2. Look up film by keyword
	3. Exit
	> 1
	
	Enter film ID: 808
	
	Title:		SLING LUKE
	Year:		2012
	Rating:		R
	Language:	English
	Description:	A Intrepid Character Study of a Robot And a Monkey who must Reach a Secret Agent in An Abandoned Amusement Park
	
			=====CAST=====
			Dan Torn
			Greg Chaplin
			Ed Mansfield
	
	
	  1) View all details
	  2) Return to Menu
	  >1
	
	Film ID:	808
	Title:		SLING LUKE
	Year:		2012
	Rating:		R
	Language ID:	1
	Language:	English
	Length:		84 min
	Rental Dur:	5 days
	Rental Rate	$0.99
	Rep Cost:	$10.99
	Description:	A Intrepid Character Study of a Robot And a Monkey who must Reach a Secret Agent in An Abandoned Amusement Park
	Special Feat:	Behind the Scenes
	
			=====CAST=====
			Dan Torn
			Greg Chaplin
			Ed Mansfield
	
	
	  1) View all details
	  2) Return to Menu
	  >2
	
	Please make a selection from the Menu:
	1. Look up film by ID
	2. Look up film by keyword
	3. Exit
	> 2
	
	Enter film keyword: sup
	
	Film ID:	123
	Title:		CASABLANCA SUPER
	Year:		2006
	Rating:		G
	Language:	English
	Description:	A Amazing Panorama of a Crocodile And a Forensic Psychologist who must Pursue a Secret Agent in The First Manned Space Station
	
			=====CAST=====
			Kirsten Akroyd
			Walter Torn
			Angela Witherspoon
			Reese West
	
	Film ID:	790
	Title:		SHOOTIST SUPERFLY
	Year:		2009
	Rating:		PG13
	Language:	English
	Description:	A Fast-Paced Story of a Crocodile And a A Shark who must Sink a Pioneer in Berlin
	
			=====CAST=====
			Woody Hoffman
			Julia Barrymore
			Fay Kilmer
	
	Film ID:	867
	Title:		SUPER WYOMING
	Year:		2010
	Rating:		PG
	Language:	English
	Description:	A Action-Packed Saga of a Pastry Chef And a Explorer who must Discover a A Shark in The Outback
	
			=====CAST=====
			Tom Miranda
			Nick Degeneres
			Humphrey Garland
	
	Film ID:	868
	Title:		SUPERFLY TRIP
	Year:		2010
	Rating:		PG
	Language:	English
	Description:	A Beautiful Saga of a Lumberjack And a Teacher who must Build a Technical Writer in An Abandoned Fun House
	
			=====CAST=====
			Johnny Cage
			Dan Harris
			Sean Guiness
			Warren Jackman
			Richard Penn
			Mena Hopper
			Matthew Carrey
	
	---Total Results---
	     4 Films
	
	Please make a selection from the Menu:
	1. Look up film by ID
	2. Look up film by keyword
	3. Exit
	> 3
	
			Goodbye!

### Technologies Used
- Java SE8
- MySQL/MAMP
- JDBC
- Eclipse IDE
- MacOS Terminal
- GitHub/Git

### Lessons Learned
* This time around, I was introduced to MySQL and JDBC. I learned the syntax of querying a database and how to use JDBC to process that data.


* This project was a great reminder to pay attention to detail. This means code, but also instructions. A lot of time was lost due to misinterpreting a minor detail.


* Not particularly a technical lesson, but I learned not to underestimate the amount of time it takes to write and debug code involving databases.


* Bugs caused by recursive behavior have a strong chance of leading to insanity.