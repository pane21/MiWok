package com.example.android.miwok;

public class Word {

    private String mEnglishWord;
    private String mMiWokWord;
    private int mImageResourceID = -1;



    public Word(String englishWord, String miWokWord, int drawable) {
        mEnglishWord = englishWord;
        mMiWokWord = miWokWord;
        mImageResourceID = drawable;

    }

    public Word(String englishWord, String miWokWord) {
        mEnglishWord = englishWord;
        mMiWokWord = miWokWord;

    }

    public String getEnglishWord() {
        return mEnglishWord;
    }

    public String getMiWokWord() {
        return mMiWokWord;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }

    public boolean hasImage(){
        return mImageResourceID !=-1;
    }
}
