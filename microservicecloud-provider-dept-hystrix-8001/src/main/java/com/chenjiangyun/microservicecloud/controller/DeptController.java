/**
 * @Title:DeptController.java
 * @Description:
 * @Copyright:
 * @Company:
 * @author:chenjiangyun
 * @date:2020年2月28日 下午11:23:07
 * @version:1.0
 */
package com.chenjiangyun.microservicecloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chenjiangyun.microservicecloud.entities.Dept;
import com.chenjiangyun.microservicecloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import lombok.extern.slf4j.Slf4j;

/**
 * @title:DeptController
 * @author chenjiangyun
 * @Description:
 * @version:1.0
 * @date:2020年2月28日 下午11:23:07
 */
@Slf4j
@RestController
public class DeptController {

	@Autowired
	private DeptService deptService;

	@Autowired
	private org.springframework.cloud.client.discovery.DiscoveryClient discoveryClient;

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean add(@RequestBody Dept dept) {
		return deptService.add(dept);
	}

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "processHystrix_Get")
	public Dept get(@PathVariable("id") Long id) {
		Dept dept = deptService.get(id);
		if (dept == null) {
			throw new RuntimeException("该" + id + "没有的对应的信息");
		}
		return dept;
	}

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list() {
		return deptService.list();
	}

	@RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
	public Object discovery() {
		List<String> services = discoveryClient.getServices();
		log.info("{}", services);
		List<ServiceInstance> instances = discoveryClient.getInstances("microservicecloud-dept");
		for (ServiceInstance serviceInstance : instances) {
			log.info(serviceInstance.getServiceId() + "," + serviceInstance.getHost() + "," + serviceInstance.getPort()
					+ "," + serviceInstance.getUri());
		}
		return discoveryClient;
	}

	public Dept processHystrix_Get(@PathVariable("id") Long id) {
		return new Dept().setDeptNo(id).setDname("该" + id + "没有对应的信息").setDb_source("no this database in MySql");
	}
}
