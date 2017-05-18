package com.example.android.miwok;

public class Words {

    private String mEnglishWord;
    private String mMiWokWord;

    public Words(String englishWord, String miWokWord) {
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
