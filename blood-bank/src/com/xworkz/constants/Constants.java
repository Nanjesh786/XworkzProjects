package com.xworkz.constants;

public class Constants {

	public static final String DRIVER_CLASS_NAME="com.mysql.cj.jdbc.Driver";
	public static final String URL="jdbc:mysql://localhost:3306/xworkz.db?user=root&password=Kingofkings99";
	public static final String INSERT_QUERY="insert into blood_bank_table values(?,?,?,?,?,?)";
	public static final String SELECT_QUERY="select * from blood_bank_table";
	public static final String UPDATE_AGE_BY_DONOR_NAME="update blood_bank_table set donor_age = ? where donor_name=?";
    public static final String DELETE_BY_NAME="delete from blood_bank_table where donor_name=? ";
    public static final String SELECT_Smoker="select issmoker from blood_bank_table where donor_name=?";
    public static final String SELECT_LOCATION="select * from blood_bank_table  where blood_bank_location=?";
    public static final String SELECT_ContactNo="select Donor_ContactNo from blood_bank_table";
}
