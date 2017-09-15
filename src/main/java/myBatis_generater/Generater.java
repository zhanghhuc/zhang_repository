package myBatis_generater;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class Generater {
	public void generator() throws Exception{  
		  
		  
        List<String> warnings = new ArrayList<String>();  
        boolean overwrite = true;  
        //º”‘ÿ≈‰÷√Œƒº˛  
//        File configFile = new File("/generatorConfig.xml");   
        File configFile =Resources.getResourceAsFile("generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);  
        Configuration config = cp.parseConfiguration(configFile);  
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);  
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,callback, warnings);  
        myBatisGenerator.generate(null);  
  
  
    }   
    public static void main(String[] args) throws Exception {  
        try {  
        	Generater g = new Generater();  
            g.generator();  
            System.out.println("............end");
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
          
    }  
}
