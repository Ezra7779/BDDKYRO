Feature: Insception of All Functionality of KYRO

 Scenario: Successful Login with Valid Credentials
     Given User Launch Chrome Browser
     When User open url "https://kyro.pages.dev/"
     And User should click on Login button
     And User enter Email as "ezra.sastry.musali@gmail.com" and password as "Ezrasastry@9"
     And click on Submit button 
     Then User should verify Home Page with keyword "Risks"
  
     When User Click on Dashboard 
     And User should verify the Dashboard page with keyword "Project Owner, CenterPoint Energy"
     And User Click on New Project button
     And User enter Startdate as "09/06/2022" and enddate as "09/07/2025"
     And User enter Project Name as "construction" 
     And User enter Department Details 
     And User enter Owner as "Ezra" 
     And User enter Source Template
     And User enter Project Type 
     And User enter Cost Center as "3 crores" 
     And User enter Poc as "75 percentage of work is completed" 
     And User click on Submit button
     Then User should verify the project update on Dashboard
     
    
      And User Click on ViewAll button
     And User should verify the Project Name and Tasks with Keyword "Summary"
     And User click on CreateTask button 
     And User enter summary as "It is MEGA Project"
     And User enter tasktype as "civil construction type like NH-6 Way Road"
     And User enter description as "Complex  Project"
     And User enter Priority
     And User enter location as "Chennai"
     And User enter Startingdate as "09/06/2022" and endingdate as "09/07/2025"
     And User click on submit button
     Then User should verify the Task 
     When User click on Dashboard
     And User should click on Flag on Top Right 
     And User click on Logout option
     
    
    