package cn.dongyeshengzhen.framework.security.shiro;

import cn.publink.framework.appconfig.entity.Position;
import cn.publink.framework.security.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * shiro工具类
 * @author yuqs
 * @since 0.1
 */
public class ShiroUtils {
	/**
	 * 返回当前登录的认证实体ID
	 * @return
	 */
	public static Long getUserId() {
		ShiroPrincipal principal = getPrincipal();
		if(principal != null) return principal.getId();
		return -1L;
	}
	
	public static User getUser() {
		ShiroPrincipal principal = getPrincipal();
		if(principal != null) return principal.getUser();
		return null;
	}
	
	/**
	 * 返回当前登录的认证实体部门ID
	 * @return
	 */
	public static Long getOrgId() {
		User user = getUser();
		if(user != null && user.getOrg() != null) return user.getOrg().getId();
		return -1L;
	}
	
	/**
	 * 获取当前登录的认证实体
	 * @return
	 */
	public static ShiroPrincipal getPrincipal() {
		Subject subject = SecurityUtils.getSubject();
		return (ShiroPrincipal)subject.getPrincipal();
	}
	
	/**
	 * 获取所有组集合
	 * @return
	 */
	public static List<String> getGroups() {
		List<String> groups = new ArrayList<String>();
		Long orgId = getOrgId();
		ShiroPrincipal principal = getPrincipal();
		if(principal != null) {
			groups.addAll(principal.getRoles());
		}
		if(orgId != null) {
			groups.add(String.valueOf(orgId));
		}
		return groups;
	}
	
	/**
	 * 获取当前认证实体的中文名称
	 * @return
	 */
	public static String getFullname() {
		ShiroPrincipal principal = getPrincipal();
		if(principal != null) return principal.toString();
		return "";
	}
	
	/**
	 * 获取当前认证实体的登录名称
	 * @return
	 */
	public static String getUsername() {
		ShiroPrincipal principal = getPrincipal();
		if(principal != null) return principal.getUsername();
		throw new RuntimeException("user's name is null.");
	}
	
	/**
	 * 获取当前认证的实体部门名称
	 * @return
	 */
	public static String getOrgName() {
		User user = getUser();
		if(user != null) return user.getOrg().getName();
		return "";
	}

	/**
	 * 判断当前用户是否是服务经理
	 * @return
     */
	public static Boolean isManager(){
		Boolean isManager = false;
		List<Position> positions = getUser().getPositions();
		if(positions == null) {
			return isManager;
		}
		for(int i = 0;i<positions.size();i++){
			if(positions.get(i).getName().equals("服务经理")){
				isManager = true;
			}
		}
		return isManager;
	}
}
