package com.biz.Blackjack.controller;

import com.biz.Blackjack.service.BlackJackService;

public class BlackJack_01 {

	public static void main(String[] args) {

		BlackJackService bs=new BlackJackService();
		
		bs.makeDeck();
		bs.viewCardList();
		
		
		
	}

}
