package com.example.bookshelf;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey(autoGenerate = false)
    private String uuid = ""; // 사용자 기기 값(노티용)

    private String my_nm;

    private String start_date; // YYYYMMDD

    private int con_date = 0;

    private String last_date; // YYYYMMDD

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getMy_nm() {
        return my_nm;
    }

    public void setMy_nm(String my_nm) {
        this.my_nm = my_nm;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public int getCon_date() {
        return con_date;
    }

    public void setCon_date(int con_date) {
        this.con_date = con_date;
    }

    public String getLast_date() {
        return last_date;
    }

    public void setLast_date(String last_date) {
        this.last_date = last_date;
    }
}
