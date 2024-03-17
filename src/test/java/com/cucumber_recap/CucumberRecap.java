package com.cucumber_recap;

public class CucumberRecap {
    /*
    What is Cucumber?
      It is a collaborative tool used between technical and non-technical people.
      Frameworks that are built with Cucumber usually titled as BDD frameworks.
      Behavior Driven Development

      1. Features
        We have feature files where we write our automation test cases.
        These test cases are written in Gherkin language with keywords such as:
        Given,When,Then,And
      2. How do create frameWork from scratch?
        POM                -> Page Object Model
        pom.xml            -> Project Object Model
        Pages              -> each page elements and actions stored here
        Runners            -> triggers our test
           @RunWith(Cucumber.class)
           @CucumberOptions(
             feature="location of feature file"
             glue =  "location of step defs"
             dryRun= "true/false" true- generate snippets false runs the test
             tags=   "@smoke" based on this tags,scenarios in feature file will be triggered
             plugIns="used generate reports"

             )
        StepDefinitions -> keeps our defined steps from feature files
      3. How do parametrize your test data?
        We can directly parametrize in feature file with single quotation.
        We can also use DataTable and treat with Map interface from Java.
         feature: login in
          Scenario:

        Also, we can utilize Scenario Outline with Examples table.

         Scenario: happy path
             Given user is on main page of lambda user clicks on ajax submit form
             Then user enters name and message as follows
             #dataTable
             | name    | Ganbaa      |
             | message | hello world |




     */
}
