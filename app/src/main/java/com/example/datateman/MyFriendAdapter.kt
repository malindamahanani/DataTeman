package com.example.datateman

import android.content.Context
import kotlinx.android.extensions.LayoutContainer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.my_friend_item.*

class MyFriendAdapter(private val context: Context, private val item:ArrayList<MyFriend>):
    RecyclerView.Adapter<MyFriendAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)=ViewHolder(
        LayoutInflater.from(context).inflate(R.layout.my_friend_item, parent, false)
        )

    override fun getItemCount(): Int {
        return item.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        holder.bindItem(item.get(position))
    }

    class ViewHolder(override val containerView: View):
            RecyclerView.ViewHolder(containerView), LayoutContainer{
            fun bindItem(item: MyFriend){
                txtFriendsName.text=item.nama
                txtFriendsJkel.text=item.jkel
                txtFriendsMail.text=item.email
                txtFriendsTelp.text=item.telp
                txtFriendsAlamat.text=item.alamat
            }
        }
    }