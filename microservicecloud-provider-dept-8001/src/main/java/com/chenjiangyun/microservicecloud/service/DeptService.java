/**
 * @Title:DeptService.java
 * @Description:
 * @Copyright:
 * @Company:
 * @author:chenjiangyun
 * @date:2020年2月28日 下午11:19:49
 * @version:1.0
 */
package com.chenjiangyun.microservicecloud.service;

import java.util.List;

import com.chenjiangyun.microservicecloud.entities.Dept;

/**
 * @title:DeptService
 * @author chenjiangyun
 * @Description:
 * @version:1.0
 * @date:2020年2月28日 下午11:19:49
 */
public interface DeptService {

	boolean add(Dept dept);

	Dept get(Long id);

	List<Dept> list();
}
