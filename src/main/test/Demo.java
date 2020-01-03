import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Demo {

        @Test
            public void getreverse() throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
                List<String> warnings = new ArrayList<String>();
                boolean overwrite = true;
                //指定 逆向工程配置文件
                File configFile = new File("E:\\u4\\u4-day01\\u4demo01\\src\\main\\resources\\gen.xml");
                ConfigurationParser cp = new ConfigurationParser(warnings);
                Configuration config = cp.parseConfiguration(configFile);
                DefaultShellCallback callback = new DefaultShellCallback(overwrite);
                MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                        callback, warnings);
                myBatisGenerator.generate(null);
            }
}
