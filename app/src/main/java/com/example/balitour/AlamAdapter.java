package com.example.balitour;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class AlamAdapter extends RecyclerView.Adapter<AlamAdapter.HolderData> {

    String data1[],data2[],data3[],data4[];
    int images[];
    Context context;

    public AlamAdapter(Context ct, String s1[], String s2[], String s3[], String s4[], int img[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        data3 = s3;
        data4 = s4;
        images = img;
    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_row, parent, false);
        return new HolderData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderData holder, int position) {
        holder.alam_text.setText(data1[position]);
        holder.image_img.setImageResource(images[position]);

        holder.AlamLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailAlam.class);
                intent.putExtra("data1", data1[position]);
                intent.putExtra("data2",data2[position]);
                intent.putExtra("data3",data3[position]);
                intent.putExtra("data4",data4[position]);
                intent.putExtra("images", images[position]);

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class HolderData extends RecyclerView.ViewHolder {

        TextView alam_text;
        ImageView image_img;
        ConstraintLayout AlamLayout;

        public HolderData(@NonNull View itemView) {
            super(itemView);
            alam_text = itemView.findViewById(R.id.text_tittle);
            image_img = itemView.findViewById(R.id.MyImageView);
            AlamLayout =  itemView.findViewById(R.id.AdapterLayout);
        }
    }
}
