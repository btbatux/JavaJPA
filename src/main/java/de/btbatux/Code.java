package de.btbatux;

import jakarta.persistence.*;

@Entity // Bu sınıfın bir JPA varlığı olduğunu belirtir.
@Table(name = "codes") // Bu varlığın veritabanındaki tablo adını belirtir.
public class Code {
    @Id // Bu alanın birincil anahtar olduğunu belirtir.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Bu alanın otomatik artan bir değere sahip olduğunu belirtir.
    @Column(name = "code_id",columnDefinition = "serial") // Bu alanın veritabanındaki sütun adını ve sütunun veri tipini belirtir.
    private int id;
    @Column(name = "code_group",nullable = false) // Bu alanın veritabanındaki sütun adını ve null olamayacağını belirtir
    private String group;

    @Column(name = "code_serial",nullable = false)
    private String serial;

    @OneToOne(mappedBy = "code",fetch = FetchType.LAZY)
    private Product product;
    public Code() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Code{" +
                "id=" + id +
                ", group='" + group + '\'' +
                ", serial='" + serial + '\'' +
                '}';
    }
}
