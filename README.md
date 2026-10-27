# PBO-Case-Study
# Sistem Rental Kendaraan

Implementasi konsep Object-Oriented Programming (OOP) pada sistem rental kendaraan.

### 1. Abstract Class
- Terdapat pada file `Kendaraan.java`. Kelas ini bertindak sebagai kerangka utama untuk semua jenis kendaraan rental. 
- Kelas ini berstatus *abstract* karena objek umum `Kendaraan` tidak boleh dibuat secara langsung. Sistem rental harus menyewakan wujud kendaraan yang spesifik (Mobil Listrik atau Mobil Bensin). 
- Kelas ini memiliki *abstract method* `hitungTotalSewa(int hari)` yang mewajibkan semua kelas turunannya untuk mendefinisikan rumus harga sewa mereka sendiri.

### 2. Interface
- Terdapat pada file `KendaraanListrik.java`. Interface digunakan untuk merepresentasikan kontrak atau kemampuan (can-do relationship).
- Tidak semua kendaraan mendapatkan insentif pajak. Daripada menaruh diskon pajak pada *Abstract Class*, dibuat antarmuka khusus yang hanya akan di-`implements` oleh kendaraan berbasis baterai.

### 3. Inheritance (Pewarisan)
- Terdapat pada `MobilListrik.java` dan `MobilBensin.java`.
- Kedua kelas tersebut merupakan kelas turunan (child class) yang menggunakan kata kunci `extends Kendaraan`. Mereka mewarisi properti dasar seperti `platNomor` dan `merk`, sehingga tidak terjadi duplikasi kode.

### 4. Polymorphism
- Terdapat pada file `Main.java`.
- Sistem menggunakan sebuah array bertipe `Kendaraan` yang menampung objek turunan yang berbeda (`MobilListrik` dan `MobilBensin`). Saat perulangan (`for`) memanggil metode `k.hitungTotalSewa(durasiSewa)`, program mengeksekusi implementasi yang berbeda untuk masing-masing objek secara otomatis.
