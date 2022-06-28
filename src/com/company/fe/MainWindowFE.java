package com.company.fe;

import com.company.interfaces.Feinterfaces;

import javax.swing.*;

public class MainWindowFE extends JFrame implements Feinterfaces {
    public MainWindowFE() {
        initWindow();
    }

    @Override
    public void initWindow() {

        JTabbedPane tabs = initTabs();
        JMenuBar bar = initBar();
//        add(tabs);
//        setJMenuBar(bar);
        setTitle("Sale and Stock Program");
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public JMenuBar initPanel() {
        return null;
    }

    @Override
    public JMenuBar initBar() {
        return null;
    }

    @Override
    public JTabbedPane initTabs() {
        return null;
    }
}
