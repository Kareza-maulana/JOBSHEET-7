PERTANYAAN 1
1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program
Percobaan 1!
```for(int i=1;i<=10;i++)```
int i=1 sebagai inisialisasi, i<=10 sebagai kondisi, dan i++ sebagai iterasi

2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang
terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?
inisialisasi 0 pada nilai tertinggi bertujuan untuk mendapatkan nilai tertingi dari skala 0-100, setiap nilai yang dimasukan akan diuji ke dalam kode
 ``` if(nilai>nilai_tertingi){nilai_tertingi=nilai;}```, pada saat iterasi pertama, saat itulah program menginisiasi nilai tertinggi pertama, jadi berapapun nilai yang diinput akan menjadi nilai tertinggi saat iterasi pertama, karena pada aturan if tersebut nilai awal dari variabel nilai tertinggi=0, namun saat iterasi ke 2 nilai_tertinggi tidak lagi sama dengan 0, namun menjadi nilai_tertingi yang ada saat iterasi pertama.
 inisialisasi 100 pada variabel nilai tereendah bertujuan untuk membatasi nilai variabel nilai terendah dan prosesnya mirip seperti variabel nilai tertinggi yakni dengan mambandingkan iterasi yang baru dengan iterasi sebelumnya 

3. Jelaskan fungsi dan alur kerja dari potongan kode berikut!
``` if(nilai>nilai_tertingi){nilai_tertingi=nilai;}```
```    if(nilai<nilai_terendah){ nilai_terendah=nilai;}```

alur dari program tersebut adalah membandingkan setiap nilai variabel(nilai tertingi, nilai terendah) dengan nilai baru yang diinputkan, jadi pada mulanya variabel nilai tertinggi = 0, ketika diinputkan nilai berapa pun maka aturan if nilai tertinggi akan terpenuhi dan dijalankan, namun saat iterasi ke 2 nilai dari variabel nilai_tertinggi tidak lagi= 0 melainkan berisi nilai dari inputan sebelumnya, begitu juga dengan variabel nilai_trendah juga memiliki alur yang sama  



PERTANYAAN 2

1.Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut:
a. nilai < 0 || nilai > 100
SINTAKS INI BERFUNGSI Untuk memberikan batasan nilai yang diinput yaitu tidak boleh negatif dan tidak boleh lebih dari 100
b. continue
untuk untuk menghentikan iterasi dan keluar dari loop ketika kondisi dalam if tidak terpenuhi
2.Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya dituliskan di awal perulangan WHILE?
jika sintaks i++ ditulis di akhir while dengan nilai awal i=0, maka perulanagan dimulai dari 0, namun jika dipindahkan ke awal loop while maka i akan ditambah 1 terlebih dahulu baru ditampilkan
3.Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE
akan berjalan?
```18 kali```


PERTANYAAN 3

1. Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali
adalah “batal”, maka berapa kali perulangan dilakukan?
```1 KALI karena sintaks break akan langsung mengentikan program```

2. Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!
```            if (nama_pelanggan.equals("selesai")) {System.out.println("Transaksi Selesai, Silahkan bayar di kasir.");break;}```

3. Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE? berfungsi untuk melanjutkan perulangan
4. Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen
inisialisasi dan update?
karena prinsip utama dari DOWHILE  itu sendiri yakni menjalankan program minimal 1 kali baik program itu bernilai true atau false



    