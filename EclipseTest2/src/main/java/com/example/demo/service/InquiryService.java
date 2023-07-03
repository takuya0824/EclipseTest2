package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.InquiryForm;

@Service
public class InquiryService {
	
	/***
	 * 問い合わせ内容受付処理
	 * @param dataForm
	 * @return
	 */
	public Boolean doInquiryEntry(InquiryForm dataForm) {
		
//		登録チェック
		if(!checkInquiry(dataForm)) {
			return false;
		}
		
//		登録処理
		if(!insertInquiry(dataForm)) {
			return false;
		}
		
//		その他
		if(!otherInquiry(dataForm) ) {
			return false;
		}
		
		return true;
	}
	
	/***
	 * 登録チェック
	 * @param dataForm
	 * @return
	 */
	private Boolean checkInquiry(InquiryForm dataForm) {
		return true;
	}
	
	/***
	 * 登録処理
	 * @param dataForm
	 * @return
	 */
	private Boolean insertInquiry(InquiryForm dataForm) {
		return true;
	}
	
	/***
	 * その他
	 * @param dataForm
	 * @return
	 */
	private Boolean otherInquiry(InquiryForm dataForm) {
		return true;
	}

}
