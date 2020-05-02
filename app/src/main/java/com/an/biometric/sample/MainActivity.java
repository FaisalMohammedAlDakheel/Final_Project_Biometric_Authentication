package com.an.biometric.sample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.an.biometric.BiometricCallback;
import com.an.biometric.BiometricManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements BiometricCallback {

    private Button button; // Define a button.
    BiometricManager mBiometricManager; // Define BiometricManager method.

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn_authenticate); // Created a button.
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // I got some information and codes from this website.
                // https://developer.android.com/training/sign-in/biometric-auth#kotlin

                mBiometricManager = new BiometricManager.BiometricBuilder(MainActivity.this)
                        // Display these messages when pressing to login button.
                        .setTitle("LOGIN")
                        .setSubtitle("Login to your system")
                        .setDescription("Please put your fingerprint on the device home button to verify from authentication")
                        // This button to cancel
                        .setNegativeButtonText("CANCEL")
                        .build();

                // Start authentication
                mBiometricManager.authenticate(MainActivity.this);
            }
        });
    }
    // I got some information and codes from this website.
    // https://developer.android.com/training/sign-in/biometric-auth#kotlin

    @Override
    // Created a method to check if version supported or not.
    public void onSdkVersionNotSupported() {
        Toast.makeText(getApplicationContext(), "SDK VERSION NOT SUPPORTED", Toast.LENGTH_LONG).show();
    }

    @Override
    // Created a method to check if the device supported authentication or not.
    public void onBiometricAuthenticationNotSupported() {
        Toast.makeText(getApplicationContext(), "DEVICE DOES NOT SUPPORT BIOMETRIC AUTHENTICATION", Toast.LENGTH_LONG).show();
    }

    @Override
    // Created a method to check if the fingerprint registered in device or not.
    public void onBiometricAuthenticationNotAvailable() {
        Toast.makeText(getApplicationContext(), "FINGERPRINT NOT REGISTERED IN THE DEVICE", Toast.LENGTH_LONG).show();
    }

    @Override
    // Created a method to check if the permission granted or not.
    public void onBiometricAuthenticationPermissionNotGranted() {
        Toast.makeText(getApplicationContext(), "PERMISSION IS NOT GRANTED", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onBiometricAuthenticationInternalError(String error) {
        Toast.makeText(getApplicationContext(), error, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onAuthenticationFailed() {
     // Toast.makeText(getApplicationContext(), getString(R.string.biometric_failure), Toast.LENGTH_LONG).show();
    }

    @Override
    // Created a method to check if the authentication canceled by user or not.
    public void onAuthenticationCancelled() {
        Toast.makeText(getApplicationContext(), "AUTHENTICATION CANCELED", Toast.LENGTH_LONG).show();
        mBiometricManager.cancelAuthentication();
    }

    @Override
    // Created a method to display an alert message for login successful.
    public void onAuthenticationSuccessful() {
        Toast.makeText(getApplicationContext(), "LOGIN SUCCESSFUL", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onAuthenticationHelp(int helpCode, CharSequence helpString) {
    // Toast.makeText(getApplicationContext(), helpString, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onAuthenticationError(int errorCode, CharSequence errString) {
    // Toast.makeText(getApplicationContext(), errString, Toast.LENGTH_LONG).show();
    }
}
