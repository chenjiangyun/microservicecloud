/**
 * @Title:ConfigBean.java
 * @Description:
 * @Copyright:
 * @Company:
 * @author:chenjiangyun
 * @date:2020年2月28日 下午11:38:20
 * @version:1.0
 */
package org.microservicecloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;

/**
 * @title:ConfigBean
 * @author chenjiangyun
 * @Description:
 * @version:1.0
 * @date:2020年2月28日 下午11:38:20
 */
@Configuration
public class ConfigBean {

	@Bean
	@LoadBalanced // 负载均衡
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public IRule iRule() {
		return new RetryRule();
	}
}
