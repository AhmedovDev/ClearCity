package com.example.clearcity.di.global

import android.content.Context
import com.example.clearcity.di.global.modules.DataModule
import com.example.clearcity.di.global.modules.NavigationModule
import com.example.clearcity.di.global.modules.NetworkModule
import com.example.clearcity.di.local.main.MainComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [
        NetworkModule::class,
        DataModule::class,
        NavigationModule::class
    ]
)
@Singleton
interface AppComponent {
    fun mainComponentBuilder(): MainComponent.Builder

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun context(context: Context): Builder

        fun build(): AppComponent
    }
}