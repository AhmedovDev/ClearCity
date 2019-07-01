package com.example.clearcity.di.local.main

import com.example.clearcity.ui.main.MainActivity
import dagger.Subcomponent

@Subcomponent(modules = [MainModule::class])
@MainScope
interface MainComponent {
    fun inject(activity: MainActivity)

    @Subcomponent.Builder
    interface Builder {
        fun build(): MainComponent
    }
}