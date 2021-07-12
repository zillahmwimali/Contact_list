package com.example.myphonebook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter (var contactList:List<Contacts>):RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var itemView=
            LayoutInflater.from(parent.context).inflate(R.layout.contact_list_view,parent,false)
        return ContactsViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
            var currentContact=contactList.get(position)
            holder.tvName.text=currentContact.name
            holder.tvNumber.text=currentContact.phoneNumber
            holder.tvEmail.text=currentContact.email
        }

    override fun getItemCount(): Int {
        return contactList.size
    }
}
class ContactsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvNumber=itemView.findViewById<TextView>(R.id.tvNumber)
    var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)
//    var img1=itemView.findViewById<TextView>(R.id.img1)
//    var img2=itemView.findViewById<TextView>(R.id.img2)
//    var img3=itemView.findViewById<TextView>(R.id.img3)
//    var img4=itemView.findViewById<TextView>(R.id.img4)
//    var img5=itemView.findViewById<TextView>(R.id.img5)
//    var img6=itemView.findViewById<TextView>(R.id.img6)




}
