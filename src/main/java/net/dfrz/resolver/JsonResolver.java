package net.dfrz.resolver;

import java.util.Locale;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonJsonView;

//序列化是把对象转换为JSON ，反序列化是把JSON转换为对象，FastJSON只做序列化
public class JsonResolver implements ViewResolver{
	
	public View resolveViewName(String viewName, Locale locale) throws Exception {
		FastJsonJsonView view = new FastJsonJsonView();
		
		FastJsonConfig config = new FastJsonConfig();
		
		SerializerFeature []features = new SerializerFeature[]{
				SerializerFeature.WriteDateUseDateFormat
		};
		
		config.setSerializerFeatures(features);
		
		view.setFastJsonConfig(config);
		
		return view;
	}

}
