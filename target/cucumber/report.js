$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CreateNewUser.feature");
formatter.feature({
  "line": 2,
  "name": "Login Action",
  "description": "",
  "id": "login-action",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user is on Home Page \"browser\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "browser",
      "offset": 22
    }
  ],
  "location": "NewUserCreation.user_is_on_home_page(String)"
});
formatter.result({
  "duration": 11295111100,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Create New User",
  "description": "",
  "id": "login-action;create-new-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "User navigate to Login Page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters new user details",
  "rows": [
    {
      "cells": [
        "Female",
        "fname4",
        "lname4",
        "testaddress",
        "san diago",
        "CaL",
        "1025",
        "Egypt",
        "10215488751",
        "23/09/1985",
        "mtest4@test.com",
        "P@ssw0rd",
        "P@ssw0rd"
      ],
      "line": 10
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "New User is created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUserCreation.user_navigate_to_login_page()"
});
formatter.result({
  "duration": 4127849500,
  "status": "passed"
});
formatter.match({
  "location": "NewUserCreation.user_enters_new_user_details(DataTable)"
});
formatter.result({
  "duration": 2942633000,
  "status": "passed"
});
formatter.match({
  "location": "NewUserCreation.new_user_is_created()"
});
formatter.result({
  "duration": 30053442100,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"h1#createAcctSuccessHeading\"}\n  (Session info: chrome\u003d55.0.2883.87)\n  (Driver info: chromedriver\u003d2.27.440174 (e97a722caafc2d3a8b807ee115bfb307f7d2cfd9),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 30.05 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.0.1\u0027, revision: \u00271969d75\u0027, time: \u00272016-10-18 09:49:13 -0700\u0027\nSystem info: host: \u0027WIN-OPE5MEVAQUN\u0027, ip: \u0027192.168.159.128\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_151\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.27.440174 (e97a722caafc2d3a8b807ee115bfb307f7d2cfd9), userDataDir\u003dC:\\Users\\INTEGR~1\\AppData\\Local\\Temp\\scoped_dir1620_27745}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d55.0.2883.87, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: c2209c3c9776145dabbce35941d6bbfd\n*** Element info: {Using\u003dcss selector, value\u003dh1#createAcctSuccessHeading}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:635)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:368)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:465)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:430)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.getText(Unknown Source)\r\n\tat PageFactory.LoginPage.accountCreationConfirmationMessage(LoginPage.java:104)\r\n\tat stepDefinition.NewUserCreation.new_user_is_created(NewUserCreation.java:49)\r\n\tat ✽.Then New User is created successfully(CreateNewUser.feature:11)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 814083400,
  "status": "passed"
});
});