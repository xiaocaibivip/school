package com.school.school.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;


@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {
	@Bean
	public LocaleResolver localeResolver() {
		SessionLocaleResolver slr = new SessionLocaleResolver();
		slr.setDefaultLocale(Locale.US);
		return slr;
	}

	@Bean
	public LocaleChangeInterceptor localeChangeInterceptor() {
		LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
		lci.setParamName("lang");
		return lci;
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//i18n
		registry.addInterceptor(localeChangeInterceptor()).excludePathPatterns("/api/**", "/assets/**", "/media/**");
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index/index");
		registry.addViewController("/denglu").setViewName("denglu/denglu");
		registry.addViewController("/zhuce").setViewName("zhuce/zhuce");
		registry.addViewController("/index").setViewName("index/index");
		registry.addViewController("/chaxunliangbiao").setViewName("chaxunliangbiao/chaxunliangbiao");
		registry.addViewController("/chaxunsanbiao").setViewName("chaxunsanbiao/chaxunsanbiao");
		registry.addViewController("/shujuliulan").setViewName("shujuliulan/shujuliulan");
		registry.addViewController("/shujutongji").setViewName("shujutongji/shujutongji");
		registry.addViewController("/shujutongjinxsl").setViewName("shujutongjinxsl/shujutongjinxsl");
		registry.addViewController("/shujutongjiqhd").setViewName("shujutongjiqhd/shujutongjiqhd");
		registry.addViewController("/tiaojianchaxun").setViewName("tiaojianchaxun/tiaojianchaxun");
		registry.addViewController("/touyingchaxun").setViewName("touyingchaxun/touyingchaxun");
		registry.addViewController("/huiyuantongji").setViewName("huiyuantongji/huiyuantongji");
	}
}
