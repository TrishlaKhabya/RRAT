package Dao;




import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import model.Candidate;
import model.Employee;

public class UserDao {
	
	javax.sql.DataSource datasource;
	public javax.sql.DataSource getDatasource() {
		return datasource;
	}
	public void setDatasource(javax.sql.DataSource datasource) {
		this.datasource = datasource;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	JdbcTemplate jdbcTemplate;
	public String loginChk(Employee m)
	{
		String sql="select password from login where id='"+m.getId()+"'";
		System.out.println(m.getId());
		String password=(String)jdbcTemplate.queryForObject(sql, String.class);
		return password;
		/*Employee e=new Employee();
		e.setId(1);
		e.setName("aaa");
		e.setPassword("123");*/
		
	}
	
	public int save(Employee emp)
	{
		
		String sql="insert into login values('"+emp.getId()+"','"+emp.getName()+"','"+emp.getPassword()+"','"+emp.getCpassword()+"')";    
	    return jdbcTemplate.update(sql);    
	}
	public int saveCandidate(Candidate candidate)
	{
		String sql="insert into candidate_details (id,firstname,lastname,category) values('"+candidate.getId()+"','"+candidate.getFirstname()+"','"+candidate.getLastname()+"','"+candidate.getCategory()+"')";
		return jdbcTemplate.update(sql);
	}
	
	/*public List<Candidate> getCandidates(String category)
	{
		List<Candidate> list=new ArrayList<>();
		String sql="select id from candidate_details where category='"+category+"'";    
	    int i=jdbcTemplate.queryForInt(sql);
	    for(int j=0;j<i;j++)
	    {
	    	Candidate cand=new Candidate();
	    	cand.getId();
	    	list.add(cand);
	    }
	    return list;
	}  */ 
	public List<Candidate> getCandidates(String category){  
		
		
	    return jdbcTemplate.query("select id,firstname,lastname,category from candidate_details where category='"+category+"'",new RowMapper<Candidate>(){    
	        public Candidate mapRow(ResultSet rs, int row) throws SQLException {    
	        	       	
	        	
	        
	            Candidate e=new Candidate();    
	            e.setId(rs.getInt(1));    
	            e.setFirstname(rs.getString(2));    
	            e.setLastname(rs.getString(3));    
	            e.setCategory(rs.getString(4));
	                
	            return e; 
	        }    
	    });    
	  
	}    
	
}
