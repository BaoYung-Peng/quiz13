package com.example.quiz13.vo;

import java.time.LocalDate;
import java.util.List;

public class FeedbackVo {

	private String userName;

	private String phone;

	private String email;

	private int age;

	private LocalDate fillinDate;

	public List<QuesAnswerVo> quesAnswerList;

	public FeedbackVo() {
		super();
	}

	public FeedbackVo(String userName, String phone, String email, int age, LocalDate fillinDate,
			List<QuesAnswerVo> quesAnswerList) {
		super();
		this.userName = userName;
		this.phone = phone;
		this.email = email;
		this.age = age;
		this.fillinDate = fillinDate;
		this.quesAnswerList = quesAnswerList;
	}

	public String getUserName() {
		return userName;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	public LocalDate getFillinDate() {
		return fillinDate;
	}

	public List<QuesAnswerVo> getQuesAnswerList() {
		return quesAnswerList;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setFillinDate(LocalDate fillinDate) {
		this.fillinDate = fillinDate;
	}

	public void setQuesAnswerList(List<QuesAnswerVo> quesAnswerList) {
		this.quesAnswerList = quesAnswerList;
	}
	
}
