package isomora.com.greendoctor
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val userList : ArrayList<Sheets>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.user_item,
            parent,false)
        return MyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentitem = userList[position]

        holder.crop_Name.text = currentitem.Name
        holder.cure.text = currentitem.Cure
        holder.description.text = currentitem.Description
        holder.prevention.text = currentitem.Prevention


    }

    override fun getItemCount(): Int {

        return userList.size
    }


    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val crop_Name : TextView = itemView.findViewById(R.id.Name)
        val cure : TextView = itemView.findViewById(R.id.cure)
        val description : TextView = itemView.findViewById(R.id.Description)
        val prevention : TextView = itemView.findViewById(R.id.prevention)

    }

}