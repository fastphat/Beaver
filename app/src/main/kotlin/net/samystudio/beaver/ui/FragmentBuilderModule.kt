@file:Suppress("unused")

package net.samystudio.beaver.ui

import dagger.Module
import dagger.android.ContributesAndroidInjector
import net.samystudio.beaver.di.scope.FragmentScope
import net.samystudio.beaver.ui.main.authenticator.AuthenticatorFragment
import net.samystudio.beaver.ui.main.authenticator.AuthenticatorFragmentModule
import net.samystudio.beaver.ui.main.home.HomeFragment
import net.samystudio.beaver.ui.main.home.HomeFragmentModule

@Module
abstract class FragmentBuilderModule {
    @ContributesAndroidInjector(modules = [HomeFragmentModule::class])
    @FragmentScope
    abstract fun contributeHomeFragment(): HomeFragment

    @ContributesAndroidInjector(modules = [AuthenticatorFragmentModule::class])
    @FragmentScope
    abstract fun contributeAuthenticatorFragment(): AuthenticatorFragment
}