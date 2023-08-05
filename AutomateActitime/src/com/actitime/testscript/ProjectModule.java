package com.actitime.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListnerImplementation.class)
public class ProjectModule extends BaseClass {
	
	@Test
	public void testCreateProject() throws EncryptedDocumentException, IOException, Throwable
	{
		FileLib f=new FileLib();
		String projectName = f.getExcelData("CreateProject", 2, 4);
		String projectDescription = f.getExcelData("CreateProject", 1, 4);
		HomePage h=new HomePage(driver);
		h.setTasksTab();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewBtn().click();
		Thread.sleep(3000);
		t.getNewProjectDD().click();
		Thread.sleep(3000);
		t.getEnterProjectNameTbx().sendKeys(projectName);
		Thread.sleep(3000);
		t.getSelectCustDDBtn().click();
		Thread.sleep(3000);
		t.getOurCompanyOptionInCreateProject().click();
		Thread.sleep(3000);
		t.getProjectDescriptionTbx().sendKeys(projectDescription);
		Thread.sleep(3000);
		t.getCreateProjectBtn().click();
		Thread.sleep(3000);
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		try
		{
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		}
		catch(Exception e)
		{
			
		}
		wait.until(ExpectedConditions.textToBePresentInElement(t.getActualProjectID(), projectName ));
		
		String actualText = t.getActualProjectID().getText();
		Assert.assertEquals(actualText, "Banking Project");	

	}

}
