package com.example.tytwodemo;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.example.tytwodemo.dao.TyuserDao;
import com.example.tytwodemo.entity.Tyuser;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.task.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TytwodemoApplicationTests {
	@Resource
	private TyuserDao tyuserDao;
	@Test
	public void contextLoads() {
		EntityWrapper EntityWrapper = new EntityWrapper();
		List<Tyuser> tyuserList= tyuserDao.selectList(EntityWrapper);
		for (Tyuser tyuser : tyuserList) {
			System.out.println(tyuser.getUname());
		}

	}

	@Test
	public void creatActivitiTask() {
		//加载的那两个内容就是我们之前已经弄好的基础内容哦。
		//得到了流程引擎
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		processEngine.getRepositoryService()
				.createDeployment()
				.addClasspathResource("processes/test6.bpmn")
				.addClasspathResource("jsps/test6.png")
				.deploy();
	}

	/**
	 * 2：启动流程实例
	 */
	@Test
	public void testStartProcessInstance() {
		//Map<String, Object> variables = new HashMap<String, Object>();
		//variables.put("student", "小雪");
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		processEngine.getRuntimeService()
				.startProcessInstanceById("请假流程66:2:57505");  //这个是查看数据库中act_re_procdef表
	}


	/**
	 * 完成请假申请
	 */
	@Test
	public void testQingjia(){
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("outkey", "yes");
		processEngine.getTaskService()
				.complete("75002"); //查看act_ru_task表
	}

	/**
	 * 小明学习的班主任小毛查询当前正在执行任务
	 */
	@Test
	public void testQueryTask(){
		//下面代码中的小毛，就是我们之前设计那个流程图中添加的班主任内容
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		List<Task> tasks = processEngine.getTaskService()
				.createTaskQuery()
				.taskAssignee("龙组长")
				.list();
		for (Task task : tasks) {
			System.out.println(task.getName());
		}
	}

	/**
	 * 班主任小毛完成任务
	 */
	@Test
	public void testFinishTask_manager(){
		ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
		engine.getTaskService()
				.complete("7502"); //查看act_ru_task数据表
	}

	/**
	 * 教务处的大毛完成的任务
	 */
	@Test
	public void testFinishTask_Boss(){
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		processEngine.getTaskService()
				.complete("10002");  //查看act_ru_task数据表
	}


}
