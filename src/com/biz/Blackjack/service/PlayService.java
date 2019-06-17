package com.biz.Blackjack.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.Blackjack.model.DeckVO;

public class PlayService {
	
	List<DeckVO> plaList;
	List<DeckVO> deckList;
	String playName;
	public PlayService(List<DeckVO> deckList,String playName) {
		this.plaList= new ArrayList<DeckVO>();
		this.deckList=deckList;
		this.playName=playName;
	}
	
	
	public int sumValue() {
		
		int sumValue=0;
		for(DeckVO vo:plaList) {
			sumValue+=vo.getValue();
		}
		return sumValue;
	}
	
	public void hit() {
		
		if(playName.equals("딜러")&&this.sumValue()>16) {
			System.out.println("딜러점수:"+this.sumValue());
			System.out.println("딜러 Hit 금지");
		}else {
			plaList.add(deckList.get(0));
			deckList.remove(0);
		}
		
		System.out.println("-----------------------");
		System.out.println(playName);
		System.out.println("-----------------------");
		for(DeckVO vo:plaList) {
			System.out.println(vo);
		}
	}
	
}
