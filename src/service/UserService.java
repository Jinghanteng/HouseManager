package service;

import java.util.List;

import exception.UserException;
import model.role.PageRole;
import model.role.Role;
import model.user.PageUser;
import model.user.RootUser;
import model.user.RootUserPageInfo;
import model.user.User;

public interface UserService<E> {
	List<RootUser> FindAllRootUser();
	RootUser login(String passname,String password) throws UserException;
	RootUserPageInfo<RootUser> pageForRootUser(int page,int size);
	
	PageRole<Role> pageRole(int page,int size);
	
	PageUser<User> pageUser(int page,int size);
}
