# Test Projesi - Bireysel

# Senaryo Detayları
21 adet UI ve 12 adet veritabanı eksenli senaryonun detayları şu şekildedir:

# Arayüz, Sayfa geçişi ve Element Kontrolü Eksenli - Smoke
- Tutorial sayfası title doğrulaması
- Tutorial devamındaki ikinci sayfaya geçiş ve title ile doğrulaması
- Tutorial skip sonrası Main Page'e geçiş ve doğrulaması
- Tutorial içinden Main Page'e geçiş ve doğrulaması

- Main page slogan metni kontrolü
- Main page'den "Privacy Policy" sayfasına geçiş ve title doğrulaması
- Main page'den "Terms of Services" sayfasına geçiş ve title doğrulaması
- Main page'den "Google Account" sayfasına geçiş ve title ile doğrulaması
- Main page'den "Mail ile Sign Up" sayfasına geçiş ve title doğrulaması
- Main page'den "Choose Account Type" sayfasına geçiş ve sayfadaki butonların doğrulanması
- Main page'den "Login" sayfasına geçiş ve title doğrulaması

- Sign Up sayfasının tüm input alanlarının doğrulanması
- Sign Up sayfasından "Privacy Policy" sayfasına geçiş ve title doğrulaması
- Sign Up sayfasından "Terms of Services" sayfasına geçiş ve title doğrulaması
- Sign Up sayfasından "Privacy Policy" sayfasına geçiş ve Accept butonuna tıklanıp onay verilmesi
- Sign Up sayfasından "Terms of Services" sayfasına geçiş ve Accept butonuna tıklanıp onay verilmesi
- Sign Up sayfasından "Login" sayfasına geçiş ve title doğrulaması

- Login sayfasının tüm input alanlarının doğrulanması
- Login sayfasından "Password Reset" sayfasına geçiş ve title doğrulaması
- Login sayfasından "Google Account" sayfasına geçiş ve title ile doğrulaması
- Login sayfasından "Sign Up" sayfasına geçiş ve title ile doğrulaması

- Password Reset sayfasındaki input alanının doğrulanması

# DB Eksenli Senaryolar -NOT NULL ve UNIQUE değerler, Veri Tipi Validation, İlişkiler-
- Sign Up sayfasında NOT NULL alanların kontrolü
- Sign Up sayfasında UNIQUE değerlerin kontrolü: mail&şifre
- Sign Up sayfasında şifre yeterlilik koşullarının kontrolü
- Sign Up sayfasında telefon numarası yeterlilik koşullarının kontrolü
- Sign Up sayfasında isim alanlarında nümerik ifade kontrolü
- Sign Up sayfasında valid email girişi kontrolü

- Login sayfasında şifre/email ilişkisi kontrolü: kayıtlı olmayan email girişi & kayıtlı email ile ilişkili şifrenin yanlış girilmesi
- Login sayfasında NOT NULL alanların kontrolü

Bu detaylar harici, genel olarak bakılırsa test projesi 4 başlıktan oluşmaktadır:

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

