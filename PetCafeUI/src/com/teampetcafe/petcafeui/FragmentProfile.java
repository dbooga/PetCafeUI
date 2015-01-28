package com.teampetcafe.petcafeui;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentProfile extends Fragment {  

   public static FragmentProfile newInstance() {
	   FragmentProfile fragment = new FragmentProfile();  
     return fragment;  
   }  

   public FragmentProfile() {  
   }  

   @Override  
   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {  
       View rootView = inflater.inflate(R.layout.fragment_profile, container, false);  
       return rootView;  
   }  

   @Override  
   public void onAttach(Activity activity) {  
       super.onAttach(activity);  
       ((MainActivity) activity).onSectionAttached(1);  
   }  
}  