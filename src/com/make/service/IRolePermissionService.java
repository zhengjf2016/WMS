/**  
 * @Title: IRolePermissionService.java
 * @Package com.make.service
 * @Description: TODO
 * @author zhengjf
 * @date 2016-4-12
 */
package com.make.service;

import java.util.List;
import java.util.Map;

import com.make.bean.RolePermissionBean;

/**
 * ClassName: IRolePermissionService
 * 
 * @Description: 角色权限Service
 * @author zhengjf
 * @date 2016-4-12
 */
public interface IRolePermissionService {

	/**
	 * @Description: 跳转到角色权限页面时，根据ID查询角色和权限信息
	 * @param @return
	 * @return List<MenuBtBean>
	 * @throws
	 * @author zhengjf
	 * @date 2016-4-12
	 */
	public Map<String, Object> linkPage(int id);

	/**
	 * @Description: 查询角色信息
	 * @param @return
	 * @return List<RolePermissionBean>
	 * @throws
	 * @author zhengjf
	 * @date 2016-4-12
	 */
	public List<RolePermissionBean> loadRolePermission(RolePermissionBean item);

	/**
	 * @Description: 添加角色权限信息
	 * @param @param item
	 * @param @return
	 * @return int
	 * @throws
	 * @author zhengjf
	 * @date 2016-4-13
	 */
	public int insertRolePermission(RolePermissionBean item);

	/**
	 * @Description: 修改信息
	 * @param @param item
	 * @param @return
	 * @return int
	 * @throws
	 * @author zhengjf
	 * @date 2016-4-19
	 */
	int updateInfo(RolePermissionBean item);
}
