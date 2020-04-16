package com.xtgj.j2ee.chapter05.entity;

import java.io.Serializable;

public class TblJd implements Serializable {
	private int jdid=1;
	private String jd;
	private int qxid;
	

	public String getJd() {
		return jd;
	}

	public void setJd(String jd) {
		this.jd = jd;
	}

	public int getJdid() {
		return jdid;
	}

	public void setJdid(int jdid) {
		this.jdid = jdid;
	}

	public int getQxid() {
		return qxid;
	}

	public void setQxid(int qxid) {
		this.qxid = qxid;
	}
}
