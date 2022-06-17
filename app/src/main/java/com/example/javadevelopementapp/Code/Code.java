package com.example.javadevelopementapp.Code;

public class Code {
 public static final String firstprogram =
         "package com.example.javadevelopementapp.Main_Adapters;\n" +
                 "\n" +
                 "\n" +
                 "import static com.example.javadevelopementapp.Models.Model.LAYOUT_ONE_SHOW_TEXT;\n" +
                 "import static com.example.javadevelopementapp.Models.Model.LAYOUT_TWO_SHOW_PREVIEW;\n" +
                 "\n" +
                 "import android.content.Context;\n" +
                 "import android.content.Intent;\n" +
                 "import android.view.LayoutInflater;\n" +
                 "import android.view.View;\n" +
                 "import android.view.ViewGroup;\n" +
                 "import android.widget.ImageView;\n" +
                 "import android.widget.TextView;\n" +
                 "import android.widget.Toast;\n" +
                 "\n" +
                 "import androidx.annotation.NonNull;\n" +
                 "import androidx.recyclerview.widget.RecyclerView;\n" +
                 "\n" +
                 "import com.example.javadevelopementapp.Show_Code_List_Activity.TextViewActivity;\n" +
                 "import com.example.javadevelopementapp.Models.Model;\n" +
                 "import com.example.javadevelopementapp.R;\n" +
                 "\n" +
                 "import java.util.ArrayList;\n" +
                 "\n" +
                 "public class Main_Adapters extends RecyclerView.Adapter {\n" +
                 "\n" +
                 "    Context context;\n" +
                 "    ArrayList<Model> arrayList;\n" +
                 "\n" +
                 "    public Main_Adapters(Context context, ArrayList<Model> arrayList) {\n" +
                 "        this.context = context;\n" +
                 "        this.arrayList = arrayList;\n" +
                 "    }\n" +
                 "\n" +
                 "    @NonNull\n" +
                 "    @Override\n" +
                 "    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {\n" +
                 "        switch (viewType) {\n" +
                 "            case LAYOUT_ONE_SHOW_TEXT:\n" +
                 "                View view = LayoutInflater.from(context).inflate(R.layout.show_code, parent, false);\n" +
                 "                return new MY_FIRST_TITLE_TEXT(view);\n" +
                 "            case LAYOUT_TWO_SHOW_PREVIEW:\n" +
                 "                View view1 = LayoutInflater.from(context).inflate(R.layout.show_preview, parent, false);\n" +
                 "                return new MY_SECOND_PRIVIEW(view1);\n" +
                 "            default:\n" +
                 "                return null;\n" +
                 "        }\n" +
                 "    }\n" +
                 "\n" +
                 "    @Override\n" +
                 "    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {\n" +
                 "        switch (arrayList.get(position).getMY_VIEW_TYPE()) {\n" +
                 "            case LAYOUT_ONE_SHOW_TEXT:\n" +
                 "                String textTitles = arrayList.get(position).getShow_title_text();\n" +
                 "                ((MY_FIRST_TITLE_TEXT) holder).titleHere.setText(textTitles);\n" +
                 "                break;\n" +
                 "\n" +
                 "            case LAYOUT_TWO_SHOW_PREVIEW:\n" +
                 "                String topText = arrayList.get(position).getShow_title_text();\n" +
                 "                int javaImage = arrayList.get(position).getJavaImage();\n" +
                 "                String bottomText = arrayList.get(position).getShow_code_priview();\n" +
                 "                ((MY_SECOND_PRIVIEW) holder).java_detail.setText(bottomText);\n" +
                 "                ((MY_SECOND_PRIVIEW) holder).java_title.setText(topText);\n" +
                 "                ((MY_SECOND_PRIVIEW) holder).java_image.setImageResource(javaImage);\n" +
                 "\n" +
                 "                ((MY_SECOND_PRIVIEW) holder).itemView.setOnClickListener(new View.OnClickListener() {\n" +
                 "                    @Override\n" +
                 "                    public void onClick(View view) {\n" +
                 "                        switch (holder.getAdapterPosition()){\n" +
                 "\n" +
                 "                            case 1:\n" +
                 "                                 Intent intent = new Intent(context, TextViewActivity.class);\n" +
                 "                                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);\n" +
                 "                                context.startActivity(intent);\n" +
                 "                                break;\n" +
                 "\n" +
                 "                                case 2:\n" +
                 "                                    Toast.makeText(context, \"Bikash\", Toast.LENGTH_SHORT).show();\n" +
                 "                                break;\n" +
                 "                            case 3:\n" +
                 "                                Toast.makeText(context, \"This is Sachin\", Toast.LENGTH_SHORT).show();\n" +
                 "                                break;\n" +
                 "\n" +
                 "\n" +
                 "                        }\n" +
                 "                    }\n" +
                 "                });\n" +
                 "                break;\n" +
                 "        }\n" +
                 "    }\n" +
                 "\n" +
                 "    @Override\n" +
                 "    public int getItemViewType(int position) {\n" +
                 "         switch (arrayList.get(position).getMY_VIEW_TYPE()){\n" +
                 "             case 1:\n" +
                 "                 return LAYOUT_ONE_SHOW_TEXT;\n" +
                 "\n" +
                 "             case 2:\n" +
                 "                 return LAYOUT_TWO_SHOW_PREVIEW;\n" +
                 "             default:\n" +
                 "                 return -1;\n" +
                 "         }\n" +
                 "    }\n" +
                 "\n" +
                 "    @Override\n" +
                 "    public int getItemCount() {\n" +
                 "        return arrayList.size();\n" +
                 "    }\n" +
                 "\n" +
                 "    public class MY_FIRST_TITLE_TEXT extends RecyclerView.ViewHolder {\n" +
                 "        TextView titleHere;\n" +
                 "\n" +
                 "        public MY_FIRST_TITLE_TEXT(@NonNull View itemView) {\n" +
                 "            super(itemView);\n" +
                 "            titleHere = itemView.findViewById(R.id.textview);\n" +
                 "        }\n" +
                 "\n" +
                 "\n" +
                 "    }\n" +
                 "\n" +
                 "    public class MY_SECOND_PRIVIEW extends RecyclerView.ViewHolder {\n" +
                 "        ImageView java_image;\n" +
                 "        TextView java_title;\n" +
                 "        TextView java_detail;\n" +
                 "\n" +
                 "        public MY_SECOND_PRIVIEW(@NonNull View itemView) {\n" +
                 "            super(itemView);\n" +
                 "\n" +
                 "            java_image = itemView.findViewById(R.id.item_image);\n" +
                 "            java_title = itemView.findViewById(R.id.textTitle);\n" +
                 "            java_detail = itemView.findViewById(R.id.textName);\n" +
                 "\n" +
                 "        }\n" +
                 "\n" +
                 "\n" +
                 "    }\n" +
                 "\n" +
                 "    public class DetailViewHolder extends RecyclerView.ViewHolder{\n" +
                 "\n" +
                 "        public DetailViewHolder(@NonNull View itemView) {\n" +
                 "            super(itemView);\n" +
                 "\n" +
                 "        }\n" +
                 "    }\n" +
                 "}\n";

 public final static String FirstprogramMainXml =
         "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                 "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                 "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                 "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                 "    android:layout_width=\"match_parent\"\n" +
                 "    android:layout_height=\"match_parent\"\n" +
                 "    tools:context=\".MainActivity\">\n" +
                 "\n" +
                 "    <Toolbar\n" +
                 "        android:id=\"@+id/toolbar\"\n" +
                 "        android:layout_width=\"match_parent\"\n" +
                 "        android:layout_height=\"56dp\"\n" +
                 "        android:background=\"#3E616F\"\n" +
                 "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                 "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                 "        app:layout_constraintTop_toTopOf=\"parent\">\n" +
                 "        <LinearLayout\n" +
                 "            android:layout_width=\"match_parent\"\n" +
                 "            android:layout_height=\"match_parent\"\n" +
                 "            android:orientation=\"horizontal\">\n" +
                 "            <ImageView\n" +
                 "                android:layout_width=\"50dp\"\n" +
                 "                android:layout_height=\"50dp\"\n" +
                 "                android:padding=\"4dp\"\n" +
                 "                android:src=\"@drawable/java_b\"\n" +
                 "                app:tint=\"@color/white\" />\n" +
                 "\n" +
                 "            <TextView\n" +
                 "                android:layout_width=\"wrap_content\"\n" +
                 "                android:layout_height=\"match_parent\"\n" +
                 "                android:gravity=\"center\"\n" +
                 "                android:layout_marginLeft=\"10dp\"\n" +
                 "                android:textColor=\"@color/white\"\n" +
                 "                android:textStyle=\"bold\"\n" +
                 "                android:textSize=\"22sp\"\n" +
                 "                android:text=\"Android Tutorial\"/>\n" +
                 "        </LinearLayout>\n" +
                 "\n" +
                 "    </Toolbar>\n" +
                 "\n" +
                 "    <androidx.recyclerview.widget.RecyclerView\n" +
                 "        android:id=\"@+id/recycleview\"\n" +
                 "        android:layout_width=\"match_parent\"\n" +
                 "        android:layout_height=\"0dp\"\n" +
                 "        tools:listitem=\"@layout/show_preview\"\n" +
                 "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                 "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                 "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                 "        app:layout_constraintTop_toBottomOf=\"@+id/toolbar\" />\n" +
                 "\n" +
                 "</androidx.constraintlayout.widget.ConstraintLayout>";

 public final static String menifest =
         "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                 "<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                 "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                 "    package=\"com.example.javaoutputproject\">\n" +
                 "\n" +
                 "    <application\n" +
                 "        android:allowBackup=\"true\"\n" +
                 "        android:dataExtractionRules=\"@xml/data_extraction_rules\"\n" +
                 "        android:fullBackupContent=\"@xml/backup_rules\"\n" +
                 "        android:icon=\"@mipmap/ic_launcher\"\n" +
                 "        android:label=\"@string/app_name\"\n" +
                 "        android:roundIcon=\"@mipmap/ic_launcher_round\"\n" +
                 "        android:supportsRtl=\"true\"\n" +
                 "        android:theme=\"@style/Theme.JavaOutputProject\"\n" +
                 "        tools:targetApi=\"31\">\n" +
                 "        <activity\n" +
                 "            android:name=\".MainActivity\"\n" +
                 "            android:exported=\"true\">\n" +
                 "            <intent-filter>\n" +
                 "                <action android:name=\"android.intent.action.MAIN\" />\n" +
                 "\n" +
                 "                <category android:name=\"android.intent.category.LAUNCHER\" />\n" +
                 "            </intent-filter>\n" +
                 "        </activity>\n" +
                 "    </application>\n" +
                 "\n" +
                 "</manifest>";
 public final static String buiild_Gradle =
         "plugins {\n" +
                 "    id 'com.android.application'\n" +
                 "}\n" +
                 "\n" +
                 "android {\n" +
                 "    compileSdk 32\n" +
                 "\n" +
                 "    defaultConfig {\n" +
                 "        applicationId \"com.example.javaoutputproject\"\n" +
                 "        minSdk 21\n" +
                 "        targetSdk 32\n" +
                 "        versionCode 1\n" +
                 "        versionName \"1.0\"\n" +
                 "\n" +
                 "        testInstrumentationRunner \"androidx.test.runner.AndroidJUnitRunner\"\n" +
                 "    }\n" +
                 "\n" +
                 "    buildTypes {\n" +
                 "        release {\n" +
                 "            minifyEnabled false\n" +
                 "            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'\n" +
                 "        }\n" +
                 "    }\n" +
                 "    compileOptions {\n" +
                 "        sourceCompatibility JavaVersion.VERSION_1_8\n" +
                 "        targetCompatibility JavaVersion.VERSION_1_8\n" +
                 "    }\n" +
                 "}\n" +
                 "\n" +
                 "dependencies {\n" +
                 "\n" +
                 "    implementation 'androidx.appcompat:appcompat:1.4.2'\n" +
                 "    implementation 'com.google.android.material:material:1.6.1'\n" +
                 "    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'\n" +
                 "    testImplementation 'junit:junit:4.13.2'\n" +
                 "    androidTestImplementation 'androidx.test.ext:junit:1.1.3'\n" +
                 "    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'\n" +
                 "}";
 public static final  String editTExtXml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
         "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
         "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
         "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
         "    android:layout_width=\"match_parent\"\n" +
         "    android:layout_height=\"match_parent\"\n" +
         "    tools:context=\".MainActivity\">\n" +
         "\n" +
         "\n" +
         "    <EditText\n" +
         "        android:id=\"@+id/editTextTextPersonName\"\n" +
         "        android:layout_width=\"wrap_content\"\n" +
         "        android:layout_height=\"wrap_content\"\n" +
         "        android:layout_marginTop=\"132dp\"\n" +
         "        android:ems=\"10\"\n" +
         "        android:inputType=\"textPersonName\"\n" +
         "        android:hint=\"Name\"\n" +
         "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
         "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
         "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
         "\n" +
         "    <EditText\n" +
         "        android:id=\"@+id/editTextTextPersonName2\"\n" +
         "        android:layout_width=\"wrap_content\"\n" +
         "        android:layout_height=\"wrap_content\"\n" +
         "        android:layout_marginTop=\"16dp\"\n" +
         "        android:ems=\"10\"\n" +
         "        android:inputType=\"textPersonName\"\n" +
         "        android:hint=\"Last Name\"\n" +
         "        app:layout_constraintEnd_toEndOf=\"@+id/editTextTextPersonName\"\n" +
         "        app:layout_constraintStart_toStartOf=\"@+id/editTextTextPersonName\"\n" +
         "        app:layout_constraintTop_toBottomOf=\"@+id/editTextTextPersonName\" />\n" +
         "\n" +
         "    <Button\n" +
         "        android:id=\"@+id/button\"\n" +
         "        android:layout_width=\"wrap_content\"\n" +
         "        android:layout_height=\"wrap_content\"\n" +
         "        android:layout_marginTop=\"8dp\"\n" +
         "        android:text=\"Button\"\n" +
         "        app:layout_constraintEnd_toEndOf=\"@+id/editTextTextPersonName2\"\n" +
         "        app:layout_constraintStart_toStartOf=\"@+id/editTextTextPersonName2\"\n" +
         "        app:layout_constraintTop_toBottomOf=\"@+id/editTextTextPersonName2\" />\n" +
         "</androidx.constraintlayout.widget.ConstraintLayout>";

