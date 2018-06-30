package com.ie.naukri.rms.main;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationConfig.class, webEnvironment=WebEnvironment.RANDOM_PORT)
@ActiveProfiles(profiles = "dev"/*, resolver = SystemPropertyActiveProfileResolver.class*/)
public class ApplicationConfigTests {

	/*@Autowired
	private IScheduler scheduler;*/
	@Test
	public void contextLoads() {
		/*try {
			List<String> jobs =  scheduler.getJobs();
			for (String job : jobs){
				System.out.println(job);
				System.out.print("");
			}
		} catch (ApplicationException e) {
			e.printStackTrace();
		}*/
	}

	/*@Test
	public void scheduleJob( ){
		Date triggerTime = new Date();
		String jobName = "UT_JOB";
		String groupName = "UT";
		String className = "com.ie.naukri.rms.jobs.DemoJob";
		String cronExpression = "1 1 1 1 1 ?";

		try {
			assertEquals(jobName,scheduler.schedule(triggerTime,className,jobName,groupName,cronExpression));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail to start the job");
		}
	}

	@Test
	public void rescheduleJob(){

		String jobName = "UT_JOB";
		String groupName = "UT";
		String newCronExpression = "1 1 1 1 1 ?";
		try {
			assertEquals(jobName,scheduler.reSchedule(jobName,groupName,newCronExpression));
		} catch (ApplicationException e) {
			e.printStackTrace();
		}
	}


	@Test
	public void run() throws ApplicationException {
		String name = "UT_JOB";
		String group = "UT";
		assertEquals(name,scheduler.run(name,group));

	}

	*//*@Test
	public void jobs() throws ApplicationException {
		List<JobDTO> expJobs = new ArrayList<>();
		JobDTO jobDTO = new JobDTO();
		jobDTO.setJobName("mbean-job");
		jobDTO.setGroupName();
		jobDTO.setExpression();
		expJobs.add("mbean-job");
		expJobs.add("practise");
		expJobs.add("test_job");
		List<String> jobs = scheduler.getJobs();
		assertEquals(expJobs,jobs);

	}*//*


	@Test
	public void deleteJob(){
		try {
			String jobName = "UT_JOB";
			String groupName = "UT";
			assertEquals(jobName,scheduler.delete(jobName,groupName));
		} catch (ApplicationException e) {
			e.printStackTrace();
		}
	}*/
	

}
