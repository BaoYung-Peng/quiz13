package com.example.quiz13.vo;

import java.util.List;

public class StatisticsRes extends BasicRes {

	private List<StatisticsVo> statisticsVoList;

	public StatisticsRes() {
		super();
	}

	public StatisticsRes(int code, String message) {
		super(code, message);
	}

	public StatisticsRes(int code, String message, List<StatisticsVo> statisticsVoList) {
		super(code, message);
		this.statisticsVoList = statisticsVoList;
	}

	public List<StatisticsVo> getStatisticsVoList() {
		return statisticsVoList;
	}
	
}
