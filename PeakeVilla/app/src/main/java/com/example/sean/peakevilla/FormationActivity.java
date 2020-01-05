package com.example.sean.peakevilla;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FormationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formation);

        Context context = this;
        String msg = "The current formation of the team";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, msg, duration);
        toast.show();

        Button cf1Clicked = (Button) findViewById(R.id.cf1);
        Button cf2Clicked = (Button) findViewById(R.id.cf2);
        Button lamClicked = (Button) findViewById(R.id.lam);
        Button camClicked = (Button) findViewById(R.id.cam);
        Button ramClicked = (Button) findViewById(R.id.ram);
        Button ldmClicked = (Button) findViewById(R.id.ldm);
        Button cdmClicked = (Button) findViewById(R.id.cdm);
        Button rdmClicked = (Button) findViewById(R.id.rdm);
        Button cb1Clicked = (Button) findViewById(R.id.cb1);
        Button cb2Clicked = (Button) findViewById(R.id.cb2);
        Button gkClicked = (Button) findViewById(R.id.gk);
        Button viewClicked = (Button) findViewById(R.id.view_players);

        cf1Clicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create Dialog
                final Dialog dialog = new Dialog(FormationActivity.this);
                dialog.setContentView(R.layout.formation_dialog);
                dialog.setTitle("Player Information");
                dialog.setCancelable(true);

                //Create text for player information
                TextView text = (TextView) dialog.findViewById(R.id.formation_textview);
                text.setText(R.string.cf1_description);

                //Create image for player
                ImageView img = (ImageView) dialog.findViewById(R.id.formation_image);
                img.setImageResource(R.drawable.player_image);

                //Create button to close dialog
                Button button = (Button) dialog.findViewById(R.id.back_to_formation);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                //Display dialog
                dialog.show();
            }
        });

        cf2Clicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(FormationActivity.this);
                dialog.setContentView(R.layout.formation_dialog);
                dialog.setTitle("Player Information");
                dialog.setCancelable(true);

                //Create text for player information
                TextView text = (TextView) dialog.findViewById(R.id.formation_textview);
                text.setText(R.string.cf2_description);

                //Create image for player
                ImageView img = (ImageView) dialog.findViewById(R.id.formation_image);
                img.setImageResource(R.drawable.player_image);

                //Create button to close dialog
                Button button = (Button) dialog.findViewById(R.id.back_to_formation);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        ramClicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(FormationActivity.this);
                dialog.setContentView(R.layout.formation_dialog);
                dialog.setTitle("Player Information");
                dialog.setCancelable(true);

                //Create text for player information
                TextView text = (TextView) dialog.findViewById(R.id.formation_textview);
                text.setText(R.string.ram_description);

                //Create image for player
                ImageView img = (ImageView) dialog.findViewById(R.id.formation_image);
                img.setImageResource(R.drawable.player_image);

                //Create button to close dialog
                Button button = (Button) dialog.findViewById(R.id.back_to_formation);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        camClicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(FormationActivity.this);
                dialog.setContentView(R.layout.formation_dialog);
                dialog.setTitle("Center Forward");
                dialog.setCancelable(true);

                //Create text for player information
                TextView text = (TextView) dialog.findViewById(R.id.formation_textview);
                text.setText(R.string.cam_description);

                //Create image for player
                ImageView img = (ImageView) dialog.findViewById(R.id.formation_image);
                img.setImageResource(R.drawable.player_image);

                //Create button to close dialog
                Button button = (Button) dialog.findViewById(R.id.back_to_formation);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        lamClicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(FormationActivity.this);
                dialog.setContentView(R.layout.formation_dialog);
                dialog.setTitle("Player Information");
                dialog.setCancelable(true);

                //Create text for player information
                TextView text = (TextView) dialog.findViewById(R.id.formation_textview);
                text.setText(R.string.lam_description);

                //Create image for player
                ImageView img = (ImageView) dialog.findViewById(R.id.formation_image);
                img.setImageResource(R.drawable.player_image);

                //Create button to close dialog
                Button button = (Button) dialog.findViewById(R.id.back_to_formation);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        ldmClicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(FormationActivity.this);
                dialog.setContentView(R.layout.formation_dialog);
                dialog.setTitle("Player Information");
                dialog.setCancelable(true);

                //Create text for player information
                TextView text = (TextView) dialog.findViewById(R.id.formation_textview);
                text.setText(R.string.ldm_description);

                //Create image for player
                ImageView img = (ImageView) dialog.findViewById(R.id.formation_image);
                img.setImageResource(R.drawable.player_image);

                //Create button to close dialog
                Button button = (Button) dialog.findViewById(R.id.back_to_formation);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        cdmClicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(FormationActivity.this);
                dialog.setContentView(R.layout.formation_dialog);
                dialog.setTitle("Player Information");
                dialog.setCancelable(true);

                //Create text for player information
                TextView text = (TextView) dialog.findViewById(R.id.formation_textview);
                text.setText(R.string.cdm_description);

                //Create image for player
                ImageView img = (ImageView) dialog.findViewById(R.id.formation_image);
                img.setImageResource(R.drawable.player_image);

                //Create button to close dialog
                Button button = (Button) dialog.findViewById(R.id.back_to_formation);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        rdmClicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(FormationActivity.this);
                dialog.setContentView(R.layout.formation_dialog);
                dialog.setTitle("Player Information");
                dialog.setCancelable(true);

                //Create text for player information
                TextView text = (TextView) dialog.findViewById(R.id.formation_textview);
                text.setText(R.string.rdm_description);

                //Create image for player
                ImageView img = (ImageView) dialog.findViewById(R.id.formation_image);
                img.setImageResource(R.drawable.player_image);

                //Create button to close dialog
                Button button = (Button) dialog.findViewById(R.id.back_to_formation);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        cb1Clicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(FormationActivity.this);
                dialog.setContentView(R.layout.formation_dialog);
                dialog.setTitle("Player Information");
                dialog.setCancelable(true);

                //Create text for player information
                TextView text = (TextView) dialog.findViewById(R.id.formation_textview);
                text.setText(R.string.cb1_description);

                //Create image for player
                ImageView img = (ImageView) dialog.findViewById(R.id.formation_image);
                img.setImageResource(R.drawable.player_image);

                //Create button to close dialog
                Button button = (Button) dialog.findViewById(R.id.back_to_formation);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        cb2Clicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(FormationActivity.this);
                dialog.setContentView(R.layout.formation_dialog);
                dialog.setTitle("Player Information");
                dialog.setCancelable(true);

                //Create text for player information
                TextView text = (TextView) dialog.findViewById(R.id.formation_textview);
                text.setText(R.string.cb2_description);

                //Create image for player
                ImageView img = (ImageView) dialog.findViewById(R.id.formation_image);
                img.setImageResource(R.drawable.player_image);

                //Create button to close dialog
                Button button = (Button) dialog.findViewById(R.id.back_to_formation);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        gkClicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(FormationActivity.this);
                dialog.setContentView(R.layout.formation_dialog);
                dialog.setTitle("Player Information");
                dialog.setCancelable(true);

                //Create text for player information
                TextView text = (TextView) dialog.findViewById(R.id.formation_textview);
                text.setText(R.string.gk_description);

                //Create image for player
                ImageView img = (ImageView) dialog.findViewById(R.id.formation_image);
                img.setImageResource(R.drawable.player_image);

                //Create button to close dialog
                Button button = (Button) dialog.findViewById(R.id.back_to_formation);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        viewClicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FormationActivity.this, ViewTeamActivity.class);
                startActivity(intent);
            }

        });

    }
}
