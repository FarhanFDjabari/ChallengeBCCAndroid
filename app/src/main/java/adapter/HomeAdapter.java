package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myemptyactivity.Database;
import com.example.myemptyactivity.R;
import com.example.myemptyactivity.ui.home.HomeFragment;

public class HomeAdapter extends RecyclerView.Adapter{



    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_item, parent,false);
        return new HomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((HomeViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return Database.product.length;
    }

    private class HomeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private ImageView productImg;
        private TextView productName;

        public HomeViewHolder(View itemView){
            super(itemView);

            productImg = (ImageView) itemView.findViewById(R.id.product_img);
            productName = (TextView) itemView.findViewById(R.id.product_name);
            itemView.setOnClickListener(this);

        }

        public void bindView (int position) {
            productImg.setImageResource(Database.imgPath[position]);
            productName.setText(Database.product[position]);
        }

        public void onClick (View view) {

        }
    }
}
