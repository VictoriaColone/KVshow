package com.example.kvshow.base;

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity;
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

/**
 *
 * @ClassName: BaseActivity
 * @Description: 所有Activity的基类
 * @Author: yutao
 */
abstract class BaseActivity : AppCompatActivity(), AnkoLogger {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initListenter()
        initData()
    }

    /**
     * 获取布局id
     */
    abstract fun getLayoutId(): Int

    /**
     * 初始化监听器
     */
    open protected fun initListenter() {}

    /**
     * 初始化数据
     */
    open protected fun initData() {}

    /**
     * 吐司处理，避免多线程问题
     */
    protected fun kToast(msg : String) {
        runOnUiThread { toast(msg) }
    }

    /**
     * 开启activity并且关闭当前
     */
    inline fun <reified T : BaseActivity> startActivityWithFinish() {
        startActivity<T>()
        finish()
    }
}
