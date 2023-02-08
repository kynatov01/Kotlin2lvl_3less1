package com.example.kotlin2lvl_2less.utils

import android.app.Application

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initPref()
    }

    private fun initPref() {
        val preferenceHelper = PreferenceHelper()
        preferenceHelper.unit(this)
    }
}