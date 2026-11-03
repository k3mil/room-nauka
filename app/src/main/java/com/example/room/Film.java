package com.example.room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Film")
public class Film {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String tytul;
    @ColumnInfo(name = "rok")
    private int rokProdukcji;
    private String kategoria;

    public Film(String tytul, int rokProdukcji, String kategoria) {
        this.tytul = tytul;
        this.rokProdukcji = rokProdukcji;
        this.kategoria = kategoria;
    }
}
