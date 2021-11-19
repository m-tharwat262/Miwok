package com.example.android.miwok;


public class Word {


    private static final int NO_IMAGE_PROVIDED = -1;

    private int mDefaultTranslationResId;
    private int mMiwokTranslationResId;
    private int mAudioResId;
    private int mImageResId = NO_IMAGE_PROVIDED;



    public Word(int defaultTranslationResId, int miwokTranslationResId, int audioResourceId) {

        mDefaultTranslationResId = defaultTranslationResId;
        mMiwokTranslationResId = miwokTranslationResId;
        mAudioResId = audioResourceId;

    }


    public Word(int defaultTranslationResId, int miwokTranslationResId, int imageResourceId, int audioResourceId) {

        mDefaultTranslationResId = defaultTranslationResId;
        mMiwokTranslationResId = miwokTranslationResId;
        mImageResId = imageResourceId;
        mAudioResId = audioResourceId;

    }


    public int getDefaultTranslation() {

        return mDefaultTranslationResId;
    }


    public int getMiwokTranslation() {

        return mMiwokTranslationResId;
    }


    public int getImageResourceId() {

        return mImageResId;
    }


    public boolean hasImage() {

        return mImageResId != NO_IMAGE_PROVIDED;
    }


    public int getAudioResourceId() {

        return mAudioResId;
    }
}