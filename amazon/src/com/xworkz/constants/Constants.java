package com.xworkz.constants;

public class Constants {

	public static final String DRIVER_CLASS_NAME="com.mysql.cj.jdbc.Driver";
	public static final String URL="jdbc:mysql://localhost:3306/xworkz.db?user=root&password=Kingofkings99";
	public static final String INSERT_QUERY="insert into amazon_table values(?,?,?,?,?)";
	public static final String SELECT_QUERY="select * from amazon_table";
	public static final String UPDATE_NAME_BY_ID="update amazon_table set name = ? where id =?";
    public static final String DELETE_BY_ID="delete from amazon_table where id=? ";
    public static final String SELECT_NAME="select name from amazon_table";
    public static final String SELECT_ID="select id from amazon_table where name=?";
}
