/**
 * @Title:Dept.java
 * @Description:
 * @Copyright:
 * @Company:
 * @author:chenjiangyun
 * @date:2020年2月28日 下午10:29:06
 * @version:1.0
 */
package com.chenjiangyun.microservicecloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @title:Dept
 * @author chenjiangyun
 * @Description:
 * @version:1.0
 * @date:2020年2月28日 下午10:29:06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable{

	private Long deptNo;
	private String dname;
	private String db_source;
	
	
	
}
