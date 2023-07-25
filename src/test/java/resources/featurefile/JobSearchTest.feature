@regression
Feature: Job search Test
  As a user I want to search a job into Uk library website

  @smoke
  Scenario Outline: Verify job search result using different dataSet
    Given I am on Homepage
    When I enter the job title "<job title>"
    And I enter the location "<location>"
    And I select the distance "<distance>"
    And I click on moreSearchOptionsLink
    And I enter the minimum salary "<salaryMin>"
    And I enter the maximum salary "<salaryMax>"
    And I select salaryType "<salaryType>"
    And I select jobType "<jobType>"
    And I click on find jobs button
    Then I verify the result "<result>"

    Examples:
      | job title        | location               | distance | salaryMin | salaryMax | salaryType | jobType        | result                                    |
      | Tester           | Harrow, Greater London | 5        | 30000     | 500000    | Per annum  | Permanent      | Permanent Tester jobs in Harrow           |
      | Developer        | Harrow                 | 15       | 40000     | 500000    | Per month  | Contract       | Contract Developer jobs in Harrow         |
      | Graphic Designer | London                 | 7        | 3000      | 4000      | Per week   | Temporary      | Temporary Graphic Designer jobs in London |
      | Salesforce       | Harrow, Greater London | 15       | 80000     | 500000    | Per month  | Permanent      | Permanent Salesforce jobs in Harrow       |
      | Data Analyst     | liverpool Uk           | 10       | 300       | 400       | Per day    | Temporary      | Temporary Data Analyst jobs               |
      | QA Tester        | liverpool Uk           | 7        | 4000      | 5000      | Per day    | Apprenticeship | Apprenticeship Qa Tester jobs             |



