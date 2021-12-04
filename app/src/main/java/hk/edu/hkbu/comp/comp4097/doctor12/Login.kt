package hk.edu.hkbu.comp.comp4097.doctor12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.viewpager2.widget.ViewPager2
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import hk.edu.hkbu.comp.comp4097.doctor12.adaptor.NewsRecyclerViewAdapter
import hk.edu.hkbu.comp.comp4097.doctor12.data.News
import hk.edu.hkbu.comp.comp4097.doctor12.data.SampleData.NEWS
import hk.edu.hkbu.comp.comp4097.doctor12.databinding.ActivityLoginBinding
import hk.edu.hkbu.comp.comp4097.doctor12.helper.HorizontalMarginItemDecoration
import java.util.*

class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        setupViewpager(1,NEWS)

        binding.enterapp.textView.setOnClickListener {
            nav1()
        }

        binding.enterapp.textView2.setOnClickListener {
            nav2()
        }
    }

    private fun setupViewpager(currentItem:Int, Newslist:List<News> ){
        binding.viewPager.adapter=NewsRecyclerViewAdapter(Newslist)

        binding.viewPager.currentItem=currentItem
        // You need to retain one page on each side so that the next and previous items are visible
        binding.viewPager.offscreenPageLimit = 1

        // Add a PageTransformer that translates the next and previous items horizontally
        // towards the center of the screen, which makes them visible
        val nextItemVisiblePx = resources.getDimension(R.dimen.viewpager_next_item_visible).toInt()
        val currentItemHorizontalMarginPx =
            resources.getDimension(R.dimen.viewpager_current_item_horizontal_margin).toInt()
        val pageTranslationX = nextItemVisiblePx + currentItemHorizontalMarginPx
        val pageTransformer = ViewPager2.PageTransformer { page: View, position: Float ->
            page.translationX = -pageTranslationX * position
            // Next line scales the item's height. You can remove it if you don't want this effect
            page.scaleY = 1 - 0.15f * Math.abs(position)
        }

        binding.viewPager.setPageTransformer(pageTransformer)
        binding.viewPager.addItemDecoration(
            HorizontalMarginItemDecoration(
                this, R.dimen.viewpager_current_item_horizontal_margin_testing,
                R.dimen.viewpager_next_item_visible_testing
            )
        )
    }

    private fun nav1(){
        startActivity(Intent(this,SignIn::class.java))
    }

    private fun nav2(){
        startActivity(Intent(this,SignUp::class.java))
    }
}