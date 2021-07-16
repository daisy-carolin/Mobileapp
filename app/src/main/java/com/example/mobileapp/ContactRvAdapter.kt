package com.example.mobileapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ContactRvAdapter(var contactList: List<Contact>, var context: Context):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
        return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=contactList.get(position)
        holder.tvName.text=currentContact.name
        holder.tvPhoneNumber.text=currentContact.phoneNumber
        holder.tvEmail.text=currentContact.email
        Picasso.get().load(currentContact.image).placeholder(R.drawable.picasso2
        ).into(holder.ivprofile)
        holder.cvContact.setOnClickListener{
            var intent=Intent(context,ContactView::class.java)
            intent.putExtra("Name",currentContact.name)
            intent.putExtra("Email",currentContact.email)
            intent.putExtra("PhoneNumber",currentContact.phoneNumber)
            intent.putExtra("Profile",currentContact.image)
            context.startActivity(intent)
        }

//        holder.ivprofile.text=currentContact.image


    }

    override fun getItemCount(): Int {
        return contactList.size


    }
}
class ContactViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvPhoneNumber=itemView.findViewById<TextView>(R.id.tvPhoneNumber)
    var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)
    var ivprofile=itemView.findViewById<ImageView>(R.id.ivprofile)
    var cvContact=itemView.findViewById<CardView>(R.id.rvContact)

}


