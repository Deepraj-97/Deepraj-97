package com.expenditure.POJO;

import java.io.Serializable;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@DynamicUpdate
@DynamicInsert
@Table
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer Uid;

	@Column(name="name")
	private String Uname;

	public Integer getUid() {

		return Uid;
	}

	public void setUid(Integer Uid) {

		this.Uid = Uid;
	}

	public String getUname() {
		return Uname;
	}

	public void setUname(String Uname) {
		this.Uname = Uname;
	}


	public User(Integer Uid, String Uname) {
		this.Uid = Uid;
		this.Uname = Uname;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + Uid +
				", name='" + Uname + '\'' +
				'}';
	}
}
