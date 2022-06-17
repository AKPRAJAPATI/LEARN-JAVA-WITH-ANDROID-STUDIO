package com.example.javadevelopementapp.Adapters;


import static com.example.javadevelopementapp.Models.Model.LAYOUT_ONE_SHOW_TEXT;
import static com.example.javadevelopementapp.Models.Model.LAYOUT_TWO_SHOW_PREVIEW;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.javadevelopementapp.ButtonDirectory.ButtonRecyclerview;
import com.example.javadevelopementapp.CheckBoxes.CheckBoxRecyclerview;
import com.example.javadevelopementapp.ContentMenu.contentMenuRecyclerview;
import com.example.javadevelopementapp.DetailActivity.TextViewActivity;
import com.example.javadevelopementapp.EditTextDirectory.Edit_recyclerview;
import com.example.javadevelopementapp.ExplictIntent.ExplictRecyclerview;
import com.example.javadevelopementapp.ImageButton.ImageButtonRecyclerview;
import com.example.javadevelopementapp.ImageSwitcher.ImageSwitcherRecyclerview;
import com.example.javadevelopementapp.ImplictIntent.EmplictRecyclerview;
import com.example.javadevelopementapp.Models.Model;
import com.example.javadevelopementapp.R;
import com.example.javadevelopementapp.RadioButton.RadioButtonRecyclerview;
import com.example.javadevelopementapp.RatingBar.RatingBarRecyclerview;
import com.example.javadevelopementapp.Scrollview.ScrollViewRecyclerview;
import com.example.javadevelopementapp.SeekBar.SeekbarRecyclerview;
import com.example.javadevelopementapp.Spinner.SpinnerRecyclerview;
import com.example.javadevelopementapp.Switchs.SwitchRecyclerview;
import com.example.javadevelopementapp.T_take_photo.take_photoRecyclerview;
import com.example.javadevelopementapp.T_take_video.take_video_Recyclerview;
import com.example.javadevelopementapp.TextSiwtcher.textSwitcherRecyclerview;
import com.example.javadevelopementapp.Toasts.colorToastRecyclerview;
import com.example.javadevelopementapp.Toasts.simple_toast_recyclerview;
import com.example.javadevelopementapp.TongleButton.TongleRecyclerview;
import com.example.javadevelopementapp.chooseImageActivity.chooseImageRecyclerview;
import com.example.javadevelopementapp.copyActivity.copyRecyclerview;
import com.example.javadevelopementapp.emailActivity.EmailRecyclerview;
import com.example.javadevelopementapp.shareActivity.shareRecyclerview;
import com.example.javadevelopementapp.sqliteDatabase.sqliteDatabaseRecyclerview;
import com.example.javadevelopementapp.valuePassActivity.valuepassActivityRecyclerview;
import com.example.javadevelopementapp.whatsappActivity.whatsappRecyclerview;

import java.util.ArrayList;

public class Main_Adapters extends RecyclerView.Adapter {

    Context context;
    ArrayList<Model> arrayList;

