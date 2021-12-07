package com.gmail.kutepov89.sergey;

import java.util.function.Supplier;

public class GetWord implements Supplier<String> {
	private String text;
	private String tempWord = "";

	public GetWord() {
		super();
	}

	public GetWord(String text) {
		super();
		this.text = text;
	}

	public GetWord(String text, String tempWord) {
		super();
		this.text = text;
		this.tempWord = tempWord;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTempWord() {
		return tempWord;
	}

	public void setTempWord(String tempWord) {
		this.tempWord = tempWord;
	}

	@Override
	public String toString() {
		return "GetWord [text=" + text + ", tempWord=" + tempWord + "]";
	}

	@Override
	public String get() {
		if (text == "")
			return null;
		
		text = text.replace(tempWord, "").strip();
		tempWord = "";
		
		char[] letters = text.toCharArray();

		for (char i : letters) {
			if (i == ' ') {
				break;
			}
			tempWord += i;
		}
		return tempWord;
	}

}