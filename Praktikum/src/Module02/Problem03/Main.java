package Module02.Problem03;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        //Pada baris ini terjadi error karena kurangnya titik koma (;)
        //e.name = "Roi"
        e.name = "Roi";
        e.origin = "Kingdom of Orvel";
        e.setRole("Assasin");
        //Pada baris ini umur tidak pernah diisi sehingga bernilai default 0, padahal keluaran yang diminta adalah 17
        e.age = 17;

        //Pada baris ini terjadi kesalahan karena teks yang dicetak (Nama Pegawai) tidak sesuai dengan keluaran yang diminta (Nama)
        //System.out.println("Nama Pegawai: " + e.getName());
        System.out.println("Nama: " + e.getName());
        System.out.println("Asal: " + e.getOrigin());
        System.out.println("Jabatan: " + e.role);
        //Pada baris ini terjadi kesalahan karena keluaran yang diminta memuat kata "tahun" setelah umur
        //System.out.println("Umur: " + e.age);
        System.out.println("Umur: " + e.age + " tahun");
    }
}