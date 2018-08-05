package cn.com.boge.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.com.boge.Application;
import cn.com.boge.service.PrintService;


/**
 * @author 宋波
 *		该类用于集成测试使用
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@ActiveProfiles("dev")
public class PrintServiceImplTest {
    @Autowired
    private PrintService printService;

    @Test
    public void sysout() {
    	System.out.println("---进来了--");
    	printService.sysout();
    	System.out.println("---结束了--");
    	
    }
}
