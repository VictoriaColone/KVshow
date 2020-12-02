package com.example.kvshow.ui.fragment

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.preference.Preference
import android.preference.PreferenceFragment
import android.preference.PreferenceScreen
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import com.example.kvshow.R
import com.example.kvshow.ui.activity.ABOUT
import com.example.kvshow.ui.activity.AboutActivity

/**
 *
 * @Description: 设置状态页面
 * @Author: yutao
 */
class SettingFragment: PreferenceFragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        addPreferencesFromResource(R.xml.setting_status)
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onPreferenceTreeClick(
        preferenceScreen: PreferenceScreen?, preference: Preference?): Boolean {
        val key = preference?.key
        when(key) {
            ABOUT -> {
                activity.startActivity(Intent(activity, AboutActivity::class.java))
            }
        }
        return super.onPreferenceTreeClick(preferenceScreen, preference)
    }
}