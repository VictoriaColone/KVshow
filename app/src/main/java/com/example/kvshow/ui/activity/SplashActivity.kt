package com.example.kvshow.ui.activity

import android.view.View
import androidx.core.view.ViewCompat
import androidx.core.view.ViewPropertyAnimatorListener
import com.example.kvshow.R
import com.example.kvshow.base.BaseActivity

/**
 *
 * @ClassName: SplashActivity
 * @Description: 闪屏
 * @Author: yutao
 */
class SplashActivity: BaseActivity(), ViewPropertyAnimatorListener {
    override fun getLayoutId(): Int {
        return R.layout.activity_splash
    }

    override fun initData() {
        ViewCompat.animate(findViewById(R.id.splash_picture))
                .scaleX(1.0f).scaleY(1.0f).setListener(this).setDuration(2000)
    }

    override fun onAnimationCancel(view: View?) {
    }

    override fun onAnimationStart(view: View?) {
    }
    override fun onAnimationEnd(view: View?) {
        startActivityWithFinish<MainActivity>()
    }
}