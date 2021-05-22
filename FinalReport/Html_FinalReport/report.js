$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/Final_Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Room Booking In Adactin Application",
  "description": "",
  "id": "hotel-room-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Log In",
  "description": "",
  "id": "hotel-room-booking-in-adactin-application;log-in",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Enter The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User Enter The \"\u003cusername\u003e\" In the Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User Enter The \"\u003cpassword\u003e\" In The Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User Click The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "hotel-room-booking-in-adactin-application;log-in;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 17,
      "id": "hotel-room-booking-in-adactin-application;log-in;;1"
    },
    {
      "cells": [
        "ara",
        "123"
      ],
      "line": 18,
      "id": "hotel-room-booking-in-adactin-application;log-in;;2"
    },
    {
      "cells": [
        "vin",
        "345"
      ],
      "line": 19,
      "id": "hotel-room-booking-in-adactin-application;log-in;;3"
    },
    {
      "cells": [
        "Aravind12",
        "aravind12"
      ],
      "line": 20,
      "id": "hotel-room-booking-in-adactin-application;log-in;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "Log In",
  "description": "",
  "id": "hotel-room-booking-in-adactin-application;log-in;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Enter The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User Enter The \"ara\" In the Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User Enter The \"123\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User Click The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Adactin.enter_The_Url()"
});
formatter.result({
  "duration": 9585538700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ara",
      "offset": 16
    }
  ],
  "location": "Step_Adactin.user_Enter_The_In_the_Username_Field(String)"
});
formatter.result({
  "duration": 502678400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 16
    }
  ],
  "location": "Step_Adactin.user_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 203984700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Adactin.user_Click_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 812763900,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Log In",
  "description": "",
  "id": "hotel-room-booking-in-adactin-application;log-in;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Enter The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User Enter The \"vin\" In the Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User Enter The \"345\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User Click The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Adactin.enter_The_Url()"
});
formatter.result({
  "duration": 5478864900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vin",
      "offset": 16
    }
  ],
  "location": "Step_Adactin.user_Enter_The_In_the_Username_Field(String)"
});
formatter.result({
  "duration": 240263900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "345",
      "offset": 16
    }
  ],
  "location": "Step_Adactin.user_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 127894700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Adactin.user_Click_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 637312000,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Log In",
  "description": "",
  "id": "hotel-room-booking-in-adactin-application;log-in;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Enter The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User Enter The \"Aravind12\" In the Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User Enter The \"aravind12\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User Click The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Adactin.enter_The_Url()"
});
formatter.result({
  "duration": 5594780700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Aravind12",
      "offset": 16
    }
  ],
  "location": "Step_Adactin.user_Enter_The_In_the_Username_Field(String)"
});
formatter.result({
  "duration": 259641500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aravind12",
      "offset": 16
    }
  ],
  "location": "Step_Adactin.user_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 201230000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Adactin.user_Click_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1388113700,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Search Hotel",
  "description": "",
  "id": "hotel-room-booking-in-adactin-application;search-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "User Select The Location in the Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User Select The Hotel Name In the Hotel Field",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User Select The Room Type In The Room Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User Select The Number Of Rooms In Number Of Rooms Field",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User Enter The Check In Date In Check In Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User Enter The Check Out Date In Check Out Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "User Enetr The Adults Per Room Detail In Adults Per Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User Enter The Children Per Room Detail In Children Per Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "User Click The Search Button And It Navigates To Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Adactin.user_Select_The_Location_in_the_Location_Field()"
});
formatter.result({
  "duration": 254328900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Adactin.user_Select_The_Hotel_Name_In_the_Hotel_Field()"
});
formatter.result({
  "duration": 301776700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Adactin.user_Select_The_Room_Type_In_The_Room_Type_Field()"
});
formatter.result({
  "duration": 206863800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Adactin.user_Select_The_Number_Of_Rooms_In_Number_Of_Rooms_Field()"
});
formatter.result({
  "duration": 202417900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Adactin.user_Enter_The_Check_In_Date_In_Check_In_Date_Field()"
});
formatter.result({
  "duration": 145201600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Adactin.user_Enter_The_Check_Out_Date_In_Check_Out_Date_Field()"
});
formatter.result({
  "duration": 163666200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Adactin.user_Enetr_The_Adults_Per_Room_Detail_In_Adults_Per_Room_Field()"
});
formatter.result({
  "duration": 268511700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Adactin.user_Enter_The_Children_Per_Room_Detail_In_Children_Per_Room_Field()"
});
formatter.result({
  "duration": 295722100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Adactin.user_Click_The_Search_Button_And_It_Navigates_To_Select_Hotel_Page()"
});
formatter.result({
  "duration": 1024789900,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "Select Hotel",
  "description": "",
  "id": "hotel-room-booking-in-adactin-application;select-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 44,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 47,
  "name": "User Select The Hotel Details In Select Field",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "User click The Continue Button And It Navigates To Book A Hotel Page",
  "keyword": "Then "
});
formatter.step({
  "line": 51,
  "name": "User Enter The First Name In The First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 53,
  "name": "User Enter The Last Name In The Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "User Enter the Billing Address In The Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "User Enter The Credit Card Number In The Credit Card Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "User Select The Credit Card Type In The Credit Card Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "User Select The Expiry Date In The Select Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "User Select The Expiry Year In The Select Year Field",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "User Enter The Cvv Number In The Cvv Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "User Click The Book Now Button And It Navigates To BookedItinerary",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Adactin.user_Select_The_Hotel_Details_In_Select_Field()"
});
formatter.result({
  "duration": 161439300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Adactin.user_click_The_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 1085637200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Adactin.user_Enter_The_First_Name_In_The_First_Name_Field()"
});
formatter.result({
  "duration": 234885600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Adactin.user_Enter_The_Last_Name_In_The_Last_Name_Field()"
});
formatter.result({
  "duration": 294127800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Adactin.user_Enter_the_Billing_Address_In_The_Billing_Address_Field()"
});
formatter.result({
  "duration": 212371300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Adactin.user_Enter_The_Credit_Card_Number_In_The_Credit_Card_Number_Field()"
});
formatter.result({
  "duration": 274978900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Adactin.user_Select_The_Credit_Card_Type_In_The_Credit_Card_Type_Field()"
});
formatter.result({
  "duration": 201406300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Adactin.user_Select_The_Expiry_Date_In_The_Select_Date_Field()"
});
formatter.result({
  "duration": 203142400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Adactin.user_Select_The_Expiry_Year_In_The_Select_Year_Field()"
});
formatter.result({
  "duration": 223319200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Adactin.user_Enter_The_Cvv_Number_In_The_Cvv_Number_Field()"
});
formatter.result({
  "duration": 188146700,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});