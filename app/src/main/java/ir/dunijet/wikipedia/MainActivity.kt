package ir.dunijet.wikipedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import ir.dunijet.wikipedia.databinding.ActivityMainBinding
import ir.dunijet.wikipedia.fragments.FragmentExplor
import ir.dunijet.wikipedia.fragments.FragmentProfile
import ir.dunijet.wikipedia.fragments.FragmentTrend

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbarMain)

        val actiontog = ActionBarDrawerToggle(
            this,
            binding.drawerMain,
            binding.toolbarMain,
            R.string.open,
            R.string.clouse
        )
        binding.drawerMain.addDrawerListener(actiontog)
        actiontog.syncState()

        binding.myNavigationview.setNavigationItemSelectedListener {

            when(it.itemId){

                R.id.menu_writer -> {
                    Toast.makeText(this, "click on the writer", Toast.LENGTH_SHORT).show()

                    binding.drawerMain.closeDrawer(GravityCompat.START)

                }

                R.id.menu_wikipedia -> {

                }

                R.id.menu_videomaker -> {

                }

                R.id.menu_photograph -> {

                }

                R.id.menu_translate -> {

                }


            }

            true
        }

        firstload()

        binding.bottomNavigationmain.setOnItemSelectedListener {

            when (it.itemId) {

                R.id.menu_explore -> {
                    replacefragment(FragmentExplor())
                }

                R.id.menu_profile -> {
                    replacefragment(FragmentProfile())
                }

                R.id.menu_trend -> {
                    replacefragment(FragmentTrend())
                }


            }
            true

        }
        binding.bottomNavigationmain.setOnItemReselectedListener {}


    }
    fun replacefragment(fragment : Fragment){

        val trans = supportFragmentManager.beginTransaction()
        trans.replace(R.id.fream_main, fragment)
        trans.commit()

    }

    fun firstload() {

        replacefragment(FragmentExplor())
        binding.bottomNavigationmain.selectedItemId = R.id.menu_explore

    }

}