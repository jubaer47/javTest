package com.bit.test;

import java.io.IOException;
import java.sql.Driver;

import org.junit.Test;

import Page.HomePage;
import Page.JeansePage;
import Page.WomenPage;
import Page.manePage;

public class SmokeTest extends BaseTest {
	HomePage hp;
	WomenPage wp;
	manePage mp;
	JeansePage jeansPage;
	@Test
	public void TestOne() throws IOException {
		hp = new HomePage(driver);
	wp=	hp.ClickwomenMenu();
	wp.verifyWomenPageURL();
		
	}
	
	
@Test
private void TestTow() throws IOException {
	hp = new HomePage(driver);
	mp=hp.ClickmaneMenu().get();
	
}
}
