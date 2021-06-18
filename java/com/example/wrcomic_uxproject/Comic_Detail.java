package com.example.wrcomic_uxproject;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Comic_Detail extends AppCompatActivity {

    private EditText editText;

    private Button button;

    private ImageView Comic_image;
    private TextView Comic_title;
    private TextView Comic_desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comic__detail);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Comic_image = findViewById(R.id.comic_image);
        Comic_title = findViewById(R.id.comic_title);
        Comic_desc = findViewById(R.id.comic_description);

        Integer img = getIntent().getIntExtra("Comic Image", R.mipmap.ic_comic1);
        String title = getIntent().getStringExtra("Comic Title");
        String desc = getIntent().getStringExtra("Comic Desc");

        Comic_image.setImageResource(img);
        Comic_title.setText(title);
        Comic_desc.setText(desc);

        editText = findViewById(R.id.editText_quantity);
        button = findViewById(R.id.button_buy);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });

    }

    public void openDialog()
    {
        if(editText.getText().toString().contains("1") == false && editText.getText().toString().contains("2") == false
            && editText.getText().toString().contains("3") == false && editText.getText().toString().contains("4") == false
                && editText.getText().toString().contains("5") == false && editText.getText().toString().contains("6") == false
                && editText.getText().toString().contains("7") == false && editText.getText().toString().contains("8") == false
            && editText.getText().toString().contains("9") == false)
        {
            Dialog dialog = new Dialog("Error", "Quantity must be filled!");
            dialog.show(getSupportFragmentManager(), "Error Dialog");
        }
        else
        {
            Dialog dialog = new Dialog("Success", "Your comic successfully bought!");
            dialog.show(getSupportFragmentManager(), "Success Dialog");
        }
    }

}
