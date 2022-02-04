package com.example.gb_android.storage;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.gb_android.domain.Theme;

public class ThemeStorage {

    private final SharedPreferences sharedPreferences;

    public ThemeStorage(Context context) {
        sharedPreferences = context.getSharedPreferences("themes", Context.MODE_PRIVATE);
    }

    public Theme getTheme() {
        String savedTheme = sharedPreferences.getString("theme", Theme.LIGHT.getKey());

        Theme selectedTheme = Theme.LIGHT;

        for (Theme theme : Theme.values()) {
            if (theme.getKey().equals(savedTheme)) {
                selectedTheme = theme;
                break;
            }
        }

        return selectedTheme;
    }

    public void saveTheme(Theme theme) {
        sharedPreferences.edit().putString("theme", theme.getKey()).apply();
    }

}
