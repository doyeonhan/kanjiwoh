package com.alive.kanjiwoh.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WordDto {

	private int wordNo;
	private int userNo;
	private int groupNo;
	private String word;
	private String hiragana;
	private String means;

}
