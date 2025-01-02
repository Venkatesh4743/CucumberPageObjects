Feature: Searching new cars
  In order to search new car 
  As a user 
  I have to navigate to carwale.com

  Scenario Outline: Finding new cars
    Given user navigates to carwale website
    When user mouseover to new cars
    Then clicks on Findnewcars
    And user clicks on "<carBrand>" car
    And user validates carTitle as "<carTitle>"

    Examples: 
      | carBrand | carTitle    |
      | Toyota   | Toyota Cars |
      | Kia      | Kia Cars    |
      | Honda    | Honda Cars  |
      | BMW      | BMW Cars    |
