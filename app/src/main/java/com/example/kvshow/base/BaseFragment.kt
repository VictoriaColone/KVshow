package com.example.kvshow.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.support.v4.runOnUiThread
import org.jetbrains.anko.support.v4.toast

/**
 *
 * @ClassName: BaseFragment
 * @Description: 所有Fragment的基类
 * @Author: yutao
 */
abstract class BaseFragment : Fragment() , AnkoLogger{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    /**
     * fragment初始化
     */
    protected fun init() {}

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return initView()
    }

    /**
     * 获取布局view
     */
    abstract fun initView(): View?

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initListener()
        initData()
    }

    /**
     * adapter listener
     */
    protected fun initListener() {}

    /**
     * 数据初始化
     */
    abstract fun initData()

    fun kToast(msg : String) {
        runOnUiThread { toast(msg) }
    }
}