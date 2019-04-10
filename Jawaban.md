simpulkan apakah perbedaan antara wrap_content dan match_parent
*wrap_content : menyesuaikan ukuran lebar dan tinggi view berdasarkan konten atau objek yang ada di dalamnya
*match_parent : menyesuaikan lebar dan tinggi view suatu tampilan dengan ukuran lebar dan tinggi dari layar device

Berdasarkan percobaan diatas lakukan lah perubahan perubahan sebagai berikut kemudian ambil lah kesimpulan dari percobaan ini.
*ubah orientasi menjadi horizontal : Yang terjadi adalah error pada bagian layout:height karena ukurannya berum dirubah masih 0dp
*ubah weight sum menjadi angka integer yang lain : Yang terjadi adalah layout warna menjadi lebih lebar dibanding layout polos
*ubah layout_weight dari salah satu LinearLayout : Yang terjadi adalah layout polos menjadi lebih lebar dibanding layout warna

Pada text view hello world terdapat 4 constraint dan masing masing constraint di hubungkan ke parent dengan mode panah bergerigi, panah bergerigi ini mewakili wrap_content pilihan lain selain wrap content adalah fixed dan match constraint. Silahkan mencoba dan berikan kesimpulan terhadap pengamatan dan percobaan ada mengenai hal ini.
*dengan adanya panah bergerigi memudahkan penentuan ukuran posisi komponen berada dan akan diletakkan