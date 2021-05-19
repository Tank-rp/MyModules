package sg.edu.rp.c346.id20022678.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    TextView tvModuleCode;
    TextView tvModuleName;
    TextView tvAcaYear;
    TextView tvSem;
    TextView tvModuleCredit;
    TextView tvVenue;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        tvModuleCode = findViewById(R.id.textViewMCo);
        tvModuleName = findViewById(R.id.textViewMN);
        tvAcaYear = findViewById(R.id.textViewAY);
        tvSem = findViewById(R.id.textViewS);
        tvModuleCredit = findViewById(R.id.textViewMCr);
        tvVenue = findViewById(R.id.textViewV);
        btnBack = findViewById(R.id.btnBack);

        Intent intentReveived = getIntent();
        String moduleCode = intentReveived.getStringExtra("ModuleCode");
        String moduleName = intentReveived.getStringExtra("ModuleName");
        int acadYear = intentReveived.getIntExtra("AcadYear",0);
        int sem = intentReveived.getIntExtra("Sem",0);
        int moduleCredit = intentReveived.getIntExtra("ModuleCredit",0);
        String venue = intentReveived.getStringExtra("Venue");
        tvModuleCode.setText("Module code: " + moduleCode);
        tvModuleName.setText("Module name: " + moduleName);
        tvAcaYear.setText("Academic Year: " + acadYear);
        tvSem.setText("Semster: " + sem);
        tvModuleCredit.setText("Module Credit: " + moduleCredit);
        tvVenue.setText("Venue: " + venue);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}