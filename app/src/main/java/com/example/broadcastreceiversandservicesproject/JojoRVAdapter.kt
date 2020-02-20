package com.example.broadcastreceiversandservicesproject
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.jojo_item.view.*



class JojoRVAdapter(val jojoList: ArrayList<Jojo>):RecyclerView.Adapter<JojoRVAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JojoRVAdapter.ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: JojoRVAdapter.ViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    inner class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){

        fun populateItem (jojo:Jojo) {

            itemView.rvName.text = jojo.name
            itemView.rvStand.text = jojo.stand
            itemView.rvCatchphrase.text = jojo.catchphrase
            itemView.rvPart.text = jojo.part

            itemView.setOnClickListener(View.OnClickListener {
                val intent = Intent(it.context,MainActivity::class.java)
                intent.putExtra(KEY_JOJO,jojo)
                it.context.startActivity(intent)

            })

        }
    }
}