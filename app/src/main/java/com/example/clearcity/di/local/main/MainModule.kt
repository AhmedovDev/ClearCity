package com.example.clearcity.di.local.main

import com.example.clearcity.mvp.main.main.MainPresenter
import dagger.Module
import dagger.Provides
import ru.terrakok.cicerone.Router

@Module
class MainModule {
    @Provides
    @MainScope
    fun providePresenter(router: Router) = MainPresenter(router)
}