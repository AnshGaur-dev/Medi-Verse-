package com.example.medi_verse.di
import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin




val appModules = listOf(networkModule, viewModelModule)

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApp)
            modules(appModules)
        }
    }
}