package service.impl;

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.regexp.internal.recompile;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import exception.UserException;
import model.role.PageRole;
import model.role.Role;
import model.user.PageUser;
import model.user.RootUser;
import model.user.RootUserPageInfo;
import model.user.User;
import service.UserService;

public class UserServiceImpl<E> implements UserService {
	UserDao userdao = new UserDaoImpl();

	@Override
	public List<RootUser> FindAllRootUser() {
		// TODO Auto-generated method stub
		List<RootUser> list = userdao.findAllRootUser();

		return userdao.findAllRootUser();
	}

	@Override
	public RootUser login(String passname, String password) throws UserException {
		// TODO Auto-generated method stub
		RootUser rootUser = userdao.getRootUserByName(passname);
		if (rootUser == null) {
			// 没有用户抛出异常
			throw new UserException("没有此用户");
		} else {
			if (password.equals(rootUser.getPassword())) {
				// 密码正确返回RootUser
				return rootUser;
			} else {
				throw new UserException("密码错误");
			}

		}

	}

	@Override
	public RootUserPageInfo<RootUser> pageForRootUser(int page, int size) {
		// TODO Auto-generated method stub
		RootUserPageInfo<RootUser> rootUserPageInfo = new RootUserPageInfo<>();

		rootUserPageInfo.setAllsize(userdao.findAllRootUser().size());
		rootUserPageInfo.setPage(page);
		rootUserPageInfo.setSize(size);
		rootUserPageInfo.setList(userdao.getUserByLimit(page, size));

		return rootUserPageInfo;
	}

	@Override
	public PageRole<Role> pageRole(int page, int size) {
		// TODO Auto-generated method stub
		PageRole<Role> pageRole = new PageRole<>();
		pageRole.setAllsize(userdao.getAllRole().size());
		pageRole.setList(userdao.getByLimit(page, size));
		pageRole.setPage(page);
		pageRole.setSize(size);
		return pageRole;
	}

	@Override
	public PageUser pageUser(int page, int size) {
		// TODO Auto-generated method stub
		PageUser<User> pageUser=new PageUser<>();
		pageUser.setAllsize(userdao.getAllUser().size());
		pageUser.setList(userdao.getLimit(page, size));
		pageUser.setPage(page);
		pageUser.setSize(size);
		return pageUser;
	}

}
