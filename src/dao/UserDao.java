package dao;

import java.util.List;

import model.role.PageRole;
import model.role.Role;
import model.user.RootUser;
import model.user.User;

public interface UserDao {
	List<RootUser> findAllRootUser();
	RootUser getRootUserByName(String passname);
	List<RootUser> getUserByLimit(int page,int size);
	//系统角色管理
	List<Role> getAllRole();
	
	List<Role> getByLimit(int page,int size);
	List<User> getAllUser();
	
	List<User> getLimit(int page,int size);
	
}
