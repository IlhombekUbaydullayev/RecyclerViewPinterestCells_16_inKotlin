package com.example.recyclerviewpinterestcells_16_injava

import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import com.example.recyclerviewpinterestcells_16_injava.R
import com.example.recyclerviewpinterestcells_16_injava.adapter.CustomAdapter.CustomViewHolder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewpinterestcells_16_injava.adapter.CustomAdapter
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.example.recyclerviewpinterestcells_16_injava.helper.SpacesItemDecoration
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        Assert.assertEquals(
            "com.example.recyclerviewpinterestcells_16_injava",
            appContext.packageName
        )
    }
}