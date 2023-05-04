package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.csm.CSM_CertificateObj;
import resources.BaseClass;

public class CSM_CertificateSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	CSM_CertificateObj certificateObj = new CSM_CertificateObj(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);

	@And("^click on certificate feature$")
	public void click_on_certificate_feature() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(certificateObj.csmCertificateFeature());
				clicksAndActionsHelper.moveToElement(certificateObj.csmCertificateFeature());
				clicksAndActionsHelper.clickOnElement(certificateObj.csmCertificateFeature());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^click on maintenance under certifiate$")
	public void click_on_maintenance_under_certifiate() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, certificateObj.certificateMaintenance());
		clicksAndActionsHelper.moveToElement(certificateObj.certificateMaintenance());
		clicksAndActionsHelper.clickOnElement(certificateObj.certificateMaintenance());
	}

	@And("^enter the certificate type in certificate feature$")
	public void enter_the_certificate_type_in_certificate_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, certificateObj.certificateMaintenanceCertificateTypeInput());
		clicksAndActionsHelper.moveToElement(certificateObj.certificateMaintenanceCertificateTypeInput());
		clicksAndActionsHelper.clickOnElement(certificateObj.certificateMaintenanceCertificateTypeInput());
		certificateObj.certificateMaintenanceCertificateTypeInput().sendKeys("7878237");
		waitHelper.waitForElementwithFluentwait(driver, certificateObj.certificateMaintenanceLabel());
		clicksAndActionsHelper.moveToElement(certificateObj.certificateMaintenanceLabel());
		clicksAndActionsHelper.clickOnElement(certificateObj.certificateMaintenanceLabel());
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(certificateObj.certificateMaintenanceCertificateTypeDescription().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {

			}

		}
	}

	@And("^enter the CIF number in certificate feature$")
	public void enter_the_cif_number_in_certificate_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, certificateObj.certificateMaintenanceCIFNumberInput());
		clicksAndActionsHelper.moveToElement(certificateObj.certificateMaintenanceCIFNumberInput());
		clicksAndActionsHelper.clickOnElement(certificateObj.certificateMaintenanceCIFNumberInput());
		certificateObj.certificateMaintenanceCIFNumberInput().sendKeys("78");
		waitHelper.waitForElementwithFluentwait(driver, certificateObj.certificateMaintenanceLabel());
		clicksAndActionsHelper.moveToElement(certificateObj.certificateMaintenanceLabel());
		clicksAndActionsHelper.clickOnElement(certificateObj.certificateMaintenanceLabel());
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(certificateObj.certificateMaintenanceCIFNumberDescription().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {

			}

		}
	}

	@And("^enter the number of bills in certificate feature$")
	public void enter_the_number_of_bills_in_certificate_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, certificateObj.certificateMaintenanceNumberOfBillsInput());
		clicksAndActionsHelper.moveToElement(certificateObj.certificateMaintenanceNumberOfBillsInput());
		clicksAndActionsHelper.clickOnElement(certificateObj.certificateMaintenanceNumberOfBillsInput());
		certificateObj.certificateMaintenanceNumberOfBillsInput().sendKeys("78");
	}

	@And("^enter the total number of bills in certificate feature$")
	public void enter_the_total_number_of_bills_in_certificate_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, certificateObj.certificateMaintenanceTotalAmountOfBillsInput());
		clicksAndActionsHelper.moveToElement(certificateObj.certificateMaintenanceTotalAmountOfBillsInput());
		clicksAndActionsHelper.clickOnElement(certificateObj.certificateMaintenanceTotalAmountOfBillsInput());
		certificateObj.certificateMaintenanceTotalAmountOfBillsInput().sendKeys("78");
	}

	@And("^select the active credit account$")
	public void select_the_active_credit_account() throws Throwable {
waitHelper.waitForElementwithFluentwait(driver, certificateObj.certificateCreditAccount());
clicksAndActionsHelper.moveToElement(certificateObj.certificateCreditAccount());
clicksAndActionsHelper.clickOnElement(certificateObj.certificateCreditAccount());
	}

	@And("^select the active debit account$")
	public void select_the_active_debit_account() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, certificateObj.certificateDeductFromAccount());
		clicksAndActionsHelper.moveToElement(certificateObj.certificateDeductFromAccount());
		clicksAndActionsHelper.clickOnElement(certificateObj.certificateDeductFromAccount());
	}

	@And("^click on charges button$")
	public void click_on_charges_button() throws Throwable {

	}

}
