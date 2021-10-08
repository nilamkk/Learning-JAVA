package com.company;

// This is a button which has a title and a interface reference variable
public class Button {
    private String title;
    private IOnClickListener onClickListener; // this will point to a class which will implement IOnClickListener

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(IOnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    // with this function we will click the button which invoke the function of the class instance referred by onClickListener
    public void onClick(){
        this.onClickListener.onClick(this.title);
    }

    // this is an interface
    public interface IOnClickListener{
        public void onClick(String title);
    }
}
