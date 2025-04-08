package com.example.quiz13.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.quiz13.ifs.FeedbackService;
import com.example.quiz13.vo.BasicRes;
import com.example.quiz13.vo.FillinReq;
import com.example.quiz13.vo.SearchIdReq;
import com.example.quiz13.vo.SearchReq;
import com.example.quiz13.vo.SearchRes;
import com.example.quiz13.vo.UpdateReq;

import jakarta.validation.Valid;

//跨域支援請求
@CrossOrigin
@RestController
public class FeedBackController {

	@Autowired
	FeedbackService feedback;

	@PostMapping(value = "quiz/fillin")
	public BasicRes fillin(@Valid @RequestBody FillinReq req) {
		return feedback.fillin(req);
	}
	
	@PostMapping(value = "quiz/feedback")
	public BasicRes feedback(@Valid @RequestBody SearchIdReq req) {
		return feedback.feedback(req.getId());
	}
}
