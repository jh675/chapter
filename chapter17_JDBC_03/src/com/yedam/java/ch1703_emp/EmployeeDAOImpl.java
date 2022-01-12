package com.yedam.java.ch1703_emp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.java.ch1703_common.DAO;

public class EmployeeDAOImpl extends DAO implements EmployeeDAO {
	private static EmployeeDAO instance = new EmployeeDAOImpl();
	private EmployeeDAOImpl() {}
	public static EmployeeDAO getInstance() {
		return instance;
	}

	@Override
	public List<Employee> selectAll() {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<>();
		try {
			connect();
			String select = "SELECT * FROM emp13 ORDER BY employee_id";
			pst = conn.prepareStatement(select);
			rs = pst.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("Employee_id"));
				emp.setFirstName(rs.getString("First_name"));
				emp.setJobId(rs.getString("Job_id"));
				emp.setSalary(rs.getInt("Salary"));
				emp.setCommissionPct(rs.getString("Commission_pct"));
				emp.setDepartmentName(rs.getString("Department_name"));
				emp.setLocationId(rs.getInt("Location_id"));
				
				list.add(emp);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override
	public Employee search(int employeeId) {
		// TODO Auto-generated method stub
		Employee emp = null;
		try {
			connect();
			String select = "SELECT * FROM emp13 WHERE employee_id = ?";
			pst = conn.prepareStatement(select);
			pst.setInt(1, employeeId);
			rs = pst.executeQuery();
			if(rs.next()) {
				emp = new Employee();
				
				emp.setEmployeeId(rs.getInt("Employee_id"));
				emp.setFirstName(rs.getString("First_name"));
				emp.setJobId(rs.getString("Job_id"));
				emp.setSalary(rs.getInt("Salary"));
				emp.setCommissionPct(rs.getString("Commission_pct"));
				emp.setDepartmentName(rs.getString("Department_name"));
				emp.setLocationId(rs.getInt("Location_id"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return emp;
	}

	@Override
	public void insert(Employee emp) {
		// TODO Auto-generated method stub
		try {
			connect();
			String insert = "INSERT INTO emp13 VALUES(?, ?, ?, ?, ?, ?, ?)";
			
			pst = conn.prepareStatement(insert);
			pst.setInt(1,emp.getEmployeeId());
			pst.setString(2,emp.getFirstName());
			pst.setString(3,emp.getJobId());
			pst.setInt(4,emp.getSalary());
			pst.setString(5,emp.getCommissionPct());
			pst.setString(6,emp.getDepartmentName());
			pst.setInt(7,emp.getLocationId());
			
			int result = pst.executeUpdate();
			
			System.out.println(result + "건이 등록되었습니다");
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void update(Employee emp) {
		// TODO Auto-generated method stub
		try {
			connect();
			String update = "UPDATE emp13 SET commission_pct = ? WHERE employee_id = ?";
			
			pst = conn.prepareStatement(update);
			pst.setString(1, emp.getCommissionPct());
			pst.setInt(2, emp.getEmployeeId());
			
			int result = pst.executeUpdate();
			
			System.out.println(result + "건이 수정되었습니다");
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void delete(int employeeId) {
		// TODO Auto-generated method stub
		try {
			connect();
			String delete = "DELETE FROM emp13 WHERE employee_id = ?";
			
			pst = conn.prepareStatement(delete);
			pst.setInt(1, employeeId);
			
			int result = pst.executeUpdate();
			
			System.out.println(result + "건이 삭제되었습니다.");
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

}
