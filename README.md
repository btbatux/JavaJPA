# Java JPA ile Veritabanı İşlemleri Örneği

Bu proje, Java Persistence API (JPA) kullanarak temel veritabanı işlemlerini gerçekleştiren bir örnektir. 
Proje, Java programlama dili kullanılarak oluşturulmuştur.

## Gereksinimler

Bu projenin çalıştırılması için aşağıdaki gereksinimlere ihtiyacınız olacaktır:

- Java Development Kit (JDK) 8 veya üstü
- Bir IDE (Integrated Development Environment) veya Java için bir metin düzenleyici (VSCode, IntelliJ IDEA, Eclipse vb.)
- Apache Maven
- PostgreSQL veritabanı

## Proje Yapısı

Proje, aşağıdaki sınıfları içermektedir:

1. Customer: Müşteri verilerini temsil eden sınıf.
2. Product: Ürün verilerini temsil eden sınıf.
3. Category: Kategori verilerini temsil eden sınıf.
4. Supplier: Tedarikçi verilerini temsil eden sınıf.
5. Code: Ürün kodu verilerini temsil eden sınıf.
6. Color: Ürün renk verilerini temsil eden sınıf.
7. Main: JPA ile veritabanı işlemlerinin gerçekleştirildiği ana sınıf.

## Nasıl Çalıştırılır

1. Projenin klonunu oluşturmak için terminal veya komut istemcisini açın ve şu komutu çalıştırın:

    ```
    git clone <https://github.com/btbatux/JavaJPA.git>
    ```

2. PostgreSQL veritabanında bir veritabanı oluşturun. Örneğin:

    ```
    CREATE DATABASE market;
    ```

3. Proje dizinine gidin ve `src/main/resources/META-INF/persistence.xml` dosyasını açarak veritabanı bağlantı ayarlarınızı düzenleyin. 
4. Özellikle, `javax.persistence.jdbc.url`, `jakarta.persistence.jdbc.user` ve `jakarta.persistence.jdbc.password` 
5. değerlerini kendi veritabanı bağlantı bilgilerinize göre ayarlayın.
4. Proje dizinine gidin ve aşağıdaki komutu çalıştırarak Maven bağımlılıklarını indirin:

    ```
    mvn clean install
    ```

5. Proje dizinindeki `Main.java` dosyasını çalıştırarak örnek veritabanı işlemlerini gerçekleştirin.

## İlişkiler

Bu projede aşağıdaki ilişki türleri uygulanmıştır:

- **One-to-One İlişki**: `Product` ve `Code` sınıfları arasında birbirine bağlıdır. Her ürünün bir kodu vardır ve her kod bir ürüne aittir.

- **Many-to-One İlişki**: `Product` ve `Supplier` sınıfları arasında bu ilişki bulunur. Bir tedarikçinin birden çok ürünü olabilir, ancak her ürün bir tedarikçiye aittir.

- **One-to-Many İlişki**: `Category` ve `Product` sınıfları arasında bu ilişki mevcuttur. Bir kategorinin birden çok ürünü olabilir, ancak her ürün bir kategoriye aittir.

- **Many-to-Many İlişki**: `Product` ve `Color` sınıfları arasında bu ilişki bulunur. Bir ürün birden çok renge sahip olabilir ve bir renk birden çok ürüne ait olabilir.

## Notlar

- Proje, PostgreSQL veritabanı kullanılarak oluşturulmuştur. Ancak, farklı bir veritabanı kullanmak isterseniz, 
- bağlantı ayarlarınıza uygun olarak `persistence.xml` dosyasını düzenleyebilirsiniz.

- Veritabanı tabloları otomatik olarak oluşturulacak ve güncellenecektir, 
- çünkü `hibernate.hbm2ddl.auto` özelliği `update` olarak ayarlanmıştır. 
- Ancak, bir üretim ortamında bu özelliği kullanmaktan kaçının ve el ile veritabanını yönetin.

- Proje, JPA'nın temel özelliklerini kullanarak bir örnek sunmaktadır. 
- Gerçek dünya uygulamalarında, daha karmaşık ilişkiler, sorgular ve iş mantığı senaryolarıyla karşılaşabilirsiniz.

