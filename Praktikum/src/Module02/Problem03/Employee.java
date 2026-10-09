package Module02.Problem03;

//Pada baris ini terjadi error karena nama class (Pegawai) tidak sama dengan nama file (Employee.java) dan tidak sesuai dengan Main.java yang memakai Employee
//public class Pegawai {
public class Employee {
    public String name;
    //Pada baris ini terjadi error karena origin bertipe char sehingga tidak dapat menyimpan teks "Kingdom of Orvel" dan tidak dapat dikembalikan oleh getOrigin() yang bertipe String
    //public char origin;
    public String origin;
    public String role;
    public int age;

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    //Pada baris ini terjadi error karena method tidak memiliki parameter, padahal dipanggil dengan setRole("Assasin") dan variabel r pada baris di bawahnya tidak dideklarasikan
    //public void setRole() {
    public void setRole(String r) {
        this.role = r;
    }
}