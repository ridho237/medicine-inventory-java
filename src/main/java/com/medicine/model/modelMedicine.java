package com.medicine.model;
import jakarta.persistence.*;
import java.time.LocalDate;
/**
 *
 * @author Wiliam Devin Septianus Pranggono
 */
@Entity
@Table (name = "medicine")
public class modelMedicine {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;
    
    @Column (name = "Nama_Obat", length = 200, nullable = false)
    private String nama_obat;
    
    @Column (name = "Jenis_Obat", length = 200)
    private String jenis_obat;
    
    @Column (name = "Jumlah")
    private int jumlah;
    
    @Column (name = "Satuan", length = 100)
    private String satuan;
    
    @Column (name = "Exp_Date")
    private LocalDate expired;
    
    public modelMedicine() {
        
    }
    
    public modelMedicine(int id, String nama_obat, String jenis_obat, int jumlah, String satuan, LocalDate expired) {
        this.id = id;
        this.nama_obat = nama_obat;
        this.jenis_obat = jenis_obat;
        this.jumlah = jumlah;
        this.satuan = satuan;
        this.expired = expired;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama_obat() {
        return nama_obat;
    }

    public void setNama_obat(String nama_obat) {
        this.nama_obat = nama_obat;
    }

    public String getJenis_obat() {
        return jenis_obat;
    }

    public void setJenis_obat(String jenis_obat) {
        this.jenis_obat = jenis_obat;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public LocalDate getExpired() {
        return expired;
    }

    public void setExpired(String expired) {
        this.expired = LocalDate.parse(expired);
    }
}
