package com.bg;

import java.util.*;

public class CollectionMain {

	private Integer eid;
	private String ename;
	
	public CollectionMain() {
	}

	public CollectionMain(Integer eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public boolean equals(Object s) {

		CollectionMain cm = (CollectionMain) s;

		if (ename == cm.ename && eid == cm.eid)
			return true;
		else
			return false;
	}

	public int hashCode() {

		int result = eid.hashCode() + ename.hashCode();
		return result;
	}

	public static void main(String args[]) {

		HashSet<CollectionMain> s = new HashSet<CollectionMain>();

		CollectionMain cm1 = new CollectionMain();

		cm1.setEid(1);
		cm1.setEname("raja");

		CollectionMain cm2 = new CollectionMain();

		cm2.setEid(2);
		cm2.setEname("rani");

		CollectionMain cm3 = new CollectionMain();

		cm3.setEid(1);
		cm3.setEname("raja");

		s.add(cm1);
		s.add(cm2);
		s.add(cm3);
		s.add(new CollectionMain(4,"Bhagath"));

		for (CollectionMain c : s) {
			System.out.println(c.eid);
			System.out.println(c.ename);
		}
	}
}