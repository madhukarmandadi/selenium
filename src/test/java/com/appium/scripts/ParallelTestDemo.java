package com.appium.scripts;

import org.testng.annotations.Test;

public class ParallelTestDemo extends ParalellTest {

	@Test
	public void test1() {
		getDriver().get("https://chromedriver.chromium.org/downloads");
		System.out.println("test1 thread id is:" + Thread.currentThread().getId());
		System.out.println("Title of the page is:" + getDriver().getTitle());
	}

	@Test
	public void test2() {
		getDriver().get("https://chromedriver.chromium.org/downloads");
		System.out.println("test2 thread id is:" + Thread.currentThread().getId());
		System.out.println("Title of the page is:" + getDriver().getTitle());
	}

	@Test
	public void test3() {
		getDriver().get("https://chromedriver.chromium.org/downloads");
		System.out.println("test3 thread id is:" + Thread.currentThread().getId());
		System.out.println("Title of the page is:" + getDriver().getTitle());
	}

	@Test
	public void test4() {
		getDriver().get("https://chromedriver.chromium.org/downloads");
		System.out.println("test4 thread id is:" + Thread.currentThread().getId());
		System.out.println("Title of the page is:" + getDriver().getTitle());
	}

	@Test
	public void test5() {
		getDriver().get("https://chromedriver.chromium.org/downloads");
		System.out.println("test1 thread id is:" + Thread.currentThread().getId());
		System.out.println("Title of the page is:" + getDriver().getTitle());
	}

	@Test
	public void test6() {
		getDriver().get("https://chromedriver.chromium.org/downloads");
		System.out.println("test2 thread id is:" + Thread.currentThread().getId());
		System.out.println("Title of the page is:" + getDriver().getTitle());
	}

	@Test
	public void test7() {
		getDriver().get("https://chromedriver.chromium.org/downloads");
		System.out.println("test3 thread id is:" + Thread.currentThread().getId());
		System.out.println("Title of the page is:" + getDriver().getTitle());
	}

	@Test
	public void test8() {
		getDriver().get("https://chromedriver.chromium.org/downloads");
		System.out.println("test4 thread id is:" + Thread.currentThread().getId());
		System.out.println("Title of the page is:" + getDriver().getTitle());
	}

}
