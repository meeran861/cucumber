package com.flipkart.Hooks;

import com.flipkart.BaseClass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {
   BaseClass base = new BaseClass();
   @Before
   public void launchBrowse() {
	   base.browserLaunch();
   }
   @After
   public void closeBrowser() {
	   base.browserClose();
   }
}
