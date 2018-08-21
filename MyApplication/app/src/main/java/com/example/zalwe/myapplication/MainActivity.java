package com.example.zalwe.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.regex.Pattern;


public class MainActivity extends AppCompatActivity {

    EditText registryEmailText,registryPasswordText,registryNameText,registrySchoolText;
    Button buttonSingUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registryEmailText=findViewById(R.id.editTextEmail);
        registryPasswordText=findViewById(R.id.editTextPassword);
        registrySchoolText=findViewById(R.id.editTextSchool);
        registryNameText=findViewById(R.id.editTextName);
        buttonSingUp=findViewById(R.id.buttonSignUp);


        buttonSingUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onSignUpButtonClick();
            }
        });
    }



   private void onPasswordClick()
   {
       String emailregex="^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
       if(!Pattern.matches(emailregex,registryEmailText.getText()))
       {
          registryEmailText.setError("Wrong e-mail");
           registryEmailText.setHint("Type correct e-mail address");

       }else
       {
           registryEmailText.setHint("email");
       }
   }
   private void onNameClick()
   {
       int passwordlenght = registryPasswordText.length();
       if(passwordlenght<6)
       {
           registryPasswordText.setError("Password is too short");
           registryPasswordText.setHint("Your password should be longer");
       }
   }

   private void onSchoolClick()
   {
       int namelenght = registryNameText.length();
       if(namelenght<2)
       {
           registryNameText.setError("Your name is too shory");
           registryNameText.setHint("Please,type corrcet name");
       }
   }
private void onSignUpButtonClick()
{
    onPasswordClick();
    onNameClick();
    onSchoolClick();
    int schoollength = registrySchoolText.length();
    if(schoollength<3)
    {
        registrySchoolText.setError("Type correct school");
    }
}
}
