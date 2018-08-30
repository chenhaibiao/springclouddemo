package com.demo.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;


/**
 * 自定义的负载均衡算法
 */
@Configuration
public class MySelfRule {
	@Bean
	public IRule myRule() {
		// Ribbon默认是轮询，我自定义为随机
		// return new RandomRule();

		// Ribbon默认是轮询，我自定义为随机
		// return new RoundRobinRule();

		// 我自定义为每台机器5次
		return new RandomRule_ZY();
	}
}
