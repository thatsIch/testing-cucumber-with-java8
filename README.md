This is a toy project to play around with [cucumber](https://cucumber.io/) in [Gradle](http://gradle.org/). 

* Cucumber is for Behaviour-Driven Development
* Gradle is a hackable build tool

Execute `gradlew test` to see cucumber in action.
 

An expected result would be:

    :compileJava                                                    
    :processResources UP-TO-DATE      
    :classes                 
    :compileTestJava                                                         
    :processTestResources                 
    :testClasses                 
    :test                                                         
                                              
    book.BookSearchTest STANDARD_OUT          
                                              
        1 Scenarios (1 passed)                
        7 Steps (7 passed)                    
        0m0,140s                              
                                              
                                              
    skeleton.RunCukesTest STANDARD_OUT        
        Feature: Belly                        
                                                          
          Scenario: a few cukes               # skeleton/belly.feature:3
            Given I have 42 cukes in my belly # Stepdefs.I_have_cukes_in_my_belly(int)
            When I wait 1 hour                            
            Then my belly should growl                    
                                                          
        1 Scenarios (1 undefined)                         
        3 Steps (2 undefined, 1 passed)                   
        0m0,007s                                          
                                                          
                                                          
        You can implement missing steps with the snippets below:
                                                          
        @When("^I wait (\\d+) hour$")                     
        public void i_wait_hour(int arg1) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();                 
        }                                                 
                                                          
        @Then("^my belly should growl$")                  
        public void my_belly_should_growl() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();                 
        }                                                 
                                                          
                                                          
    BUILD SUCCESSFUL
                   
That is showing that the book example is running fine but the skeleton example is still missing parts of its test.

This project was run with [IntelliJ](https://www.jetbrains.com/idea/), which offers direct support for cucumber feature files and evaluation of the respective classes, if the feature is fully implemented or not.
