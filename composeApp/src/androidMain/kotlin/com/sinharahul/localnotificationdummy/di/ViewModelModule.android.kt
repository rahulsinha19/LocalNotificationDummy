package com.sinharahul.localnotificationdummy.di

import com.sinharahul.localnotificationdummy.home.HomeScreenViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

actual val viewModelModule = module {
    viewModel { HomeScreenViewModel(get()) }
}
