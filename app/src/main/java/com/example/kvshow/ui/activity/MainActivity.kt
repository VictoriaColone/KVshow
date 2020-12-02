package com.example.kvshow.ui.activity

import androidx.appcompat.widget.Toolbar
import com.example.kvshow.R
import com.example.kvshow.base.BaseActivity
import com.example.kvshow.utils.ToolBarManager
import com.roughike.bottombar.BottomBar
import org.jetbrains.anko.find

/**
 *
 * @Description: 主界面
 * @Author: yutao
 */
class MainActivity: BaseActivity(), ToolBarManager {
    // 懒加载toolbar
    override val toolbar by lazy { find<Toolbar>(R.id.toolbar) }


    override fun getLayoutId(): Int {
        return R.layout.activity_main

    }

    override fun initData() {
        initMainToolBar()
    }

    override fun initListenter() {
        find<BottomBar>(R.id.bottomBar).setOnTabSelectListener {
            it
        }
    }
}