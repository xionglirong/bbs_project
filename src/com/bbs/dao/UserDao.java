package com.bbs.dao;

import com.bbs.pojo.Register;
import com.bbs.tools.BaseDao;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDao {
	/**
	 * 把账户添加到数据库
	 * @param register
	 * @return
	 */
	public int addUserId(Register register) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = BaseDao.getConnection();
			String sql = "insert into bbs_user(userId,userPsw,userAlice,userEmail,userSex) values(?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			return BaseDao.alter(ps, new Object[] {
					register.getUserId(),register.getUserPsw(),register.getUserAlice(),
					register.getUserEmail(),register.getUserSex()
			});
		} catch (Exception e) {e.printStackTrace();
		}finally {
			try {
				BaseDao.close(conn, ps, null);
			} catch (Exception e2) {e2.printStackTrace();}
		}
		return 0;
	}
}
