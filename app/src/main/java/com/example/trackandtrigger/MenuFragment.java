package com.example.trackandtrigger;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.facebook.AccessToken;
import com.facebook.login.LoginManager;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MenuFragment extends Fragment {
    private View mView;
    Button btn_1,btn_2, btn_3, btn_4, btn_5, btn_6;
    Button menu_logout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu,container,false);
        this.mView = view;
        Tools.setSystemBarLight(getActivity());
        Tools.setSystemBarColor(getActivity(), R.color.white);

        if(mView!=null){
            menu_logout = mView.findViewById(R.id.menu_logout);
            if(menu_logout!=null){
                menu_logout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        signOut();
                    }
                });
            }
            btn_1 = mView.findViewById(R.id.gmap_button);
            btn_2 = mView.findViewById(R.id.amazon_btn);
            btn_3 = mView.findViewById(R.id.flipkart_btn);
            btn_4 = mView.findViewById(R.id.bigbasket_btn);
            btn_5 = mView.findViewById(R.id.OneMg_btn);
            btn_6 = mView.findViewById(R.id.myntra_btn);
        }
        return mView;
    }

    private void signOut() {
        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        mAuth.signOut();

        //Facebook Signout
        AccessToken accessToken = AccessToken.getCurrentAccessToken();
        boolean isLoggedIn = accessToken != null && !accessToken.isExpired();
        if(isLoggedIn) LoginManager.getInstance().logOut();

        //Google SignOut
        GoogleSignInClient googleSignInClient = GoogleSignIn.getClient(getActivity(),
                GoogleSignInOptions.DEFAULT_SIGN_IN);
        if(googleSignInClient!=null){

            googleSignInClient.signOut();
        }

        //Notify SignOut
        Toast.makeText(getActivity(), "We miss you already!", Toast.LENGTH_SHORT).show();
        updateUI();
    }

    private void updateUI() {
        Intent intent = new Intent(getActivity(), MainActivity.class);
        startActivity(intent);
    }
}
