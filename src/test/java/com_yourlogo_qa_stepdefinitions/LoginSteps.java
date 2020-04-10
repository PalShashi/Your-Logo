/*
package com_yourlogo_qa_stepdefinitions;

import com_yourlogo_qa_base.Base;
import com_yourlogo_qa_base.Hooks;
import com_yourlogo_qa_pages.CreateAccountPage;
import com_yourlogo_qa_pages.LoginPage;
import com_yourlogo_qa_utils.Constant;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class LoginSteps<Order> {
    private Properties prop;
    private WebDriver driver;
    private Base base;
    private LoginPage loginPage;
    private CreateAccountPage createAccount;

    // Constant constant = new Constant();

    //Hooks hook = new Hooks();


    @Before
    public void setUp() {
        base = new Base();
        prop = base.property();
        driver = base.browser();
        loginPage = new LoginPage(driver);
        createAccount = new CreateAccountPage(driver);


    }

    @After
    public void tearDown() {

        driver.close();
    }
// login page steps or methods

    @Given("^user is on home page of application$")
    public void user_is_on_home_page() {
        String title = loginPage.title();
        Assert.assertEquals("My Store", title);
        // assertThat(title, is(endsWith("Login - My Store")));


    }

    @And("^user click on signin link$")
    public void click_on_signin_button() {

        loginPage.goToLogin();
    }

    @When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enter_and(String username, String password) {
        loginPage.enterLoginEmailAndPassword(username, password);

    }

    @When("^user click on login button$")
    public void click_on_login_button() {
        loginPage.clickOnLoginButton();


    }

    @Then("^user should login$")
    public void user_should_login() {

    }

    @Then("^user shold land on Service dashboard page$")
    public void user_shold_land_on_Service_dashboard_page() {

    }

    @When("^user enter invalid \"([^\"]*)\" and valid \"([^\"]*)\"$")
    public void user_enter_invalid_and_valid(String emailid, String password) {
        loginPage.enterLoginEmailAndPassword(emailid, password);

    }

    @Then("^email field should get highlighted and an error message will appear$")
    public void email_field_should_get_highlighted_and_an_error_message_will_appear() {
        String errorMessage = loginPage.invalidEmailid();
        //assertthat(errorMessage,is(contains("")));
        Assert.assertEquals(errorMessage, "Authentication failed.");
    }

    @When("^user enter valid \"([^\"]*)\" and invalid \"([^\"]*)\"$")
    public void user_enter_valid_and_invalid(String emailid, String password) {
        loginPage.enterLoginEmailAndPassword(emailid, password);
    }

    @Then("^password field should get highlighted and get an error message should appear$")
    public void password_field_should_get_highlighted_and_get_an_error_message_should_appear() {
        String errorMessage = loginPage.invalidpassword();
        Assert.assertEquals("Authentication failed.", errorMessage);

    }

    @When("^user enter click on forget password link$")
    public void user_enter_click_on_forget_password_link() {
        loginPage.forgotPassword();

    }

    @Then("^user should navigate to forget password page$")
    public void user_should_navigate_to_forget_password_page() {
        String header = loginPage.forgotPasswordHeader();
        Assert.assertEquals("FORGOT YOUR PASSWORD?", header);

    }

    @When("^user enter registered \"([^\"]*)\"$")
    public void user_enter_regestered_emaild_is(String emailid) {
        loginPage.enterLoginEmailid(emailid);

    }

    @When("^click on reterieve password button$")
    public void click_on_reterieve_password_button() {
        loginPage.retrievePassword();
    }

    @Then("^a password reset message will appear on user screen$")
    public void a_password_reset_message_will_appear_on_user_screen() {
        String resetPassword = loginPage.passwordResetMessage();
        assertThat(resetPassword, is(endsWith("sent to your address: shashi@yahoo.com")));

    }

    @Then("^a reset password email has been sent to the user account$")
    public void a_reset_password_email_has_been_sent_to_the_user_account() {
        // Write code here that turns the phrase above into concrete actions

    }

    // create account steps


    @Given("^user is on login page$")
    public void user_is_on_login_page() {
        loginPage.goToLogin();

    }

    @Given("^user go to create an account component$")
    public void user_go_to_create_an_account_component() {
        String header = loginPage.createAccountPageHeader();
        Assert.assertEquals(Constant.CREATE_ACCOUNT_COMPONENT_HEADER, header);

    }

    @When("^user enter his valid emailid$")
    public void user_enter_his_validEmail(DataTable email) {
        List<List<String>> emailid = email.raw();
        loginPage.createAnAccountEmailId(emailid.get(0).get(0));

    }

    @When("^user click on create an account button$")
    public void user_click_on_create_on_login_button() {
        loginPage.clickOnCreateAccountButton();

    }

    @Then("^user should navigate to create an account form$")
    public void user_should_navigate_to_create_an_account_form() {
        String header = loginPage.accounFormHeader();
        Assert.assertEquals(Constant.ACCOUNT_FORM_HEADER, header);

    }

    @When("^user select the title$")
    public void user_select_the_title() {
        createAccount.selecTitle();

    }

    @When("^user enters first name and last name$")
    public void user_enters_firstName_LastName(DataTable credentials) {
        for (Map<String, String> values : credentials.asMaps(String.class, String.class)) {
            createAccount.enterFirstAndLastName(values.get("firstName"), values.get("lastName"));

        }

    }

    @When("^user create an password minimum of five character$")
    public void user_create_an_minimum_of_five_character(DataTable password) {
        List<List<String>> pswd = password.raw();
        createAccount.createPassword(pswd.get(0).get(0));

    }

    @When("^user select his date of birth from dropdown menu$")
    public void user_select_his_date_of_birth_from_dropdown_menu() {

        createAccount.enterDateOfBirth();
    }

    @When("^user click on newsletter checkbox$")
    public void user_click_on_newsletter_checkbox() {
        createAccount.selectNewsLetterCheckBox();
    }

    @When("^user enter address and city and postcode$")
    public void user_enter_address_and_city_and_postcode(DataTable details) {
        for (Map<String, String> detail : details.asMaps(String.class, String.class)) {
            createAccount.address(detail.get("Address"), detail.get("city"), detail.get("Postcode"));
        }

    }

    @When("^user select state and country$")
    public void user_select_state_and_country() {
        createAccount.selectStateAndCountry();
    }

    @When("^user enter phone number and alias refrence$")
    public void user_enter_phone_number_and_alias_refrence(DataTable info) {
        List<List<String>> data = info.raw();
        createAccount.setMobileNoNumberAndAliasRefrence(data.get(0).get(0), data.get(0).get(1));

    }

    @When("^user click on register button$")
    public void user_click_on_register_button() {
        createAccount.submitAccountRegistrationForm();
    }

    @Then("^user should be register$")
    public void user_should_be_register() {

    }
    // register account without mandatory field and already existed email address

    @Given("^user is on registration info page$")
    public void user_is_on_registration_info_page() {
        loginPage.goToLogin();
        loginPage.createAnAccountEmailId("shd@yahoo.com");
        loginPage.clickOnCreateAccountButton();

    }

    @When("^user enter date of birth$")
    public void user_enter_date_of_birth() {
        createAccount.enterDateOfBirth();
    }


    @When("^user enter \"([^\"]*)\" in address line two$")
    public void user_enter_in_address_line(String add) {
        createAccount.addressline2(add);

    }

    @When("^user enter \"([^\"]*)\" additional information$")
    public void user_enter_additional_information(String info) {
        createAccount.additionalInformation(info);

    }

    @Then("^user should get an error message$")
    public void user_should_get_an_error_message() {
        createAccount.mandatoryFieldErrorMessage();
        boolean value = createAccount.mandatoryFieldErrorMessage().contains("lastname is required.");
        Assert.assertTrue(value);

    }

    @When("^user enter already registered \"([^\"]*)\"$")
    public void user_enter_already_registered(String emailid) {

        loginPage.createAnAccountEmailId(emailid);

    }

    @Then("^user should get an invalid email error message$")
    public void invalidEmailid() {
        String errorMessage = createAccount.existedEmailidErrorMessage();
        assertThat(errorMessage, is(endsWith("Please enter a valid password or request a new one.")));
    }

}

*/
