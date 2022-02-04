package com.example.gb_android.domain;

import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;

import com.example.gb_android.R;

public enum Theme {
    LIGHT(R.style.Theme_GB_Android, R.string.light_theme, "light"),
    DARK(R.style.Theme_GB_Android_Dark, R.string.dark_theme, "dark");

    @StyleRes
    private final int style;

    @StringRes
    private final int title;

    private final String key;

    Theme(int style, int title, String key) {
        this.style = style;
        this.title = title;
        this.key = key;
    }

    public int getStyle() {
        return style;
    }

    public String getKey() {
        return key;
    }

    public int getTitle() {
        return title;
    }
}
