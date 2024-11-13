
public class Test {
	public static void main(String[] args) {
		
		Person taro = new Person();
		
		taro.name = "太郎";
		taro.age =20;
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		
		taro.name = "木村次郎";
		taro.age = 18;
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		
		taro.name = "鈴木花子";
		taro.age = 15;
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		
		taro.name ="鵜木宏好";
		taro.age = 30;
		taro.address ="abc@gmail.com";
		taro.phoneNumber = "12345678";
		
		taro.name ="太郎";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.address);
		System.out.println(taro.phoneNumber);
		
		taro.talk();
		taro.walk();
		taro.run();
		
	}
}
