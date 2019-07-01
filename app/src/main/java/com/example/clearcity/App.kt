package com.example.clearcity

import android.app.Application
import com.arellomobile.mvp.MvpFacade
import com.example.clearcity.di.global.AppComponent
import com.example.clearcity.di.global.DaggerAppComponent

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        MvpFacade.init()
        appComponent = buildAppComponent()
    }

    private fun buildAppComponent(): AppComponent =
        DaggerAppComponent.builder()
            .context(this)
            .build()

    companion object {
        lateinit var appComponent: AppComponent
    }
}