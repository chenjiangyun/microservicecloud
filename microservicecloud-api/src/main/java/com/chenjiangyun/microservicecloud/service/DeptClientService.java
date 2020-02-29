/**
 * @Title:DeptClientService.java
 * @Description:
 * @Copyright:
 * @Company:
 * @author:chenjiangyun
 * @date:2020年2月29日 下午4:23:28
 * @version:1.0
 */
package com.chenjiangyun.microservicecloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chenjiangyun.microservicecloud.entities.Dept;

/**
 * @title:DeptClientService
 * @author chenjiangyun
 * @Description:
 * @version:1.0
 * @date:2020年2月29日 下午4:23:28
 */
@FeignClient(value = "microservicecloud-dept", fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id);

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list();

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean add(Dept dept);
}
