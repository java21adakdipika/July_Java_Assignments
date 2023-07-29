package reflection.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

import reflection.model.*;

public class Reflection {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException{

		String className = args[0];
		
		Class<?> tempClass = Class.forName(className);
		System.out.println("*** Fields *************************************************************************");
		
		Field[] declaredFields = tempClass.getDeclaredFields();
		
		for(Field f:declaredFields) {
			System.out.println(f);
		}
		
		System.out.println("\n*** Constructor ******************************************************************");
		
		Constructor<?>[] declaredConstructor = tempClass.getConstructors();
		
		for(Constructor c:declaredConstructor) {
			System.out.println(c);
		}
		
		System.out.println("\n*** Methods **********************************************************************");
		
		Method[] methods = tempClass.getMethods();
		
		for(Method m:methods) {
			System.out.println(m);
		}
		
		System.out.println("\n**** Type ******************************************************************************");
		
		Class<? super ClassifyPlayer> superClass = ClassifyPlayer.class.getSuperclass();
		System.out.println(superClass.getSimpleName());
	}
	

}