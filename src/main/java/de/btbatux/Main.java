package de.btbatux;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PostRemove;
import jdk.swing.interop.SwingInterOpUtils;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        /*
        JPA ile veritabanı işlemleri yapmak için kullanılan temel yapıları oluşturur.
        EntityManager aracılığıyla veritabanı işlemleri gerçekleştirilebilir,
        örneğin veri ekleme, silme, güncelleme veya sorgulama.
         */
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("market");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        /*
        //Müşteri Ekleme
        Customer c1 = new Customer();
        c1.setName("Batuhan Strg");
        c1.setMail("info@patikabtbatu.com");
        c1.setOnDate(LocalDate.now());
        c1.setGender(Customer.GENDER.MALE);
        entityManager.persist(c1);

        //Supplier Ekleme
        Supplier supplier = new Supplier();
        supplier.setAddress("İstanbul");
        supplier.setCompany("Samsung");
        supplier.setContact("0000999");
        supplier.setMail("batuhan111@hotmail.com");
        supplier.setPerson("BatuhanX");
        entityManager.persist(supplier);

        //Category ekleme
        Category category = new Category();
        category.setName("Telefonlar");
        entityManager.persist(category);

        //Code Ekleme
        Code code =  new Code();
        code.setGroup("00001");
        code.setSerial("00112");
        entityManager.persist(code);

        //Ürün Ekleme Ekleme
        Product product = new Product();
        product.setName("Samsung mi 18");
        product.setPrice(9901);
        product.setStock(31);
        product.setCode(code);
        product.setSupplier(supplier);
        product.setCategory(category);
        entityManager.persist(product);
        */

        /*
        Color red = new Color("Red");
        Color blue = new Color("Blue");
        Color green = new Color("Green");
        entityManager.persist(red);
        entityManager.persist(blue);
        entityManager.persist(green);

        Product product3 = entityManager.find(Product.class,1);
        List<Color>colorList = new ArrayList<>();
        colorList.add(blue);
        colorList.add(red);
         // colorList.add(green);
        product3.setColorList(colorList);
        entityManager.persist(product3);
*/

        Product product = entityManager.find(Product.class,1);
        System.out.println(product.getName());


        entityManager.getTransaction().commit();



    }
}