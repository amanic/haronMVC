
package mvc.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.StringHttpMessageConverter;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/**
 * 配置自定义ObjectMapper
 * 
 * @author wangjinfeng 29622 2017年8月16日.
 */

public class StringMessageConvertorFactory {
    private static StringHttpMessageConverter stringHttpMessageConverter = null;

    private static final Logger logger = LoggerFactory.getLogger(StringMessageConvertorFactory.class);

    public static StringHttpMessageConverter getStringHttpMessageConverter() {
        logger.info("初始化StringMessageConvertorFactory");
        StringHttpMessageConverter stringHttpMessageConverter=new StringHttpMessageConverter(StandardCharsets.UTF_8);

        return stringHttpMessageConverter;
    }
}
