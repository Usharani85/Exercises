Feature: This feature is used to validation app place API's
@addPlace
Scenario Outline: This is used to validate app place request
 Given Add place payload with "<name>" and "<language>" and "<Address>"
 When user calls "addPlaceAPI" with "POST" http request
 Then verify the response and the status code is 200
 And verify the "status" code is "OK"
 And verify the "scope" code is "APP"
 And verify place_id created  maps to "<name>" using "getPlaceAPI" 
 Examples:
 | name | language | Address    |
 |Henry| French   |Peter Street|
 |james	| Italian  |Newyork street|
 
 @deletePlace
 Scenario: verify delete operatios is performed successfully
 Given Delete payload
 When user calls "deletePlaceAPI" with "POST" http request
 Then verify the response and the status code is 200
 And verify the "status" code is "OK"