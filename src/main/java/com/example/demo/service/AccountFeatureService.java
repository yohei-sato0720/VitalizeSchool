package com.example.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountFeatureService {

	public String getText(String text){
		String returnText = text + "abc" + "宮垣さん";
	    return returnText;
	}

}