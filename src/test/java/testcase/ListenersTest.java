package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.Base;

public class ListenersTest extends Base {

	@Test(retryAnalyzer = common.MyRetry.class)
	public void test1() {
		driver.get("https://chromedriver.chromium.org/downloads");
		System.out.println("test1 thread id is:" + Thread.currentThread().getId());
		System.out.println("Title of the page is:" + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "page title");
	}

	@Test(enabled=false)
	public void test2() {
		driver.get("https://chromedriver.chromium.org/downloads");
		System.out.println("test2 thread id is:" + Thread.currentThread().getId());
		System.out.println("Title of the page is:" + driver.getTitle());
	}

	@Test(enabled=false)
	public void test3() {
		driver.get("https://chromedriver.chromium.org/downloads");
		System.out.println("test3 thread id is:" + Thread.currentThread().getId());
		System.out.println("Title of the page is:" + driver.getTitle());
	}

	@Test(enabled=false)
	public void test4() {
		driver.get("https://chromedriver.chromium.org/downloads");
		System.out.println("test4 thread id is:" + Thread.currentThread().getId());
		System.out.println("Title of the page is:" + driver.getTitle());
	}

	@Test(enabled=false)
	public void test5() {
		driver.get("https://chromedriver.chromium.org/downloads");
		System.out.println("test1 thread id is:" + Thread.currentThread().getId());
		System.out.println("Title of the page is:" + driver.getTitle());
	}

	@Test(enabled=false)
	public void test6() {
		driver.get("https://chromedriver.chromium.org/downloads");
		System.out.println("test2 thread id is:" + Thread.currentThread().getId());
		System.out.println("Title of the page is:" + driver.getTitle());
	}

	@Test(enabled=false)
	public void test7() {
		driver.get("https://chromedriver.chromium.org/downloads");
		System.out.println("test3 thread id is:" + Thread.currentThread().getId());
		System.out.println("Title of the page is:" + driver.getTitle());
	}

	@Test(enabled=false)
	public void test8() {
		driver.get("https://chromedriver.chromium.org/downloads");
		System.out.println("test4 thread id is:" + Thread.currentThread().getId());
		System.out.println("Title of the page is:" + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "page title");
	}

}
