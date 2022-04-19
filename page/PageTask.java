package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageTask {
	public WebDriver driver;

	public PageTask(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

@FindBy(xpath = "//a[@href='/popups/Tasks']//*[name()='svg']")
private WebElement ClickTaskButton;

public WebElement getClickTaskButton() {
return ClickTaskButton;
}
@FindBy(xpath = "//body/div[@id='root']/div[@class='App']/div[@class='app-body']/div[@class='task-container']/div[@id='task-block']/div[@class='tk-px-40']/div[@class='tk-cd-top-layer']/div[2]")
private WebElement ClickEditButton;

public WebElement getClickEditButton() {
return ClickEditButton;
}
@FindBy(xpath = "//input[@placeholder='New Category Name']")
private WebElement EnterNewCategory;

public WebElement getEnterNewCategory() {
return EnterNewCategory;
}
@FindBy(xpath = "(//button[normalize-space()='New Category'])[1]")
private WebElement ClickNewCategory;

public WebElement getClickNewCategory() {
return ClickNewCategory;
}
@FindBy(xpath = "//div[@class='ad-tk-close']//*[name()='svg']")
private WebElement clickClose;

public WebElement getclickClose() {
return clickClose;
}
@FindBy(xpath = "(//div[@class='tk-cd-right-btn'][normalize-space()='Edit'])[2]")
private WebElement clickStatusEdit;

public WebElement getclickStatusEdit() {
return clickStatusEdit;
}
@FindBy(xpath = "//input[@placeholder='Status Name']")
private WebElement EnterStausName;

public WebElement getEnterStausName() {
return EnterStausName;
}
@FindBy(xpath = "//select[@name='status_category']")
private WebElement ClickStatus;

public WebElement getClickStatus() {
return ClickStatus;
}
@FindBy(xpath = "//select[@name='status_category']//option[@value='3'][normalize-space()='In Progress']")
private WebElement SelectInProgress;

public WebElement getSelectInProgress() {
return SelectInProgress;
}
@FindBy(xpath = "//select[@id='select_cat']")
private WebElement ClickCategory;

public WebElement getClickCategory() {
return ClickCategory;
}
@FindBy(xpath = "//select[@id='select_cat']//option[@value='6'][normalize-space()='Fever']")
private WebElement SelectFever;

public WebElement getSelectFever() {
return SelectFever;
}
@FindBy(xpath = "//button[normalize-space()='New Status']")
private WebElement ClickNewsStatses;

public WebElement getClickNewsStatses() {
return ClickNewsStatses;
}
@FindBy(xpath = "//div[@class='ad-tk-close']//*[name()='svg']")
private WebElement ClickClose;

public WebElement getClickClose() {
return ClickClose;
}
@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]")
private WebElement ClickEditTaskTemplate;

public WebElement getClickEditTaskTemplate() {
return ClickEditTaskTemplate;
}
@FindBy(xpath = "//button[normalize-space()='Create New Template']")
private WebElement ClickCreateNewTemplate;

public WebElement getClickCreateNewTemplate() {
return ClickCreateNewTemplate;
}
@FindBy(xpath = "//div[@id='create_template']//div[1]//div[1]//div[2]//input[1]")
private WebElement EnterTitle;

public WebElement getEnterTitle() {
return EnterTitle;
}
@FindBy(xpath = "//div[@class='modal_body mod_bod_alt modal-body']//div[2]//div[1]//div[2]//select[1]")
private WebElement CickAssignee;

public WebElement getCickAssignee() {
return CickAssignee;
}
@FindBy(xpath = "//select[@class='form-control']//option[@value='7'][normalize-space()='Tech1 Test']")
private WebElement selectTech1Test;

public WebElement getselectTech1Test() {
return selectTech1Test;
}
@FindBy(xpath = "//input[@name='template_name']")
private WebElement EnterTemplateName;

public WebElement getEnterTemplateName() {
return EnterTemplateName;
}
@FindBy(xpath = "//div[@class='cr-tem-date']//input[1]")
private WebElement EnterDay;

public WebElement getEnterDay() {
return EnterDay;
}
@FindBy(xpath = "(//input[@type='tel'])[2]")
private WebElement EnterHour;

public WebElement getEnterHour() {
return EnterHour;
}
@FindBy(xpath = "(//input[@type='tel'])[3]")
private WebElement EnterMin;

public WebElement getEnterMin() {
return EnterMin;
}
@FindBy(xpath = "(//select[@class='form-control'])[4]")
private WebElement Selectcategory;

public WebElement getSelectcategory() {
return Selectcategory;
}
@FindBy(xpath = "//option[@value='8'][normalize-space()='capminds']")
private WebElement SelectCapminds;

public WebElement getSelectCapminds() {
return SelectCapminds;
}
@FindBy(xpath = "//select[@name='priority']")
private WebElement ClickPriority;

public WebElement getClickPriority() {
return ClickPriority;
}
@FindBy(xpath = "(//option[@value='2'][normalize-space()='Medium'])[2]")
private WebElement Selectmedium;

public WebElement getSelectmedium() {
return Selectmedium;
}
@FindBy(xpath = "(//select[@class='form-control'])[6]")
private WebElement ClickStatus1;

public WebElement getClickStatus1() {
return ClickStatus1;
}
@FindBy(xpath = "(//option[@value='7'][normalize-space()='Arrived'])[1]")
private WebElement SelectArrived;

public WebElement getSelectArrived() {
return SelectArrived;
}
@FindBy(xpath = "//input[@type='textarea']")
private WebElement EnterNotes;

public WebElement getEnterNotes() {
return EnterNotes;
}
@FindBy(xpath = "//button[normalize-space()='Save']")
private WebElement SelectSave;

public WebElement getSelectSave() {
return SelectSave;
}
@FindBy(xpath = "//button[normalize-space()='Cancel']")
private WebElement SelectCancel;

public WebElement getSelectCancel() {
return SelectCancel;
}



}