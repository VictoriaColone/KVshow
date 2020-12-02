package com.example.kvshow.ui.activity

import android.preference.PreferenceManager
import androidx.appcompat.widget.Toolbar
import com.example.kvshow.R
import com.example.kvshow.base.BaseActivity
import com.example.kvshow.utils.ToolBarManager
import org.jetbrains.anko.find

const val PUSH = "push"
const val NO_WIFI = "no_wifi"
const val ABOUT = "about"

/**
 *
 * @Description: 设置界面
 * @Author: yutao
 */
class SettingActivity: BaseActivity(), ToolBarManager {

    override val toolbar by lazy { find<Toolbar>(R.id.toolbar) }

    override fun getLayoutId(): Int {
        return R.layout.activity_setting
    }

    override fun initData() {
        initSettingToolBar()
        // 获取空间是否被选中
        val sp = PreferenceManager.getDefaultSharedPreferences(this)
        val push = sp.getBoolean(PUSH, false)
        val no_wifi = sp.getBoolean(NO_WIFI, false)
    }

}