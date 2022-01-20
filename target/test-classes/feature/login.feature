Feature: Login to the amazon application


Scenario: User should able to login with valid crendtials only

Given Open the application using browser

And User navigate to the application url

When  User should enter username as saipattabhi18@gmail.com into the fields


And User should click on continue button

When User should enter password as Sai@2255 in to the fields
When User should click on the sigin button
When User should click on the amazonpay button
When User should click on the electricity icon
When  User should click on state
When User should select electricity board
When User enter servicenumber as 14421602100000551 in to the fields
And  User clicks on the fetch button
Then User should see the alert on the display



