package com.example.android.theroomtrivia;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;

/*
 * Created by sungem on 03/03/2018.
 */

public class TriviaActivity extends AppCompatActivity {
    int score = 0;
    EditText userName, editText;
    String wrong, correct, hi, exclamation, fan, notFan, scoreProgress;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        ArrayList<String> answers = new ArrayList<String>();
        //answers for question 1 [0-3], correct answer is q1a4

        answers.add(getString(R.string.q1a1));
        answers.add(getString(R.string.q1a2));
        answers.add(getString(R.string.q1a3));
        answers.add(getString(R.string.q1a4));

        //answers for question 2 [4-7], correct answer is q2a1
        answers.add(getString(R.string.q2a1));
        answers.add(getString(R.string.q2a2));
        answers.add(getString(R.string.q2a3));
        answers.add(getString(R.string.q2a4));

        //answers for question 3 [8-11], correct answers are q3a3
        answers.add(getString(R.string.q3a1));
        answers.add(getString(R.string.q3a2));
        answers.add(getString(R.string.q3a3));
        answers.add(getString(R.string.q3a4));

        //answers for question 4 [12-15], correct answers is q4a1 & q4a2
        answers.add(getString(R.string.q4a1));
        answers.add(getString(R.string.q4a2));
        answers.add(getString(R.string.q4a3));
        answers.add(getString(R.string.q4a4));

        //answers for question 6 [16-19], correct answers is q6a1
        answers.add(getString(R.string.q6a1));
        answers.add(getString(R.string.q6a2));
        answers.add(getString(R.string.q6a3));
        answers.add(getString(R.string.q6a4));

        RadioButton answerView1 = (RadioButton) findViewById(R.id.radioButton1);
        answerView1.setText(answers.get(0));

        RadioButton answerView2 = (RadioButton) findViewById(R.id.radioButton2);
        answerView2.setText(answers.get(1));

        RadioButton answerView3 = (RadioButton) findViewById(R.id.radioButton3);
        answerView3.setText(answers.get(2));

        RadioButton answerView4 = (RadioButton) findViewById(R.id.radioButton4);
        answerView4.setText(answers.get(3));

        RadioButton answerView5 = (RadioButton) findViewById(R.id.radioButton5);
        answerView5.setText(answers.get(4));

        RadioButton answerView6 = (RadioButton) findViewById(R.id.radioButton6);
        answerView6.setText(answers.get(5));

        RadioButton answerView7 = (RadioButton) findViewById(R.id.radioButton7);
        answerView7.setText(answers.get(6));

        RadioButton answerView8 = (RadioButton) findViewById(R.id.radioButton8);
        answerView8.setText(answers.get(7));

        RadioButton answerView9 = (RadioButton) findViewById(R.id.radioButton9);
        answerView9.setText(answers.get(8));

        RadioButton answerView10 = (RadioButton) findViewById(R.id.radioButton10);
        answerView10.setText(answers.get(9));

        RadioButton answerView11 = (RadioButton) findViewById(R.id.radioButton11);
        answerView11.setText(answers.get(10));

        RadioButton answerView12 = (RadioButton) findViewById(R.id.radioButton12);
        answerView12.setText(answers.get(11));

        CheckBox answerView13 = (CheckBox) findViewById(R.id.checkBoxButton1);
        answerView13.setText(answers.get(12));

        CheckBox answerView14 = (CheckBox) findViewById(R.id.checkBoxButton2);
        answerView14.setText(answers.get(13));

        CheckBox answerView15 = (CheckBox) findViewById(R.id.checkBoxButton3);
        answerView15.setText(answers.get(14));

        CheckBox answerView16 = (CheckBox) findViewById(R.id.checkBoxButton4);
        answerView16.setText(answers.get(15));

        RadioButton answerView17 = (RadioButton) findViewById(R.id.radioButton13);
        answerView17.setText(answers.get(16));

        RadioButton answerView18 = (RadioButton) findViewById(R.id.radioButton14);
        answerView18.setText(answers.get(17));

        RadioButton answerView19 = (RadioButton) findViewById(R.id.radioButton15);
        answerView19.setText(answers.get(18));

        RadioButton answerView20 = (RadioButton) findViewById(R.id.radioButton16);
        answerView20.setText(answers.get(19));

        userName = findViewById(R.id.user_name);
        editText = findViewById(R.id.written_answer);
        wrong = getString(R.string.wrong);
        correct = getString(R.string.correct);
        hi = getString(R.string.hi);
        exclamation = getString(R.string.exclamation);
        fan = getString(R.string.fan);
        notFan = getString(R.string.notFan);
        scoreProgress = getString(R.string.scoreProgress);

        userName.setImeOptions(EditorInfo.IME_ACTION_DONE);
        userName.setRawInputType(InputType.TYPE_CLASS_TEXT);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radioButton4:
                if (checked)
                    score++;
                break;
            case R.id.radioButton5:
                if (checked)
                    score++;
                break;

            case R.id.radioButton11:
                if (checked)
                    score++;
                break;

