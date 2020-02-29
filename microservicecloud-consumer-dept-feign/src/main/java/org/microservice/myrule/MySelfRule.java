/**
 * @Title:MySelfRule.java
 * @Description:
 * @Copyright:
 * @Company:
 * @author:chenjiangyun
 * @date:2020年2月29日 下午3:38:32
 * @version:1.0
 */
package org.microservice.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

/**
 * @title:MySelfRule
 * @author chenjiangyun
 * @Description:
 * @version:1.0
 * @date:2020年2月29日 下午3:38:32
 */
@Configuration
public class MySelfRule {

	@Bean
	public IRule iRule() {
		return new RandomRule_ZY();
	}
}
