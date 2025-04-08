package com.example.quiz13.Entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class QuestionId implements Serializable{
	
	private int quizId;
	
	private int quesId;

	public int getQuizId() {
		return quizId;
	}

	public void setQuizId(int quizId) {
		this.quizId = quizId;
	}

	public int getQuesId() {
		return quesId;
	}

	public void setQuesId(int quesId) {
		this.quesId = quesId;
	}
}
