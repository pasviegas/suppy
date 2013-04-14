Feature: Stock control

Scenario: Add to stock
	Given I am a user with id 4
	When I add these skus to my stock:
	| id | name |
	| 1  | Dove |
	| 2  | Whey |
	Then it should have 2 item on it

