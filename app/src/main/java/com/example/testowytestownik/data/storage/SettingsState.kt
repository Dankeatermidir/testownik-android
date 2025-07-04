package com.example.testowytestownik.data.storage


data class SettingsState(
    //Ui preferences
    val darkMode: Boolean = false,
    val autoSave: Boolean = true,
    val fontSize: FontSize = FontSize.Medium,
    //Quiz preferences
    val initRepeats: Int = 3,
    val extraRepeats: Int = 1,
    val maxRepeats: Int = 3,
    //Bzzt preferences
    val hardcoreMode: Boolean = false,
    val bzztmachenPlayer: Int = 1,
    val bzztmachenAddress: String = "bzztmachen.local"
)

enum class FontSize(val scale: Float) {
    Small(1.0f),
    Medium(1.2f),
    Large(1.5f);

    companion object {
        fun fromName(name: String?): FontSize {
            return values().firstOrNull { it.name == name } ?: Medium
        }
    }
}