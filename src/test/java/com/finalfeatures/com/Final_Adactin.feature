Feature: Hotel Room Booking In Adactin Application

@smokeTest
Scenario Outline: Log In


Given Enter The Url

When User Enter The "<username>" In the Username Field

And User Enter The "<password>" In The Password Field

Then User Click The Login Button And It Navigates To The Search Hotel Page

Examples:

|username|password|
|ara|123|
|vin|345|
|Aravind12|aravind12|

@sanityTest
Scenario: Search Hotel

When User Select The Location in the Location Field

And User Select The Hotel Name In the Hotel Field

And User Select The Room Type In The Room Type Field

And User Select The Number Of Rooms In Number Of Rooms Field

And User Enter The Check In Date In Check In Date Field

And User Enter The Check Out Date In Check Out Date Field

And User Enetr The Adults Per Room Detail In Adults Per Room Field

And User Enter The Children Per Room Detail In Children Per Room Field

Then User Click The Search Button And It Navigates To Select Hotel Page


@sanityTest
Scenario: Select Hotel

When User Select The Hotel Details In Select Field

Then User click The Continue Button And It Navigates To Book A Hotel Page

When User Enter The First Name In The First Name Field

And User Enter The Last Name In The Last Name Field

And User Enter the Billing Address In The Billing Address Field

And User Enter The Credit Card Number In The Credit Card Number Field

And User Select The Credit Card Type In The Credit Card Type Field

And User Select The Expiry Date In The Select Date Field

And User Select The Expiry Year In The Select Year Field

And User Enter The Cvv Number In The Cvv Number Field

Then User Click The Book Now Button And It Navigates To BookedItinerary


@regressionTest
Scenario: LogOut

Then User Click The Logout Button And The Process Exit Frome The AdactIn Application











