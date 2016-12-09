package com.example.administrator.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Administrator on 12/9/2016.
 */

public class Crime {
    private UUID mId;
    private String mTitle;

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    private Date mDate;

    public Boolean isSolved() {
        return mSolved;
    }

    public void setSolved(Boolean mSolved) {
        this.mSolved = mSolved;
    }

    private Boolean mSolved;

    public Crime(){
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId(){
        return mId;
    }

    public String getTitle(){
        return mTitle;
    }

    public void setTitle(String title){
        mTitle = title;
    }
}
