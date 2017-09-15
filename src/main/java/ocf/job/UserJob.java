package ocf.job;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import ocf.dao.BannerMCMapper;
import ocf.entity.BannerMC;
import ocf.entity.BannerMCExample;
import ocf.entity.BannerMCExample.Criteria;

public class UserJob implements Runnable{
	
	@Autowired
	private BannerMCMapper bannerMCMapper;
	
	@Autowired
	private ThreadPoolTaskExecutor pool;
	
	private static Logger l = Logger.getLogger(UserJob.class);
	
	public void execute() throws Exception{
		pool.execute(this);
	}

	public void run() {
		try {
			l.info("executer  run ..................");
			
			System.out.println("thread  id ="+Thread.currentThread().getId());
			System.out.println("thread  name ="+Thread.currentThread().getName());
			
			BannerMCExample example = new BannerMCExample();
			Criteria criteria = example.createCriteria();
			
			criteria.andIsActiveEqualTo(new Byte("0"));
			criteria.andIsDeleteEqualTo(new Byte("0"));
			
			FileWriter writer = new FileWriter(new File("db.txt"),true);
			
			List<BannerMC> list = bannerMCMapper.selectByExample(example);
			for (BannerMC b : list) {
				System.out.println("banner  id = "+b.getBannerId());
				writer.write(b.getBannerCode());
				writer.write("\n");
			}
			writer.flush();
			writer.close();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
