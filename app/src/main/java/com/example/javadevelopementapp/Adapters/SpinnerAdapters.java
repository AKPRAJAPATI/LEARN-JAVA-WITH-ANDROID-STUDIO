package com.example.javadevelopementapp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.javadevelopementapp.Code.Code;
import com.example.javadevelopementapp.DetailActivity.Show_Code_List_Activity;
import com.example.javadevelopementapp.Models.Model_Detail;
import com.example.javadevelopementapp.R;

import java.util.ArrayList;

public class SpinnerAdapters extends RecyclerView.Adapter<SpinnerAdapters.DetailViewHolder> {
    Context context;
    ArrayList<Model_Detail> arrayList;

    public SpinnerAdapters(Context context, ArrayList<Model_Detail> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public DetailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DetailViewHolder(LayoutInflater.from(context).inflate(R.layout.show_code, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DetailViewHolder holder, int position) {
        Model_Detail model_detail = arrayList.get(position);
        holder.title.setText(model_detail.getMycodeTitle());
        int myItemPosition = holder.getAdapterPosition();
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (myItemPosition) {

                    case 0:
                        Intent intent1 = new Intent(context, Show_Code_List_Activity.class);
                        intent1.putExtra("manifest",Code.menifest);
                        intent1.putExtra("manifesting","manifesting");
                        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent1);
                        break;
                    case 1:
                        Intent intent = new Intent(context, Show_Code_List_Activity.class);
                        intent.putExtra("codingMain", Code.spinner_java);
                        intent.putExtra("java_work","java_work");
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent);
                        break;
                    case 2:
                        Intent intent3 = new Intent(context, Show_Code_List_Activity.class);
                        intent3.putExtra("codingXml",Code.spinner_xml);
                        intent3.putExtra("xml_work","xml_work");
                        intent3.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent3);
                        break;
                            case 3:
                        Intent intent4 = new Intent(context, Show_Code_List_Activity.class);
                        intent4.putExtra("build",Code.buiild_Gradle);
                        intent4.putExtra("build_gradle","build_gradle");
                        intent4.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent4);
                        break;

                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class DetailViewHolder extends RecyclerView.ViewHolder {
        TextView title;

        public DetailViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.textview);
        }
    }
}
