package com.example.demo.repository;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.example.demo.entity.Inquiry;

/*
 * Add an annotation here
 */
@Repository
public class InquiryDaoImpl implements InquiryDao{
	
	private final JdbcTemplate jdbcTemplate;
	
	public InquiryDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertInquiry(Inquiry inquiry) {
		PreparedStatement pStmt = null;
		int result = 0;
		try {
			pStmt = con.prepareStatement(“INSERT INTO ～");
					pStmt.setString(1, inquiry.getName());
			pStmt.setInt(2, inquiry.getEmail());
			pStmt.setInt(3, inquiry.getContents());
			pStmt.setTimestamp(4, inquiry.getId());
			result = pStmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null) {
					pStmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
//  This method is used in the latter chapter
//	@Override
//	public int updateInquiry(Inquiry inquiry) {
//		return jdbcTemplate.update("UPDATE inquiry SET name = ?, email = ?,contents = ? WHERE id = ?",
//				 inquiry.getName(), inquiry.getEmail(), inquiry.getContents(), inquiry.getId() );	
//	}

	@Override
	public List<Inquiry> getAll() {
		
		//make SQL
		
		List<Map<String, Object>> resultList = null;
		
		List<Inquiry> list = null;
		
		//Set the data form database into Inquiry instance
		
		return list;
	}
	
}