 public static final String java_editText = "package com.example.javaoutputproject;\n" +
         "\n" +
         "import androidx.appcompat.app.AppCompatActivity;\n" +
         "\n" +
         "import android.os.Bundle;\n" +
         "import android.widget.Button;\n" +
         "import android.widget.EditText;\n" +
         "import android.widget.TextView;\n" +
         "\n" +
         "public class MainActivity extends AppCompatActivity {\n" +
         "    EditText name, lastname;\n" +
         "    Button savebtn;\n" +
         "    TextView textView;\n" +
         "\n" +
         "    @Override\n" +
         "    protected void onCreate(Bundle savedInstanceState) {\n" +
         "        super.onCreate(savedInstanceState);\n" +
         "        setContentView(R.layout.activity_main);\n" +
         "\n" +
         "        textView = findViewById(R.id.textView);\n" +
         "        name = findViewById(R.id.editTextTextPersonName);\n" +
         "        lastname = findViewById(R.id.editTextTextPersonName2);\n" +
         "        savebtn = findViewById(R.id.button);\n" +
         "\n" +
         "        TextView textView = (TextView) findViewById(R.id.textView);\n" +
         "        String firstname = name.getText().toString();\n" +
         "        String last_name = lastname.getText().toString();\n" +
         "        String fullname = firstname + \" \" + last_name;\n" +
         "        textView.setText(fullname);\n" +
         "        \n" +
         "    }\n" +
         "}";


 public static final String button_xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
         "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
         "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
         "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
         "    android:layout_width=\"match_parent\"\n" +
         "    android:layout_height=\"match_parent\"\n" +
         "    tools:context=\".ButtonDirectory.ButtonOutput\">\n" +
         "\n" +
         "    <Button\n" +
         "        android:id=\"@+id/buttonClicked\"\n" +
         "        android:layout_width=\"match_parent\"\n" +
         "        android:layout_height=\"wrap_content\"\n" +
         "        android:text=\"Hello Bro Clicked me\"\n" +
         "        android:layout_marginLeft=\"10dp\"\n" +
         "        android:layout_marginRight=\"10dp\"\n" +
         "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
         "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
         "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
         "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
         "    \n" +
         "\n" +
         "</androidx.constraintlayout.widget.ConstraintLayout>";

