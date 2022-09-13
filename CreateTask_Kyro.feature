Feature: CREATE TASK

 Scenario: Successful CreateTask with Valid Credentials
     Given User Launch Chrome Browser
     When User open url "https://kyro.pages.dev/"
     And User should click on Login button
     And User enter Email as "ezra.sastry.musali@gmail.com" and password as "Ezrasastry@9"
     And click on Submit button 
     Then User should verify Home Page
     When User Click on Dashboard 
     And User should verify the Dashboard page
     And User Click on ViewAll button
     And User should verify the Project Name and Tasks
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
     
    
    
