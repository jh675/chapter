package com.yedam.java.ch1704_dept;

import java.sql.SQLException;
import java.util.*;

import com.yedam.java.ch1704_common.DAO;

public class DepartmentDAOImpl extends DAO implements DepartmentDAO {
	private static DepartmentDAO instance = new DepartmentDAOImpl();
	private DepartmentDAOImpl() {}
	public static DepartmentDAO getInstance() {
		return instance;
	}
	
	@Override
	public List<Department> selectAll() {
		// TODO Auto-generated method stub
		List<Department> list = new ArrayList<>();
		try {
			connect();
			String select = "SELECT * FROM departments ORDER BY department_id";
			pst = conn.prepareStatement(select);
			rs = pst.executeQuery();
			while(rs.next()) {
				Department dept = new Department();
				dept.setDeptId(rs.getInt("Department_id"));
				dept.setDeptName(rs.getString("Department_name"));
				dept.setManagerId(rs.getString("Manager_id"));
				dept.setLocationId(rs.getInt("Location_id"));
				
				list.add(dept);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override
	public Department search(int departmentId) {
		Department dept = null;
		try {
			connect();
			String select = "SELECT * FROM departments WHERE department_id = ?";
			pst = conn.prepareStatement(select);
			pst.setInt(1, departmentId);
			
			rs = pst.executeQuery();
			if(rs.next()) {
				dept = new Department();
				
				dept.setDeptId(rs.getInt("department_id"));
				dept.setDeptName(rs.getString("department_name"));
				dept.setManagerId(rs.getString("manager_id"));
				dept.setLocationId(rs.getInt("location_id"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return dept;
	}

	@Override
	public void insert(Department dept) {
		// TODO Auto-generated method stub
		try {
			connect();
			String insert = "INSERT INTO departments VALUES(?, ?, ?, ?)";

			pst = conn.prepareStatement(insert);

			pst.setInt(1,dept.getDeptId());
			pst.setString(2,dept.getDeptName());
			pst.setString(3,dept.getManagerId());
			pst.setInt(4,dept.getLocationId());

			int result = pst.executeUpdate();

			System.out.println(result + "건이 등록되었습니다");

		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void update(Department dept) {
		try {
			connect();
			String update = "UPDATE departments SET manager_id = ? WHERE department_id = ?";

			pst = conn.prepareStatement(update);
			pst.setString(1, dept.getManagerId());
			pst.setInt(2, dept.getDeptId());
			
			int result = pst.executeUpdate();
			
			System.out.println(result + "건이 수정되었습니다");
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void delete(int deptId) {
		try {
			connect();
			String delete = "DELETE FROM departments WHERE department_id = ?";
			
			pst = conn.prepareStatement(delete);
			pst.setInt(1, deptId);
			
			int result = pst.executeUpdate();
			
			System.out.println(result + "건이 삭제되었습니다.");
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

}
