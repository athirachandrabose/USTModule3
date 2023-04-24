package com.ust.ioc;

public class Login {
private String username;
private String password;
dbConnection db;

public dbConnection getDb() {
	return db;
}
public void setDb(dbConnection db) {
	this.db = db;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String validate() {
	//obtain connection and writes sql.
	//to verify user name and password exist.
	//in database
//	dbConnection db=new dbConnection();
	dbConnection con=db.getConnection();
	return "login validated...";
}
//object oriented programming is full based approach, a class needs to lookup or create a instances on which it depends.
//spring ioc is based in push approach.objects required by a class are injected with the help of configuration file
}

