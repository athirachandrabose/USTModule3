/**
 * 
 */
/**
 * @author Administrator
 *
 */
module IOC {
	requires spring.beans;
	requires spring.core;
	requires java.sql;
	requires spring.context;

	exports com.ust.ioc;
	exports com.ust.ioc2;
	exports com.ust.iocautowiring;
	requires java.annotation;
	exports com.ust.javaconfig;
	opens com.ust.javaconfig to spring.core;
}