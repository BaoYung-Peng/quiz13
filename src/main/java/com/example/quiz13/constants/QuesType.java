package com.example.quiz13.constants;

public enum QuesType {

	SINGLE("Single"), //
	MULTI("Multi"), //
	TEXT("Text");

	private String type;

	private QuesType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	// 列舉
	public static boolean checkType(String inputType) {
		// String QuesType.values()取的資料是QuesType.java的資料
		for (QuesType item : QuesType.values()) {
			if (inputType.equalsIgnoreCase(item.getType())) {
				return true;
			}
		}
		return false;
	}
}
