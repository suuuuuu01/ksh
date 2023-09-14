package ch12.sec11.exam02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflecctionExample {

	public static void main(String[] args) {
		// 리플렉션 작업을 지원하는 클래스 : Class
		Class clazz = Car.class;
		
		System.out.println("[생성자 정보]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
			printparameters(parameters); // 생성자의 파라미터 정보
			System.out.print(")");
		}
		
		System.out.println("\n[필드 정보]");
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getType().getName() + " " + field.getName());
		}
		System.out.println();
		
		System.out.println("[메소드 정보]");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printparameters(parameters);
			System.out.print(")");
		}
		
	}

	private static void printparameters(Class[] parameters) {		
		for(int i=0; i<parameters.length; i++) {
			System.out.println(parameters[i].getName());
			if(i<parameters.length-1) {
				System.out.println(",");
			}
		}
	}

	
}