            case R.id.radioButton13:
                if (checked)
                    score++;
                break;

        }
    }

    public void submitAnswer1(View view) {
        String name = userName.getText().toString();
        RadioButton rb = (RadioButton) findViewById(R.id.radioButton4);

        if (rb.isChecked()) {
            Toast.makeText(this, name + correct + scoreProgress + score, Toast.LENGTH_SHORT).show();
            mediaPlayer = MediaPlayer.create(this, R.raw.johnny_laugh);
            mediaPlayer.start();

        } else {
            Toast.makeText(this, name + wrong + scoreProgress + score, Toast.LENGTH_SHORT).show();
            mediaPlayer = MediaPlayer.create(this, R.raw.lisa);
            mediaPlayer.start();

        }
    }

    public void submitAnswer2(View view) {
        String name = userName.getText().toString();
        RadioButton rb = (RadioButton) findViewById(R.id.radioButton5);


        if (rb.isChecked()) {
            Toast.makeText(this, name + correct + scoreProgress + score, Toast.LENGTH_SHORT).show();
            mediaPlayer = MediaPlayer.create(this, R.raw.johnny_laugh);
            mediaPlayer.start();


        } else {
            Toast.makeText(this, name + wrong + scoreProgress + score, Toast.LENGTH_SHORT).show();
            mediaPlayer = MediaPlayer.create(this, R.raw.lisa);
            mediaPlayer.start();
        }
    }

    public void submitAnswer3(View view) {
        String name = userName.getText().toString();
        RadioButton rb = (RadioButton) findViewById(R.id.radioButton11);

        if (rb.isChecked()) {
            Toast.makeText(this, name + correct + scoreProgress + score, Toast.LENGTH_SHORT).show();
            mediaPlayer = MediaPlayer.create(this, R.raw.johnny_laugh);
            mediaPlayer.start();

        } else {
            Toast.makeText(this, name + wrong + scoreProgress + score, Toast.LENGTH_SHORT).show();
            mediaPlayer = MediaPlayer.create(this, R.raw.lisa);
            mediaPlayer.start();
        }
    }

    public void submitAnswer4(View view) {
        String name = userName.getText().toString();
        CheckBox answerView5 = (CheckBox) findViewById(R.id.checkBoxButton1);
        CheckBox answerView6 = (CheckBox) findViewById(R.id.checkBoxButton2);
        CheckBox answerView7 = (CheckBox) findViewById(R.id.checkBoxButton3);
        CheckBox answerView8 = (CheckBox) findViewById(R.id.checkBoxButton4);

        if (answerView5.isChecked() && answerView6.isChecked()
                && !answerView7.isChecked() && !answerView8.isChecked()) {
            score++;
            Toast.makeText(this, name + correct + scoreProgress + score, Toast.LENGTH_SHORT).show();
            mediaPlayer = MediaPlayer.create(this, R.raw.johnny_laugh);
            mediaPlayer.start();
        } else {
            Toast.makeText(this, name + wrong + scoreProgress + score, Toast.LENGTH_SHORT).show();
            mediaPlayer = MediaPlayer.create(this, R.raw.lisa);
            mediaPlayer.start();
        }
    }

    public void submitAnswer5(View view) {
        String name = userName.getText().toString();
        String userEntry = editText.getText().toString();

        if (userEntry.matches(getString(R.string.q5a))) {
            score++;
            Toast.makeText(this, name + correct + scoreProgress + score, Toast.LENGTH_SHORT).show();
            mediaPlayer = MediaPlayer.create(this, R.raw.johnny_laugh);
            mediaPlayer.start();

        } else {
            Toast.makeText(this, name + wrong + scoreProgress + score, Toast.LENGTH_SHORT).show();
            mediaPlayer = MediaPlayer.create(this, R.raw.lisa);
            mediaPlayer.start();
        }
    }

    public void submitAnswer6(View view) {
        RadioButton rb = (RadioButton) findViewById(R.id.radioButton13);
        String name = userName.getText().toString();

        if (rb.isChecked()) {
            Toast.makeText(this, name + correct + scoreProgress + score, Toast.LENGTH_SHORT).show();
            mediaPlayer = MediaPlayer.create(this, R.raw.johnny_laugh);
            mediaPlayer.start();

        } else {
            Toast.makeText(this, name + wrong + scoreProgress + score, Toast.LENGTH_SHORT).show();
            mediaPlayer = MediaPlayer.create(this, R.raw.lisa);
            mediaPlayer.start();
        }
    }

    public void displayScore(View view) {
        String name = userName.getText().toString();
        String message = hi + name + exclamation;
        message += scoreProgress + score + "\n";

        if (score == 6) {
            message += fan;
            mediaPlayer = MediaPlayer.create(this, R.raw.intro);
            mediaPlayer.start();
            display(message);
            GifImageView fanGif = (GifImageView) findViewById(R.id.high_score);
            fanGif.setVisibility(View.VISIBLE);
        } else {
            message += notFan;
            mediaPlayer = MediaPlayer.create(this, R.raw.intro);
            mediaPlayer.start();
            display(message);
            GifImageView notFanGif = (GifImageView) findViewById(R.id.low_score);
            notFanGif.setVisibility(View.VISIBLE);

        }

    }

    //Displays the score on the screen

    private void display(String message) {
        TextView displayScore = (TextView) findViewById(R.id.display);
        displayScore.setText(message);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current score state
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("User", score);
    }

    public void onRest@Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current score state
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("User", score);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);

        // Restore state members from saved instance
        score = savedInstanceState.getInt("User");
    }
}oreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);

        // Restore state members from saved instance
        score = savedInstanceState.getInt("User");
    }
}
