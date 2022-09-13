Feature: AddProject
Scenario: Successful AddProject details with Valid Credentials
     Given User Launch Chrome Browser
     When User open url "https://kyro.pages.dev/"
     And User should click on Login button
     And User enter Email as "ezra.sastry.musali@gmail.com" and password as "Ezrasastry@9"
     And click on Submit button 
     Then User should verify Home Page
     When User Click on Dashboard 
     And User should verify the Dashboard page
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
     
    
