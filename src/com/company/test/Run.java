package com.company.test;

import com.company.fe.MainWindowFE;

import javax.swing.*;

public class Run {
    public static void  main (String [] args){

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindowFE();
            }
        });
    }
}
