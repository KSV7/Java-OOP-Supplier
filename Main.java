package com.gmail.kutepov89.sergey;

import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		String text = "one two three four five";
		Supplier<String> counter = new GetWord(text);
		String s;
		for (; (s = counter.get()) != "";) {
			System.out.println(s);
		}
	}

}
