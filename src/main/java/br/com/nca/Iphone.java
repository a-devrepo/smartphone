package br.com.nca;

import br.com.nca.interfaces.Browser;
import br.com.nca.interfaces.Phone;
import br.com.nca.interfaces.Player;

public class Iphone implements Phone, Browser, Player {
    @Override
    public void displayPage() {
    System.out.println("Displaying Page");
    }

    @Override
    public void addTab() {
        System.out.println("Adding Tab");
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing Page");
    }

    @Override
    public void call() {
        System.out.println("Calling Number");
    }

    @Override
    public void answer() {
        System.out.println("Answering Call");
    }

    @Override
    public void voiceMail() {
        System.out.println("Starting Voice Mail");
    }

    @Override
    public void play() {
        System.out.println("Playing Track");
    }

    @Override
    public void pause() {
        System.out.println("Pausing Track");
    }

    @Override
    public void select() {
        System.out.println("Selecting Track");
    }
}
