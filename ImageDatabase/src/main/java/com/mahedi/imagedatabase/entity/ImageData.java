package com.mahedi.imagedatabase.entity;

import jakarta.persistence.*;

@Entity
@Table(name="img")
public class ImageData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private String image;

    public ImageData() {
    }

    public ImageData(long id, String name, String image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "ImageData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
