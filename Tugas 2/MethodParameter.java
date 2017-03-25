public class MetrhodParameter{
public static void main(String[] args) {
	MetrhodParameter method = new MetrhodParameter();
		method.methodTampilkan("beljar java yuk");
		System.out.println(method.tampilkanNilai (3,5));
	}
	private void methodTampilkan (String nama){
	System.out.println(nama);
	}
	private void tampilkanNilai(int x, int y){
		return x+ y;
	}
}	