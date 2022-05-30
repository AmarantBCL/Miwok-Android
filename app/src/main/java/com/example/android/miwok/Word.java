package com.example.android.miwok;

public class Word {
    private String defaultTranslation;
    private String miwokTranslation;
    private int imageResource;
    private int audioResource;

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public int getImageResource() {
        return imageResource;
    }

    public int getAudioResource() {
        return audioResource;
    }

    public Word(String defaultTranslation, String miwokTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResource) {
        this(defaultTranslation, miwokTranslation);
        this.imageResource = imageResource;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResource, int audioResource) {
        this(defaultTranslation, miwokTranslation, imageResource);
        this.audioResource = audioResource;
    }
}
