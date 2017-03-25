public class Mahasiswa {
	public String nama;
	public void kuliah () {
		System.out.println("kuliah");
	} 
		public static void main(String[] args) {
			Mahasiswa asep = new Mahasiswa () ;

			asep.nama = "asep kurniawan" ;
			asep.kuliah () ;
		}
	}