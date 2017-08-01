package reflect;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test {

	public static void main(String[] args) throws Exception{
		
		Properties prop = new Properties();
		prop.load(new FileInputStream("C:\\zzz\\server.properties"));
		
		System.out.println(prop.getProperty("bbb"));
		
		
		
//		String className ="reflect.SampleC";
//		
//		String methodName = "doC";
//		
//		Class clz = Class.forName(className);
//		
//		Constructor con = clz.getDeclaredConstructor(String.class);
//		
//		Object obj = con.newInstance("AAAA");
//		//Object obj = clz.newInstance();
//		
//		System.out.println(obj);
//		
//		Method method = clz.getDeclaredMethod(methodName);
//		
//		System.out.println(method.invoke(obj));
		
	}
}
