package cn.com.boge.test;

import org.junit.Before;
import org.junit.Test;

import cn.com.boge.service.PrintService;
import cn.com.boge.service.impl.PrintServiceImpl;

/**
 * @author �β�
 *		�������ڵ�Ԫ����
 */
public class UnitTest {
	PrintService printService;
	 @Before
	 public void init(){
		 System.out.println("-----��ʼ��-------");
		 printService = new PrintServiceImpl();
	 }
	 
	 @Test
	 public void sysout(){
		 printService.sysout("�β�");
	 }
}
