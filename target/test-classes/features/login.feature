Feature: QT recognition
Scenario Outline: Login to the application

Given Initialize the browser with the chrome
And navigate to "https://qtrecognition.testqtwiz.com" site
When User enters <username> and <password>
And click on login button
Then close the session

Examples:
|username	|password	|
|madhu.niloor@qualitestgroup.com	|p@ssw0rd	|
|test1	|test2	|