package com.gourianova.binocularvision.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Setter
@Entity
public class TextIn implements Serializable {
       @Id
        private long  id;
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(nullable = false, updatable = false)
        private String text_title;
        private String text_in;
    private LocalDate create_time;
  //  private Language language;

    public TextIn() {

    }
    public TextIn(String text_title, String text_in, LocalDate create_time, Language language) {
        {

            this.text_title = text_title;
            this.text_in = text_in;
            this.create_time=create_time;
        //this.language = language;
        }
    }
    public TextIn(String text_title, String text_in) {
        {

            this.text_title = text_title;
            this.text_in = text_in;
            }
    }
    public TextIn(long incrementAndGet, LocalDate now, String text_title, String text_in) {
        this.id=incrementAndGet;
        this.create_time=now;
        this.text_in=text_in;
       // this.roles_id=Integer.parseInt(name);
    }
}

