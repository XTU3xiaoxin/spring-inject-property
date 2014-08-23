package com.tja.injpro.site;

import java.util.Set;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tja.injpro.util.Constants;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:context-application.xml"})
public class InjproTest {

	@Autowired
	private MenuHolder menuHolder;
	
	/**
	 * 测试静态方法的注入（重要）
	 */
	@Test
	public void testMenuHolder() {
		Set<Menu> menus = menuHolder.getMenus();
		Assert.assertEquals(4, menus);
	}
	
	/**
	 * 测试系统默认值覆盖
	 */
	@Test
	public void testConstants() {
		Assert.assertEquals("1.0", Constants.JPA_VERSION);
		Assert.assertEquals("this is jus test", Constants.JPA_DESC);
		Assert.assertEquals("test jpa name", Constants.JPA_NAME);
	}
}
