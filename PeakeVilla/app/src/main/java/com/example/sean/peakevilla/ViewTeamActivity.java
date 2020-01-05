package com.example.sean.peakevilla;

import android.app.AlertDialog;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ViewTeamActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editName, editPosition, editGoals, editAssists;
    Button btnAdd,btnDelete,btnModify,btnView,btnViewAll,btnShowInfo;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_team);

        Context context = this;
        String msg = "View the full team and add or remove Players";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, msg, duration);
        toast.show();

        editName=(EditText)findViewById(R.id.editName);
        editPosition =(EditText)findViewById(R.id.editPosition);
        editGoals =(EditText)findViewById(R.id.editGoals);
        editAssists =(EditText)findViewById(R.id.editAssists);
        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnDelete=(Button)findViewById(R.id.btnDelete);
        btnModify=(Button)findViewById(R.id.btnModify);
        btnView=(Button)findViewById(R.id.btnView);
        btnViewAll=(Button)findViewById(R.id.btnViewAll);
        btnShowInfo=(Button)findViewById(R.id.btnShowInfo);
        btnAdd.setOnClickListener(this);
        btnDelete.setOnClickListener(this);
        btnModify.setOnClickListener(this);
        btnView.setOnClickListener(this);
        btnViewAll.setOnClickListener(this);
        btnShowInfo.setOnClickListener(this);
        db=openOrCreateDatabase("peakevilladb", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS player(name VARCHAR, position VARCHAR, goals VARCHAR, assists VARCHAR);");
    }
    public void onClick(View view)
    {
        if(view==btnAdd)
        {
            if(editName.getText().toString().trim().length()==0||
                    editPosition.getText().toString().trim().length()==0||
                    editGoals.getText().toString().trim().length()==0||
                    editAssists.getText().toString().trim().length()==0)
            {
                showMessage("Error", "Please enter all values");
                return;
            }
            db.execSQL("INSERT INTO player VALUES('"+editName.getText()+"','"+ editPosition.getText()+
                    "','"+ editGoals.getText()+"','"+ editAssists.getText()+"');");
            showMessage("Success", "Record added");
            clearText();
        }
        if(view==btnDelete)
        {
            if(editName.getText().toString().trim().length()==0)
            {
                showMessage("Error", "Please enter Name");
                return;
            }
            Cursor c=db.rawQuery("SELECT * FROM player WHERE name='"+editName.getText()+"'", null);
            if(c.moveToFirst())
            {
                db.execSQL("DELETE FROM player WHERE name='"+editName.getText()+"'");
                showMessage("Success", "Record Deleted");
            }
            else
            {
                showMessage("Error", "Invalid Name");
            }
            clearText();
        }
        if(view==btnModify)
        {
            if(editName.getText().toString().trim().length()==0)
            {
                showMessage("Error", "Please enter Name");
                return;
            }
            Cursor c=db.rawQuery("SELECT * FROM player WHERE name='"+editName.getText()+"'", null);
            if(c.moveToFirst())
            {
                db.execSQL("UPDATE player SET position='"+ editPosition.getText()+"',goals='"+ editGoals.getText()+
                        "',assits='"+ editAssists.getText()+"' WHERE name='"+editName.getText()+"'");
                showMessage("Success", "Record Modified");
            }
            else
            {
                showMessage("Error", "Invalid Name");
            }
            clearText();
        }
        if(view==btnView)
        {
            if(editName.getText().toString().trim().length()==0)
            {
                showMessage("Error", "Please enter Name");
                return;
            }
            Cursor c=db.rawQuery("SELECT * FROM player WHERE name='"+editName.getText()+"'", null);
            if(c.moveToFirst())
            {
                editPosition.setText(c.getString(1));
                editGoals.setText(c.getString(2));
                editAssists.setText(c.getString(3));
            }
            else
            {
                showMessage("Error", "Invalid Name");
                clearText();
            }
        }
        if(view==btnViewAll)
        {
            Cursor c=db.rawQuery("SELECT * FROM player", null);
            if(c.getCount()==0)
            {
                showMessage("Error", "No records found");
                return;
            }
            StringBuffer buffer=new StringBuffer();
            while(c.moveToNext())
            {
                buffer.append("Name: "+c.getString(0)+"\n");
                buffer.append("Position: "+c.getString(1)+"\n");
                buffer.append("Goals: "+c.getString(1)+"\n");
                buffer.append("Assists: "+c.getString(2)+"\n\n");
            }
            showMessage("Team", buffer.toString());
        }
        if(view==btnShowInfo)
        {
            showMessage("Peake Villa App", "Developed by Sean");
        }
    }
    public void showMessage(String title,String message)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
    public void clearText()
    {
        editName.setText("");
        editPosition.setText("");
        editGoals.setText("");
        editAssists.setText("");
        editName.requestFocus();
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}

