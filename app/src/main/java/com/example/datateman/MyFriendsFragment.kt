package com.example.datateman

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friend.*

class MyFriendsFragment : Fragment() {

    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiData(){
        listTeman = ArrayList()
        listTeman.add(MyFriend("Malinda Mahanani","Perempuan",
        "Malinda@stimata.ac.id","0882xxxxxx","Lamongan"))

        listTeman.add(MyFriend("Nova eka","Pria",
            "Nova@stimata.ac.id","0882xxxxxx","Lamongan"))

        listTeman.add(MyFriend("Mahanani","Perempuan",
            "Hana@stimata.ac.id","0882xxxxxx","Malang"))

        listTeman.add(MyFriend("Permadi","Pria",
            "Permadi@stimata.ac.id","0882xxxxxx","Malang"))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    @SuppressLint("UseRequireInsteadOfGet")
    private fun  TampilTeman(){
        rv_listMyFtriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyFtriends.adapter=MyFriendAdapter(activity!!, listTeman)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friend, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        simulasiData()
        TampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }

}