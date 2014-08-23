package com.tja.injpro.site;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.util.StringUtils;


public class Menu {

	private String id;
	private String name;
	private String url;
	
	public static Set<Menu> assemble(Map<String, String> map) {
		Set<Menu> menus = new HashSet<Menu>();
		for (Map.Entry<String, String> entry : map.entrySet()) {
			menus.add(parse(entry.getKey(), entry.getValue()));
		}
		return menus;
	}
	
	public static Menu parse(String id,String str) {
		String[] attrs = StringUtils.split(str, ";");
		Menu menu = new Menu();
		menu.setId(id);
		menu.setName(attrs[0]);   // 仅仅是测试，不做验证了
		menu.setUrl(attrs[1]);
		return menu;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public String toString() {
		return "id:"+this.id+"  name:"+this.name+" url:"+this.url;
	}
}
