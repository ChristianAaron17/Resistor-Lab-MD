package com.example.resistorlab.di

import android.content.Context
import com.example.resistorlab.data.UserRepository
import com.example.resistorlab.data.pref.UserPreference
import com.example.resistorlab.data.pref.dataStore

object Injection {
    fun provideRepository(context: Context): UserRepository {
        val pref = UserPreference.getInstance(context.dataStore)
        return UserRepository.getInstance(pref)
    }
}