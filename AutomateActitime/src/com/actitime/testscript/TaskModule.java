package com.actitime.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
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
public class TaskModule extends BaseClass {
	
	@Test
	public void testCreateTask() throws EncryptedDocumentException, IOException, Throwable
	{
		FileLib f=new FileLib();
		String taskName = f.getExcelData("CreateTask", 1, 3);
		
		HomePage h=new HomePage(driver);
		h.setTasksTab();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewBtn().click();
		Thread.sleep(3000);
		t.getNewTasksDD().click();
		Thread.sleep(3000);
		t.getCustDD().click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(t.getOurCompanyOptionInCreateTasks()));
		t.getOurCompanyOptionInCreateTasks().click();//ghg
		Thread.sleep(3000);
		t.getSelectProjectDD().click();
		
		Thread.sleep(3000);
		t.getAccountingOption().click();
		Thread.sleep(3000);
		t.getEnterTaskNameTxtBx().sendKeys(taskName);
		Thread.sleep(3000);
		t.getCreateTasksBtn().click();
		Thread.sleep(3000);
		String actualText = t.getActualTaskID().getText();
		Assert.assertEquals(actualText, taskName);
	}
	
	

}