    public Main_Adapters(Context context, ArrayList<Model> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType) {
            case LAYOUT_ONE_SHOW_TEXT:
                View view = LayoutInflater.from(context).inflate(R.layout.show_code, parent, false);
                return new MY_FIRST_TITLE_TEXT(view);
            case LAYOUT_TWO_SHOW_PREVIEW:
                View view1 = LayoutInflater.from(context).inflate(R.layout.show_preview, parent, false);
                return new MY_SECOND_PRIVIEW(view1);
            default:
                return null;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch (arrayList.get(position).getMY_VIEW_TYPE()) {
            case LAYOUT_ONE_SHOW_TEXT:
                String textTitles = arrayList.get(position).getShow_title_text();
                ((MY_FIRST_TITLE_TEXT) holder).titleHere.setText(textTitles);
                break;

            case LAYOUT_TWO_SHOW_PREVIEW:
                String topText = arrayList.get(position).getShow_title_text();
                int javaImage = arrayList.get(position).getJavaImage();
                String bottomText = arrayList.get(position).getShow_code_priview();
                ((MY_SECOND_PRIVIEW) holder).java_detail.setText(bottomText);
                ((MY_SECOND_PRIVIEW) holder).java_title.setText(topText);
                ((MY_SECOND_PRIVIEW) holder).java_image.setImageResource(javaImage);

                ((MY_SECOND_PRIVIEW) holder).itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        switch (holder.getAdapterPosition()) {
                            case 1:
                                Intent intent = new Intent(context, TextViewActivity.class);
                                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent);
                                break;
                            case 2:
                                Intent intent2 = new Intent(context, Edit_recyclerview.class);
                                intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent2);
                                break;
                            case 3:
                                Intent intent4 = new Intent(context, ButtonRecyclerview.class);
                                intent4.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent4);
                                break;
                            case 4:
                                Intent intent_toggle = new Intent(context, TongleRecyclerview.class);
                                intent_toggle.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent_toggle);
                                break;
                            case 5:
                                Intent intent_imagebtn = new Intent(context, SwitchRecyclerview.class);
                                intent_imagebtn.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent_imagebtn);
                                break;

                            case 6:
                                Intent intent5 = new Intent(context, ImageButtonRecyclerview.class);
                                intent5.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent5);
                                break;

                            case 7:
                                Intent intent6 = new Intent(context, CheckBoxRecyclerview.class);
                                intent6.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent6);
                                break;

                            case 8:
                                Intent intent7 = new Intent(context, SpinnerRecyclerview.class);
                                intent7.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent7);
                                break;

                            case 9:
                                Intent intent8 = new Intent(context, RadioButtonRecyclerview.class);
                                intent8.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent8);
                                break;

                            case 10:
                                Intent intent9 = new Intent(context, SeekbarRecyclerview.class);
                                intent9.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent9);
                                break;

                            case 11:
                                Intent intent10 = new Intent(context, RatingBarRecyclerview.class);
                                intent10.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent10);
                                break;

                            case 12:
                                Intent intent11 = new Intent(context, textSwitcherRecyclerview.class);
                                intent11.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent11);
                                break;

                            case 13:
                                Intent intent13 = new Intent(context, ScrollViewRecyclerview.class);
                                intent13.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent13);
                                break;

                            case 14:
                                Intent intent14 = new Intent(context, ImageSwitcherRecyclerview.class);
                                intent14.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent14);
                                break;

                            case 16:
                                Intent intent16 = new Intent(context, simple_toast_recyclerview.class);
                                intent16.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent16);
                                break;

                            case 17:
                                Intent intent17 = new Intent(context, colorToastRecyclerview.class);
                                intent17.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent17);
                                break;

                            case 18:
                                Toast.makeText(context, "View not Opened Try Again new Mobile", Toast.LENGTH_SHORT).show();
                                break;
                            case 20:
                                Intent intent20 = new Intent(context, ExplictRecyclerview.class);
                                intent20.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent20);
                                break;
                            case 21:
                                Intent intent21 = new Intent(context, EmplictRecyclerview.class);
                                intent21.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent21);
                                break;
                            case 22:
                                Intent intent22 = new Intent(context, valuepassActivityRecyclerview.class);
                                intent22.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent22);
                                break;
                            case 23:
//                                Intent intent23 = new Intent(context, ExplictRecyclerview.class);
//                                intent23.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                                context.startActivity(intent23);
                                Toast.makeText(context, "MY application not is play store", Toast.LENGTH_SHORT).show();
                                break;
                            case 24:
                                Intent intent24 = new Intent(context, shareRecyclerview.class);
                                intent24.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent24);
                                break;
                            case 25:
                                Intent intent25 = new Intent(context, EmailRecyclerview.class);
                                intent25.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent25);
                                break;
                            case 26:
                                Intent intent26 = new Intent(context, whatsappRecyclerview.class);
                                intent26.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent26);
                                break;
                            case 27:
                                Intent intent27 = new Intent(context, copyRecyclerview.class);
                                intent27.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent27);
                                break;
                            case 28:
                                Intent intent28 = new Intent(context, shareRecyclerview.class);
                                intent28.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent28);
                                break;
                            case 29:
                                Intent intent29 = new Intent(context, chooseImageRecyclerview.class);
                                intent29.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent29);
                                break;


                            case 31:
