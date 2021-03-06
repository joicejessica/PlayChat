package id.sch.smktelkom_mlg.project2.xirpl609101415.playchat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    int turn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        this.setTitle("TicTacToe");

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);

        turn = 1;

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (turn == 1) {
                    turn = 2;
                    button1.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    button1.setText("O");
                }

                endGame();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn == 1) {
                    turn = 2;
                    button2.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    button2.setText("O");
                }
                endGame();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn == 1) {
                    turn = 2;
                    button3.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    button3.setText("O");
                }
                endGame();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn == 1) {
                    turn = 2;
                    button4.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    button4.setText("O");
                }
                endGame();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn == 1) {
                    turn = 2;
                    button5.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    button5.setText("O");
                }
                endGame();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn == 1) {
                    turn = 2;
                    button6.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    button6.setText("O");
                }
                endGame();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn == 1) {
                    turn = 2;
                    button7.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    button7.setText("O");
                }
                endGame();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn == 1) {
                    turn = 2;
                    button8.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    button8.setText("O");
                }
                endGame();
            }

        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn == 1) {
                    turn = 2;
                    button9.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    button9.setText("O");
                }

                endGame();
            }

        });
    }

    private void endGame() {
        String a, b, c, d, e, f, g, h, i;
        a = button1.getText().toString();
        b = button2.getText().toString();
        c = button3.getText().toString();
        d = button4.getText().toString();
        e = button5.getText().toString();
        f = button6.getText().toString();
        g = button7.getText().toString();
        h = button8.getText().toString();
        i = button9.getText().toString();

        Boolean end = false;

        if (a.equals("X") && b.equals("X") && c.equals("X")) {
            Toast.makeText(GameActivity.this, "Pemain X Menang !!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e.equals("X") && i.equals("X") && a.equals("X")) {
            Toast.makeText(GameActivity.this, "Pemain X Menang !!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (g.equals("X") && d.equals("X") && a.equals("X")) {
            Toast.makeText(GameActivity.this, "Pemain X Menang !!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (g.equals("X") && h.equals("X") && i.equals("X")) {
            Toast.makeText(GameActivity.this, "Pemain X Menang !!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f.equals("X") && i.equals("X") && c.equals("X")) {
            Toast.makeText(GameActivity.this, "Pemain X Menang !!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c.equals("X") && e.equals("X") && g.equals("X")) {
            Toast.makeText(GameActivity.this, "Pemain X Menang !!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (b.equals("X") && e.equals("X") && h.equals("X")) {
            Toast.makeText(GameActivity.this, "Pemain X Menang !!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d.equals("X") && e.equals("X") && f.equals("X")) {
            Toast.makeText(GameActivity.this, "Pemain X Menang !!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (a.equals("O") && b.equals("O") && c.equals("O")) {
            Toast.makeText(GameActivity.this, "Pemain X Menang !!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e.equals("O") && i.equals("O") && a.equals("O")) {
            Toast.makeText(GameActivity.this, "Pemain O Menang !!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (g.equals("O") && d.equals("O") && a.equals("O")) {
            Toast.makeText(GameActivity.this, "Pemain X Menang !!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (g.equals("O") && h.equals("O") && i.equals("O")) {
            Toast.makeText(GameActivity.this, "Pemain O Menang !!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f.equals("O") && i.equals("O") && c.equals("O")) {
            Toast.makeText(GameActivity.this, "Pemain O Menang !!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c.equals("O") && e.equals("O") && g.equals("O")) {
            Toast.makeText(GameActivity.this, "Pemain O Menang !!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (b.equals("O") && e.equals("O") && h.equals("O")) {
            Toast.makeText(GameActivity.this, "Pemain O Menang !!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d.equals("O") && e.equals("O") && f.equals("O")) {
            Toast.makeText(GameActivity.this, "Pemain O Menang !!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (end) {
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        }

    }
}
