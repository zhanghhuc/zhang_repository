package ocf.jobListener;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;

public class UserJobListener implements JobListener{

	public String getName() {
		System.out.println("listener  getName userJobListener");
		return "job_listener";
	}

	public void jobExecutionVetoed(JobExecutionContext jec) {
		System.out.println("job   vetoed .....");
		
	}

	public void jobToBeExecuted(JobExecutionContext jec) {
		System.out.println("job executing   ....");
		
	}

	public void jobWasExecuted(JobExecutionContext jec, JobExecutionException e) {
		System.out.println("job executed  ....");
		
	}

}
