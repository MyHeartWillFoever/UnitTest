package cn.com.boge.test;

import org.junit.Before;
import org.junit.Test;

import cn.com.boge.service.PrintService;
import cn.com.boge.service.impl.PrintServiceImpl;

/**
 * @author 宋波
 *		该类用于单元测试
 */
public class UnitTest {
	PrintService printService;
	 @Before
	 public void init(){
		 System.out.println("-----初始化-------");
		 printService = new PrintServiceImpl();
	 }
	 
	 @Test
	 public void sysout(){
		 printService.sysout("宋波");
	 }
}
