Feature: Login

 Scenario: Successful Login with Valid Credentials
     Given User Launch Chrome Browser
     When User open url "https://kyro.pages.dev/"
     And User should click on Login button
     And User enter Email as "ezra.sastry.musali@gmail.com" and password as "Ezrasastry@9"
     And click on Submit button 
     Then User should verify Home Page with keyword "Risks"
  
