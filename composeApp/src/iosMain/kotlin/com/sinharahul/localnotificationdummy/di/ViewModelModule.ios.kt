package com.sinharahul.localnotificationdummy.di

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import com.sinharahul.localnotificationdummy.home.HomeScreenViewModel

actual val viewModelModule = module {
    singleOf(::HomeScreenViewModel)
}
