/**
 * @Title:DeptServiceImpl.java
 * @Description:
 * @Copyright:
 * @Company:
 * @author:chenjiangyun
 * @date:2020年2月28日 下午11:21:01
 * @version:1.0
 */
package com.chenjiangyun.microservicecloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenjiangyun.microservicecloud.dao.DeptDao;
import com.chenjiangyun.microservicecloud.entities.Dept;
import com.chenjiangyun.microservicecloud.service.DeptService;

/**
 * @title:DeptServiceImpl
 * @author chenjiangyun
 * @Description:
 * @version:1.0
 * @date:2020年2月28日 下午11:21:01
 */
@Service
public class DeptServiceImpl implements DeptService{

	@Autowired
	private DeptDao deptDao;
	/**
	 * @title:add
	 * @Description:
	 * @param dept
	 * @return
	 * @see com.chenjiangyun.microservicecloud.service.DeptService#add(com.chenjiangyun.microservicecloud.entities.Dept)
	*/
	@Override
	public boolean add(Dept dept) {
		return deptDao.addDept(dept);
	}

	/**
	 * @title:get
	 * @Description:
	 * @param id
	 * @return
	 * @see com.chenjiangyun.microservicecloud.service.DeptService#get(java.lang.Long)
	*/
	@Override
	public Dept get(Long id) {
		return deptDao.findById(id);
	}

	/**
	 * @title:list
	 * @Description:
	 * @return
	 * @see com.chenjiangyun.microservicecloud.service.DeptService#list()
	*/
	@Override
	public List<Dept> list() {
		return deptDao.findAll();
	}

}
