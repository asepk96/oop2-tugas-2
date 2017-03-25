public class Parameter1{
public static void main(String[] args) {
	Parameter1 method = new Parameter1(){
		method.methodTampilkan( "beljar java yuk");
		method.methodTampilkan("beljar java yuk","hinga mengerti");
	}
	private void methodTampilkan (String nama){
	System.out.println(nama);
	}
	private void methodTampilkan (String nama1, String nama2){
		System.out.println(nama1+nama2);
	}
}	