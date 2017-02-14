package io.daio.taptargetviewbug

import android.graphics.Rect
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.getkeepsafe.taptargetview.TapTarget
import com.getkeepsafe.taptargetview.TapTargetView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        webView.loadUrl("http://www.google.co.uk")

        val bounds = Rect(50, 20, 100, 100)
        val tapTarget = TapTarget.forBounds(bounds, "Hello im here", "Enjoy this new feature")
                .cancelable(true)
                .dimColor(android.R.color.black)
                .outerCircleColor(android.R.color.black)
                .targetCircleColor(android.R.color.black)
                .transparentTarget(true)
                .descriptionTextColor(android.R.color.white)
                .textColor(android.R.color.white)
                .id(1)

        TapTargetView.showFor(this, tapTarget)
                // Set layer type to software to fix - .setLayerType(View.LAYER_TYPE_SOFTWARE, null)


    }
}
