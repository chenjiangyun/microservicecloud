/**
 * @Title:DeptClientServiceFallbackFactory.java
 * @Description:
 * @Copyright:
 * @Company:
 * @author:chenjiangyun
 * @date:2020年2月29日 下午5:21:18
 * @version:1.0
 */
package com.chenjiangyun.microservicecloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.chenjiangyun.microservicecloud.entities.Dept;

import feign.hystrix.FallbackFactory;

/**
 * @title:DeptClientServiceFallbackFactory
 * @author chenjiangyun
 * @Description:
 * @version:1.0
 * @date:2020年2月29日 下午5:21:18
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

	/**
	 * @title:create
	 * @Description:
	 * @param cause
	 * @return
	 * @see feign.hystrix.FallbackFactory#create(java.lang.Throwable)
	 */
	@Override
	public DeptClientService create(Throwable cause) {
		return new DeptClientService() {

			@Override
			public List<Dept> list() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Dept get(Long id) {
				return new Dept().setDeptNo(id).setDname("该" + id + "没有对应的信息")
						.setDb_source("no this database in MySql");
			}

			@Override
			public boolean add(Dept dept) {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}

}
