package com.example.invetoryappmvp;

import android.os.Bundle;
import android.view.Menu;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class EditorActivity extends AppCompatActivity {
    private EditText mNameEditText;
    private EditText mAddressEditText;
    private EditText mRatingsEditText;
    private EditText mBillEditText;
    private EditText mCommentEditText;

    List<DataDto> dataList = new ArrayList<>();
    RoomDB database = new RoomDB();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor);
    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_editor, menu);
//        return true;
//    }

}
