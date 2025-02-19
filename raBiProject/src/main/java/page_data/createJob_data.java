package page_data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class createJob_data
{
	public WebDriver driver;
	
	public static By job = By.xpath("//a[@id='menu_admin_Job']");
	public static By job_title = By.xpath("//a[@id='menu_admin_viewJobTitleList']");
	public static By add_job = By.xpath("//input[@id='btnAdd']");
	public static By add_job_title = By.xpath("//input[@id='jobTitle_jobTitle']");
	public static By add_job_description = By.xpath("//textarea[@id='jobTitle_jobDescription']");
	public static By add_job_file = By.xpath("//input[@id='jobTitle_jobSpec']");
	public static By add_job_note = By.xpath("//textarea[@id='jobTitle_note']");
	public static By add_job_savebtn = By.xpath("//input[@id='btnSave']");
	
	public createJob_data(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement job_element()
	{
		return driver.findElement(job);
	}
	
	public WebElement job_title_element()
	{
		return driver.findElement(job_title);
	}
	
	public WebElement add_job()
	{
		return driver.findElement(add_job);
	}
	
	public WebElement add_job_title_element()
	{
		return driver.findElement(add_job_title);
	}
	
	public WebElement add_job_description_element()
	{
		return driver.findElement(add_job_description);
	}
	
	public WebElement add_job_file_element()
	{
		return driver.findElement(add_job_file);
	}
	
	public WebElement add_job_note_element()
	{
		return driver.findElement(add_job_note);
	}
	
	public WebElement add_job_savebtn_element()
	{
		return driver.findElement(add_job_savebtn);
	}
	
}
