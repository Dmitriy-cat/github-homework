public class Main {

	public static void main(String[] args) {
		System.out.println("Hello, world!");
	}
	
	public static void print(String str){
		System.out.println(str);
	}

	public static void print(String str, int count){
		for (int i=0; i < count; i++){
			System.out.println(str);
		}
	}
}