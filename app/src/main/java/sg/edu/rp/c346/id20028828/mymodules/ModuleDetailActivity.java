package sg.edu.rp.c346.id20028828.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvModCode, tvModName, tvAcademicYr, tvSem, tvModCred, tvVenue;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvModCode = findViewById(R.id.TextViewModuleCode);
        tvModName = findViewById(R.id.textViewModuleName);
        tvAcademicYr = findViewById(R.id.textViewAcadYear);
        tvSem = findViewById(R.id.textViewSem);
        tvModCred = findViewById(R.id.textViewModCred);
        tvVenue = findViewById(R.id.textViewVenue);
        btnBack = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();
        String moduleCode = intentReceived.getStringExtra("modulecode");
        tvModCode.setText("Module Code:\n" + moduleCode);
        String moduleName = intentReceived.getStringExtra("modulename");
        tvModName.setText("Module Name: \n" + moduleName);
        int academicYear = intentReceived.getIntExtra("acadyear", 0);
        tvAcademicYr.setText("Academic Year: \n" + academicYear);
        int sem = intentReceived.getIntExtra("sem", 0);
        tvSem.setText("Semester: \n" + sem);
        int moduleCredit = intentReceived.getIntExtra("modcred", 0);
        tvModCred.setText("Module Credit: \n" + moduleCredit);
        String venue = intentReceived.getStringExtra("venue");
        tvVenue.setText("Venue: \n" + venue);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }
}