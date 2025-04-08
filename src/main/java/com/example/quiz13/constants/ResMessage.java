package com.example.quiz13.constants;

public enum ResMessage {

	SUCCESS(200, "Success!!"), //
	PARAM_DATE_ERROR(400, "Param_date_error!!"), //
	QUES_TYPE_ERROR(400, "Ques_type_error!!"), //
	PARAM_OPTIONS_ERROR(400, "Param_options_error"), //
	OPTIONS_PARSE_ERROR(400, "Options_parse_error"), //
	OPTIONS_SIZE_ERROR(400, "Options_size_error"), //
	SQL_ERROR(400, "SQL_error"), //
	PARAM_QUIZ_ID_ERROR(400, "Param quiz_id error!!"), //
	QUIZ_ID_MISMACTH(400, "Quiz_id mismatch!!"), //
	ID_NOT_FOUND(404,"Id not found!!"), //
	OUT_OF_FILLIN_DATE_RANGE(400, "Out of fillin date range!!"), //
	EMAIL_DUPLICATED(400, "Email duplicated!!"), //
	ANSWER_REQUIRED(400, "Answer required!!"), //
	ANSWER_OPTION_MISMATCH(400, "Answer option mismatch!!"), //
	ONE_OPTION_IS_ALLOWED(400, "One option is allowed!!"), //
	ANSWER_PARSE_ERROR(400, "Answer parse_error!!"); //

	private int code;

	private String message;

	private ResMessage(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public static class ConstantsMessage {
		public static final String PARAM_QUIZ_NAME_ERROR = "Param_quiz_name_error!!";
		public static final String PARAM_DESCRIPTION_ERROR = "Param_description_error!!";
		public static final String PARAM_DESCRIPTION_LENGTH_TOO_LONG = "Param_description length too long!!";
		public static final String PARAM_START_DATE_ERROR = "Param_start_date_error!!";
		public static final String PARAM_END_DATE_ERROR = "Param_end_date_error!!";
		public static final String PARAM_QUIZ_ID_ERROR = "Param_quiz_id_error!!";
		public static final String PARAM_QUES_ID_ERROR = "Param_ques_id_error!!";
		public static final String PARAM_QUES_NAME_ERROR = "Param_question name_error!!";
		public static final String PARAM_QUES_TYPE_ERROR = "Param_question type_error!!";
		public static final String PARAM_QUES_LIST_ERROR = "Param_question list_error!!";
		public static final String PARAM_QUES_ID_LIST_ERROR = "Param_question_id list_error!!";
		public static final String EMAIL_IS_NECESSARY = "Email is necessary!!";
		public static final String OUT_OF_FILLIN_DATE_RANGE = "Out of Fill date range!!";
		public static final String EMAIL_DUPLICATED = "Email.duplicated!!";
		public static final String OPTIONS_PARSE_ERROR = "Options_parse_error!!";
	
	}
}
