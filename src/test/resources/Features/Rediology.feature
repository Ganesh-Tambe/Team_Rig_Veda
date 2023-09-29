Feature: testing rediology  functinality of webpage

Background: 
Given  visitor should be on "https://demo.smart-hospital.in/patient/dashboard" 
When visitor click on sign in
And visitor click on Rediology

@tabale_data_access
Scenario: checking Rediology functinality
Then visitor should get the table data



@positive @searchbill_and_assert 
Scenario:
 : checking rediology  functanility
And then visitor should search for bill <bill_no>

|RADIOB107|

And then click on view
And assert the text
Then click on close

@negative @searchbill_and_assert
Scenario: checking rediology  functanility
And then visitor should search for bill <bill_no>


|RADIOB107|
And then click on view
And assert the text
Then click on close


@positive @testing_caseid
Scenario Outline: case searching and veiwing it's details 
And search case id in search box <caseid>
|4130|
And click on view payment 
And assert the result



@negative @testing_caseid
Scenario Outline: case searching and veiwing it's details 
And search case id in search box "<caseid>"


And click on view payment 
And assert the result
Examples:
|caseid|
|4130|
|3212|
|4130|


 
 
