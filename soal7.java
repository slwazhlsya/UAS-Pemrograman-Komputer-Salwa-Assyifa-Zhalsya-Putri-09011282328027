public class soal7 {
  private String judul;
  private String penulis;
  private int tahunTerbit;
  private boolean tersedia;

  // Konstruktor untuk inisialisasi atribut buku
  public soal7(String judul, String penulis, int tahunTerbit) {
    this.judul = judul;
    this.penulis = penulis;
    this.tahunTerbit = tahunTerbit;
    this.tersedia = true; // Saat pertama kali, buku tersedia untuk dipinjam
  }

  // Metode untuk menampilkan informasi buku
  public void tampilkanInfoBuku() {
    System.out.println("Judul: " + judul);
    System.out.println("Penulis: " + penulis);
    System.out.println("Tahun Terbit: " + tahunTerbit);
    System.out.println("Status: " + (tersedia ? "Tersedia" : "Dipinjam"));
  }

  // Metode untuk meminjam buku
  public void pinjamBuku() {
    if (tersedia) {
      System.out.println("Buku berhasil dipinjam.");
      tersedia = false;
    } else {
      System.out.println("Maaf, buku sedang tidak tersedia.");
    }
  }

  public static void main(String[] args) {
    // Membuat objek buku
    soal7 buku1 = new soal7("Java Programming", "John Doe", 2020);

    // Menampilkan informasi buku sebelum dipinjam
    System.out.println("Informasi buku sebelum dipinjam:");
    buku1.tampilkanInfoBuku();

    // Meminjam buku
    buku1.pinjamBuku();

    // Menampilkan informasi buku setelah dipinjam
    System.out.println("\nInformasi buku setelah dipinjam:");
    buku1.tampilkanInfoBuku();
  }
}