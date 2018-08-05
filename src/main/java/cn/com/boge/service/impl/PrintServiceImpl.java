package cn.com.boge.service.impl;

import org.springframework.stereotype.Service;

import cn.com.boge.service.PrintService;

@Service
public class PrintServiceImpl implements PrintService{

	@Override
	public void sysout() {
		System.out.println("------------PrintServiceImpl-----------");
	}

	@Override
	public void sysout(String string) {
		System.out.println("------------My name is -----------"+string);
	}

}
