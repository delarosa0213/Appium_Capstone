package iOS.tests.Test;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import iOS.tests.Test.LaunchingIphone;

import iOS.tests.Pages.ScrollGesture_Page;
import iOS.tests.Pages.ActivityIndicator_Page;
import iOS.tests.Pages.DatePicker_Page;
import iOS.tests.Pages.ImageView_Page;
import iOS.tests.Pages.PageControl_Page;
import iOS.tests.Pages.PickerView_Page;
import iOS.tests.Pages.ProgressView_Page;
import iOS.tests.Pages.Search_Page;
import iOS.tests.Pages.SegmentedControls_Page;
import iOS.tests.Pages.Slider_Page;
import iOS.tests.Pages.StackViews_Page;
import iOS.tests.Pages.Switch_Page;
import iOS.tests.Pages.TextField_Page;
import iOS.tests.Pages.Toolbars_Page;
import iOS.tests.Pages.WebViews_Page;
import iOS.tests.Pages.AlertViews_Page;

public class AppiumIphoneMain {
	static IOSDriver driver;
  @Test(priority =1)
  public void setup() throws MalformedURLException, FileNotFoundException {
	  LaunchingIphone iphone = new LaunchingIphone();
	  iphone.configureApp();
	  driver = LaunchingIphone.driver;
  }
  @Test(priority = 2)
  public void scrollGes() {
	  ScrollGesture_Page scroll = new ScrollGesture_Page(driver);
	  scroll.scroll();
  }
  @Test(priority = 3)
  public void actIndicator() {
	  ActivityIndicator_Page act = new ActivityIndicator_Page(driver);
	  act.actvityIndi();
  }
  @Test(priority = 4)
  public void datePicker() throws InterruptedException {
	  DatePicker_Page date= new DatePicker_Page(driver);
	  date.datePick();
	  
  }
  @Test(priority = 5)
  public void timePicker() throws InterruptedException {
	  DatePicker_Page time= new DatePicker_Page(driver);
	  time.timePick();
	  
  }
  @Test(priority = 6)
  public void ImageView() throws InterruptedException {
	  ImageView_Page img= new ImageView_Page(driver);
	  img.imageView();  
  }
  @Test(priority = 7)
  public void pageControl(){
	  PageControl_Page pc= new PageControl_Page(driver);
	  pc.pageControl();
  }
  @Test(priority = 8)
  public void pickView() {
	  PickerView_Page pv = new PickerView_Page(driver);
	  pv.pickerView();
  }
  @Test(priority = 9)
  public void progView() throws InterruptedException {
	  ProgressView_Page prog = new ProgressView_Page(driver);
	  prog.progressView();
  }
  @Test(priority = 10)
  public void searchView() throws InterruptedException {
	  Search_Page srch = new Search_Page(driver);
	  srch.search();
  }
  @Test(priority = 11)
  public void segmentedControls() {
	  SegmentedControls_Page sp = new SegmentedControls_Page(driver);
	  sp.segmentedControl();
  }
  @Test(priority = 12)
  public void sliderControl() {
	  Slider_Page sld = new Slider_Page(driver);
	  sld.slide();
  }
  @Test(priority = 13)
  public void stackViews() throws InterruptedException {
	  StackViews_Page svp = new StackViews_Page(driver);
	  svp.stackView();
  }
  
  @Test(priority = 14)
  public void switches() throws InterruptedException{
	  Switch_Page swp = new Switch_Page(driver);
	  swp.switchPage();
  }
  @Test(priority = 15)
  public void textField() throws InterruptedException{
	  TextField_Page txtF = new TextField_Page(driver);
	  txtF.txtField();
  }
  @Test(priority = 16)
  public void toolBars(){
	  Toolbars_Page tools = new Toolbars_Page(driver);
	  tools.toolBars();
  }
  
  @Test(priority = 17)
  public void webViews(){
	  WebViews_Page web = new WebViews_Page(driver);
	  web.webViews();
  }
  @Test(priority = 18)
  public void alert(){
	  AlertViews_Page al = new AlertViews_Page(driver);
	  al.alertViews();
  }
  
}
