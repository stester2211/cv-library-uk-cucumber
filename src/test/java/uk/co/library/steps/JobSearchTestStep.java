package uk.co.library.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchTestStep {

    @Given("I am on Homepage")
    public void iAmOnHomepage() {
    }

    @When("I enter the job title {string}")
    public void iEnterTheJobTitle(String jobTitle) {
        new HomePage().enterJobTitle(jobTitle);
    }

    @And("I enter the location {string}")
    public void iEnterTheLocation(String location) {
        new HomePage().enterLocation(location);
    }

    @And("I select the distance {string}")
    public void iSelectTheDistance(String distance) {
        new HomePage().selectDistance(distance);
    }

    @And("I click on moreSearchOptionsLink")
    public void iClickOnMoreSearchOptionsLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("I enter the minimum salary {string}")
    public void iEnterTheMinimumSalary(String salaryMin) {
        new HomePage().enterMinSalary(salaryMin);
    }

    @And("I enter the maximum salary {string}")
    public void iEnterTheMaximumSalary(String salaryMax) {
        new HomePage().enterMaxSalary(salaryMax);
    }

    @And("I select salaryType {string}")
    public void iSelectSalaryType(String salaryType) {
        new HomePage().selectSalaryType(salaryType);
    }

    @And("I select jobType {string}")
    public void iSelectJobType(String jobType) {
        new HomePage().selectJobType(jobType);
    }

    @And("I click on find jobs button")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnFindJobsButton();
    }

    @Then("I verify the result {string}")
    public void iVerifyTheResult(String result) {
        Assert.assertEquals("No verify text found", result, new ResultPage().verifyResultText(result));
    }


}