 public static final String button_java = "package com.example.javadevelopementapp.ButtonDirectory;\n" +
         "\n" +
         "import androidx.appcompat.app.AppCompatActivity;\n" +
         "\n" +
         "import android.os.Bundle;\n" +
         "import android.view.View;\n" +
         "import android.widget.Button;\n" +
         "import android.widget.Toast;\n" +
         "\n" +
         "import com.example.javadevelopementapp.R;\n" +
         "\n" +
         "public class ButtonOutput extends AppCompatActivity {\n" +
         "    Button button;\n" +
         "    \n" +
         "    @Override\n" +
         "    protected void onCreate(Bundle savedInstanceState) {\n" +
         "        super.onCreate(savedInstanceState);\n" +
         "        setContentView(R.layout.activity_button_output);\n" +
         "        button = findViewById(R.id.buttonClicked);\n" +
         "        button.setOnClickListener(new View.OnClickListener() {\n" +
         "            @Override\n" +
         "            public void onClick(View view) {\n" +
         "                Toast.makeText(ButtonOutput.this, \"Button Clicked\", Toast.LENGTH_SHORT).show();\n" +
         "            }\n" +
         "        });\n" +
         "    }\n" +
         "}";
 public static final  String toggleJava = "package com.example.javadevelopementapp.TongleButton;\n" +
         "\n" +
         "import androidx.appcompat.app.AppCompatActivity;\n" +
         "\n" +
         "import android.os.Bundle;\n" +
         "import android.view.View;\n" +
         "import android.widget.Toast;\n" +
         "import android.widget.ToggleButton;\n" +
         "\n" +
         "import com.example.javadevelopementapp.R;\n" +
         "\n" +
         "public class TongleOutput extends AppCompatActivity {\n" +
         "    ToggleButton toggleButton;\n" +
         "\n" +
         "    @Override\n" +
         "    protected void onCreate(Bundle savedInstanceState) {\n" +
         "        super.onCreate(savedInstanceState);\n" +
         "        setContentView(R.layout.activity_tongle_output);\n" +
         "\n" +
         "        toggleButton = findViewById(R.id.ToggleButton);\n" +
         "        toggleButton.setOnClickListener(new View.OnClickListener() {\n" +
         "            @Override\n" +
         "            public void onClick(View view) {\n" +
         "                if (toggleButton.isChecked()) {\n" +
         "                    Toast.makeText(TongleOutput.this, \"Toggle ON\", Toast.LENGTH_SHORT).show();\n" +
         "                } else {\n" +
         "                    Toast.makeText(TongleOutput.this, \"Toggle OFF\", Toast.LENGTH_SHORT).show();\n" +
         "                }\n" +
         "            }\n" +
         "        });\n" +
         "    }\n" +
         "}";
public static final String toggle_xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
        "    android:layout_width=\"match_parent\"\n" +
        "    android:layout_height=\"match_parent\"\n" +
        "    tools:context=\".TongleButton.TongleOutput\">\n" +
        "\n" +
        "    <ToggleButton\n" +
        "        android:id=\"@+id/ToggleButton\"\n" +
        "        android:layout_width=\"match_parent\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:layout_marginLeft=\"10dp\"\n" +
        "        android:layout_marginRight=\"10dp\"\n" +
        "        android:text=\"ToggleButton Clicked\"\n" +
        "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
        "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
        "\n" +
        "</androidx.constraintlayout.widget.ConstraintLayout>";


public static final String switchXml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
        "    android:layout_width=\"match_parent\"\n" +
        "    android:layout_height=\"match_parent\"\n" +
        "    tools:context=\".Switchs.SwitchOutput\">\n" +
        "\n" +
        "    <TextView\n" +
        "        android:id=\"@+id/textView\"\n" +
        "        android:layout_width=\"0dp\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:layout_marginTop=\"170dp\"\n" +
        "        android:gravity=\"center\"\n" +
        "        android:text=\"Switch\"\n" +
        "        android:textColor=\"@color/black\"\n" +
        "        android:textSize=\"22sp\"\n" +
        "        android:textStyle=\"bold\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
        "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
        "\n" +
        "    <Switch\n" +
        "        android:id=\"@+id/switches\"\n" +
        "        android:layout_width=\"wrap_content\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"@+id/textView\"\n" +
        "        app:layout_constraintHorizontal_bias=\"0.498\"\n" +
        "        app:layout_constraintStart_toStartOf=\"@+id/textView\"\n" +
        "        app:layout_constraintTop_toBottomOf=\"@+id/textView\"\n" +
        "        app:layout_constraintVertical_bias=\"0.091\" />\n" +
        "\n" +
        "</androidx.constraintlayout.widget.ConstraintLayout>";


public static final String switchjava = "package com.example.javadevelopementapp.Switchs;\n" +
        "\n" +
        "import android.os.Bundle;\n" +
        "import android.widget.CompoundButton;\n" +
        "import android.widget.Switch;\n" +
        "\n" +
        "import androidx.appcompat.app.AppCompatActivity;\n" +
        "import androidx.constraintlayout.widget.ConstraintLayout;\n" +
        "\n" +
        "import com.example.javadevelopementapp.R;\n" +
        "\n" +
        "public class SwitchOutput extends AppCompatActivity {\n" +
        "    Switch aSwitch;\n" +
        "    ConstraintLayout constraintLayout;\n" +
        "\n" +
        "    @Override\n" +
        "    protected void onCreate(Bundle savedInstanceState) {\n" +
        "        super.onCreate(savedInstanceState);\n" +
        "        setContentView(R.layout.activity_switch_output);\n" +
        "        aSwitch = findViewById(R.id.switches);\n" +
        "\n" +
        "        constraintLayout = findViewById(R.id.switchbackground);\n" +
        "\n" +
        "        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {\n" +
        "            @Override\n" +
        "            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {\n" +
        "                if (b == true) {\n" +
        "                    constraintLayout.setBackgroundColor(getResources().getColor(R.color.background));\n" +
        "                } else {\n" +
        "                    constraintLayout.setBackgroundColor(getResources().getColor(R.color.white));\n" +
        "                }\n" +
        "            }\n" +
        "        });\n" +
        "    }\n" +
        "}";
public static final String  swithxml= "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
        "    android:layout_width=\"match_parent\"\n" +
        "    android:layout_height=\"match_parent\"\n" +
        "    android:id=\"@+id/switchbackground\"\n" +
        "    tools:context=\".Switchs.SwitchOutput\">\n" +
        "\n" +
        "    <TextView\n" +
        "        android:id=\"@+id/textView\"\n" +
        "        android:layout_width=\"0dp\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:layout_marginTop=\"170dp\"\n" +
        "        android:gravity=\"center\"\n" +
        "        android:text=\"Switch\"\n" +
        "        android:textColor=\"@color/black\"\n" +
        "        android:textSize=\"22sp\"\n" +
        "        android:textStyle=\"bold\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
        "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
        "\n" +
        "    <Switch\n" +
        "        android:id=\"@+id/switches\"\n" +
        "        android:layout_width=\"wrap_content\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"@+id/textView\"\n" +
        "        app:layout_constraintHorizontal_bias=\"0.498\"\n" +
        "        app:layout_constraintStart_toStartOf=\"@+id/textView\"\n" +
        "        app:layout_constraintTop_toBottomOf=\"@+id/textView\"\n" +
        "        app:layout_constraintVertical_bias=\"0.091\" />\n" +
        "\n" +
        "</androidx.constraintlayout.widget.ConstraintLayout>";
 public static final String imageBtnjava = "package com.example.javadevelopementapp.ImageButton;\n" +
         "\n" +
         "import android.os.Bundle;\n" +
         "import android.view.View;\n" +
         "import android.widget.ImageButton;\n" +
         "import android.widget.Toast;\n" +
         "\n" +
         "import androidx.appcompat.app.AppCompatActivity;\n" +
         "\n" +
         "import com.example.javadevelopementapp.R;\n" +
         "\n" +
         "public class ImageButtonOutput extends AppCompatActivity {\n" +
         "    ImageButton imageButton;\n" +
         "\n" +
         "    @Override\n" +
         "    protected void onCreate(Bundle savedInstanceState) {\n" +
         "        super.onCreate(savedInstanceState);\n" +
         "        setContentView(R.layout.activity_image_button_output);\n" +
         "\n" +
         "        imageButton = findViewById(R.id.imageBtn);\n" +
         "        imageButton.setOnClickListener(new View.OnClickListener() {\n" +
         "            @Override\n" +
         "            public void onClick(View view) {\n" +
         "                Toast.makeText(ImageButtonOutput.this, \"Image Button Clicked\", Toast.LENGTH_SHORT).show();\n" +
         "            }\n" +
         "        });\n" +
         "    }\n" +
         "}";
 public static final String imageBtnxml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
         "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
         "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
         "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
         "    android:layout_width=\"match_parent\"\n" +
         "    android:layout_height=\"match_parent\"\n" +
         "    tools:context=\".ImageButton.ImageButtonOutput\">\n" +
         "\n" +
         "    <Toolbar\n" +
         "        android:id=\"@+id/toolbar\"\n" +
         "        android:layout_width=\"match_parent\"\n" +
         "        android:layout_height=\"56dp\"\n" +
         "        android:background=\"#3E616F\"\n" +
         "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
         "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
         "        app:layout_constraintTop_toTopOf=\"parent\">\n" +
         "\n" +
         "        <LinearLayout\n" +
         "            android:layout_width=\"match_parent\"\n" +
         "            android:layout_height=\"match_parent\"\n" +
         "            android:orientation=\"horizontal\">\n" +
         "\n" +
         "            <ImageView\n" +
         "                android:layout_width=\"50dp\"\n" +
         "                android:layout_height=\"50dp\"\n" +
         "                android:padding=\"4dp\"\n" +
         "                android:src=\"@drawable/java_b\"\n" +
         "                app:tint=\"@color/white\" />\n" +
         "\n" +
         "            <TextView\n" +
         "                android:layout_width=\"wrap_content\"\n" +
         "                android:layout_height=\"match_parent\"\n" +
         "                android:layout_marginLeft=\"10dp\"\n" +
         "                android:gravity=\"center\"\n" +
         "                android:text=\"Android Tutorial\"\n" +
         "                android:textColor=\"@color/white\"\n" +
         "                android:textSize=\"22sp\"\n" +
         "                android:textStyle=\"bold\" />\n" +
         "        </LinearLayout>\n" +
         "\n" +
         "    </Toolbar>\n" +
         "\n" +
         "    <ImageButton\n" +
         "        android:id=\"@+id/imageBtn\"\n" +
         "        android:layout_width=\"228dp\"\n" +
         "        android:layout_height=\"295dp\"\n" +
         "        android:src=\"@drawable/java_background\"\n" +
         "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
         "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
         "        app:layout_constraintHorizontal_bias=\"0.497\"\n" +
         "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
         "        app:layout_constraintTop_toBottomOf=\"@+id/toolbar\"\n" +
         "        app:layout_constraintVertical_bias=\"0.273\" />\n" +
         "\n" +
         "\n" +
         "</androidx.constraintlayout.widget.ConstraintLayout>";
public static final String check_xml  = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
        "    android:layout_width=\"match_parent\"\n" +
        "    android:layout_height=\"match_parent\"\n" +
        "    tools:context=\".CheckBoxes.checkBoxOutput\">\n" +
        "\n" +
        "    <LinearLayout\n" +
        "        android:id=\"@+id/linearLayout\"\n" +
        "        android:layout_width=\"0dp\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:orientation=\"vertical\"\n" +
        "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
        "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
        "        app:layout_constraintVertical_bias=\"0.26999998\">\n" +
        "\n" +
        "        <TextView\n" +
        "            android:layout_width=\"match_parent\"\n" +
        "            android:layout_height=\"wrap_content\"\n" +
        "            android:layout_marginBottom=\"10dp\"\n" +
        "            android:gravity=\"center\"\n" +
        "            android:text=\"Check Box\"\n" +
        "            android:textSize=\"25dp\"\n" +
        "            android:textStyle=\"bold\" />\n" +
        "\n" +
        "        <LinearLayout\n" +
        "            android:layout_width=\"match_parent\"\n" +
        "            android:layout_height=\"wrap_content\"\n" +
        "            android:orientation=\"horizontal\">\n" +
        "\n" +
        "            <CheckBox\n" +
        "                android:id=\"@+id/firstCheckBox\"\n" +
        "                android:layout_width=\"wrap_content\"\n" +
        "                android:layout_height=\"wrap_content\" />\n" +
        "\n" +
        "            <TextView\n" +
        "                android:layout_width=\"wrap_content\"\n" +
        "                android:layout_height=\"wrap_content\"\n" +
        "                android:text=\"Android \" />\n" +
        "\n" +
        "        </LinearLayout>\n" +
        "\n" +
        "        <LinearLayout\n" +
        "            android:layout_width=\"match_parent\"\n" +
        "            android:layout_height=\"wrap_content\"\n" +
        "            android:orientation=\"horizontal\">\n" +
        "\n" +
        "            <CheckBox\n" +
        "                android:id=\"@+id/secondCheckBox\"\n" +
        "                android:layout_width=\"wrap_content\"\n" +
        "                android:layout_height=\"wrap_content\" />\n" +
        "\n" +
        "            <TextView\n" +
        "                android:layout_width=\"wrap_content\"\n" +
        "                android:layout_height=\"wrap_content\"\n" +
        "                android:text=\"Flutter\" />\n" +
        "\n" +
        "        </LinearLayout>\n" +
        "\n" +
        "        <LinearLayout\n" +
        "            android:layout_width=\"match_parent\"\n" +
        "            android:layout_height=\"wrap_content\"\n" +
        "            android:orientation=\"horizontal\">\n" +
        "\n" +
        "            <CheckBox\n" +
        "                android:id=\"@+id/thirdCheckBox\"\n" +
        "                android:layout_width=\"wrap_content\"\n" +
        "                android:layout_height=\"wrap_content\" />\n" +
        "\n" +
        "            <TextView\n" +
        "                android:layout_width=\"wrap_content\"\n" +
        "                android:layout_height=\"wrap_content\"\n" +
        "                android:text=\"Swift\" />\n" +
        "\n" +
        "        </LinearLayout>\n" +
        "\n" +
        "        <androidx.appcompat.widget.AppCompatButton\n" +
        "            android:id=\"@+id/ckeckCheckBox\"\n" +
        "            android:layout_width=\"match_parent\"\n" +
        "            android:layout_height=\"match_parent\"\n" +
        "            android:layout_margin=\"10dp\"\n" +
        "            android:background=\"@drawable/btnbackground\"\n" +
        "            android:text=\"Check\"\n" +
        "            android:textAllCaps=\"false\"\n" +
        "            android:textColor=\"@color/white\"\n" +
        "            android:textSize=\"22sp\"\n" +
        "            android:textStyle=\"bold\" />\n" +
        "\n" +
        "    </LinearLayout>\n" +
        "\n" +
        "</androidx.constraintlayout.widget.ConstraintLayout>";
public static final String check_java  = "package com.example.javadevelopementapp.CheckBoxes;\n" +
        "\n" +
        "import android.os.Bundle;\n" +
        "import android.view.View;\n" +
        "import android.widget.Button;\n" +
        "import android.widget.CheckBox;\n" +
        "import android.widget.Toast;\n" +
        "\n" +
        "import androidx.appcompat.app.AppCompatActivity;\n" +
        "\n" +
        "import com.example.javadevelopementapp.R;\n" +
        "\n" +
        "public class checkBoxOutput extends AppCompatActivity {\n" +
        "\n" +
        "    CheckBox first, second, third;\n" +
        "    Button check;\n" +
        "    boolean checked = false;\n" +
        "\n" +
        "    @Override\n" +
        "    protected void onCreate(Bundle savedInstanceState) {\n" +
        "        super.onCreate(savedInstanceState);\n" +
        "        setContentView(R.layout.activity_check_box_output);\n" +
        "\n" +
        "        first = findViewById(R.id.firstCheckBox);\n" +
        "        second = findViewById(R.id.secondCheckBox);\n" +
        "        third = findViewById(R.id.thirdCheckBox);\n" +
        "        check = findViewById(R.id.ckeckCheckBox);\n" +
        "        check.setOnClickListener(new View.OnClickListener() {\n" +
        "            @Override\n" +
        "            public void onClick(View view) {\n" +
        "                if (first.isChecked()) {\n" +
        "                    Toast.makeText(checkBoxOutput.this, \"First is checked\", Toast.LENGTH_SHORT).show();\n" +
        "                } else if (second.isChecked()) {\n" +
        "                    Toast.makeText(checkBoxOutput.this, \"second is checked\", Toast.LENGTH_SHORT).show();\n" +
        "                } else {\n" +
        "                    Toast.makeText(checkBoxOutput.this, \"Third is checked\", Toast.LENGTH_SHORT).show();\n" +
        "                }\n" +
        "            }\n" +
        "        });\n" +
        "    }\n" +
        "}";
public static final String spinner_java = "package com.example.javadevelopementapp.Spinner;\n" +
        "\n" +
        "import android.os.Bundle;\n" +
        "import android.widget.ArrayAdapter;\n" +
        "import android.widget.Spinner;\n" +
        "\n" +
        "import androidx.appcompat.app.AppCompatActivity;\n" +
        "\n" +
        "import com.example.javadevelopementapp.R;\n" +
        "\n" +
        "public class SpinnerOutput extends AppCompatActivity {\n" +
        "\n" +
        "    Spinner spinner;\n" +
        "\n" +
        "    @Override\n" +
        "    protected void onCreate(Bundle savedInstanceState) {\n" +
        "        super.onCreate(savedInstanceState);\n" +
        "        setContentView(R.layout.activity_spinner_output);\n" +
        "\n" +
        "        spinner = findViewById(R.id.myspinner);\n" +
        "        String[] show_languages = {\"C language\", \"C++ language\", \"Python\", \"Java\", \"Kotlin\", \"Ruby\", \"Swift\", \"Html\", \"css\", \"JavaScript\", \"jQuery\", \"Php\", \"Dbms\", \"Flutter\"};\n" +
        "        //make adapter for the set language in spinner\n" +
        "        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, show_languages);\n" +
        "        spinner.setAdapter(adapter);\n" +
        "\n" +
        "    }\n" +
        "}";
public static final String spinner_xml  = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
        "    android:layout_width=\"match_parent\"\n" +
        "    android:layout_height=\"match_parent\"\n" +
        "    tools:context=\".Spinner.SpinnerOutput\">\n" +
        "\n" +
        "    <Spinner\n" +
        "        android:id=\"@+id/myspinner\"\n" +
        "        android:layout_width=\"wrap_content\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:gravity=\"center\"\n" +
        "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
        "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
        "\n" +
        "</androidx.constraintlayout.widget.ConstraintLayout>";
public static final String radiojava = "package com.example.javadevelopementapp.RadioButton;\n" +
        "\n" +
        "import androidx.appcompat.app.AppCompatActivity;\n" +
        "import com.example.javadevelopementapp.R;\n" +
        "import android.os.Bundle;\n" +
        "import android.widget.RadioButton;\n" +
        "import android.widget.RadioGroup;\n" +
        "import android.widget.Toast;\n" +
        "\n" +
        "public class RadioButtonOutput extends AppCompatActivity {\n" +
        "RadioGroup radioGroup;\n" +
        "RadioButton male,female,other;\n" +
        "\n" +
        "    @Override\n" +
        "    protected void onCreate(Bundle savedInstanceState) {\n" +
        "        super.onCreate(savedInstanceState);\n" +
        "        setContentView(R.layout.activity_radio_button_output);\n" +
        "    \n" +
        "        radioGroup  = findViewById(R.id.redioGroup);\n" +
        "        male = findViewById(R.id.male);\n" +
        "        female = findViewById(R.id.female);\n" +
        "        other = findViewById(R.id.other);\n" +
        "    \n" +
        "        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {\n" +
        "            @Override\n" +
        "            public void onCheckedChanged(RadioGroup radioGroup, int i) {\n" +
        "                switch (i){\n" +
        "                    case R.id.male:\n" +
        "                        Toast.makeText(RadioButtonOutput.this, \"Male is checked\", Toast.LENGTH_SHORT).show();\n" +
        "                        break;\n" +
        "                    case R.id.female:\n" +
        "                        Toast.makeText(RadioButtonOutput.this, \"female is checked\", Toast.LENGTH_SHORT).show();\n" +
        "                        break;\n" +
        "                    case R.id.other:\n" +
        "                        Toast.makeText(RadioButtonOutput.this, \"other is checked\", Toast.LENGTH_SHORT).show();\n" +
        "                        break;\n" +
        "                }\n" +
        "            }\n" +
        "        });\n" +
        "    }\n" +
        "}";
public static final String radio_xml  = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
        "    android:layout_width=\"match_parent\"\n" +
        "    android:layout_height=\"match_parent\"\n" +
        "    tools:context=\".RadioButton.RadioButtonOutput\">\n" +
        "\n" +
        "    <LinearLayout\n" +
        "        android:id=\"@+id/linearLayout\"\n" +
        "        android:layout_width=\"0dp\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:orientation=\"vertical\"\n" +
        "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
        "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
        "        app:layout_constraintVertical_bias=\"0.26999998\">\n" +
        "\n" +
        "        <TextView\n" +
        "            android:layout_width=\"match_parent\"\n" +
        "            android:layout_height=\"wrap_content\"\n" +
        "            android:layout_marginBottom=\"10dp\"\n" +
        "            android:gravity=\"center\"\n" +
        "            android:text=\"Check Box\"\n" +
        "            android:textSize=\"25dp\"\n" +
        "            android:textStyle=\"bold\" />\n" +
        "\n" +
        "        <RadioGroup\n" +
        "            android:id=\"@+id/redioGroup\"\n" +
        "            android:layout_width=\"match_parent\"\n" +
        "            android:layout_height=\"wrap_content\"\n" +
        "            android:layout_margin=\"10dp\">\n" +
        "\n" +
        "            <RadioButton\n" +
        "                android:id=\"@+id/male\"\n" +
        "                android:layout_width=\"wrap_content\"\n" +
        "                android:layout_height=\"wrap_content\"\n" +
        "                android:text=\"Male\" />\n" +
        "\n" +
        "            <RadioButton\n" +
        "                android:id=\"@+id/female\"\n" +
        "                android:layout_width=\"wrap_content\"\n" +
        "                android:layout_height=\"wrap_content\"\n" +
        "                android:text=\"FeMale\" />\n" +
        "\n" +
        "            <RadioButton\n" +
        "                android:id=\"@+id/other\"\n" +
        "                android:layout_width=\"wrap_content\"\n" +
        "                android:layout_height=\"wrap_content\"\n" +
        "                android:text=\"Other\" />\n" +
        "\n" +
        "\n" +
        "        </RadioGroup>\n" +
        "\n" +
        "\n" +
        "        <androidx.appcompat.widget.AppCompatButton\n" +
        "            android:id=\"@+id/ckeckCheckBox\"\n" +
        "            android:layout_width=\"match_parent\"\n" +
        "            android:layout_height=\"match_parent\"\n" +
        "            android:layout_margin=\"10dp\"\n" +
        "            android:background=\"@drawable/btnbackground\"\n" +
        "            android:text=\"Check\"\n" +
        "            android:textAllCaps=\"false\"\n" +
        "            android:textColor=\"@color/white\"\n" +
        "            android:textSize=\"22sp\"\n" +
        "            android:textStyle=\"bold\" />\n" +
        "\n" +
        "    </LinearLayout>\n" +
        "</androidx.constraintlayout.widget.ConstraintLayout>";
public static final String seekbarxml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
        "    android:layout_width=\"match_parent\"\n" +
        "    android:layout_height=\"match_parent\"\n" +
        "    tools:context=\".SeekBar.SeekbarOutput\">\n" +
        "\n" +
        "        <SeekBar\n" +
        "            android:id=\"@+id/seekbar\"\n" +
        "            android:layout_marginTop=\"400dp\"\n" +
        "            android:layout_width=\"fill_parent\"\n" +
        "            android:layout_height=\"wrap_content\"\n" +
        "            android:max=\"150\"/>\n" +
        "\n" +
        "\n" +
        "\n" +
        "</RelativeLayout>";
public static final String seekbar_java = "package com.example.javadevelopementapp.SeekBar;\n" +
        "\n" +
        "import androidx.appcompat.app.AppCompatActivity;\n" +
        "import com.example.javadevelopementapp.R;\n" +
        "import android.os.Bundle;\n" +
        "import android.widget.SeekBar;\n" +
        "import android.widget.Toast;\n" +
        "\n" +
        "public class SeekbarOutput extends AppCompatActivity {\n" +
        "    SeekBar seekbar;\n" +
        "    @Override\n" +
        "    protected void onCreate(Bundle savedInstanceState) {\n" +
        "        super.onCreate(savedInstanceState);\n" +
        "        setContentView(R.layout.activity_seekbar_output);\n" +
        "        seekbar = (SeekBar)findViewById(R.id.seekbar);\n" +
        "\n" +
        "         seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {\n" +
        "             @Override\n" +
        "             public void onProgressChanged(SeekBar seekBar, int i, boolean b) {\n" +
        "                 Toast.makeText(SeekbarOutput.this, \"Seekbar value is \"+i, Toast.LENGTH_SHORT).show();\n" +
        "             }\n" +
        "\n" +
        "             @Override\n" +
        "             public void onStartTrackingTouch(SeekBar seekBar) {\n" +
        "\n" +
        "             }\n" +
        "\n" +
        "             @Override\n" +
        "             public void onStopTrackingTouch(SeekBar seekBar) {\n" +
        "\n" +
        "             }\n" +
        "         });\n" +
        "    }\n" +
        "}";
public static final String ratingbar_java = "package com.example.javadevelopementapp.RatingBar;\n" +
        "\n" +
        "import android.graphics.Color;\n" +
        "import android.graphics.PorterDuff;\n" +
        "import android.graphics.drawable.LayerDrawable;\n" +
        "import android.os.Bundle;\n" +
        "import android.view.View;\n" +
        "import android.widget.RatingBar;\n" +
        "import android.widget.TextView;\n" +
        "\n" +
        "import androidx.appcompat.app.AppCompatActivity;\n" +
        "\n" +
        "import com.example.javadevelopementapp.R;\n" +
        "\n" +
        "public class RatingbarOutput extends AppCompatActivity {\n" +
        "    RatingBar rt;\n" +
        "\n" +
        "    @Override\n" +
        "    protected void onCreate(Bundle savedInstanceState) {\n" +
        "        super.onCreate(savedInstanceState);\n" +
        "        setContentView(R.layout.activity_ratingbar_output);\n" +
        "        rt = (RatingBar) findViewById(R.id.ratingBar);\n" +
        "        LayerDrawable stars = (LayerDrawable) rt.getProgressDrawable();\n" +
        "        stars.getDrawable(2).setColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_ATOP);\n" +
        "    }\n" +
        "\n" +
        "    public void Call(View v) {\n" +
        "        TextView t = (TextView) findViewById(R.id.textView2);\n" +
        "        t.setText(\"You Rated :\" + String.valueOf(rt.getRating()));\n" +
        "    }\n" +
        "}";
public static final String ratingbar_xml  = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
        "    android:layout_width=\"match_parent\"\n" +
        "    android:layout_height=\"match_parent\"\n" +
        "    tools:context=\".RatingBar.RatingbarOutput\">\n" +
        "\n" +
        "    <RatingBar\n" +
        "        android:id=\"@+id/ratingBar\"\n" +
        "        android:layout_width=\"wrap_content\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:layout_marginTop=\"104dp\"\n" +
        "        app:layout_constraintLeft_toLeftOf=\"parent\"\n" +
        "        app:layout_constraintRight_toRightOf=\"parent\"\n" +
        "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
        "        tools:layout_constraintLeft_creator=\"1\"\n" +
        "        tools:layout_constraintRight_creator=\"1\"\n" +
        "        tools:layout_constraintTop_creator=\"1\" />\n" +
        "\n" +
        "    <TextView\n" +
        "        android:id=\"@+id/textView\"\n" +
        "        android:layout_width=\"wrap_content\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:text=\"Rate Me!!!\"\n" +
        "        android:textColor=\"@android:color/background_dark\"\n" +
        "        android:textSize=\"30sp\"\n" +
        "        android:textStyle=\"bold|italic\"\n" +
        "        tools:layout_editor_absoluteX=\"127dp\"\n" +
        "        tools:layout_editor_absoluteY=\"28dp\" />\n" +
        "\n" +
        "    <TextView\n" +
        "        android:id=\"@+id/textView2\"\n" +
        "        android:layout_width=\"wrap_content\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:layout_marginTop=\"148dp\"\n" +
        "        android:textColorHint=\"@color/background\"\n" +
        "        android:textSize=\"24sp\"\n" +
        "        app:layout_constraintLeft_toLeftOf=\"parent\"\n" +
        "        app:layout_constraintRight_toRightOf=\"parent\"\n" +
        "        app:layout_constraintTop_toBottomOf=\"@+id/ratingBar\"\n" +
        "        tools:layout_constraintLeft_creator=\"1\"\n" +
        "        tools:layout_constraintRight_creator=\"1\" />\n" +
        "\n" +
        "    <Button\n" +
        "        android:id=\"@+id/button\"\n" +
        "        android:layout_width=\"wrap_content\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:layout_marginTop=\"50dp\"\n" +
        "        android:layout_marginBottom=\"50dp\"\n" +
        "        android:background=\"@android:color/holo_red_dark\"\n" +
        "        android:onClick=\"Call\"\n" +
        "        android:text=\"Submit\"\n" +
        "        android:textColor=\"@android:color/background_light\"\n" +
        "        android:textStyle=\"bold|italic\"\n" +
        "        app:layout_constraintBottom_toTopOf=\"@+id/textView2\"\n" +
        "        app:layout_constraintLeft_toLeftOf=\"parent\"\n" +
        "        app:layout_constraintRight_toRightOf=\"parent\"\n" +
        "        app:layout_constraintTop_toBottomOf=\"@+id/ratingBar\"\n" +
        "        tools:layout_constraintBottom_creator=\"1\"\n" +
        "        tools:layout_constraintLeft_creator=\"1\"\n" +
        "        tools:layout_constraintRight_creator=\"1\"\n" +
        "        tools:layout_constraintTop_creator=\"1\" />\n" +
        "</androidx.constraintlayout.widget.ConstraintLayout>";
public static final String textSwitcher_java  = "package com.example.javadevelopementapp.TextSiwtcher;\n" +
        "\n" +
        "import androidx.appcompat.app.AppCompatActivity;\n" +
        "\n" +
        "import com.example.javadevelopementapp.MainActivity;\n" +
        "import com.example.javadevelopementapp.R;\n" +
        "\n" +
        "import android.graphics.Color;\n" +
        "import android.os.Bundle;\n" +
        "import android.view.Gravity;\n" +
        "import android.view.View;\n" +
        "import android.widget.Button;\n" +
        "import android.widget.TextSwitcher;\n" +
        "import android.widget.TextView;\n" +
        "import android.widget.ViewSwitcher;\n" +
        "\n" +
        "public class textSwitcherOutput extends AppCompatActivity {\n" +
        "    private TextSwitcher textSwitcher;\n" +
        "    private Button nextButton;\n" +
        "    private int index = 0;\n" +
        "    private String[] arr = { \"AKASH KUMAR\", \"ANDROID\", \"BIKASH\", \"SACHIN\", \"MAYANK\", \"ARPIT\", \"MORE\" };\n" +
        "    private TextView textView;\n" +
        "\n" +
        "    @Override\n" +
        "    protected void onCreate(Bundle savedInstanceState) {\n" +
        "        super.onCreate(savedInstanceState);\n" +
        "        setContentView(R.layout.activity_text_switcher_output);\n" +
        "        textSwitcher = findViewById(R.id.textSwitcher);\n" +
        "        nextButton = findViewById(R.id.button);\n" +
        "        nextButton.setOnClickListener(new View.OnClickListener() {\n" +
        "            @Override\n" +
        "            public void onClick(View view) {\n" +
        "                if (index == arr.length - 1) {\n" +
        "                    index = 0;\n" +
        "                    textSwitcher.setText(arr[index]);\n" +
        "                }\n" +
        "                else {\n" +
        "                    textSwitcher.setText(arr[++index]);\n" +
        "                }\n" +
        "            }\n" +
        "        });\n" +
        "\n" +
        "\n" +
        "        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() {\n" +
        "                    @Override\n" +
        "                    public View makeView()\n" +
        "                    {\n" +
        "                        textView = new TextView(textSwitcherOutput.this);\n" +
        "                        textView.setTextColor(Color.parseColor(\"#219806\"));\n" +
        "                        textView.setTextSize(40);textView.setGravity(Gravity.CENTER_HORIZONTAL);\n" +
        "                        return textView;\n" +
        "                    }\n" +
        "                });\n" +
        "        textSwitcher.setText(arr[index]);\n" +
        "    }\n" +
        "}";
public static final String textSwitcher_xml  = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
        "    android:layout_width=\"match_parent\"\n" +
        "    android:layout_height=\"match_parent\"\n" +
        "    tools:context=\".TextSiwtcher.textSwitcherOutput\">\n" +
        "\n" +
        "    <TextSwitcher\n" +
        "        android:id=\"@+id/textSwitcher\"\n" +
        "        android:layout_width=\"match_parent\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:layout_marginTop=\"80dp\"\n" +
        "        android:inAnimation=\"@android:anim/slide_in_left\"\n" +
        "        android:outAnimation=\"@android:anim/slide_out_right\" />\n" +
        "\n" +
        "    <Button\n" +
        "        android:id=\"@+id/button\"\n" +
        "        android:layout_width=\"wrap_content\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:layout_centerHorizontal=\"true\"\n" +
        "        android:layout_centerVertical=\"true\"\n" +
        "        android:text=\"Next\"\n" +
        "        android:textSize=\"20sp\" />\n" +
        "</RelativeLayout>";
public static final String scroll_java  = "package com.example.javadevelopementapp.Scrollview;\n" +
        "\n" +
        "import androidx.appcompat.app.AppCompatActivity;\n" +
        "import com.example.javadevelopementapp.R;\n" +
        "import android.os.Bundle;\n" +
        "\n" +
        "public class ScrollviewOutput extends AppCompatActivity {\n" +
        "\n" +
        "    @Override\n" +
        "    protected void onCreate(Bundle savedInstanceState) {\n" +
        "        super.onCreate(savedInstanceState);\n" +
        "        setContentView(R.layout.activity_scrollview_output);\n" +
        "    }\n" +
        "}";
public static final String scroll_xml  = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
        "    android:layout_width=\"match_parent\"\n" +
        "    android:layout_height=\"match_parent\"\n" +
        "    tools:context=\".Scrollview.ScrollviewOutput\">\n" +
        "\n" +
        "    <ScrollView\n" +
        "        android:id=\"@+id/scrollView2\"\n" +
        "        android:layout_width=\"match_parent\"\n" +
        "        android:layout_height=\"match_parent\"\n" +
        "        android:scrollbars=\"vertical\"\n" +
        "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
        "        app:layout_constraintTop_toTopOf=\"parent\">\n" +
        "\n" +
        "        <TextView\n" +
        "            android:id=\"@+id/scroolbarTextVeiw\"\n" +
        "            android:layout_width=\"match_parent\"\n" +
        "            android:layout_height=\"match_parent\"\n" +
        "            android:layout_margin=\"5dp\"\n" +
        "            android:fontFamily=\"serif\"\n" +
        "            android:lineSpacingExtra=\"1dp\"\n" +
        "            android:text=\"@string/story\"\n" +
        "            android:textSize=\"22sp\" />\n" +
        "    </ScrollView>\n" +
        "</androidx.constraintlayout.widget.ConstraintLayout>";
public static final String imageSwitcher_java  = "package com.example.javadevelopementapp.ImageSwitcher;\n" +
        "\n" +
        "import android.os.Bundle;\n" +
        "import android.view.View;\n" +
        "import android.widget.ImageSwitcher;\n" +
        "import android.widget.ImageView;\n" +
        "import android.widget.LinearLayout;\n" +
        "import android.widget.ViewSwitcher;\n" +
        "\n" +
        "import androidx.appcompat.app.AppCompatActivity;\n" +
        "\n" +
        "import com.example.javadevelopementapp.R;\n" +
        "\n" +
        "public class ImageSwitcherOutput extends AppCompatActivity {\n" +
        "    ImageView btPrevious, btNext;\n" +
        "    ImageSwitcher imageSwitcher;\n" +
        "\n" +
        "    int imageList[] = {R.drawable.java_png, R.drawable.java_d, R.drawable.java_c, R.drawable.java_a, R.drawable.java_b};\n" +
        "    int currentIndex = -1;\n" +
        "\n" +
        "    @Override\n" +
        "    protected void onCreate(Bundle savedInstanceState) {\n" +
        "        super.onCreate(savedInstanceState);\n" +
        "        setContentView(R.layout.activity_image_switcher_output);\n" +
        "        btPrevious = findViewById(R.id.bt_previous);\n" +
        "        btNext = findViewById(R.id.bt_next);\n" +
        "        imageSwitcher = findViewById(R.id.image_switcher);\n" +
        "        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {\n" +
        "            @Override\n" +
        "            public View makeView() {\n" +
        "                ImageView imageView = new ImageView(getApplicationContext());\n" +
        "                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);\n" +
        "                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));\n" +
        "                return imageView;\n" +
        "\n" +
        "            }\n" +
        "        });\n" +
        "\n" +
        "        btNext.setOnClickListener(new View.OnClickListener() {\n" +
        "            @Override\n" +
        "            public void onClick(View view) {\n" +
        "                if (currentIndex < imageList.length - 1) {\n" +
        "                    currentIndex = currentIndex + 1;\n" +
        "                    imageSwitcher.setImageResource(imageList[currentIndex]);\n" +
        "                }\n" +
        "            }\n" +
        "        });\n" +
        "        btPrevious.setOnClickListener(new View.OnClickListener() {\n" +
        "            @Override\n" +
        "            public void onClick(View view) {\n" +
        "                if (currentIndex > 0) {\n" +
        "                    currentIndex = currentIndex - 1;\n" +
        "                    imageSwitcher.setImageResource(imageList[currentIndex]);\n" +
        "                }\n" +
        "            }\n" +
        "        });\n" +
        "    }\n" +
        "}";
public static final String imageSwitcher_xml  = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
        "    android:layout_width=\"match_parent\"\n" +
        "    android:layout_height=\"match_parent\"\n" +
        "    android:orientation=\"horizontal\"\n" +
        "    tools:context=\".ImageSwitcher.ImageSwitcherOutput\">\n" +
        "\n" +
        "    <ImageView\n" +
        "        android:id=\"@+id/bt_previous\"\n" +
        "        android:layout_width=\"45dp\"\n" +
        "        android:layout_height=\"45dp\"\n" +
        "        android:src=\"@drawable/arrowback\"\n" +
        "        app:layout_constraintBottom_toBottomOf=\"@+id/image_switcher\"\n" +
        "        app:layout_constraintEnd_toStartOf=\"@+id/image_switcher\"\n" +
        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
        "        app:layout_constraintTop_toTopOf=\"@+id/image_switcher\" />\n" +
        "\n" +
        "    <ImageView\n" +
        "        android:id=\"@+id/bt_next\"\n" +
        "        android:layout_width=\"45dp\"\n" +
        "        android:layout_height=\"45dp\"\n" +
        "        android:src=\"@drawable/forward\"\n" +
        "        app:layout_constraintBottom_toBottomOf=\"@+id/image_switcher\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "        app:layout_constraintStart_toEndOf=\"@+id/image_switcher\"\n" +
        "        app:layout_constraintTop_toTopOf=\"@+id/image_switcher\" />\n" +
        "\n" +
        "    <ImageSwitcher\n" +
        "        android:id=\"@+id/image_switcher\"\n" +
        "        android:layout_width=\"250dp\"\n" +
        "        android:layout_height=\"250dp\"\n" +
        "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
        "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
        "\n" +
        "</androidx.constraintlayout.widget.ConstraintLayout>";
public static final String  toast_java= "package com.example.javadevelopementapp.Toasts;\n" +
        "\n" +
        "import android.graphics.Color;\n" +
        "import android.os.Bundle;\n" +
        "import android.view.Gravity;\n" +
        "import android.view.View;\n" +
        "import android.widget.TextView;\n" +
        "import android.widget.Toast;\n" +
        "\n" +
        "import androidx.appcompat.app.AppCompatActivity;\n" +
        "import androidx.appcompat.widget.AppCompatButton;\n" +
        "\n" +
        "import com.example.javadevelopementapp.R;\n" +
        "\n" +
        "public class Simple_Toast_output extends AppCompatActivity {\n" +
        "\n" +
        "    AppCompatButton simpleToast, coloredToast, PositionToast;\n" +
        "\n" +
        "    @Override\n" +
        "    protected void onCreate(Bundle savedInstanceState) {\n" +
        "        super.onCreate(savedInstanceState);\n" +
        "        setContentView(R.layout.activity_simple_toast);\n" +
        "        simpleToast = findViewById(R.id.simpleToastBtn);\n" +
        "        coloredToast = findViewById(R.id.colorToast);\n" +
        "        PositionToast = findViewById(R.id.positionToast);\n" +
        "\n" +
        "        simpleToast.setOnClickListener(new View.OnClickListener() {\n" +
        "            @Override\n" +
        "            public void onClick(View view) {\n" +
        "                Toast.makeText(Simple_Toast_output.this, \"This is Simple Toast\", Toast.LENGTH_SHORT).show();\n" +
        "            }\n" +
        "        });\n" +
        "    }\n" +
        "}";
public static final String Toast_xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
        "    android:layout_width=\"match_parent\"\n" +
        "    android:layout_height=\"match_parent\"\n" +
        "    tools:context=\".Toasts.Simple_Toast_output\">\n" +
        "\n" +
        "    <androidx.appcompat.widget.AppCompatButton\n" +
        "        android:id=\"@+id/simpleToastBtn\"\n" +
        "        android:layout_width=\"match_parent\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:layout_margin=\"10dp\"\n" +
        "        android:background=\"@drawable/btnbackground\"\n" +
        "        android:text=\"Simple Toast\"\n" +
        "        android:textColor=\"@color/white\"\n" +
        "        android:textSize=\"22sp\"\n" +
        "        android:textStyle=\"bold\"\n" +
        "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
        "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
        "        app:layout_constraintVertical_bias=\"0.374\" />\n" +
        "\n" +
        "\n" +
        "\n" +
        "</androidx.constraintlayout.widget.ConstraintLayout>";
 public static final String colorToast_java = "package com.example.javadevelopementapp.Toasts;\n" +
         "\n" +
         "import androidx.appcompat.app.AppCompatActivity;\n" +
         "import androidx.appcompat.widget.AppCompatButton;\n" +
         "\n" +
         "import android.graphics.Color;\n" +
         "import android.os.Bundle;\n" +
         "import android.view.View;\n" +
         "import android.widget.TextView;\n" +
         "import android.widget.Toast;\n" +
         "\n" +
         "import com.example.javadevelopementapp.R;\n" +
         "\n" +
         "public class color_Toast extends AppCompatActivity {\n" +
         "\n" +
         "    AppCompatButton   coloredToast ;\n" +
         "    @Override\n" +
         "    protected void onCreate(Bundle savedInstanceState) {\n" +
         "        super.onCreate(savedInstanceState);\n" +
         "        setContentView(R.layout.activity_color_toast);\n" +
         "        coloredToast = findViewById(R.id.colorToast);\n" +
         "        coloredToast.setOnClickListener(new View.OnClickListener() {\n" +
         "            @Override\n" +
         "            public void onClick(View view) {\n" +
         "                Toast toast = Toast.makeText( color_Toast.this, \"This is Color Toast\", Toast.LENGTH_SHORT);\n" +
         "                View view1 = toast.getView();\n" +
         "                view1.setBackgroundColor(getResources().getColor(R.color.background));\n" +
         "                TextView textView = (TextView) toast.getView().findViewById(android.R.id.message);\n" +
         "                textView.setTextColor(Color.WHITE);\n" +
         "                toast.show();\n" +
         "\n" +
         "            }\n" +
         "        });\n" +
         "\n" +
         "    }\n" +
         "}";
 public static final String colorToast_xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
         "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
         "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
         "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
         "    android:layout_width=\"match_parent\"\n" +
         "    android:layout_height=\"match_parent\"\n" +
         "    tools:context=\".Toasts.color_Toast\">\n" +
         "\n" +
         "    <androidx.appcompat.widget.AppCompatButton\n" +
         "        android:id=\"@+id/colorToast\"\n" +
         "        android:layout_width=\"match_parent\"\n" +
         "        android:layout_height=\"wrap_content\"\n" +
         "        android:layout_margin=\"10dp\"\n" +
         "        android:background=\"@drawable/btn_color\"\n" +
         "        android:text=\"Color Toast\"\n" +
         "        android:textColor=\"@color/white\"\n" +
         "        android:textSize=\"22sp\"\n" +
         "        android:textStyle=\"bold\"\n" +
         "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
         "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
         "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
         "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
         "\n" +
         "</androidx.constraintlayout.widget.ConstraintLayout>";
public static final String positionToast_java = "package com.example.javadevelopementapp.Toasts;\n" +
        "\n" +
        "import androidx.appcompat.app.AppCompatActivity;\n" +
        "import androidx.appcompat.widget.AppCompatButton;\n" +
        "\n" +
        "import android.graphics.Color;\n" +
        "import android.os.Bundle;\n" +
        "import android.view.Gravity;\n" +
        "import android.view.View;\n" +
        "import android.widget.TextView;\n" +
        "import android.widget.Toast;\n" +
        "\n" +
        "import com.example.javadevelopementapp.R;\n" +
        "\n" +
        "public class positionToast extends AppCompatActivity {\n" +
        "    AppCompatButton PositionToast;\n" +
        "\n" +
        "    @Override\n" +
        "    protected void onCreate(Bundle savedInstanceState) {\n" +
        "        super.onCreate(savedInstanceState);\n" +
        "        setContentView(R.layout.activity_position_toast);\n" +
        "        PositionToast = findViewById(R.id.positionToast);\n" +
        "        PositionToast.setOnClickListener(new View.OnClickListener() {\n" +
        "            @Override\n" +
        "            public void onClick(View view) {\n" +
        "                Toast toastTop = Toast.makeText(getApplicationContext(), \"Position Top\", Toast.LENGTH_SHORT);\n" +
        "                toastTop.setGravity(Gravity.TOP, 0, 0);\n" +
        "\n" +
        "                Toast toastbottom = Toast.makeText(getApplicationContext(), \"Position Bottom\", Toast.LENGTH_SHORT);\n" +
        "                toastbottom.setGravity(Gravity.BOTTOM, 0, 0);\n" +
        "\n" +
        "                Toast toastleft = Toast.makeText(getApplicationContext(), \"Position Left\", Toast.LENGTH_SHORT);\n" +
        "                toastleft.setGravity(Gravity.LEFT, 0, 0);\n" +
        "\n" +
        "                Toast toastright = Toast.makeText(getApplicationContext(), \"Position Right\", Toast.LENGTH_SHORT);\n" +
        "                toastright.setGravity(Gravity.RIGHT, 0, 0);\n" +
        "\n" +
        "\n" +
        "            }\n" +
        "        });\n" +
        "    }\n" +
        "}\n";
public static final String positionToast_xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
        "    android:layout_width=\"match_parent\"\n" +
        "    android:layout_height=\"match_parent\"\n" +
        "    tools:context=\".Toasts.positionToast\">\n" +
        "\n" +
        "    <androidx.appcompat.widget.AppCompatButton\n" +
        "        android:id=\"@+id/positionToast\"\n" +
        "        android:layout_width=\"match_parent\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:layout_margin=\"10dp\"\n" +
        "        android:background=\"@drawable/btn_color\"\n" +
        "        android:text=\"Position Toast\"\n" +
        "        android:textColor=\"@color/white\"\n" +
        "        android:textSize=\"22sp\"\n" +
        "        android:textStyle=\"bold\"\n" +
        "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
        "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
        "\n" +
        "\n" +
        "</androidx.constraintlayout.widget.ConstraintLayout>";
public static final String  explict_java= "package com.example.javadevelopementapp.ExplictIntent;\n" +
        "\n" +
        "import android.content.Intent;\n" +
        "import android.os.Bundle;\n" +
        "import android.view.View;\n" +
        "import android.widget.Button;\n" +
        "\n" +
        "import androidx.appcompat.app.AppCompatActivity;\n" +
        "import androidx.constraintlayout.widget.ConstraintLayout;\n" +
        "\n" +
        "import com.example.javadevelopementapp.R;\n" +
        "\n" +
        "public class ExplictOutput extends AppCompatActivity {\n" +
        "    //intent activity to clicked the button\n" +
        "    ConstraintLayout constraintLayout;\n" +
        "    Button button;\n" +
        "\n" +
        "    @Override\n" +
        "    protected void onCreate(Bundle savedInstanceState) {\n" +
        "        super.onCreate(savedInstanceState);\n" +
        "        setContentView(R.layout.activity_explict_output);\n" +
        "        constraintLayout = findViewById(R.id.constaraintLayout);\n" +
        "        button = findViewById(R.id.button2);\n" +
        "\n" +
        "    }\n" +
        "\n" +
        "    public void gotonewActivity(View view) {\n" +
        "        if (getIntent().getStringExtra(\"hide\") != null && getIntent().getStringExtra(\"hide\").equals(\"hide\")) {\n" +
        "            constraintLayout.setBackgroundColor(getResources().getColor(R.color.background));\n" +
        "            button.setVisibility(View.GONE);\n" +
        "        } else {\n" +
        "            Intent intent = new Intent(getApplicationContext(), ExplictOutput.class);\n" +
        "            intent.putExtra(\"hide\", \"hide\");\n" +
        "            startActivity(new Intent(intent));\n" +
        "        }\n" +
        "    }\n" +
        "}";
public static final String  explict_xml= "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
        "    android:layout_width=\"match_parent\"\n" +
        "    android:layout_height=\"match_parent\"\n" +
        "    android:id=\"@+id/constaraintLayout\"\n" +
        "    tools:context=\".ExplictIntent.ExplictOutput\">\n" +
        "\n" +
        "\n" +
        "    <Button\n" +
        "        android:id=\"@+id/button2\"\n" +
        "        android:layout_width=\"wrap_content\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:text=\"Go to new Activity\"\n" +
        "        android:onClick=\"gotonewActivity\"\n" +
        "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
        "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
        "</androidx.constraintlayout.widget.ConstraintLayout>";
public static final String  valuePassJava= "package com.example.javadevelopementapp.valuePassActivity;\n" +
        "\n" +
        "import androidx.appcompat.app.AppCompatActivity;\n" +
        "\n" +
        "import android.content.Intent;\n" +
        "import android.os.Bundle;\n" +
        "import android.view.View;\n" +
        "import android.widget.Button;\n" +
        "import android.widget.EditText;\n" +
        "import android.widget.LinearLayout;\n" +
        "import android.widget.TextView;\n" +
        "\n" +
        "import com.example.javadevelopementapp.R;\n" +
        "\n" +
        "public class valueVassOutput extends AppCompatActivity {\n" +
        "EditText firstname,lastname;\n" +
        "Button sendButton;\n" +
        "\n" +
        "TextView first_name,last_name;\n" +
        "LinearLayout linearLayout; //not for you\n" +
        "\n" +
        "    @Override\n" +
        "    protected void onCreate(Bundle savedInstanceState) {\n" +
        "        super.onCreate(savedInstanceState);\n" +
        "        setContentView(R.layout.activity_value_vass_output);\n" +
        "        firstname = findViewById(R.id.firstname);\n" +
        "        lastname = findViewById(R.id.lastname);\n" +
        "        sendButton = findViewById(R.id.sendData);\n" +
        "\n" +
        "        first_name = findViewById(R.id.name);\n" +
        "        last_name = findViewById(R.id.lastnameTExtview);\n" +
        "\n" +
        "\n" +
        "        sendButton.setOnClickListener(new View.OnClickListener() {\n" +
        "            @Override\n" +
        "            public void onClick(View view) {\n" +
        "                String firstnam = firstname.getText().toString();\n" +
        "                String lastnam = lastname.getText().toString();\n" +
        "                Intent intent = new Intent(getApplicationContext(),valueVassOutput.class);\n" +
        "                intent.putExtra(\"hide\",\"hide\");  //this is only to me not for you\n" +
        "                intent.putExtra(\"first\",firstnam);\n" +
        "                intent.putExtra(\"last\",lastnam);\n" +
        "                startActivity(intent);\n" +
        "            }\n" +
        "\n" +
        "        });\n" +
        "        linearLayout = findViewById(R.id.linearlayoutakash);\n" +
        "\n" +
        "        String hidation = getIntent().getStringExtra(\"hide\") ;\n" +
        "        sendButton.setOnClickListener(new View.OnClickListener() {\n" +
        "            @Override\n" +
        "            public void onClick(View view) {\n" +
        "                if (getIntent().getStringExtra(\"hide\")!=null && getIntent().getStringExtra(\"hide\").equals(hidation)){\n" +
        "                    firstname.setVisibility(View.GONE);\n" +
        "                    lastname.setVisibility(View.GONE);\n" +
        "                    linearLayout.setVisibility(View.VISIBLE);\n" +
        "                    first_name.setText(getIntent().getStringExtra(\"first\"));\n" +
        "                    last_name.setText(getIntent().getStringExtra(\"last\"));\n" +
        "\n" +
        "                }else{\n" +
        "                    firstname.setVisibility(View.VISIBLE);\n" +
        "                    lastname.setVisibility(View.VISIBLE);\n" +
        "                    linearLayout.setVisibility(View.GONE);\n" +
        "                }\n" +
        "            }\n" +
        "        });\n" +
        "\n" +
        "    }\n" +
        "}";
public static final String  valuePassXml= "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
        "    android:layout_width=\"match_parent\"\n" +
        "    android:layout_height=\"match_parent\"\n" +
        "    tools:context=\".valuePassActivity.valueVassOutput\">\n" +
        "\n" +
        "    <EditText\n" +
        "        android:id=\"@+id/firstname\"\n" +
        "        android:layout_width=\"match_parent\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:hint=\"Firstname\"\n" +
        "        android:layout_marginLeft=\"10dp\"\n" +
        "        android:layout_marginRight=\"10dp\"\n" +
        "        android:layout_marginTop=\"190dp\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
        "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
        "\n" +
        "    <EditText\n" +
        "        android:id=\"@+id/lastname\"\n" +
        "        android:layout_width=\"match_parent\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:hint=\"lastname\"\n" +
        "        android:layout_marginLeft=\"10dp\"\n" +
        "        android:layout_marginRight=\"10dp\"\n" +
        "        android:layout_marginTop=\"10dp\"\n" +
        "\n" +
        "        app:layout_constraintEnd_toEndOf=\"@+id/firstname\"\n" +
        "        app:layout_constraintStart_toStartOf=\"@+id/firstname\"\n" +
        "        app:layout_constraintTop_toBottomOf=\"@id/firstname\" />\n" +
        "\n" +
        "    <Button\n" +
        "        android:id=\"@+id/sendData\"\n" +
        "        android:layout_width=\"match_parent\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:text=\"Send\"\n" +
        "        android:layout_marginLeft=\"10dp\"\n" +
        "        android:layout_marginRight=\"10dp\"\n" +
        "        android:layout_marginTop=\"10dp\"\n" +
        "        app:layout_constraintStart_toStartOf=\"@+id/lastname\"\n" +
        "        app:layout_constraintTop_toBottomOf=\"@+id/lastname\" />\n" +
        "\n" +
        "<!--    This is code to send data to other activity not write for you-->\n" +
        "\n" +
        "    <LinearLayout\n" +
        "        android:visibility=\"gone\"\n" +
        "        android:id=\"@+id/linearlayoutakash\"\n" +
        "        android:layout_width=\"match_parent\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:orientation=\"vertical\"\n" +
        "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
        "        app:layout_constraintTop_toBottomOf=\"@+id/sendData\">\n" +
        "\n" +
        "        <TextView\n" +
        "            android:id=\"@+id/name\"\n" +
        "            android:layout_width=\"match_parent\"\n" +
        "            android:layout_height=\"wrap_content\"\n" +
        "            android:gravity=\"center\"\n" +
        "            android:text=\"hello\"\n" +
        "            android:textSize=\"22sp\"\n" +
        "            android:textStyle=\"bold\" />\n" +
        "\n" +
        "        <TextView\n" +
        "            android:id=\"@+id/lastnameTExtview\"\n" +
        "            android:layout_width=\"match_parent\"\n" +
        "            android:layout_height=\"wrap_content\"\n" +
        "            android:gravity=\"center\"\n" +
        "            android:text=\"hello\"\n" +
        "            android:textSize=\"22sp\"\n" +
        "            android:textStyle=\"bold\" />\n" +
        "    </LinearLayout>\n" +
        "\n" +
        "</androidx.constraintlayout.widget.ConstraintLayout>";
public static final String implictjava = "package com.example.javadevelopementapp.ImplictIntent;\n" +
        "\n" +
        "import android.content.Intent;\n" +
        "import android.net.Uri;\n" +
        "import android.os.Bundle;\n" +
        "import android.view.View;\n" +
        "import android.widget.Button;\n" +
        "import android.widget.EditText;\n" +
        "\n" +
        "import androidx.appcompat.app.AppCompatActivity;\n" +
        "\n" +
        "import com.example.javadevelopementapp.R;\n" +
        "\n" +
        "public class EmplictOutput extends AppCompatActivity {\n" +
        "    EditText editText;\n" +
        "    Button button;\n" +
        "\n" +
        "    @Override\n" +
        "    protected void onCreate(Bundle savedInstanceState) {\n" +
        "        super.onCreate(savedInstanceState);\n" +
        "        setContentView(R.layout.activity_emplict_output);\n" +
        "        editText = findViewById(R.id.editTextTextPersonName3);\n" +
        "        button = findViewById(R.id.button3search);\n" +
        "        button.setOnClickListener(new View.OnClickListener() {\n" +
        "            @Override\n" +
        "            public void onClick(View view) {\n" +
        "                String searchEdit = editText.getText().toString();\n" +
        "                Intent intent = new Intent(Intent.ACTION_VIEW);\n" +
        "                intent.setData(Uri.parse(\"https://\" + searchEdit + \".com\"));\n" +
        "                startActivity(intent);\n" +
        "\n" +
        "            }\n" +
        "        });\n" +
        "    }\n" +
        "}";
public static final String implictxml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
        "    android:layout_width=\"match_parent\"\n" +
        "    android:layout_height=\"match_parent\"\n" +
        "    tools:context=\".ImplictIntent.EmplictOutput\">\n" +
        "\n" +
        "    <EditText\n" +
        "        android:id=\"@+id/editTextTextPersonName3\"\n" +
        "        android:layout_width=\"wrap_content\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:layout_marginTop=\"332dp\"\n" +
        "        android:ems=\"10\"\n" +
        "        android:inputType=\"textPersonName\"\n" +
        "        android:hint=\"Search Url\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "        app:layout_constraintHorizontal_bias=\"0.497\"\n" +
        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
        "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
        "\n" +
        "    <Button\n" +
        "        android:id=\"@+id/button3search\"\n" +
        "        android:layout_width=\"wrap_content\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:text=\"Search\"\n" +
        "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"@+id/editTextTextPersonName3\"\n" +
        "        app:layout_constraintStart_toStartOf=\"@+id/editTextTextPersonName3\"\n" +
        "        app:layout_constraintTop_toBottomOf=\"@+id/editTextTextPersonName3\"\n" +
        "        app:layout_constraintVertical_bias=\"0.271\" />\n" +
        "</androidx.constraintlayout.widget.ConstraintLayout>";


public static final String shareJava = "package com.example.javadevelopementapp.shareActivity;\n" +
        "\n" +
        "import android.content.Intent;\n" +
        "import android.os.Bundle;\n" +
        "import android.view.View;\n" +
        "import android.widget.TextView;\n" +
        "import android.widget.Toast;\n" +
        "\n" +
        "import androidx.appcompat.app.AppCompatActivity;\n" +
        "\n" +
        "import com.example.javadevelopementapp.R;\n" +
        "\n" +
        "public class shareOutput extends AppCompatActivity {\n" +
        "\n" +
        "    String shayari = \"जिसे कोयल समझा वो कौवा निकला,\\n\" +\n" +
        "            \"दोस्ती के नाम पर हौवा निकला,\\n\" +\n" +
        "            \"जो रोकते थे हमें शराब पीने से,\\n\" +\n" +
        "            \"आज उन्हीं की जेब में पौवा निकला।\";\n" +
        "\n" +
        "    @Override\n" +
        "    protected void onCreate(Bundle savedInstanceState) {\n" +
        "        super.onCreate(savedInstanceState);\n" +
        "        setContentView(R.layout.activity_share_output);\n" +
        "    }\n" +
        "\n" +
        "    public void shareText(View view) {\n" +
        "        Intent whatsappIntent = new Intent(Intent.ACTION_SEND);\n" +
        "        whatsappIntent.setType(\"text/plain\");\n" +
        "        whatsappIntent.setPackage(\"com.whatsapp\");\n" +
        "        whatsappIntent.putExtra(Intent.EXTRA_TEXT, shayari);\n" +
        "        try {\n" +
        "            startActivity(whatsappIntent);\n" +
        "        } catch (android.content.ActivityNotFoundException ex) {\n" +
        "            Toast.makeText(this, \"WhatsApp not installed\" + ex.getMessage(), Toast.LENGTH_SHORT).show();\n" +
        "        }\n" +
        "    }\n" +
        "}";
public static final String shareXml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
        "    android:layout_width=\"match_parent\"\n" +
        "    android:layout_height=\"match_parent\"\n" +
        "    tools:context=\".shareActivity.shareOutput\">\n" +
        "\n" +
        "    <androidx.cardview.widget.CardView\n" +
        "        android:id=\"@+id/cardView3\"\n" +
        "        android:layout_width=\"0dp\"\n" +
        "        android:layout_height=\"300dp\"\n" +
        "        android:layout_margin=\"15dp\"\n" +
        "        android:layout_marginStart=\"14dp\"\n" +
        "        android:layout_marginEnd=\"14dp\"\n" +
        "        app:cardCornerRadius=\"10dp\"\n" +
        "        app:cardElevation=\"5dp\"\n" +
        "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "        app:layout_constraintHorizontal_bias=\"0.0\"\n" +
        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
        "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
        "        app:layout_constraintVertical_bias=\"0.132\">\n" +
        "\n" +
        "        <TextView\n" +
        "            android:id=\"@+id/textshayari\"\n" +
        "            android:layout_width=\"match_parent\"\n" +
        "            android:layout_height=\"match_parent\"\n" +
        "            android:layout_margin=\"10dp\"\n" +
        "            android:text=\"जिसे कोयल समझा वो कौवा निकला,\n" +
        "दोस्ती के नाम पर हौवा निकला,\n" +
        "जो रोकते थे हमें शराब पीने से,\n" +
        "आज उन्हीं की जेब में पौवा निकला।\"\n" +
        "            android:textSize=\"22sp\">\n" +
        "\n" +
        "        </TextView>\n" +
        "    </androidx.cardview.widget.CardView>\n" +
        "\n" +
        "    <Button\n" +
        "        android:id=\"@+id/shareBtn\"\n" +
        "        android:layout_width=\"wrap_content\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:text=\"Share\"\n" +
        "        android:onClick=\"shareText\"\n" +
        "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"@+id/cardView3\"\n" +
        "        app:layout_constraintHorizontal_bias=\"0.496\"\n" +
        "        app:layout_constraintStart_toStartOf=\"@+id/cardView3\"\n" +
        "        app:layout_constraintTop_toBottomOf=\"@+id/cardView3\" />\n" +
        "</androidx.constraintlayout.widget.ConstraintLayout>";
public static final String email_java = "package com.example.javadevelopementapp.emailActivity;\n" +
        "\n" +
        "import android.content.Intent;\n" +
        "import android.net.Uri;\n" +
        "import android.os.Bundle;\n" +
        "import android.view.View;\n" +
        "\n" +
        "import androidx.appcompat.app.AppCompatActivity;\n" +
        "\n" +
        "import com.example.javadevelopementapp.R;\n" +
        "\n" +
        "public class EmailOutput extends AppCompatActivity {\n" +
        "\n" +
        "\n" +
        "    @Override\n" +
        "    protected void onCreate(Bundle savedInstanceState) {\n" +
        "        super.onCreate(savedInstanceState);\n" +
        "        setContentView(R.layout.activity_email_output);\n" +
        "    }\n" +
        "\n" +
        "    public void emailSend(View view) {\n" +
        "        Intent email = new Intent(Intent.ACTION_SEND);\n" +
        "        email.setData(Uri.parse(\"Email\"));\n" +
        "        String[] mail = {\"akp97583757@gmail.com\", \"akp97583757@gmail.com\"};\n" +
        "        email.putExtra(Intent.EXTRA_EMAIL, mail);\n" +
        "        email.putExtra(Intent.EXTRA_SUBJECT, \"Enter suject here\");\n" +
        "        email.putExtra(Intent.EXTRA_TEXT, \"Enter text here\");\n" +
        "        email.setType(\"message/rfc822\");\n" +
        "        Intent intent = Intent.createChooser(email, \"start Email\");\n" +
        "        startActivity(intent);\n" +
        "    }\n" +
        "}";
public static final String email_xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
        "    android:layout_width=\"match_parent\"\n" +
        "    android:layout_height=\"match_parent\"\n" +
        "    tools:context=\".emailActivity.EmailOutput\">\n" +
        "\n" +
        "\n" +
        "    <Button\n" +
        "        android:id=\"@+id/button3\"\n" +
        "        android:layout_width=\"wrap_content\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:text=\"Send Email\"\n" +
        "        android:onClick=\"emailSend\"\n" +
        "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
        "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
        "</androidx.constraintlayout.widget.ConstraintLayout>";
public static final String sendWhatsappJava  = "package com.example.javadevelopementapp.whatsappActivity;\n" +
        "\n" +
        "import androidx.appcompat.app.AppCompatActivity;\n" +
        "\n" +
        "import android.content.Intent;\n" +
        "import android.os.Bundle;\n" +
        "import android.view.View;\n" +
        "import android.widget.EditText;\n" +
        "\n" +
        "import com.example.javadevelopementapp.R;\n" +
        "\n" +
        "public class whatsappOutput extends AppCompatActivity {\n" +
        "    EditText editText;\n" +
        "    @Override\n" +
        "    protected void onCreate(Bundle savedInstanceState) {\n" +
        "        super.onCreate(savedInstanceState);\n" +
        "        setContentView(R.layout.activity_whatsapp_output);\n" +
        "        editText = findViewById(R.id.editTextTextPersonName4);\n" +
        "    }\n" +
        "    public void sendWhatsapp(View view) {\n" +
        "    String text = editText.getText().toString();\n" +
        "        Intent waIntent = new Intent(Intent.ACTION_SEND);\n" +
        "        waIntent.setType(\"text/plain\");\n" +
        "        waIntent.setPackage(\"com.whatsapp\");\n" +
        "        waIntent.putExtra(Intent.EXTRA_TEXT, text);\n" +
        "        startActivity(Intent.createChooser(waIntent, \"Share with\"));\n" +
        "    }\n" +
        "}";
public static final String sendWhatsappxml  = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
        "    android:layout_width=\"match_parent\"\n" +
        "    android:layout_height=\"match_parent\"\n" +
        "    tools:context=\".whatsappActivity.whatsappOutput\">\n" +
        "\n" +
        "\n" +
        "    <EditText\n" +
        "        android:id=\"@+id/editTextTextPersonName4\"\n" +
        "        android:layout_width=\"wrap_content\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:ems=\"10\"\n" +
        "        android:inputType=\"textPersonName\"\n" +
        "        android:hint=\"Enter any text\"\n" +
        "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "        app:layout_constraintHorizontal_bias=\"0.497\"\n" +
        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
        "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
        "        app:layout_constraintVertical_bias=\"0.393\" />\n" +
        "\n" +
        "    <Button\n" +
        "        android:id=\"@+id/button4\"\n" +
        "        android:layout_width=\"wrap_content\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:text=\"Send Whatsapp\"\n" +
        "        android:onClick=\"sendWhatsapp\"\n" +
        "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"@+id/editTextTextPersonName4\"\n" +
        "        app:layout_constraintStart_toStartOf=\"@+id/editTextTextPersonName4\"\n" +
        "        app:layout_constraintTop_toBottomOf=\"@+id/editTextTextPersonName4\" />\n" +
        "</androidx.constraintlayout.widget.ConstraintLayout>";
public static final String copytextJava  = "package com.example.javadevelopementapp.copyActivity;\n" +
        "\n" +
        "import androidx.appcompat.app.AppCompatActivity;\n" +
        "\n" +
        "import android.content.ClipData;\n" +
        "import android.content.ClipboardManager;\n" +
        "import android.content.Context;\n" +
        "import android.os.Bundle;\n" +
        "import android.view.View;\n" +
        "import android.widget.EditText;\n" +
        "\n" +
        "import com.example.javadevelopementapp.R;\n" +
        "\n" +
        "public class copyOutput extends AppCompatActivity {\n" +
        "EditText editText;\n" +
        "    @Override\n" +
        "    protected void onCreate(Bundle savedInstanceState) {\n" +
        "        super.onCreate(savedInstanceState);\n" +
        "        setContentView(R.layout.activity_copy_output);\n" +
        "        editText = findViewById(R.id.copyEditTExt);\n" +
        "    }\n" +
        "    public void copyText(View view) {\n" +
        "        String edit = editText.getText().toString();\n" +
        "        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);\n" +
        "        ClipData clip = ClipData.newPlainText(\"Copied Text\",edit);\n" +
        "        clipboard.setPrimaryClip(clip);\n" +
        "    }\n" +
        "}";
public static final String copytextxml  = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
        "    android:layout_width=\"match_parent\"\n" +
        "    android:layout_height=\"match_parent\"\n" +
        "    tools:context=\".copyActivity.copyOutput\">\n" +
        "\n" +
        "    <EditText\n" +
        "        android:id=\"@+id/copyEditTExt\"\n" +
        "        android:layout_width=\"wrap_content\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:layout_marginTop=\"324dp\"\n" +
        "        android:ems=\"10\"\n" +
        "        android:inputType=\"textPersonName\"\n" +
        "        android:hint=\"Enter text for copy\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "        app:layout_constraintHorizontal_bias=\"0.497\"\n" +
        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
        "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
        "\n" +
        "    <Button\n" +
        "        android:id=\"@+id/copyBtn\"\n" +
        "        android:layout_width=\"wrap_content\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:layout_marginTop=\"8dp\"\n" +
        "        android:text=\"Copy Text\"\n" +
        "        android:onClick=\"copyText\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"@+id/copyEditTExt\"\n" +
        "        app:layout_constraintStart_toStartOf=\"@+id/copyEditTExt\"\n" +
        "        app:layout_constraintTop_toBottomOf=\"@+id/copyEditTExt\" />\n" +
        "</androidx.constraintlayout.widget.ConstraintLayout>";
public static final String contentMenuJava  = "package com.example.javadevelopementapp.ContentMenu;\n" +
        "\n" +
        "import android.os.Bundle;\n" +
        "import android.view.ContextMenu;\n" +
        "import android.view.MenuItem;\n" +
        "import android.view.View;\n" +
        "import android.widget.ArrayAdapter;\n" +
        "import android.widget.ListView;\n" +
        "import android.widget.Toast;\n" +
        "\n" +
        "import androidx.annotation.NonNull;\n" +
        "import androidx.appcompat.app.AppCompatActivity;\n" +
        "\n" +
        "import com.example.javadevelopementapp.R;\n" +
        "\n" +
        "public class ContentMenuOutput extends AppCompatActivity {\n" +
        "    ListView listView;\n" +
        "    String listItems[] = {\"First item\", \"second item\", \"Third item\", \"Fourth item\", \"fifth item\"};\n" +
        "\n" +
        "    @Override\n" +
        "    protected void onCreate(Bundle savedInstanceState) {\n" +
        "        super.onCreate(savedInstanceState);\n" +
        "        setContentView(R.layout.activity_popup_menu_output);\n" +
        "\n" +
        "        listView = findViewById(R.id.listview);\n" +
        "        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, listItems);\n" +
        "        listView.setAdapter(arrayAdapter);\n" +
        "        registerForContextMenu(listView);\n" +
        "\n" +
        "    }\n" +
        "\n" +
        "    @Override\n" +
        "    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {\n" +
        "        super.onCreateContextMenu(menu, v, menuInfo);\n" +
        "        menu.setHeaderTitle(\"Please select any Menu\");\n" +
        "        menu.add(0, v.getId(), 0, \"item 1\");\n" +
        "        menu.add(0, v.getId(), 0, \"item 2\");\n" +
        "        menu.add(0, v.getId(), 0, \"item 3\");\n" +
        "        menu.add(0, v.getId(), 0, \"item 4\");\n" +
        "    }\n" +
        "\n" +
        "    @Override\n" +
        "    public boolean onContextItemSelected(@NonNull MenuItem item) {\n" +
        "        if (item.getTitle() == \"item 1\") {\n" +
        "            Toast.makeText(this, \"Item 1 Selected\", Toast.LENGTH_SHORT).show();\n" +
        "        } else if (item.getTitle() == \"item 2\") {\n" +
        "            Toast.makeText(this, \"Item 2 Selected\", Toast.LENGTH_SHORT).show();\n" +
        "\n" +
        "        } else if (item.getTitle() == \"item 3\") {\n" +
        "            Toast.makeText(this, \"Item 3 Selected\", Toast.LENGTH_SHORT).show();\n" +
        "\n" +
        "        } else if (item.getTitle() == \"item 4\") {\n" +
        "            Toast.makeText(this, \"Item 4 Selected\", Toast.LENGTH_SHORT).show();\n" +
        "\n" +
        "        } else {\n" +
        "            return false;\n" +
        "        }\n" +
        "\n" +
        "        return true;\n" +
        "\n" +
        "    }\n" +
        "}\n";
public static final String contentMenuXml  = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
        "    android:layout_width=\"match_parent\"\n" +
        "    android:layout_height=\"match_parent\"\n" +
        "    tools:context=\".ContentMenu.ContentMenuOutput\">\n" +
        "\n" +
        "    <TextView\n" +
        "        android:id=\"@+id/textView3\"\n" +
        "        android:layout_width=\"match_parent\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:layout_marginTop=\"188dp\"\n" +
        "        android:gravity=\"center\"\n" +
        "        android:text=\"Long press any Menu list\"\n" +
        "        android:textColor=\"@color/black\"\n" +
        "        android:textSize=\"25sp\"\n" +
        "        android:textStyle=\"bold\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "        app:layout_constraintHorizontal_bias=\"0.0\"\n" +
        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
        "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
        "\n" +
        "    <ListView\n" +
        "        android:id=\"@+id/listview\"\n" +
        "        android:layout_width=\"match_parent\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:layout_margin=\"15dp\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"@+id/textView3\"\n" +
        "        app:layout_constraintStart_toStartOf=\"@+id/textView3\"\n" +
        "        app:layout_constraintTop_toBottomOf=\"@+id/textView3\" />\n" +
        "\n" +
        "</androidx.constraintlayout.widget.ConstraintLayout>";
public static final String textToSpeechJava  = "package com.example.javadevelopementapp.T_speech_to_text;\n" +
        "\n" +
        "import androidx.appcompat.app.AppCompatActivity;\n" +
        "import androidx.recyclerview.widget.LinearLayoutManager;\n" +
        "import androidx.recyclerview.widget.RecyclerView;\n" +
        "\n" +
        "import android.content.Intent;\n" +
        "import android.os.Bundle;\n" +
        "import android.view.View;\n" +
        "\n" +
        "import com.example.javadevelopementapp.Adapters.ButtonAdapters;\n" +
        "import com.example.javadevelopementapp.Adapters.text_To_speechAdapter;\n" +
        "import com.example.javadevelopementapp.ButtonDirectory.ButtonOutput;\n" +
        "import com.example.javadevelopementapp.Models.Model_Detail;\n" +
        "import com.example.javadevelopementapp.R;\n" +
        "\n" +
        "import java.util.ArrayList;\n" +
        "\n" +
        "public class textToSpeechRecyclerview extends AppCompatActivity {\n" +
        "\n" +
        "    RecyclerView recyclerView;\n" +
        "\n" +
        "    @Override\n" +
        "    protected void onCreate(Bundle savedInstanceState) {\n" +
        "        super.onCreate(savedInstanceState);\n" +
        "        setContentView(R.layout.activity_take_text_to_speech_recyclerview);\n" +
        "        getSupportActionBar().hide();\n" +
        "\n" +
        "        recyclerView = findViewById(R.id.recycleviewItems);\n" +
        "        recyclerView.setLayoutManager(new LinearLayoutManager(this));\n" +
        "        recyclerView.setHasFixedSize(true);\n" +
        "        ArrayList<Model_Detail> arrayList = new ArrayList<>();\n" +
        "        text_To_speechAdapter detailAdapters= new text_To_speechAdapter(getApplicationContext(),arrayList);\n" +
        "\n" +
        "        arrayList.add(new Model_Detail(\"Manifest\"));\n" +
        "        arrayList.add(new Model_Detail(\"MainActivity.class\"));\n" +
        "        arrayList.add(new Model_Detail(\"Actvity_main.xml\"));\n" +
        "        arrayList.add(new Model_Detail(\"build Gradle\"));\n" +
        "        recyclerView.setAdapter(detailAdapters);\n" +
        "    }\n" +
        "\n" +
        "    public void outPutActivity(View view) {\n" +
        "        startActivity(new Intent(this, text_to_speech_output.class));\n" +
        "    }\n" +
        "}";
public static final String textToSpeechXml  = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
        "    android:layout_width=\"match_parent\"\n" +
        "    android:layout_height=\"match_parent\"\n" +
        "    tools:context=\".T_speech_to_text.text_to_speech_output\">\n" +
        "\n" +
        "\n" +
        "    <EditText\n" +
        "        android:id=\"@+id/textToSpeechEditText\"\n" +
        "        android:layout_width=\"wrap_content\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:layout_marginTop=\"240dp\"\n" +
        "        android:ems=\"10\"\n" +
        "        android:inputType=\"textPersonName\"\n" +
        "        android:text=\"Name\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
        "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
        "\n" +
        "    <Button\n" +
        "        android:id=\"@+id/Speechbtn\"\n" +
        "        android:layout_width=\"wrap_content\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:layout_marginTop=\"16dp\"\n" +
        "        android:text=\"Speech\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"@+id/textToSpeechEditText\"\n" +
        "        app:layout_constraintStart_toStartOf=\"@+id/textToSpeechEditText\"\n" +
        "        app:layout_constraintTop_toBottomOf=\"@+id/textToSpeechEditText\" />\n" +
        "</androidx.constraintlayout.widget.ConstraintLayout>";
 public static final String takePhotoJava  = "package com.example.javadevelopementapp.T_take_photo;\n" +
         "\n" +
         "import android.Manifest;\n" +
         "import android.app.Activity;\n" +
         "import android.content.Intent;\n" +
         "import android.content.pm.PackageManager;\n" +
         "import android.graphics.Bitmap;\n" +
         "import android.os.Build;\n" +
         "import android.os.Bundle;\n" +
         "import android.provider.MediaStore;\n" +
         "import android.view.View;\n" +
         "import android.widget.Button;\n" +
         "import android.widget.ImageView;\n" +
         "import android.widget.Toast;\n" +
         "\n" +
         "import androidx.annotation.NonNull;\n" +
         "import androidx.annotation.Nullable;\n" +
         "import androidx.appcompat.app.AppCompatActivity;\n" +
         "\n" +
         "import com.example.javadevelopementapp.R;\n" +
         "\n" +
         "public class take_photo_output extends AppCompatActivity {\n" +
         "    ImageView imageView;\n" +
         "    Button button;\n" +
         "    private static final int CAMERA_REQUEST = 1888;\n" +
         "    private static final int MY_CAMERA_PERMISSION_CODE = 100;\n" +
         "\n" +
         "    @Override\n" +
         "    protected void onCreate(Bundle savedInstanceState) {\n" +
         "        super.onCreate(savedInstanceState);\n" +
         "        setContentView(R.layout.activity_take_photo_output);\n" +
         "        imageView = findViewById(R.id.takePhotoImage);\n" +
         "        button = findViewById(R.id.takePhotoButton);\n" +
         "        button.setOnClickListener(new View.OnClickListener() {\n" +
         "            @Override\n" +
         "            public void onClick(View view) {\n" +
         "                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {\n" +
         "                    if (checkSelfPermission(Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {\n" +
         "                        requestPermissions(new String[]{Manifest.permission.CAMERA}, MY_CAMERA_PERMISSION_CODE);\n" +
         "                    } else {\n" +
         "                        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);\n" +
         "                        startActivityForResult(cameraIntent, CAMERA_REQUEST);\n" +
         "                    }\n" +
         "                }\n" +
         "            }\n" +
         "        });\n" +
         "\n" +
         "    }\n" +
         "\n" +
         "    @Override\n" +
         "    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {\n" +
         "        super.onRequestPermissionsResult(requestCode, permissions, grantResults);\n" +
         "        if (requestCode == MY_CAMERA_PERMISSION_CODE) {\n" +
         "            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {\n" +
         "                Toast.makeText(this, \"camera permission granted\", Toast.LENGTH_LONG).show();\n" +
         "                Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);\n" +
         "                startActivityForResult(cameraIntent, CAMERA_REQUEST);\n" +
         "            } else {\n" +
         "                Toast.makeText(this, \"camera permission denied\", Toast.LENGTH_LONG).show();\n" +
         "            }\n" +
         "        }\n" +
         "    }\n" +
         "\n" +
         "    @Override\n" +
         "    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {\n" +
         "        super.onActivityResult(requestCode, resultCode, data);\n" +
         "        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {\n" +
         "            Bitmap photo = (Bitmap) data.getExtras().get(\"data\");\n" +
         "            imageView.setImageBitmap(photo);\n" +
         "        }\n" +
         "    }\n" +
         "}";
 public static final String takePhotoxml  = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
         "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
         "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
         "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
         "    android:layout_width=\"match_parent\"\n" +
         "    android:layout_height=\"match_parent\"\n" +
         "    tools:context=\".T_take_photo.take_photo_output\">\n" +
         "\n" +
         "    <ImageView\n" +
         "        android:id=\"@+id/takePhotoImage\"\n" +
         "        android:layout_width=\"match_parent\"\n" +
         "        android:layout_height=\"500dp\"\n" +
         "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
         "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
         "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
         "\n" +
         "    <Button\n" +
         "        android:id=\"@+id/takePhotoButton\"\n" +
         "        android:layout_width=\"match_parent\"\n" +
         "        android:layout_height=\"wrap_content\"\n" +
         "        android:text=\"Take Photo\"\n" +
         "        android:layout_marginTop=\"10dp\"\n" +
         "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
         "        app:layout_constraintStart_toStartOf=\"@+id/takePhotoImage\"\n" +
         "        app:layout_constraintTop_toBottomOf=\"@+id/takePhotoImage\" />\n" +
         "\n" +
         "</androidx.constraintlayout.widget.ConstraintLayout>";
public static final String videoViewJava = "package com.example.javadevelopementapp.T_take_video;\n" +
        "\n" +
        "import android.Manifest;\n" +
        "import android.app.Activity;\n" +
        "import android.content.Intent;\n" +
        "import android.content.pm.PackageManager;\n" +
        "import android.graphics.Bitmap;\n" +
        "import android.net.Uri;\n" +
        "import android.os.Build;\n" +
        "import android.os.Bundle;\n" +
        "import android.provider.MediaStore;\n" +
        "import android.view.View;\n" +
        "import android.widget.Button;\n" +
        "import android.widget.MediaController;\n" +
        "import android.widget.Toast;\n" +
        "import android.widget.VideoView;\n" +
        "\n" +
        "import androidx.annotation.NonNull;\n" +
        "import androidx.annotation.Nullable;\n" +
        "import androidx.appcompat.app.AppCompatActivity;\n" +
        "\n" +
        "import com.example.javadevelopementapp.R;\n" +
        "\n" +
        "public class take_video_output extends AppCompatActivity {\n" +
        "    VideoView videoView;\n" +
        "    Button button;\n" +
        "    private static final int CAMERA_REQUEST = 1888;\n" +
        "    private static final int MY_CAMERA_PERMISSION_CODE = 100;\n" +
        "\n" +
        "    @Override\n" +
        "    protected void onCreate(Bundle savedInstanceState) {\n" +
        "        super.onCreate(savedInstanceState);\n" +
        "        setContentView(R.layout.activity_take_video_output);\n" +
        "        videoView = findViewById(R.id.takeVideo);\n" +
        "        button = findViewById(R.id.takeVideoButton);\n" +
        "        button.setOnClickListener(new View.OnClickListener() {\n" +
        "            @Override\n" +
        "            public void onClick(View view) {\n" +
        "                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {\n" +
        "                    if (checkSelfPermission(Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED)\n" +
        "                    {\n" +
        "                        requestPermissions(new String[]{Manifest.permission.CAMERA}, MY_CAMERA_PERMISSION_CODE);\n" +
        "                    }\n" +
        "                    else\n" +
        "                    {\n" +
        "                        Intent cameraIntent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);\n" +
        "                        startActivityForResult(cameraIntent, CAMERA_REQUEST);\n" +
        "                    }\n" +
        "                }\n" +
        "            }\n" +
        "        });\n" +
        "\n" +
        "    }\n" +
        "\n" +
        "    @Override\n" +
        "    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {\n" +
        "        super.onRequestPermissionsResult(requestCode, permissions, grantResults);\n" +
        "        if (requestCode == MY_CAMERA_PERMISSION_CODE)\n" +
        "        {\n" +
        "            if (grantResults[0] == PackageManager.PERMISSION_GRANTED)\n" +
        "            {\n" +
        "                Toast.makeText(this, \"camera permission granted\", Toast.LENGTH_LONG).show();\n" +
        "                Intent cameraIntent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);\n" +
        "                startActivityForResult(cameraIntent, CAMERA_REQUEST);\n" +
        "            }\n" +
        "            else\n" +
        "            {\n" +
        "                Toast.makeText(this, \"camera permission denied\", Toast.LENGTH_LONG).show();\n" +
        "            }\n" +
        "        }\n" +
        "    }\n" +
        "\n" +
        "    @Override\n" +
        "    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {\n" +
        "        super.onActivityResult(requestCode, resultCode, data);\n" +
        "        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK)\n" +
        "        {\n" +
        "            Uri uri = data.getData();\n" +
        "           videoView.setVideoURI(uri);\n" +
        "           videoView.setMediaController(new MediaController(getApplicationContext()));\n" +
        "           videoView.requestFocus();\n" +
        "           videoView.start();\n" +
        "        }\n" +
        "    }\n" +
        "}";
public static final String videoViewXml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
        "    android:layout_width=\"match_parent\"\n" +
        "    android:layout_height=\"match_parent\"\n" +
        "    tools:context=\".T_take_video.take_video_output\">\n" +
        "\n" +
        "    <VideoView\n" +
        "        android:id=\"@+id/takeVideo\"\n" +
        "        android:layout_width=\"match_parent\"\n" +
        "        android:layout_height=\"500dp\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
        "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
        "\n" +
        "    <Button\n" +
        "        android:id=\"@+id/takeVideoButton\"\n" +
        "        android:layout_width=\"match_parent\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:text=\"Take Video\"\n" +
        "        android:layout_marginTop=\"10dp\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "        app:layout_constraintStart_toStartOf=\"@+id/takeVideo\"\n" +
        "        app:layout_constraintTop_toBottomOf=\"@+id/takeVideo\" />\n" +
        "\n" +
        "</androidx.constraintlayout.widget.ConstraintLayout>";
public static final String sqlitedatabaseXml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
        "    android:layout_width=\"match_parent\"\n" +
        "    android:layout_height=\"match_parent\"\n" +
        "    tools:context=\".sqliteDatabase.sqliteDatbaseOutput\">\n" +
        "\n" +
        "    <LinearLayout\n" +
        "        android:id=\"@+id/linearLayout2\"\n" +
        "        android:layout_width=\"match_parent\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:orientation=\"vertical\"\n" +
        "        android:layout_marginTop=\"100dp\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
        "        app:layout_constraintTop_toTopOf=\"parent\">\n" +
        "\n" +
        "        <EditText\n" +
        "            android:id=\"@+id/sqliteId\"\n" +
        "            android:layout_width=\"match_parent\"\n" +
        "            android:layout_height=\"wrap_content\"\n" +
        "            android:hint=\"Enter Id\" />\n" +
        "\n" +
        "        <EditText\n" +
        "            android:id=\"@+id/sqliteName\"\n" +
        "            android:layout_width=\"match_parent\"\n" +
        "            android:layout_height=\"wrap_content\"\n" +
        "            android:hint=\"Enter name\" />\n" +
        "\n" +
        "        <EditText\n" +
        "            android:id=\"@+id/sqlitevillage\"\n" +
        "            android:layout_width=\"match_parent\"\n" +
        "            android:layout_height=\"wrap_content\"\n" +
        "            android:hint=\"Enter Village\" />\n" +
        "\n" +
        "        <EditText\n" +
        "            android:id=\"@+id/sqlitepost\"\n" +
        "            android:layout_width=\"match_parent\"\n" +
        "            android:layout_height=\"wrap_content\"\n" +
        "            android:hint=\"Enter Post\" />\n" +
        "    </LinearLayout>\n" +
        "\n" +
        "    <LinearLayout\n" +
        "        android:layout_marginTop=\"10dp\"\n" +
        "        android:layout_width=\"match_parent\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:orientation=\"vertical\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "        app:layout_constraintStart_toStartOf=\"@+id/linearLayout2\"\n" +
        "        app:layout_constraintTop_toBottomOf=\"@+id/linearLayout2\">\n" +
        "\n" +
        "        <LinearLayout\n" +
        "            android:layout_width=\"match_parent\"\n" +
        "            android:layout_height=\"wrap_content\"\n" +
        "            android:orientation=\"horizontal\"\n" +
        "            android:weightSum=\"2\">\n" +
        "\n" +
        "            <Button\n" +
        "                android:id=\"@+id/insertData\"\n" +
        "                android:layout_width=\"match_parent\"\n" +
        "                android:layout_height=\"wrap_content\"\n" +
        "                android:layout_marginLeft=\"5dp\"\n" +
        "                android:layout_marginRight=\"5dp\"\n" +
        "                android:layout_weight=\"1\"\n" +
        "                android:text=\"Insert\" />\n" +
        "\n" +
        "            <Button\n" +
        "                android:id=\"@+id/updateData\"\n" +
        "                android:layout_width=\"match_parent\"\n" +
        "                android:layout_height=\"wrap_content\"\n" +
        "                android:layout_marginLeft=\"5dp\"\n" +
        "                android:layout_marginRight=\"5dp\"\n" +
        "                android:layout_weight=\"1\"\n" +
        "                android:text=\"Update\" />\n" +
        "        </LinearLayout>\n" +
        "\n" +
        "        <LinearLayout\n" +
        "            android:layout_width=\"match_parent\"\n" +
        "            android:layout_height=\"wrap_content\"\n" +
        "            android:orientation=\"horizontal\"\n" +
        "            android:weightSum=\"2\">\n" +
        "\n" +
        "            <Button\n" +
        "                android:id=\"@+id/deleteData\"\n" +
        "                android:layout_width=\"match_parent\"\n" +
        "                android:layout_height=\"wrap_content\"\n" +
        "                android:layout_marginLeft=\"5dp\"\n" +
        "                android:layout_marginRight=\"5dp\"\n" +
        "                android:layout_weight=\"1\"\n" +
        "                android:text=\"Delete\" />\n" +
        "\n" +
        "            <Button\n" +
        "                android:id=\"@+id/readData\"\n" +
        "                android:layout_width=\"match_parent\"\n" +
        "                android:layout_height=\"wrap_content\"\n" +
        "                android:layout_marginLeft=\"5dp\"\n" +
        "                android:layout_marginRight=\"5dp\"\n" +
        "                android:layout_weight=\"1\"\n" +
        "                android:text=\"Read\" />\n" +
        "        </LinearLayout>\n" +
        "    </LinearLayout>\n" +
        "\n" +
        "</androidx.constraintlayout.widget.ConstraintLayout>";
public static final String sqlitedatabaseOpenHelper = "package com.example.javadevelopementapp.sqliteDatabase;\n" +
        "\n" +
        "import android.content.ContentValues;\n" +
        "import android.content.Context;\n" +
        "import android.database.Cursor;\n" +
        "import android.database.sqlite.SQLiteDatabase;\n" +
        "import android.database.sqlite.SQLiteOpenHelper;\n" +
        "\n" +
        "public class sqliteDatabaseOpenHelper extends SQLiteOpenHelper {\n" +
        "    public sqliteDatabaseOpenHelper(Context context) {\n" +
        "        super(context, \"student.db\", null, 1);\n" +
        "    }\n" +
        "\n" +
        "    @Override\n" +
        "    public void onCreate(SQLiteDatabase sqLiteDatabase) {\n" +
        "        sqLiteDatabase.execSQL(\"create table student_table(id interger primary key, name, text , vill text, post text)\");\n" +
        "    }\n" +
        "\n" +
        "    @Override\n" +
        "    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {\n" +
        "        sqLiteDatabase.execSQL(\"DROP TABLE IF EXISTS student_table\");\n" +
        "        onCreate(sqLiteDatabase);\n" +
        "    }\n" +
        "\n" +
        "    public String insertOurData(int id, String name, String vill, String post) {\n" +
        "        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();\n" +
        "        ContentValues contentValues = new ContentValues();\n" +
        "        contentValues.put(\"id\", id);\n" +
        "        contentValues.put(\"name\", name);\n" +
        "        contentValues.put(\"vill\", vill);\n" +
        "        contentValues.put(\"post\", post);\n" +
        "\n" +
        "        float res = sqLiteDatabase.insert(\"student_table\", null, contentValues);\n" +
        "        if (res == 1) {\n" +
        "            return \"Inserted\";\n" +
        "        } else {\n" +
        "            return \"Failed\";\n" +
        "        }\n" +
        "\n" +
        "    }\n" +
        "    public Cursor getData(){\n" +
        "        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();\n" +
        "        Cursor res = sqLiteDatabase.rawQuery(\"select * from akashtbl\",null);\n" +
        "        return res;\n" +
        "    }\n" +
        "    public String updateData(String  id, String name, String vill, String post) {\n" +
        "        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();\n" +
        "        ContentValues contentValues = new ContentValues();\n" +
        "        contentValues.put(\"id\", id);\n" +
        "        contentValues.put(\"name\", name);\n" +
        "        contentValues.put(\"vill\", vill);\n" +
        "        contentValues.put(\"post\", post);\n" +
        "\n" +
        "        \n" +
        "        float res = sqLiteDatabase.update(\"akashtbl\",contentValues,\"id = ?\",new String[]{id});\n" +
        "\n" +
        "        if (res == 1) {\n" +
        "            return \"Update\";\n" +
        "        } else {\n" +
        "            return \"Failed\";\n" +
        "        }\n" +
        "\n" +
        "    }\n" +
        "    \n" +
        "    public Integer deleteDatai(String id){\n" +
        "        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();\n" +
        "        return sqLiteDatabase.delete(\"akashtbl\",\"id = ?\",new String[]{id});\n" +
        "    }\n" +
        "    \n" +
        "}\n";
public static final String sqliteDatabasemainJava = "package com.example.javadevelopementapp.sqliteDatabase;\n" +
        "\n" +
        "import android.os.Bundle;\n" +
        "import android.view.View;\n" +
        "import android.widget.Button;\n" +
        "import android.widget.EditText;\n" +
        "import android.widget.Toast;\n" +
        "\n" +
        "import androidx.appcompat.app.AppCompatActivity;\n" +
        "\n" +
        "import com.example.javadevelopementapp.R;\n" +
        "\n" +
        "public class sqliteDatbaseOutput extends AppCompatActivity implements View.OnClickListener {\n" +
        "    EditText id, name, village, post;\n" +
        "    Button insert, delete, update, read;\n" +
        "    sqliteDatabaseOpenHelper sqliteDatabaseOpenHelper;\n" +
        "\n" +
        "    @Override\n" +
        "    protected void onCreate(Bundle savedInstanceState) {\n" +
        "        super.onCreate(savedInstanceState);\n" +
        "        setContentView(R.layout.activity_sqlite_datbase_output);\n" +
        "\n" +
        "        id = findViewById(R.id.sqliteId);\n" +
        "        name = findViewById(R.id.sqliteName);\n" +
        "        village = findViewById(R.id.sqlitevillage);\n" +
        "        post = findViewById(R.id.sqlitepost);\n" +
        "\n" +
        "        insert = findViewById(R.id.insertData);\n" +
        "        delete = findViewById(R.id.deleteData);\n" +
        "        update = findViewById(R.id.updateData);\n" +
        "        read = findViewById(R.id.readData);\n" +
        "\n" +
        "\n" +
        "        insert.setOnClickListener(this);\n" +
        "        delete.setOnClickListener(this);\n" +
        "        update.setOnClickListener(this);\n" +
        "        read.setOnClickListener(this);\n" +
        "\n" +
        "    }\n" +
        "\n" +
        "    @Override\n" +
        "    public void onClick(View view) {\n" +
        "        switch (view.getId()) {\n" +
        "            case R.id.insertData:\n" +
        "                if (name.getText().toString().isEmpty()) {\n" +
        "                    Toast.makeText(this, \"name is empty\", Toast.LENGTH_SHORT).show();\n" +
        "                } else if (village.getText().toString().isEmpty()) {\n" +
        "                    Toast.makeText(this, \"Village is empty\", Toast.LENGTH_SHORT).show();\n" +
        "                } else if (post.getText().toString().isEmpty()) {\n" +
        "                    Toast.makeText(this, \"Post is emtpy\", Toast.LENGTH_SHORT).show();\n" +
        "                } else {\n" +
        "                    String insertData = sqliteDatabaseOpenHelper.insertOurData(name.getText().toString(), village.getText().toString(), post.getText().toString());\n" +
        "                    Toast.makeText(this, \"Data inserted\", Toast.LENGTH_SHORT).show();\n" +
        "                    id.setText(\"\");\n" +
        "                    name.setText(\"\");\n" +
        "                    village.setText(\"\");\n" +
        "                    post.setText(\"\");\n" +
        "                }\n" +
        "\n" +
        "                break;\n" +
        "\n" +
        "            case R.id.deleteData:\n" +
        "                String ids = id.getText().toString();\n" +
        "                Integer deleteRow = sqliteDatabaseOpenHelper.deleteDatai(ids);\n" +
        "                if (deleteRow > 0) {\n" +
        "                    Toast.makeText(this, \"Data deleted\", Toast.LENGTH_SHORT).show();\n" +
        "\n" +
        "                } else {\n" +
        "                    Toast.makeText(this, \"Data not deleted\", Toast.LENGTH_SHORT).show();\n" +
        "                }\n" +
        "                break;\n" +
        "\n" +
        "            case R.id.updateData:\n" +
        "                if (name.getText().toString().isEmpty()) {\n" +
        "                    Toast.makeText(this, \"name is empty\", Toast.LENGTH_SHORT).show();\n" +
        "                } else if (village.getText().toString().isEmpty()) {\n" +
        "                    Toast.makeText(this, \"Village is empty\", Toast.LENGTH_SHORT).show();\n" +
        "                } else if (post.getText().toString().isEmpty()) {\n" +
        "                    Toast.makeText(this, \"Post is emtpy\", Toast.LENGTH_SHORT).show();\n" +
        "                } else {\n" +
        "                    String insertData = sqliteDatabaseOpenHelper.updateData(id.getText().toString(), name.getText().toString(), village.getText().toString(), post.getText().toString());\n" +
        "                    Toast.makeText(this, \"Data Updated\", Toast.LENGTH_SHORT).show();\n" +
        "                    id.setText(\"\");\n" +
        "                    name.setText(\"\");\n" +
        "                    village.setText(\"\");\n" +
        "                    post.setText(\"\");\n" +
        "                }\n" +
        "                break;\n" +
        "            case R.id.readData:\n" +
        "                /*  I will changes in future this application this application is so long size sorry bro */\n" +
        "                break;\n" +
        "        }\n" +
        "    }\n" +
        "}";
//public static final String  = "";
//public static final String  = "";
//public static final String  = "";
//public static final String  = "";
//public static final String  = "";
//public static final String  = "";
//public static final String  = "";

}
