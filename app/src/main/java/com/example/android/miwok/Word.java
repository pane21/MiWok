package com.example.android.miwok;

public class Word {

    private String mEnglishWord;
    private String mMiWokWord;
    private int mImageResourceID = -1;
    private int mAudioResourceID;



    public Word(String englishWord, String miWokWord, int drawable, int audioResourceID) {
        mEnglishWord = englishWord;
        mMiWokWord = miWokWord;
        mImageResourceID = drawable;
        mAudioResourceID = audioResourceID;

    }

    public Word(String englishWord, String miWokWord, int audioResourceID) {
        mEnglishWord = englishWord;
        mMiWokWord = miWokWord;
        mAudioResourceID = audioResourceID;

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

    public int getAudioResourceID() {
        return mAudioResourceID;
    }

    public boolean hasImage(){
        return mImageResourceID !=-1;
    }
}
