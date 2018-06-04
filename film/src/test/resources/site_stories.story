Scenario:  Movie.java found

Given user is on Github profile page
When user clicks the lala-tau link
Then the element film is displayed

When user clicks the film link
Then the element src is displayed

When user clicks the src link
Then the element main is displayed

When user clicks the main link
Then the element java is displayed

When user clicks the java link
Then the element com/lala/app is displayed

When user clicks the com/lala/app link
Then the element domain is displayed

When user clicks the domain link
Then the element Movie.java is displayed


Scenario:  Movie.java not found

Given user is on Github profile page
When user clicks the lala-tau link
Then the element film is displayed

When user clicks the film link
Then the element src is displayed

When user clicks the src link
Then the element main is displayed

When user clicks the main link
Then the element java is displayed

When user clicks the java link
Then the element com/lala/app is displayed

When user clicks the com/lala/app link
Then the element Movie.java is not displayed