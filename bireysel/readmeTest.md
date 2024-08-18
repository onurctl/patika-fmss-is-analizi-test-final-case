# Test Projesi - Bireysel
Repo içinde "bireysel" dosyasının altında tüm dokümanları yer alıyor. 4 başlıktan oluşmaktadır:

# 1. UML Diyagramı Ekseninde Test Senaryoları
- Projenin kapsamlı UML diyagramı temel alınarak, tüm signup & login süreçleri olabildiğince detaylandırılmaya çalışılarak 21 adet senaryo hazırlanmıştır.
- Bunlar, otomasyon projesindeki feature dosyaları içine ilk yazılan senaryolardır ve o feature içinde kaç adet oldukları feature dosyasının üst kısmındaki yorum satırında belirtilmiştir.
- Genellikle bir veri girişi içermeyen; smoke test eksenindeki sayfa, metin, geçiş gibi temel UI kontrollerine dayanmaktadır. Ayrıca eklenen PDF dosyasında da düzgün bir taslak içinde dokümante edilmişlerdir. 

# 2. Prototip Eksenli Otomasyon
- Balsamiq üzerinde hazırlanan mockup sayfaları, bağlantılarla geçiş eklenerek sayfaların aktif edildiği bir demo haline getirilmiştir.
- Gerek projenin iş analizi klasörü altındaki grup dosyası bağlantısında gerekse test klasörü altında bu demo -video- görülebilir.
- Otomasyon projesindeki tüm sayfa elementleri ve senaryolar tamamen buradaki tasarıma uygun hazırlanmıştır.

# 3. Veritabanı Eksenli Senaryolar
- Backend ekibi için hazırlanan sign up analizi ekseninde veri başlıklarının, veri tiplerinin, foreign key’lerin doğruluğunu test edecek senaryolar da test projesindeki feature dosyalarında yer almaktadır.
- Her bir feature içinde kaç adet oldukları database yorum satırı olarak feature dosyaları içinde yazmaktadır.
- Bu senaryolar toplam 12 adettir ancak birçok alt case ile veri girişindeki olasılıklar çeşitlendirilmiştir.
- NOT NULL veri alanları, veri tipleri, UNIQUE veri tipleri, kullanıcı bilgilerinin ilişkileri -şifre/mail eşleşmesi- gibi birçok senaryoyu içermektedir.
- Bahsi geçen sign up analizine dair bağlantı hem grup proje dokümanında hem de bireysel klasörü altındaki dosyalarda bulunmaktadır.
  
# 4. Testlerin Demo Ekranda Koşumu
- Bu aşama için, tasarım tarafında demo oluşturulması ve bu eksende düzgün bir mobil test otomasyon tasarımı oluşturulmasının yeterli görüldüğü belirtildiğinden ekstra bir çalışma yapılmamıştır.

