package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	
	//----ADD NEW BUTTON 
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addNewBtn;
	
	//--------------------------------------------------CUSTOMER MODULE------------------------------------------------------------
	
	//-----NEW CUSTOMER BUTTON UNDER DROPDOWN
	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement newCustdd;
	
	//---ENTER CUSTOMER NAME TEXT-BOX IN CREATE NEW CUSTOMER POPUP
	@FindBy(xpath = "//input[contains(@class,'newNameField')]")
	private WebElement enterCustNameTbx;
	
	//---ENTER DESCRIPTION TEXT-BOX IN CREATE NEW CUSTOMER POPUP
	@FindBy(xpath = "//textarea[contains(@placeholder,'Customer Description')]")
	private WebElement descriptionTxtbx;
	
	//---SELECT CUSTOMER DD IN CREATE NEW CUSTOMER POPUP
	@FindBy(xpath = "//div[@class='dropdownButton']/..//div[text()='- Select Customer -']")
	private WebElement selectCustDD;
	
	//---SELECT BIG-BANG-COMPANY OPTION UNDER CUSTOMER-DD IN NEW CUSTOMER POPUP
	@FindBy(xpath = "//div[@class='searchItemList']//div[text()='Big Bang Company']")
	private WebElement bigBangCoOption;
	
	//---CREATE CUSTOMER BUTTON IN CREATE NEW CUSTOMER POPUP
	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement createCustBnt;
	
	//---ACTUAL CUSTOMER ID/TEXT OF CREATED CUSTOMER
	@FindBy(xpath = "//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualCustID;
	
	//-----------------------------------------------------PROJECT MODULE----------------------------------------------------------
	
	//---NEW PROJECT BUTTON UNDER DROPDOWN
	@FindBy(xpath = "//div[text()='+ New Project']")
	private WebElement newProjectDD;
	
	//---ENTER PROJECT NAME TEXT-BOX IN CREATE NEW PROJECT POPUP
	@FindBy(xpath = "//input[contains(@class,'inputNameField')]")
	private WebElement enterProjectNameTbx;
	
	//---CUSTOMER DD BUTTON IN CREATE NEW PROJECT POPUP
	@FindBy(xpath = "//div[contains(@class,'customerSelectorPlaceholder')]")
	private WebElement selectCustDDBtn;
	
	//--OUR COMPANY OPTION UNDER CUSTOMER DD IN CREATE NEW PROJECT POPUP
	@FindBy(xpath = "//div[contains(@class,'customerSelectorPlaceholder')]//div[text()='Our company']")
	private WebElement ourCompanyOptionInCreateProject;
	
	//---PROJECT DESCRIPTION TEXT-BOX IN CREATE NEW PROJECT POPUP
	@FindBy(xpath = "//textarea[@placeholder='Add Project Description']")
	private WebElement projectDescriptionTbx;
	
	//---CREATE PROJECT BUTTON IN CREATE NEW PROJECT POPUP
	@FindBy(xpath = "//div[text()='Create Project']")
	private WebElement createProjectBtn;
	
	//---ACTUAL PROJECT ID/TEXT OF THE CREATED PROJECT
	@FindBy(xpath = "//div[contains(@class,'titleEditButtonContainer')]//div[@class='title']")
	private WebElement actualProjectID;
	
	//------------------------------------------------TASK MODULE--------------------------------------------------------------------
	
	//---NEW TASK BUTTON UNDER DROP DOWN
	@FindBy(xpath = "//div[text()='+ New Tasks']")
	private WebElement newTasksDD;
	
	//---CUSTOMER DD IN CREATE-NEW-TASK-POPUP
	@FindBy(xpath = "//tr[@class='selectCustomerRow']//div[@class='dropdownButton']")
	private WebElement custDD;
	
	//--OUR-COMPANY OPTION UNDER CUSTOMER-DD IN CREATE-NEW-TASK-POPUP
	@FindBy(xpath = "//div[@class='searchItemList' and @style='display: block;']//div[text()='Our company']")
	private WebElement ourCompanyOptionInCreateTasks;
	
	//---SELECT-PROJECT-DD IN CREATE-NEW-TASK-POPUP
	@FindBy(xpath = "//div[contains(@class,'projectSelector ')]")
	private WebElement selectProjectDD;
	
	//---ACCOUNTING-OPTION UNDER SELECT-PROJECT-DD IN CREATE-NEW-TASK-POPUP
	@FindBy(xpath = "//div[contains(@class,'projectSelector ')]//div[text()='Accounting']")
	private WebElement accountingOption;
	
	//---ENTER-TASK-NAME-TEXT-BOX IN CREATE-NEW-TASK-POPUP
	@FindBy(xpath = "(//div[@id='createTasksPopup_content']//td[@class='nameCell first'])[1]")
	private WebElement enterTaskNameTxtBx;
	
	//----CREATE-TASKS-BUTTON IN CREATE-NEW-TASK-POPUP
	@FindBy(xpath = "//div[text()='Create Tasks']")
	private WebElement createTasksBtn;
	
	//---ACTUAL TASK ID/TEXT OF THE CREATED TASK
	@FindBy(xpath = "//tr[@class='taskRow noLastTrackingDate']")
	private WebElement actualTaskID;
	
	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//==============================================METHODS OF TASK-LIST-PAGE===========================================================
	
	//----ADD NEW BUTTON 
	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	//==================================================Methods Of Customer Module===========================================================
	
	//-----NEW CUSTOMER BUTTON UNDER DROPDOWN
	public WebElement getNewCustdd() {
		return newCustdd;
	}

	//---ENTER CUSTOMER NAME TEXT-BOX IN CREATE NEW CUSTOMER POPUP
	public WebElement getEnterCustNameTbx() {
		return enterCustNameTbx;
	}

	//---ENTER DESCRIPTION TEXT-BOX IN CREATE NEW CUSTOMER POPUP
	public WebElement getDescriptionTxtbx() {
		return descriptionTxtbx;
	}

	//---SELECT CUSTOMER DD IN CREATE NEW CUSTOMER POPUP
	public WebElement getSelectCustDD() {
		return selectCustDD;
	}

	//---SELECT BIG-BANG-COMPANY OPTION UNDER CUSTOMER-DD IN NEW CUSTOMER POPUP
	public WebElement getBigBangCoOption() {
		return bigBangCoOption;
	}

	//---CREATE CUSTOMER BUTTON IN CREATE NEW CUSTOMER POPUP
	public WebElement getCreateCustBnt() {
		return createCustBnt;
	}

	//---ACTUAL CUSTOMER ID/TEXT OF CREATED CUSTOMER
	public WebElement getActualCustID() {
		return actualCustID;
	}
	//=============================================Methods of project Module===============================================================

	//---NEW PROJECT BUTTON UNDER DROPDOWN
	public WebElement getNewProjectDD() {
		return newProjectDD;
	}

	//---ENTER PROJECT NAME TEXT-BOX IN CREATE NEW PROJECT POPUP
	public WebElement getEnterProjectNameTbx() {
		return enterProjectNameTbx;
	}

	//---CUSTOMER DD BUTTON IN CREATE NEW PROJECT POPUP
	public WebElement getSelectCustDDBtn() {
		return selectCustDDBtn;
	}

	//--OUR COMPANY OPTION UNDER CUSTOMER DD IN CREATE NEW PROJECT POPUP
		public WebElement getOurCompanyOptionInCreateProject() {
			return ourCompanyOptionInCreateProject;
	}
		
	//---PROJECT DESCRIPTION TEXT-BOX IN CREATE NEW PROJECT POPUP
	public WebElement getProjectDescriptionTbx() {
		return projectDescriptionTbx;
	}

	//---CREATE PROJECT BUTTON IN CREATE NEW PROJECT POPUP
	public WebElement getCreateProjectBtn() {
		return createProjectBtn;
	}

	//---ACTUAL PROJECT ID/TEXT OF THE CREATED PROJECT
	public WebElement getActualProjectID() {
		return actualProjectID;
	}

	//===========================================METHODS OF TASK MODULE======================================================
	
	//---NEW TASK BUTTON UNDER DROP DOWN
	public WebElement getNewTasksDD() {
		return newTasksDD;
	}

	//---CUSTOMER DD IN CREATE-NEW-TASK-POPUP
	public WebElement getCustDD() {
		return custDD;
	}

	//--OUR-COMPANY OPTION UNDER CUSTOMER-DD IN CREATE-NEW-TASK-POPUP
	public WebElement getOurCompanyOptionInCreateTasks() {
		return ourCompanyOptionInCreateTasks;
	}

	//---SELECT-PROJECT-DD IN CREATE-NEW-TASK-POPUP
	public WebElement getSelectProjectDD() {
		return selectProjectDD;
	}

	//---ACCOUNTING-OPTION UNDER SELECT-PROJECT-DD IN CREATE-NEW-TASK-POPUP
	public WebElement getAccountingOption() {
		return accountingOption;
	}

	//---ENTER-TASK-NAME-TEXT-BOX IN CREATE-NEW-TASK-POPUP
	public WebElement getEnterTaskNameTxtBx() {
		return enterTaskNameTxtBx;
	}

	//----CREATE-TASKS-BUTTON IN CREATE-NEW-TASK-POPUP
	public WebElement getCreateTasksBtn() {
		return createTasksBtn;
	}

	//---ACTUAL TASK ID/TEXT OF THE CREATED TASK
	public WebElement getActualTaskID() {
		return actualTaskID;
	}
	
	
	
}
