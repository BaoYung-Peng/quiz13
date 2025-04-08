package com.example.quiz13.vo;

import java.util.List;

import com.example.quiz13.Entity.Quiz;

public class SearchRes extends BasicRes {
	
	private List<Quiz> QuizList;

	public SearchRes() {
		super();
	}

	public SearchRes(int code, String message) {
		super(code, message);
	}

	public SearchRes(int code, String message, List<Quiz> quizList) {
		super(code, message);
		QuizList = quizList;
	}

	public List<Quiz> getQuizList() {
		return QuizList;
	}

	public void setQuizList(List<Quiz> quizList) {
		QuizList = quizList;
	}
	
}
