package com.example.android.miwok;

public class Word {

    private String mEnglishWord;
    private String mMiWokWord;

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
}
