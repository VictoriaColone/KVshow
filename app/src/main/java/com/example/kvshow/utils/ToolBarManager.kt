package com.example.kvshow.utils

import android.content.Intent
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import com.example.kvshow.R
import com.example.kvshow.ui.activity.SettingActivity

/**
 * toolbar管理类
 */
interface ToolBarManager {

    val toolbar: Toolbar

    /**
     * 初始化MainActivity中toolbar
     */
    fun initMainToolBar() {
        toolbar.setTitle(R.string.app_name)
        toolbar.inflateMenu(R.menu.main)
        toolbar.setOnMenuItemClickListener {
            toolbar.context.startActivity(Intent(toolbar.context, SettingActivity::class.java))
            true
        }
    }


    /**
     * 初始化SettingActivity中toolbar
     */
    fun initSettingToolBar() {
        toolbar.setTitle(R.string.setting_title)
        toolbar.inflateMenu(R.menu.main)
    }
}