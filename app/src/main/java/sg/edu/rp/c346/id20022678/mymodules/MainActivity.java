package sg.edu.rp.c346.id20022678.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC203;
    TextView tvC206;
    TextView tvC218;
    TextView tvC235;
    TextView tvC346;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC203 = findViewById(R.id.C203);
        tvC206 = findViewById(R.id.C206);
        tvC218 = findViewById(R.id.C218);
        tvC235 = findViewById(R.id.C235);
        tvC346 = findViewById(R.id.C346);

        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                intent.putExtra("ModuleCode","C203");
                intent.putExtra("ModuleName","Web Appln Development in php");
                intent.putExtra("AcadYear",2021);
                intent.putExtra("Sem",1);
                intent.putExtra("ModuleCredit",4);
                intent.putExtra("Venue","W67M");
                startActivity(intent);
            }
        });

        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                intent.putExtra("ModuleCode","C206");
                intent.putExtra("ModuleName","Software Development Process");
                intent.putExtra("AcadYear",2021);
                intent.putExtra("Sem",1);
                intent.putExtra("ModuleCredit",4);
                intent.putExtra("Venue","W67L");
                startActivity(intent);
            }
        });

        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                intent.putExtra("ModuleCode","C218");
                intent.putExtra("ModuleName","UI/UX Design for Apps");
                intent.putExtra("AcadYear",2021);
                intent.putExtra("Sem",1);
                intent.putExtra("ModuleCredit",4);
                intent.putExtra("Venue","W64G");
                startActivity(intent);
            }
        });

        tvC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                intent.putExtra("ModuleCode","C235");
                intent.putExtra("ModuleName","IT Security and Management");
                intent.putExtra("AcadYear",2021);
                intent.putExtra("Sem",1);
                intent.putExtra("ModuleCredit",4);
                intent.putExtra("Venue","E65Q");
                startActivity(intent);
            }
        });

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                intent.putExtra("ModuleCode","C346");
                intent.putExtra("ModuleName","Mobile App Development");
                intent.putExtra("AcadYear",2021);
                intent.putExtra("Sem",1);
                intent.putExtra("ModuleCredit",4);
                intent.putExtra("Venue","E62E");
                startActivity(intent);
            }
        });
    }
}