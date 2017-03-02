package org.pltw.examples.collegeapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by alcantara94106 on 3/2/2017.
 */

public class FamilyMemberFragment extends android.support.v4.app.Fragment {
    public View onCreateView(LayoutInflater LayoutInflater, ViewGroup ViewGroup, Bundle Bundle){
        super.onCreateView(LayoutInflater,ViewGroup,Bundle);
        View rootView = LayoutInflater.inflate(R.layout.fragment_family_member,ViewGroup,false);
        return rootView;
    }
}
