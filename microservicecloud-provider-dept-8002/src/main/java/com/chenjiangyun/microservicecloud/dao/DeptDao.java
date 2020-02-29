/**
 * @Title:DeptDao.java
 * @Description:
 * @Copyright:
 * @Company:
 * @author:chenjiangyun
 * @date:2020年2月28日 下午11:14:54
 * @version:1.0
 */
package com.chenjiangyun.microservicecloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.chenjiangyun.microservicecloud.entities.Dept;

/**
 * @title:DeptDao
 * @author chenjiangyun
 * @Description:
 * @version:1.0
 * @date:2020年2月28日 下午11:14:54
 */
@Mapper
public interface DeptDao {

	boolean addDept(Dept dept);

	Dept findById(Long id);

	List<Dept> findAll();
}
