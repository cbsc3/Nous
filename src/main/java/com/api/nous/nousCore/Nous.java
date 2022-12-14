package com.api.nous.nousCore;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "main")
@Entity

public class Nous {

    @Id
    @GeneratedValue
    public int id;

    @Column
    public String heading;

    @Column
    public String post;


    @Column
    public String genre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    @Override
    public String toString() {
        return "Nous{" +
                "id=" + id +
                ", heading='" + heading + '\'' +
                ", post='" + post + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
