Feature: Practice_Automation3
@TC_01
Scenario: Demosite registration-Invalid details
Given the user launch the browser
When the user opens the Practice automation website
Then the user enter the email and password
Then click_the_login_button
Then click_the Demo site button
Then fill all the invalid details in the register form
Then click on submit button

@TC_02
Scenario: Demosite -Mandatory fields
Given open_the_url_in a browser
When the url is opened click on demosite
Then fill only mandatory fields in the register form
Then click_on submit button

@TC_03
Scenario: Demosite-Refresh
Given the user has launched the browser
When the url is open and click on demosite
Then fill all the details
Then click on refresh

@TC_04
Scenario: Demosite-FileDownload
Given Open url in the browser
When automation site is opened
Then Click on more and filedownload
Then download the file

@TC_05
Scenario: Demosite-FileUpload
Given Opened url in the browser
When automation site is open
Then Click on more and fileUpload
Then upload the file

@TC_06
Scenario: Demosite registration-File Upload
Given Opens url in the browser
When automation site is opens
Then Click on SwitchTo and alerts
Then get the alert text

@TC_07
Scenario: Demosite registration-Remove file
Given the url is opened in the website
When the more is mouse overed and click on the File Upload
When File is Selected
Then remove the uploaded file

@TC_08
Scenario: Demosite registration-Leave mandatory fields
Given the url is open in the browser
When the demosite is clicked
When the details are given and leaving the mandatory fields
Then click on submit and take screenshot

@TC_09
Scenario: Demosite registration-Video play
Given the url is opened in the browser
When the url is launched click on demosite
When mouseover to the video and click on vimeo
When play the video 
Then tap on escape key and quit

@TC_10
Scenario: Demosite registration-Logout
Given open the url 
When url is launched login to the application
When enters the email and password and click on login
Then  click on logout 
