import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


public class Launcher{
	/**
	Si les digo que voy a crear un objeto sin usar el operador "new" ¿me creerian?
	y que tal si despues ejecutamos un metodo PRIVADO de ese objeto..
	¿imposible? no lo creo... que empieze el Demo
	*/
	public static void main(String[] args) {
		/**
		Iniciemos nuestras variables de instancia
		>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>BEGIN<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		*/
		ChildClass instanceOfChild = null;
		int firstConstructorParam = 3;
		String secondConstructorParam = "Felix Diaz";
		Integer firstMethodParam = new Integer(666);
		String secondMethodParam = new String("MAGIC!");
		/**
		>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>END<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		*/
		//CLASE DE PRUEBA CON LA QUE TRABAJAREMOS
		Class<?> reflectClass = ChildClass.class;

		//Obtengamos el nombre de la clase
		String className = reflectClass.getName();
		System.out.println("\nName of our test class : " + className);

		//Obtengamos el modificador de la clase public, private, protected, sinchronized
		int classModifier = reflectClass.getModifiers();
		System.out.println("¿This class is public? = " + Modifier.isPublic(classModifier));
		
		//Obtengamos el nombre de la clase padre
		Class<?> classSuper = reflectClass.getSuperclass();
		System.out.println("Name of our test class parent : " + classSuper.getName());
		
		//Obtengamos la informacion de los metodos
		Method[] classMethods = reflectClass.getDeclaredMethods();
		if(classMethods.length > 0){
			System.out.println("\nMethods of our test class...\n");		
				for(Method actualMethod : classMethods){
					System.out.println("Method Name : " + actualMethod.getName());
					System.out.println("Return Type : " + actualMethod.getReturnType());
			//parametros
					Class<?>[] parametersType = actualMethod.getParameterTypes();
					if(parametersType.length > 0){
						System.out.println("Parameters of our actual method : ");
						for(Class<?> actualParameterType : parametersType){
							System.out.println("\tType of parameter: " + actualParameterType.getName());
						}
					}else{
						System.out.println("Method has no parameters!");
					}
					System.out.println("");
				}
		}else{
			System.out.println("Class has no methods!");
		}
		
		//Obtengamos los constructores
		Constructor<?> constructorOne = null, constructorTwo = null;
		Object constructorTwoObject = null;
		try{
			constructorOne = reflectClass.getConstructor();
			constructorTwo = reflectClass.getConstructor(int.class, String.class);
			//Aprovechando este try lanzemos la magia!
			//Hacemos un objeto basado en el constructor de la clase Reflejada
			System.out.println("Building the object wich constructor is : " + "("+firstConstructorParam +","+ secondConstructorParam+")");
			constructorTwoObject = constructorTwo.newInstance(firstConstructorParam,secondConstructorParam);
			//<>>>>>><<>< MAGIA! ><>>>>>>>>>><
			instanceOfChild = (ChildClass)constructorTwoObject;
		}catch(NoSuchMethodException | SecurityException e){
			e.printStackTrace();
		}catch(InstantiationException | IllegalArgumentException | IllegalAccessException | InvocationTargetException e){
			e.printStackTrace();
		}

		//Obtengamos los parametros del constructor
		Class[] constructorParametersType = constructorTwo.getParameterTypes();
				if(constructorParametersType.length > 0){
					System.out.println("Parameters of our constructor : ");
					for(Class<?> actualConstructorParameterType : constructorParametersType){
						System.out.println("\tName of parameter: " + actualConstructorParameterType.getName());
					}
				}else{	
					System.out.println("Constructor has no parameters!");
				}

		//Obtengamos los campos
		Field privateStringName = null;
		try{
			privateStringName = ChildClass.class.getDeclaredField("nameToShow");
			//Rompiendo seguridad del campo private
			privateStringName.setAccessible(true);
			//Obteniendo el valor
			String valueOfPrivateField = (String)privateStringName.get(instanceOfChild);
			System.out.println("private nameToShow = " + valueOfPrivateField);
		}catch(NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e){
			e.printStackTrace();
		}

		try{
			Method privateMethod = null;
			String returnValue = null;
			privateMethod = ChildClass.class.getDeclaredMethod("obtainingReturnValue");
			//Rompiendo seguridad de metodo private
			privateMethod.setAccessible(true);
			returnValue = (String)privateMethod.invoke(instanceOfChild);
			System.out.println("Return value of private method obtainingReturnValue() = " + returnValue);
		
			//¿Que tal algo mas complicado?, ejecutando metodo pasandole parametros
			Class<?>[] methodParametersClass = new Class<?>[]{Integer.TYPE, String.class};
			Object[] methodParametersValue = new Object[]{firstMethodParam, secondMethodParam};

			privateMethod = ChildClass.class.getDeclaredMethod("executingWithParamethers",methodParametersClass);		
			//Rompiendo seguridad de metodo private
			privateMethod.setAccessible(true);

			returnValue = (String)privateMethod.invoke(instanceOfChild, methodParametersValue);
			System.out.println("Return value of private method executingWithParamethers("+firstMethodParam+","+secondMethodParam+") = " + returnValue);

			//<>>>>>><<>< MAGIA! ><>>>>>>>>>><
			System.out.println("Executing \"private void myHelloWorldNTimes()\"");
			privateMethod = ChildClass.class.getDeclaredMethod("myHelloWorldNTimes");
			//Rompiendo seguridad de metodo private
			privateMethod.setAccessible(true);
			privateMethod.invoke(instanceOfChild);
		}catch(NoSuchMethodException |  IllegalArgumentException | IllegalAccessException | InvocationTargetException e){
			e.printStackTrace();
		}	
	}
}