//                                Intent intent31 = new Intent(context, popUpMenuRecyclerview.class);
//                                intent31.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                                context.startActivity(intent31);
                                Toast.makeText(context, "This is only Android 12", Toast.LENGTH_SHORT).show();
                                break;
                            case 32:
//                                Intent intent32 = new Intent(context, OptionMenuRecyclerview.class);
//                                intent32.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                                context.startActivity(intent32);
                                Toast.makeText(context, "This is only Android 12", Toast.LENGTH_SHORT).show();
                                break;
                            case 33:
                                Intent intent33 = new Intent(context, contentMenuRecyclerview.class);
                                intent33.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent33);
                                break;

                            case 35:
                                Intent intent35 = new Intent(context, take_photoRecyclerview.class);
                                intent35.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent35);
                                break;

                            case 36:
                                Intent intent36 = new Intent(context, take_video_Recyclerview.class);
                                intent36.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent36);
                                break;

                            case 37:
//                                Intent intent37 = new Intent(context, take_text_to_speechRecyclerview.class);
//                                intent37.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                                context.startActivity(intent37);
                                Toast.makeText(context, "This is only Android 12", Toast.LENGTH_SHORT).show();
                                break;

                            case 38:
//                                Intent intent38 = new Intent(context, textToSpeechRecyclerview.class);
//                                intent38.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                                context.startActivity(intent38);
                                Toast.makeText(context, "This is only Android 12", Toast.LENGTH_SHORT).show();
                                break;

                            case 40:
                                Intent intent39 = new Intent(context, sqliteDatabaseRecyclerview.class);
                                intent39.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent39);
                                break;

                            case 42:
//                                Intent intent39 = new Intent(context, sqliteDatabaseRecyclerview.class);
//                                intent39.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                                context.startActivity(intent39);
                                Toast.makeText(context, "Comming Soon Torch Application", Toast.LENGTH_SHORT).show();

                                break;

                            case 43:

                                Toast.makeText(context, "Comming Soon Student Management", Toast.LENGTH_SHORT).show();


                                //                                Intent intent39 = new Intent(context, sqliteDatabaseRecyclerview.class);
//                                intent39.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                                context.startActivity(intent39);
                                break;

                            case 44:
//                                Intent intent39 = new Intent(context, sqliteDatabaseRecyclerview.class);
//                                intent39.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                                context.startActivity(intent39);
                                Toast.makeText(context, "Comming Soon Calculator", Toast.LENGTH_SHORT).show();
                                break;

                            case 45:
//                                Intent intent39 = new Intent(context, sqliteDatabaseRecyclerview.class);
//                                intent39.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                                context.startActivity(intent39);
                                Toast.makeText(context, "Coming Soon Simple App with Firebase", Toast.LENGTH_SHORT).show();
                                break;


                        }
                    }
                });
                break;
        }
    }

    @Override
    public int getItemViewType(int position) {
        switch (arrayList.get(position).getMY_VIEW_TYPE()) {
            case 1:
                return LAYOUT_ONE_SHOW_TEXT;

            case 2:
                return LAYOUT_TWO_SHOW_PREVIEW;
            default:
                return -1;
        }
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MY_FIRST_TITLE_TEXT extends RecyclerView.ViewHolder {
        TextView titleHere;

        public MY_FIRST_TITLE_TEXT(@NonNull View itemView) {
            super(itemView);
            titleHere = itemView.findViewById(R.id.textview);
        }


    }

    public class MY_SECOND_PRIVIEW extends RecyclerView.ViewHolder {
        ImageView java_image;
        TextView java_title;
        TextView java_detail;

        public MY_SECOND_PRIVIEW(@NonNull View itemView) {
            super(itemView);

            java_image = itemView.findViewById(R.id.item_image);
            java_title = itemView.findViewById(R.id.textTitle);
            java_detail = itemView.findViewById(R.id.textName);

        }


    }

    public class DetailViewHolder extends RecyclerView.ViewHolder {

        public DetailViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
