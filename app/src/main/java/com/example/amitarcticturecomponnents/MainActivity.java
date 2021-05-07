package com.example.amitarcticturecomponnents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.amitarcticturecomponnents.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    //    setContentView(R.layout.activity_main);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.btPreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDataFromUi();
            }
        });

    }
   private void getDataFromUi(){
     String name=   binding.edName.getText().toString().trim();
    String adress=   binding.edAdress.getText().toString().trim();
       String age=binding.edAge.getText().toString().trim();
      String facebookAcount= binding.edFaceaccount.getText().toString().trim();
     String phone=  binding.edPhone.getText().toString().trim();
      String position= binding.edPosition.getText().toString().trim();
if(name.isEmpty() || adress.isEmpty()||age.isEmpty()||facebookAcount.isEmpty()||phone.isEmpty()||position.isEmpty()){

    Toast.makeText(this,"please fill the data",Toast.LENGTH_LONG).show();
return;
}
Person person= new Person(name,adress,age,facebookAcount,phone,position);
Intent intent=new Intent(MainActivity.this,PreviewActivity.class);
intent.putExtra("person",person);
startActivity(intent);


   }


}