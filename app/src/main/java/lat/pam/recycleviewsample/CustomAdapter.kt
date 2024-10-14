package lat.pam.recycleviewsample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CustomAdapter(private val mList:List<ItemsViewModel>): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    class ViewHolder (ItemView: View):RecyclerView.ViewHolder(ItemView) {
        val textView: TextView = itemView.findViewById(R.id.textView)
        val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design, parent, false)


        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mList.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = mList[position]
        holder.textView.text = ItemsViewModel.text
        holder.titleTextView.text = ItemsViewModel.judul
    }

}
