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

public class SettingsAdapter extends RecyclerView.Adapter{

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.setting_item, parent,false);
        return new SettingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((SettingViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return Database.setting.length;
    }

    private class SettingViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private ImageView settingImg;
        private TextView settingName;

        public SettingViewHolder(View itemView){
            super(itemView);

            settingImg = (ImageView) itemView.findViewById(R.id.setting_img);
            settingName = (TextView) itemView.findViewById(R.id.setting_name);
            itemView.setOnClickListener(this);

        }

        public void bindView (int position) {
            settingImg.setImageResource(Database.setImgPath[position]);
            settingName.setText(Database.setting[position]);
        }

        public void onClick (View view) {

        }
    }
}
